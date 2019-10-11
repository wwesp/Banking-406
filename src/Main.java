package src;

import src.Accounts.AccountHolder;
import src.Accounts.CheckingAccount;
import src.Accounts.MoneyAccounts;
import src.Accounts.SavingsAccount;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello World");


        ArrayList<MoneyAccounts> y= new ArrayList<MoneyAccounts>();
        CheckingAccount x = new CheckingAccount("231", "21324", 900.58,null);
        AccountHolder jeff = new AccountHolder("Jeff", "A134B0", null);


        jeff.addAccount(x);
        System.out.println(jeff.accounts);





    }
}



