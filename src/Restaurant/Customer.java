package Restaurant;

/**
 * OOP Assignment customer class
 * @author: Parker Yang
 * 
 */

public class Customer extends Human{
    //Instance and Class variables 
    private String address;
    private String email;
    private static int numCustomers = 0; 

    /**
     * Constructor for customer
     * @param fName First name
     * @param lName Last name
     * @param customerAddress Address 
     * @param customerEmail Email
     * 
     */
    public Customer(String fName, String lName, String customerAddress, String customerEmail){
        super(fName, lName);
        this.address = customerAddress; 
        this.email = customerEmail;
        
        numCustomers++; 
    }

    /**
     * Getter method to get number for customers
     * @return Total # of customers in the restaurant
     * @author: Parker Yang
     * 
     */
    public int getNumCustomers(){ 
        return numCustomers; 
    }

    /**
     * Getter method for email of customer
     * @return Address of the customer
     * @author: Parker Yang
     * 
     */
    public String getAddress(){
        return address; 
    }

    /**
     * Getter method for email of customer
     * @return Email of the customer
     * @author: Parker Yang
     * 
     */
    public String getEmail(){
        return email;
    }

    /** 
     * Converts the information of customer to a string 
     * @return: Customer perosnal information
     * @author: Parker Yang
     * 
     */
    public String toString(){
        return "Welcome " + this.getFirstName() + " " + this.getLastName() + "." + "(Address: " + this.getAddress() + ")" + " (Email: " + this.getEmail() + ")";
    }
}
