package Restaurant;
import java.io.*;
import java.util.*;

/**
 * OOP Assignment user interface 
 * @author: Parker Yang 
 * 
 */

public class HibachiRestaurant{
    /**
     * Call all the methods
     * @author: Parker Yang
     * 
     */
    public static void main(String[] args) throws IOException{
        welcome();
    }

    /**
     * Welcomes customer and gets info
     * @author: Parker Yang
     * 
     */
    public static void welcome() throws IOException{
        BufferedReader key = new BufferedReader(new InputStreamReader(System.in));

        // Creating new objects
        Chef head = new Chef("Timmy", "Lee", 70000);

        // Variables
        int enter;
        String fName;
        String lName;
        String address;
        String email;
        int numCustomers;
        int totalCustomers = 0; 

        System.out.print("Press 0 to enter the restaurant. ");
        enter = Integer.parseInt(key.readLine());

        if(enter == 0){
            System.out.println("Welcome to Parker's Hibachi Restaurant!");
            System.out.print("Enter number of customers: ");
            numCustomers = Integer.parseInt(key.readLine());
            totalCustomers = totalCustomers + numCustomers;
            
                if(numCustomers < 10){
                    System.out.print("In order to reserve a table, please enter the information of a member in the party. ");
                    System.out.print("Enter your first name: ");
                    fName = key.readLine();
                    System.out.print("Enter your last name: ");
                    lName = key.readLine();
                    System.out.print("Enter your address: ");
                    address = key.readLine();
                    System.out.print("Enter your email: ");
                    email = key.readLine();

                    Customer customer = new Customer(fName, lName, address, email);
                    System.out.println(customer);
                } else {
                    System.out.println("Sorry we do not have a table big enough to fit that many people");
                }
        } else {
            System.out.println("See you later.");
        }
    }
    /**
     * Simulates dinner service
     * @author: Parker Yang
     * 
     */
    public static void service() throws IOException{

    }
}
