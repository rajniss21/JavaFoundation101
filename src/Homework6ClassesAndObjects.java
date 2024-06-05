public class Homework6ClassesAndObjects {

    public static void main(String[] args) {
        System.out.println("Assignment");
    /*
    Homework #6 - Classes and Objects
    1.) Initialize a bank account with a balance of $500.
    2.) Deposit $150 into the account.
    3.) Withdraw $50 from the account, balance should be correct
    4.) Use an if statement to check if the final balance matches the expected result ($600).
    5.) Print the balance directly and provide a message indicating whether the balance is correct.
    */

        BankingAccount myAccount = new BankingAccount();
        myAccount.deposit(500); // Initial deposit
        // Please finish the rest

    }
} // Closing brace for the Main class

class BankingAccount {

    public int balance;

    // Method to deposit money into the account
    public void deposit(int amount) {
        // Add logic here
    }

    // Method to withdraw money from the account
    public void withdraw(int amount) {
        // Add logic here
    }
} // Closing brace for the BankingAccount class

