public class Main {
    public static void main(String[] args) {

//        BankAccount b = new BankAccount(12345,5000,"Sindhu");
//        b.deposit(2000);
//        b.withdraw(100);
////        b.bal();
//        System.out.println(b.getbal());
///////////////////////////////////////////////////
//        Antivirus aa = new Antivirus();
//        aa.scan();



        SavingsAccount sc = new SavingsAccount("125463",5000,"sindhu",2);
        CheckingAccount checkingAccount = new CheckingAccount("CA456", 500,"Jane Smith",  200.0);

        sc.depoist(500.0);
        sc.withdraw(200.0);
        System.out.println("Savings Account Balance: $" + sc.getBal());

        checkingAccount.withdraw(700.0);
        checkingAccount.withdraw(400.0);
        System.out.println("Checking Account Balance: $" + checkingAccount.getBal());

    }
}
