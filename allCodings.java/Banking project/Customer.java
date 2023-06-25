/**
 * describes the information about customer
 */
public class Customer {
    // instance variables 

    /**
     * Name of the customer
     */
    String name;

    /**
     * Address of the customer
     */
    String address;

    /**
     * Age of the customer
     */
    int age; 
    
    /**
     * customer fathers name
     */
    String fatherName;

    /**
     * Phone number of the customer
     */
    int PhoneNo;

    // Constructor

    /**
     * create a customer
     * @param name of the customer
     */
    Customer (String name) {
        this.name = name;
    }

    // Methods
    //Setter Method
     
    /**
     * Set the address for the customer
     * @param address to be assigned for customer
     */
    public void setAddress(String address){
        this.address = address;
    }

    /**
     * Set the age for the customer
     * @param age to be assigned for customer
     */
    public void setAge(int age){
        this.age = age ;
    }
    
    /**
     * Set the FatherNames for the customer
     * @param fatherName to assigned for customer
     */
    public void setFatherName(String fatherName){
        this.fatherName = fatherName ;
    }
    
    /**
     * Set the Phone number for the customer
     * @param PhoneNo to assigned for customer
     */
    public void setPhoneNO(int PhoneNo){
        this.PhoneNo = PhoneNo ;
    }

    // Getter Method
    
    /**
     * @return the name of the customer
     */
    public String getName(){
        return this.name;

    }
    
    /**
     * @return the Address of the customer
     */
    public String getAddress(){
        return this.address;
    }
    
    /**
     * @return the Age of the customer
     */
    public int getAge(){
        return this.age;
    }
    
    /**
     * @return the Father Name of the customer
     */
    public String getfatherName(){
        return this.fatherName;
    }
     
    /**
     * @return the phone number of the customer
     */
     public int getPhoneNo(){
        return this.PhoneNo;
    }





}
