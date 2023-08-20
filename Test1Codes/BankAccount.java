public class BankAccount {
    private long accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(long accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }
    public long getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }
    public long getbalance(){
        return accountNumber;
    }
    public void setbalance(long balancer){
        this.balance=balance;
    }
//    public long getownerNamer(){
//        return ownerNamer;
//    }
//    public void setownerNamer(long ownerName){
//        this.ownerNamer=ownerName;
//    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposit Successful. New Balance: " + balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amt) {
        if (balance >= amt) {
            balance -= amt;
            System.out.println("Withdrawal Successful. New Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getTheBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount a123456 = new BankAccount(123456, 5000, "Dheepa");

        // Example deposit and withdrawal operations
        a123456.deposit(1000);
        a123456.withdraw(2000);

        System.out.println("Current Balance: " + a123456.getTheBalance());
    }
}
