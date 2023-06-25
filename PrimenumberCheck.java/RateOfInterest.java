import java.util.Scanner;
public class RateOfInterest {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the name");
    String name = sc.next();
    
    System.out.println("Enter the age");
    int age = sc.nextInt();

    System.out.println("Enter the rate of interest");
    double rate = sc.nextDouble();

    System.out.println("age = " + age);
    System.out.println("rate = " + rate*rate);
    System.out.println("name = " + name);



  } 
}
