package bankaccountapp;

public class Checking extends Account {
    //Lists properties specific to a checking account
    private int debitCardNumber;
    private int debitCardPin;


    //Constructor to initialize checking account properties
    public Checking(String name, String ssn, double initDeposit){
        super(name, ssn, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();

        //Code below is to test output before creating show info method
        //System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        //System.out.println("NEW CHECKING ACCOUNT");
    }

     private void setDebitCard(){
         debitCardNumber = (int) (Math.random() * Math.pow(10,12));
         debitCardPin = (int)(Math.random() * Math.pow(10,4));
     }

     @Override
     public void setRate(){
        rate=getBaseRate()*.15;

     }
    //List any methods specific to the checking account
    public void showInfo() {
        super.showInfo();
        System.out.println("\nYour Checking account features" +
                "\nDebit Card Number:" + debitCardNumber +
                "\nDebit Card PIN: " + debitCardPin +"\n"
        );

    }







}
