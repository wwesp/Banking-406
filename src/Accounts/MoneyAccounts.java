package src.Accounts;

import java.util.ArrayList;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

abstract public class MoneyAccounts {

    private String accountNumber;
    private String routingNumber;
    private double balence;

    private ArrayList<ArrayList<String>> history;
    private static Lock lock = new ReentrantLock();



    public MoneyAccounts(String accountNumber, String routingNumber, double balence, ArrayList<ArrayList<String>> history){
        this.accountNumber=accountNumber;
        this.routingNumber=routingNumber;
        this.balence=balence;
        this.history=history;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getRoutingNumber() {
        return routingNumber;
    }

    public double getBalence() {
        return balence;
    }

    public ArrayList<ArrayList<String>> getHistory() {
        return history;
    }

    private void changeBalence(double amt){
        //amt if positive is adding funds, amt if negative removes funds

        try{
            lock.lock();
            Thread.sleep(5);
            balence+=amt;
            lock.unlock();
        }
        catch (InterruptedException ex){

        }


    }//end of changeBalence

    public boolean authorizePayment(double amt){
        //if return true it worked, false is a fail authorized
        if(doIHave(amt)){
            changeBalence(amt);
            return true;
        }
        else{
            return false;
        }


    }//end of authpayment



    public boolean doIHave(double amt){
        //do I have x amt
        //seperate from authorize since that is going though with the whole payment
        return amt<balence;
    }



}//end of moneyAccounts
