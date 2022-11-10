package Restaurant;

/**
 * OOP Assignment customer class
 * @author: Parker Yang
 * 
 */

public class Customer extends Human{
    //Instance variables 
    private String address;
    private int customers; 

    /**
     * Constructor for customer
     * @param fName First name
     * @param lName Last name
     * @param customerAddress Address 
     * @param totalCustomers Total # of customers in the restaurant
     * 
     */
    public Customer(String fName, String lName, String customerAddress, int totalCustomers){
        super(fName, lName);
        this.address = customerAddress; 
        this.customers = totalCustomers;
    }
}
