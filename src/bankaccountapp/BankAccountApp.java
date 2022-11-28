package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
       List<Account> accounts = new LinkedList<Account>();

        //Read a CSV file and then create new accounts based on that data
        String file = "C:\\Users\\myrco\\Documents\\2022\\Coding\\2022 Portfolio\\Java\\NewBankAccounts.csv";

        List<String[]> newAccountHolders= Utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolders){
            System.out.println("NEW ACCOUNT");
            String name = accountHolder[0];
            String ssn = accountHolder[1];
            String accountType=accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);

            //System.out.println(name + " " + ssn + " " + accountType + " $" + initDeposit);

            if (accountType.equals("Savings")) {
                //System.out.println("Open a Savings Account");
                accounts.add(new Savings(name, ssn, initDeposit));
            }
            else if (accountType.equals("Checking")) {
                //System.out.println("Open a Checking Account");
                accounts.add(new Checking(name, ssn, initDeposit));
            }
            else {
                System.out.println("ERROR READING ACCOUNT TYPE");
            }

            for(Account acc : accounts){
                System.out.println("\n*************************************");
                acc.showInfo();
            }
        }

    }
}