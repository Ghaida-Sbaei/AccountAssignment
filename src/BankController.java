import java.util.ArrayList;
import java.util.List;

public class BankController {
    private int  money;
    private int newMoney;
    Account account;

    public BankController(Account account){}
    List<Account> accounts = new ArrayList<Account>();


    public void add(Account account){
accounts.add(account);
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public void printAccount(){
        for (Account account:accounts){
            System.out.println("Details for Accounts : "+account.getAccountNum());
            System.out.println("The name is : "+account.getAccountHolderName()+"& THe balance "+account.getBalance());
            System.out.println("The bank"+account.getBankName()+"& THe IBAN "+account.getIBAN());
        }

    }
    public void addMoney(Account account ,int money){

            System.out.println("The balance from account "+account.getAccountHolderName() +" is : " +account.getBalance());
        newMoney = account.getBalance()+money;
            System.out.println("After the remove transition, the balance is : "  +newMoney);
        account.setBalance(newMoney);
    }

    public void removeMoney(Account account,int money){
        System.out.println("The balance from account "+account.getAccountHolderName() +" is : " +account.getBalance());
        newMoney=account.getBalance()-money;
        System.out.println("After the remove transition, the balance is : "  +newMoney);
account.setBalance(newMoney);

    }

    public void transferTo(Account currentAccount,Account acc,int money){
        int newBalance;
        int newBalance2;
        newBalance= currentAccount.getBalance();
        newMoney= newBalance-money;
        newBalance2 = acc.getBalance();
        newBalance2 =acc.getBalance()+money;
        System.out.println("THE balance for " +acc.getAccountHolderName()+ " after transfer action :" +newBalance2);
        System.out.println("THE balance for " +currentAccount.getAccountHolderName()+ " after transfer action :"+newMoney);
        currentAccount.setBalance(newMoney);
    }
}
