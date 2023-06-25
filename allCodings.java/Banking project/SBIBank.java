import java.util.Scanner;
/**
 * Represents a bank for managing customer and their Bank accounts
 */
public class SBIBank {
  // this is the main method for runs the program
  public static void main (String[] args){
   
    Scanner sc = new Scanner(System.in);
    /**
     *  mybank is an object for creating a bank
     */
    SBIBank myBank = new SBIBank();

    myBank.open();

    // Welcome message
    System.out.println("welcome to SBI Bank");
    String name = sc.nextLine();
    
    // Creates  the customer with given name
    Customer c1 = new Customer(name);

    // Greeting message
    System.out.println("We are creating a current and savings account for you :):)");
    
    // Taking address from the user
    System.out.println("What is your Address ?");
    String address = sc.next();

    // Sets the address to the customer
    c1.setAddress(address);

    // Taking the age input from the user
    System.out.println("Alright ! What is your Age ? ");
    int age = sc.nextInt();
 
    // sets  the age to the customer
    c1.setAge(age);

    // Taking the Father name from the user
    System.out.println(" What is your FatherName ?");
    String fatherName = sc.next();

    // sets the father name for the customer
    c1.setFatherName(fatherName);

    // Taking the Phone Number from the user 
    System.out.println(" What is your Phone Number ?");
    int PhoneNo = sc.nextInt();

    // sets the phone number for the customer
    c1.setPhoneNO(PhoneNo);


    BankAccount savingsAccount = new BankAccount("savings",c1);
    BankAccount currentAccount = new BankAccount("current",c1);
    BankAccount loanAccount = new BankAccount("loan",c1);

    System.out.println();

    System.out.println("customer Information is" + savingsAccount.getAccountInfo());
    System.out.println("Account Information  is" + savingsAccount.getAccountInfo());

    System.out.println("Mr.|Ms." + savingsAccount.customer.name);
    System.out.println("How much could you like to deposit from your savings account  ?");

    double depositAmount = sc.nextDouble();
    savingsAccount.deposit(depositAmount);
     
    System.out.println("Account Information is " + savingsAccount.getAccountInfo());

    System.out.println("Mr.|Ms." + savingsAccount.customer.name);
    System.out.println("How much could you like to withdraw from your saving account ?");

    double withdrawAmount = sc.nextDouble();
    savingsAccount.withdraw(withdrawAmount);

    System.out.println("Account Information is " + savingsAccount.getAccountInfo());

    System.out.println();

    System.out.println("customer Information is" + currentAccount.CustomerInfo());
    System.out.println("Account Information  is" + currentAccount.getAccountInfo());
    
    System.out.println("How Much would like yo deposit in your current account ?");
    double currentAmount = sc.nextDouble();
    currentAccount.deposit(currentAmount);

    System.out.println("Account Information is " + currentAccount.getAccountInfo());

    System.out.println("How much could you like to withdraw from your current account ?");
    double  currentwithdrawAmount = sc.nextDouble();
    currentAccount.withdraw(currentwithdrawAmount);
    
    System.out.println("Account Information is " + currentAccount.getAccountInfo());

    System.out.println("we have created a loan accountfor you");
    System.out.println("How loan do you want ?");
    double loanMoney = sc.nextDouble();

    System.out.println("when your repay your loan amount");
    int time_in_years = sc.nextInt();

    System.out.println("The rate of interest is ?");
    double rate_of_interest = sc.nextDouble();

    double interest = loanAccount.getInterestPayment(loanMoney, rate_of_interest, time_in_years);

    double debt = loanMoney + interest;
    System.out.println("you have a total debt of Rs." + debt);

    System.out.println("You have to pay interest of " + interest);

    System.out.println("your net balance will be" + (savingsAccount.balance + currentAmount -loanMoney -interest));

    myBank.close();

  }

  /**
   * Denotes the running status of the SBI Bank
   */

  public void open(){
    System.out.println("Our SBI bank is opened");
  }

  public void close(){
    System.out.println("Our SBI Bank is close :)");
  }
}