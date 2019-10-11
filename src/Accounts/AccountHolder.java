package src.Accounts;

import java.util.List;

public class AccountHolder {
    public List<MoneyAccounts> accounts;
    public String holder;
    public String mainAccountKey;
    public AccountHolder(String holder, String mainAccountKey, List<MoneyAccounts> accounts){
        this.accounts=accounts;
        this.holder=holder;
        this.mainAccountKey=mainAccountKey;

    }

    public void addAccount(MoneyAccounts x){
        //accounts.add(x);
    }




}
