package Fxtrading;

import java.util.*;

public class BankAccount{
    private String cus_name;
    private int acc_no;
    private int bal;

    public BankAccount(String cus_name, int acc_no, int bal) {
        this.cus_name = cus_name;
        this.acc_no = acc_no;
        this.bal = bal;
    }

    public BankAccount(int accountHolder, String accountNumber, int bal1) {
    }

    public String getCus_name() {
        return cus_name;
    }

    public void setCus_name(String cus_name) {
        this.cus_name = cus_name;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public int getBal() {
        return bal;
    }

    public void setBal(int bal) {
        this.bal = bal;
    }
    public void depoist(double amt){
        if(bal!=0){
            bal += amt;
            System.out.println(bal);

        }
        else{
            System.out.println("insufficent balance");
        }
    }
    public void checkbalance(){
        System.out.println(bal);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "cus_name='" + cus_name + '\'' +
                ", acc_no=" + acc_no +
                ", bal=" + bal +
                '}';
    }

    public void withdraw(int amt){
        if(bal!=0){
            bal -= amt;
            System.out.println("bal:"+bal);
            System.out.println(amt);

        }
        else{
            System.out.println("insufficent balance");
        }


    }
}


class Main20 {
    public static void main(String[] args) {
//        HashSet<BankAccount> bc =new HashSet<>();
//        BankAccount bd= new BankAccount("sindhuja",25204,25000);
//        bd.depoist(500);

        List<BankAccount> accounts = new ArrayList<>();
        Map<String, BankAccount> accountMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Bank Application");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Check Balance");
            System.out.println("5. List All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter account number: ");

                    String accountNumber = scanner.next();
                    System.out.print("Enter account holder name: ");
                    int accountHolder = (scanner.nextInt());
                    System.out.println("enter bal");
                    int bal1 = scanner.nextInt();
                    BankAccount newAccount = new BankAccount(accountHolder, accountNumber, bal1);
                    accounts.add(newAccount);
                    accountMap.put(accountNumber, newAccount);
                    System.out.println("Account created successfully!");
                    break;


                case 2:
                    System.out.print("Enter account number: ");
                    String depositAccountNumber = scanner.next();
                    BankAccount depositAccount = accountMap.get(depositAccountNumber);
                    if (depositAccount != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        depositAccount.depoist(depositAmount);
                    } else {
                        System.out.println("Account not found with account number: " + depositAccountNumber);
                    }
                    break;
                case 3:
                    System.out.println("emter tye amount:");
                    int accnum = scanner.nextInt();
                    BankAccount hi = accountMap.get(accnum);
                    if (hi != null) {
                        System.out.println("amt????");
                        int amount = scanner.nextInt();
                        hi.withdraw(amount);

                    }
                case 4:
                    System.out.print("Enter account number: ");
                    String depositAccountNumber1 = scanner.next();
                    BankAccount bal = accountMap.get(depositAccountNumber1);

                    bal.checkbalance();


                case 5:
                    System.out.println("All Accounts:");
                    for (BankAccount account : accounts) {
                        System.out.println(account);
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);

            }
        }
    }
}
