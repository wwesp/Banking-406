package src.Accounts;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.io.*;

public class AccountHolder {
    public LinkedHashMap<String, MoneyAccounts> accounts;
    public String holder;
    public String mainAccountKey;
    public AccountHolder(String holder, String mainAccountKey, LinkedHashMap<String,MoneyAccounts> accounts){
        accounts=new LinkedHashMap<>();
        this.accounts=accounts;
        this.holder=holder;
        this.mainAccountKey=mainAccountKey;

    }

    public void addAccount(String x, MoneyAccounts y){
        accounts.put(x,y);
    }

    @Override
    public String toString(){
        return holder+"::"+mainAccountKey+ "::"+ accounts.keySet();
    }



}
