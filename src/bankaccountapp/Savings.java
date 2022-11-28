package bankaccountapp;

public class Savings extends Account {

    //Lists properties specific to a savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;


    //Constructor to initialize savings account properties
    public Savings(String name, String ssn, double initDeposit){
           super(name, ssn, initDeposit);
           accountNumber = "1" + accountNumber;
           setSafetyDepositBox();
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));

    }

    @Override
    public void setRate(){
        rate=getBaseRate()-.25;

    }
           //Code below is to test output before creating show info method
        //System.out.println("ACCOUNT NUMBER: " + this.accountNumber);
        //System.out.println("NEW SAVINGS ACCOUNT");

       //List any methods specific to the savings account
        public void showInfo() {
            super.showInfo();
            System.out.println("\nYour Savings account features" +
                    "\nSafety Deposit Box ID:" + safetyDepositBoxID +
                    "\nSafety Deposit Box Key: " + safetyDepositBoxKey +"\n"
            );

        }





}
