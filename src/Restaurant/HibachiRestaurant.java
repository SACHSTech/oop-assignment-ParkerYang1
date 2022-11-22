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
        int optionA;
        int optionB;
        String optionC;
        boolean takeOrder = false;
        int orderID = 0;
        int quantity;
        int sauce;
        int rice;
        int pay;
        double price = 0.0;
        double total; 
        double totalRounded;
        double cost = 0.0;

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
                    System.out.println("");
                    optionA = Integer.parseInt(key.readLine());

                    if (optionA == 1){
                        takeOrder = true;

                        while (takeOrder == true){
                            System.out.println("\n----- Noodles Options -----");
                            System.out.println("1. Chicken Stir Fry Noodles ($15.99)");
                            System.out.println("2. Beef Stir Fry Noodles ($19.99)");
                            System.out.println("3. Pork Stir Fry Noodles ($17.99)");
                            System.out.println("4. Vegan Stir Fry Noodles ($12.99)");
                            System.out.println("-----------------------------");
                            System.out.print("\nChoose an option (1 - 4). Enter 0 to complete order: ");
                            optionB = Integer.parseInt(key.readLine());

                                if (optionB == 1){
                                    orderID = 12567;
                                    price = 15.99;
                                } else if(optionB == 2){
                                    orderID = 17912;
                                    price = 19.99;
                                } else if (optionB == 3){
                                    orderID = 12571;
                                    price = 17.99;
                                } else if(optionB == 4){
                                    orderID = 10912;
                                    price = 12.99;
                                } else if (optionB == 0){
                                    System.out.println("Subtotal: $" + cost);
                                    total = cost * 1.13;
                                    totalRounded = Math.round(total * 100.0) / 100.0;
                                    System.out.println("Total: $" + totalRounded);
                                    break;
                                }

                                System.out.print("Enter quantity: ");
                                quantity = Integer.parseInt(key.readLine());
                                System.out.println("\n--- Sauce Options ---");
                                System.out.println("1. Sweet & Sour Sauce");
                                System.out.println("2. Spicy Sauce");
                                System.out.println("3. Soy Sauce");
                                System.out.print("Enter an Option: ");
                                sauce = Integer.parseInt(key.readLine());

                                if(sauce == 1){
                                    optionC = "wweet & sour sauce";
                                } else if (sauce == 2){
                                    optionC = "spicy sauce";
                                } else {
                                    optionC = "soy sauce";
                                } 

                                while(sauce > 3 || sauce < 0){
                                    System.out.println("\n--- INVALID ---");
                                    System.out.println("--- Enter a valid option ---");
                                    sauce = Integer.parseInt(key.readLine());
                                }

                                Noodles A = new Noodles(orderID, quantity, optionC);
                                System.out.println("\n" + A);
                                cost = cost + (price * quantity);
                                System.out.println("");
                        }
                        
                    } if (optionA == 2){
                        takeOrder = true;

                        while (takeOrder == true){
                            System.out.println("----- Rice Options -----");
                            System.out.println("1. Chicken Fried Rice ($15.99)");
                            System.out.println("2. Beef Fried Rice ($19.99)");
                            System.out.println("3. Pork Fried Rice ($17.99)");
                            System.out.println("4. Vegan Fried Rice ($12.99)");
                            System.out.println("-----------------------------");
                            System.out.print("\nChoose an option (1 - 4). Enter 0 to complete order: ");
                            optionB = Integer.parseInt(key.readLine());

                                if (optionB == 1){
                                    orderID = 69712;
                                    price = 15.99;
                                } else if(optionB == 2){
                                    orderID = 61259;
                                    price = 19.99;
                                } else if (optionB == 3){
                                    orderID = 61925;
                                    price = 17.99;
                                } else if(optionB == 4){
                                    orderID = 67801;
                                    price = 12.99;
                                } else if(optionB == 0){
                                    System.out.println("Subtotal: $" + cost);
                                    total = cost * 1.13;
                                    totalRounded = Math.round(total * 100.0) / 100.0;
                                    System.out.println("Total: $" + totalRounded);
                                    break;
                                }

                                System.out.print("Enter quantity: ");
                                quantity = Integer.parseInt(key.readLine());
                                System.out.println("\n--- Rice Options ---");
                                System.out.println("1. White Rice");
                                System.out.println("2. Brown Rice");
                                System.out.println("3. Cauliflower Sauce");
                                System.out.print("Enter an Option: ");
                                rice = Integer.parseInt(key.readLine());

                                if(rice == 1){
                                    optionC = "white Rice";
                                } else if (rice == 2){
                                    optionC = "brown Rice";
                                } else {
                                    optionC = "cauliflower Sauce";
                                } 

                                while(rice > 3 || rice < 0){
                                    System.out.println("\n--- INVALID ---");
                                    System.out.println("--- Enter a valid option ---");
                                    sauce = Integer.parseInt(key.readLine());
                                }

                                Rice A = new Rice(orderID, quantity, optionC);
                                System.out.println("\n" + A);
                                cost = cost + (price * quantity);
                                System.out.println("");
                        }
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

