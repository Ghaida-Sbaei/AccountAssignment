public class Account {
    private int accountNum;
    private String accountHolderName;
    private int balance;
    private String bankName;
    private String IBAN;

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public Account(int accountNum,String accountHolderName, int balance, String bankName, String IBAN){
        this.accountHolderName=accountHolderName;
        this.balance=balance;
        this.bankName=bankName;
        this.IBAN=IBAN;
        this.accountNum = accountNum;

    }





}
