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
     * @param totalCustomers Total # of customers in the restaurant
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
     * @return total # of customers in the restaurant
     * @author: Parker Yang
     * 
     */
    public int getNumCustomers(){ 
        return numCustomers; 
    }
}
