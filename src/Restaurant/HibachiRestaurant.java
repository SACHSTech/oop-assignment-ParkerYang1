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
     * Main method to run all the code/interface
     * @author: Parker Yang
     * 
     */
    public static void main(String[] args) throws IOException{
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
        int optionA;
        int optionB;
        int quantity;
        int orderNum;

        System.out.print("\nPress 0 to enter the restaurant. ");
        enter = Integer.parseInt(key.readLine());
        
        while(enter != 0) {
            System.out.println("\nSee you later.");
            System.out.print("Press 0 to enter the restaurant. ");
            enter = Integer.parseInt(key.readLine());
        }

        if(enter == 0){
            System.out.println("\nWelcome to Parker's Hibachi Restaurant!");
            System.out.print("Enter number of customers: ");
            numCustomers = Integer.parseInt(key.readLine());
            // totalCustomers = totalCustomers + numCustomers;
            
                if(numCustomers < 10 && numCustomers > 0){
                    System.out.println("\nIn order to reserve a table, please enter the information of a member in the party. ");
                    System.out.print("Enter your first name: ");
                    fName = key.readLine();
                    System.out.print("Enter your last name: ");
                    lName = key.readLine();
                    System.out.print("Enter your address: ");
                    address = key.readLine();
                    System.out.print("Enter your email: ");
                    email = key.readLine();

                    Customer customer = new Customer(fName, lName, address, email);
                    System.out.println("\n" + customer);

                    System.out.println("\n" + head);

                    System.out.println("\n----- Menu -----");
                    System.out.print("Press 1 for noodles options and 2 for rice options. ");
                    optionA = Integer.parseInt(key.readLine());

                    if (optionA == 1){
                        System.out.println("\n----- Noodles Options -----");
                        System.out.println("1. Chicken Stir Fry Noodles");
                        System.out.println("2. Beef Stir Fry Noodles");
                        System.out.println("3. Pork Stir Fry Noodles");
                        System.out.println("4. Vegan Stir Fry Noodles");
                        System.out.println("-----------------------------");
                        System.out.print("\nChoose an option. ");
                        optionB = Integer.parseInt(key.readLine());

                        

                    } else if (optionA == 2){
                        System.out.println("\n----- Rice Option -----");
                        System.out.println("1. Chicken Fried Rice");
                        System.out.println("2. Beef Fried Rice");
                        System.out.println("3. Pork Fried Rice");
                        System.out.println("4. Vegan Fried Rice");
                    } else {
                        System.out.println("\nPlease enter a valid option");
                    }
                    
                } else if (numCustomers < 0) {
                    System.out.println("\n--- INVALID ---");
                } else {
                    System.out.println("\nSorry we do not have a table right now.");
                }
        }
    } 
}

