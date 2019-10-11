package src;

import src.Accounts.AccountHolder;
import src.Accounts.CheckingAccount;
import src.Accounts.MoneyAccounts;
import src.Accounts.SavingsAccount;


import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {




        System.out.println("Hello World");


        ArrayList<MoneyAccounts> y= new ArrayList<MoneyAccounts>();

        CheckingAccount x = new CheckingAccount("231", "21324", 900,null);
        SavingsAccount z= new SavingsAccount("654332", "6543234567", 30, null);

        AccountHolder jeff = new AccountHolder("Jeff", "A134B0", null);


        jeff.addAccount("231",x);
        jeff.addAccount("654332",z);
        //System.out.println(jeff.accounts);

        jeff.accounts.forEach((s,f)->System.out.println(f));
        System.out.println(jeff.accounts.get("231"));

        System.out.println(jeff.toString());









    }
}



