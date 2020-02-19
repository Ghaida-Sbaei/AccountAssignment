public class Application {
    public static void main(String[] args) {
        Account account1=new Account(1,"Sara",2000,"ING","LN 1234");
        Account account2=new Account(2,"Ahmed",5000,"Amro","LN 4545");
        Account account3=new Account(3,"Celin",10000,"Rabo","LN 8989");

        BankController banks=new BankController(account1);
        banks.add(account1);
        banks.add(account2);
        banks.add(account3);
        banks.printAccount();
        System.out.println("==========================================================================================================");
        banks.addMoney(account1,1000);
        System.out.println("********************************************************************************************************");
        banks.removeMoney(account2,3000);
        System.out.println("********************************************************************************************************");
        banks.removeMoney(account3,15000);
        System.out.println("********************************************************************************************************");
        banks.addMoney(account1,1500);
        System.out.println("********************************************************************************************************");
        banks.removeMoney(account1,100);
        System.out.println("********************************************************************************************************");
        banks.addMoney(account3,5500);
        System.out.println("********************************************************************************************************");
        //banks.removeMoney(account2,-142);
        System.out.println("=======================================================================================================");

        System.out.println("Transfer method : ");
        banks.transferTo(account2,account3,500);
        System.out.println("=======================================================================================================");
        banks.transferTo(account1,account2,400);
    }
}
