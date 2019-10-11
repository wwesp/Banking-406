package src.Accounts;

import java.util.ArrayList;
import java.util.List;

public class AccountHolder {
    public ArrayList<MoneyAccounts> accounts;
    public String holder;
    public String mainAccountKey;
    public AccountHolder(String holder, String mainAccountKey, ArrayList<MoneyAccounts> accounts){
        accounts=new ArrayList<>();
        this.accounts=accounts;
        this.holder=holder;
        this.mainAccountKey=mainAccountKey;

    }

    public void addAccount(MoneyAccounts x){
        accounts.add(x);
    }




}
