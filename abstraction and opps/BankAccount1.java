abstract class BankAccount1 {
    protected String accnum;
    protected String accHolname;
    protected double bal;
    public BankAccount1(String accnum, double bal, String accHolname) {
        this.accnum = accnum;
        this.bal = bal;
        this.accHolname = accHolname;
    }

//    public void setAccnum(String accnum){
//        this.accnum = accnum;
//    }
//    public void setAccHolname(String accHolname){
//        this.accHolname = accHolname;
//
//    }
//    public void setBal(double bal){
//        this.bal = bal;
//    }
    public  abstract String getAccnum();
    public abstract String getAccHolname();
    public abstract Double getBal();
    public abstract void  depoist(double amt);

    public abstract void withdraw(double amt);




}
class SavingsAccount extends BankAccount1{
    double interestrate;
    SavingsAccount(String accnum, double bal, String accHolname,double interestrate) {
        super(accnum, bal, accHolname);
        this.interestrate = interestrate;
    }

    @Override
    public String getAccnum() {
        return accnum;
    }

    @Override
    public String getAccHolname() {
        return accHolname;
    }

    @Override
    public Double getBal() {
        return bal;
    }

    @Override
    public void depoist(double amt) {
        if (amt > 0) {
            bal += amt;
            System.out.println("Deposit Successful. New Balance: " + bal);
        } else {
            System.out.println("Invalid amount");
        }

    }

    @Override
    public void withdraw(double amt) {
        if(super.bal - amt<=0){
            System.out.println("no cash");
        }
        else{
            super.bal -= amt;
            System.out.println("balnce of saving :"+bal);

        }

    }
}


class CheckingAccount extends BankAccount1{
    double overdraftlift;

    public CheckingAccount(String accnum, double bal, String accHolname,double overdraftlift) {
        super(accnum, bal, accHolname);
        this.overdraftlift = overdraftlift;
    }

    @Override
    public String getAccnum() {
        return accnum;
    }

    @Override
    public String getAccHolname() {
        return accHolname;
    }

    @Override
    public Double getBal() {
        return bal;
    }

    @Override
    public void depoist(double amt) {
        if (amt > 0) {
            bal += amt;
            System.out.println("Deposit Successful. checking New Balance: " + bal);
        } else {
            System.out.println("Invalid amount");
       }
    }

//    @Override
//    public void withdraw(double amt) {
//        super.withdraw(amt);
//    }



    @Override
    public void withdraw(double amt) {
        if(bal - amt<=0){
            System.out.println("no cash");
        }
        else{
            bal -= amt;
            System.out.println("check bal:"+bal);
        }
    }
}
