package src.Accounts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class CheckingAccount extends MoneyAccounts{

    public CheckingAccount(String accountNumber, String routingNumber, double balence, LinkedHashMap<Integer, String> history){
        super(accountNumber,routingNumber,balence,history);

    }//constructor

}
