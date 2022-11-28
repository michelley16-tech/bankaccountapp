package bankaccountapp;

public abstract class Account implements IBaseRate{

    //List common properties for savings account and checking account
    private String name;
    private String ssn;
    private double balance;
    private static int index = 10000;
    protected String accountNumber;
    protected double rate;


    //Constructor to set the base properties and in itialize the account
    public Account(String name, String ssn, double initDeposit) {
        this.name =name;
        this.ssn=ssn;
        balance=initDeposit;

        //Code below is to test output before creating show info method
        //System.out.println("NAME: "+name+ " SSN: "+ ssn+ " BALANCE: $"+balance);

        //Set account number
        index++;
        this.accountNumber = setAccountNumber();
        setRate();
    }

    public abstract void setRate();


    private String setAccountNumber(){
        String lastTwoofSSN = ssn.substring(ssn.length()-2, ssn.length());
        int uniqueID = index;

        int randomNumber = (int)(Math.random() *Math.pow(10,3));
        return lastTwoofSSN + uniqueID + randomNumber;
    }

    public void compound(){
        double accruedInterest = balance * (rate/100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: $" + accruedInterest);


    }
    //List common methods - transactions
   public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing $ " + amount);
   }
    public void withdraw(double amount){
        balance = balance - amount;
        System.out.println("Withdrawing $ " + amount);
    }
    public void transfer(String toWhere, double amount){
        balance = balance - amount;
        System.out.println("Transferring $ " + amount + " to " + toWhere);

    }
    public void printbalance() {
        System.out.println("Your balance is now: $" + balance);
    }

        //showInfo method
    public void showInfo(){
        System.out.println("NAME: " + name +"\nACCOUNT NUMBER: " + accountNumber + "\nBALANCE: " + balance + "\nRATE: " + rate +"%");



    }



}
