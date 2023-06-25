/**
 * Represnt a current account / savings account for a customer
 */
public class BankAccount {
    // Instance variables

    /**
     * Type of account (current/savings)
     */
    String AccountType;

    /**
     * Balance of the account
     */
    double balance;

    /**
     * Customer of the  bank account
     */
    Customer customer;

    // constructor
    
    /**
     * creates the bank account of given type  for the customer
     * @param AccountType is either savings or current account
     * @param customer from the Coustomer.java user defined type
     * @param balance it shows the balance of the bank account
     */
    BankAccount (String AccountType , Customer customer){
        this.AccountType = AccountType;
        this.customer = customer;
        
    }

    // Methods 
    
    /**
     * Deposits the given amount
     * @param amount to be added
     */
    public void deposit(double amount){  //doubt
        this.balance = this.balance + amount ; // this.balance += amount
    }

    /**
     * Withdraw the given amount
     * @param amount to be withdrawn the amount from bank account
     */
     public void withdraw(double amount){
        if(this.balance > amount){
        this.balance = this.balance - amount;  // this.balance -= amount
        }
        else{
            System.out.println(" The amount can't be withdrawn ");
        }
    }

    // Getter method 
     
    /**
     * print the account information for this bank account
     * @return account information is returned
     */
      public String getAccountInfo(){
        return this.AccountType + " " + this.balance;
    }
    
    /**
     * print the customer information for this bank account
     * @return customer information is returned
     */

    public String CustomerInfo(){
        return this.customer.name + " " + this.customer.address + " " + this.customer.age + this.customer.fatherName + " " + this.customer.PhoneNo ;
    }  
    
    public double getInterestPayment(double amount ,double rate_of_interest ,int time_in_years){
        double interest = (amount * rate_of_interest * time_in_years)/100;
        return interest;
    }
}



