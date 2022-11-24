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

        // Variables
        int enter;
        String fName;
        String lName;
        String address;
        String email;
        int numCustomers;
        int optionA = 0;
        int optionB;
        String optionC;
        boolean takeOrder = false;
        int orderID = 0;
        int quantity;
        int sauce;
        int rice;
        double change;
        double pay;
        double price = 0.0;
        double total; 
        double totalRounded;
        double cost = 0.0;
        boolean chooseOption = true;
        boolean end = false;

        // Enter restaurant
        System.out.print("\nPress 0 to enter the restaurant. ");
        enter = Integer.parseInt(key.readLine());
        
        while(enter != 0) {
            System.out.println("\nSee you later.");
            System.out.print("Press 0 to enter the restaurant. ");
            enter = Integer.parseInt(key.readLine());
        }

        // Welcome 
        if(enter == 0){
            System.out.println("\nWelcome to Parker's Hibachi Restaurant!");
            System.out.print("Enter number of customers: ");
            numCustomers = Integer.parseInt(key.readLine());
            
            // Enter user information
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

                // Objects are made and printed 
                Customer customer = new Customer(fName, lName, address, email);
                Chef head = new Chef("Timmy", "Lee", 70000);
                System.out.println("\n" + customer);
                System.out.println("\n" + head);
                Menu menu = new Menu(numCustomers);

                
                while(chooseOption == true && end == false){
                    end = false;
                    // Menu
                    System.out.println(menu);
                    System.out.println("\n----- Menu -----");
                    System.out.print("Press 1 for noodles options and 2 for rice options. ");
                    System.out.print("");
                    optionA = Integer.parseInt(key.readLine());
                    // Code for noodles option
                    if (optionA == 1){
                        takeOrder = true;

                        while (takeOrder == true && end == false){
                            System.out.println("\n----- Noodles Options -----");
                            System.out.println("1. Chicken Stir Fry Noodles ($15.99)");
                            System.out.println("2. Beef Stir Fry Noodles ($19.99)");
                            System.out.println("3. Pork Stir Fry Noodles ($17.99)");
                            System.out.println("4. Vegan Stir Fry Noodles ($12.99)");
                            System.out.println("-----------------------------");
                            System.out.print("\nChoose an option (1 - 4). Enter 0 to complete order: ");
                            optionB = Integer.parseInt(key.readLine());

                            while (optionB > 4 || optionB <= -1){
                                System.out.println("\n--- INVALID ---");
                                System.out.print("Choose an option (1 - 4). Enter 0 to complete order: ");
                                optionB = Integer.parseInt(key.readLine());
                            }

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
                                // Pay for meal
                                System.out.println("Subtotal: $" + cost);
                                total = cost * 1.13;
                                totalRounded = Math.round(total * 100.0) / 100.0;
                                System.out.println("Total: $" + totalRounded);

                                System.out.print("Enter the EXACT amount to pay: $");
                                pay = Double.parseDouble(key.readLine());

                                while (pay < totalRounded){
                                    System.out.print("Enter the EXACT amount to pay: $");
                                    pay = Double.parseDouble(key.readLine());
                                }

                                if (pay == totalRounded){
                                    System.out.println("Thank you for coming! See you again.");
                                } else if (pay > totalRounded){
                                    change = Math.round((pay - totalRounded) * 100.0) / 100.0;;
                                    System.out.println("Change: $" + change);
                                    
                                }
                                end = true;
                                break;
                            } 

                            if(end == true){
                                continue;
                            }

                            // Options for meal
                            System.out.print("Enter quantity: ");
                            quantity = Integer.parseInt(key.readLine());
                            System.out.println("\n--- Sauce Options ---");
                            System.out.println("1. Sweet & Sour Sauce");
                            System.out.println("2. Spicy Sauce");
                            System.out.println("3. Soy Sauce");
                            System.out.print("Enter an Option: ");
                            sauce = Integer.parseInt(key.readLine());

                            if(sauce == 1){
                                optionC = "sweet & sour sauce";
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

                            // Print out constructor 
                            Noodles A = new Noodles(orderID, quantity, optionC);
                            System.out.println(A);
                            cost = cost + (price * quantity);
                            System.out.println("");
                            
                        }
                    // Code for rice option
                    } else if (optionA == 2){
                        takeOrder = true;

                        while (takeOrder == true && end == false){
                            // Menu
                            System.out.println("----- Rice Options -----");
                            System.out.println("1. Chicken Fried Rice ($15.99)");
                            System.out.println("2. Beef Fried Rice ($19.99)");
                            System.out.println("3. Pork Fried Rice ($17.99)");
                            System.out.println("4. Vegan Fried Rice ($12.99)");
                            System.out.println("-----------------------------");
                            System.out.print("\nChoose an option (1 - 4). Enter 0 to complete order: ");
                            optionB = Integer.parseInt(key.readLine());

                            while (optionB > 4 || optionB <= -1){
                                System.out.println("\n--- INVALID ---");
                                System.out.print("Choose an option (1 - 4). Enter 0 to complete order: ");
                                optionB = Integer.parseInt(key.readLine());
                            }

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
                                // Pay for meal
                                System.out.println("Subtotal: $" + cost);
                                total = cost * 1.13;
                                totalRounded = Math.round(total * 100.0) / 100.0;
                                System.out.println("Total: $" + totalRounded);

                                System.out.print("Enter the EXACT amount to pay: $");
                                pay = Double.parseDouble(key.readLine());

                                while (pay < totalRounded){
                                    System.out.print("Enter the EXACT amount to pay: $");
                                    pay = Double.parseDouble(key.readLine());
                                }

                                if (pay == totalRounded){
                                    System.out.println("Thank you for coming! See you again.");
                                } else if (pay > totalRounded){
                                    change = Math.round((pay - totalRounded) * 100.0) / 100.0;;
                                    System.out.println("Change: $" + change);
                                }
                                end = true;
                                break;
                            } 

                            if(end == true){
                                continue;
                            }

                            // Option for meal
                            System.out.print("Enter quantity: ");
                            quantity = Integer.parseInt(key.readLine());
                            System.out.println("\n--- Rice Options ---");
                            System.out.println("1. White Rice");
                            System.out.println("2. Brown Rice");
                            System.out.println("3. Cauliflower Rice");
                            System.out.print("Enter an Option: ");
                            rice = Integer.parseInt(key.readLine());

                            if(rice == 1){
                                optionC = "white rice";
                            } else if (rice == 2){
                                optionC = "brown rice";
                            } else {
                                optionC = "cauliflower rice";
                            } 

                            while(rice > 3 || rice < 0){
                                System.out.println("\n--- INVALID ---");
                                System.out.println("--- Enter a valid option ---");
                                rice = Integer.parseInt(key.readLine());
                            }

                            Rice A = new Rice(orderID, quantity, optionC);
                            System.out.println("\n" + A);
                            cost = cost + (price * quantity);
                            System.out.println("");
                        } 
                    }else {
                        // Invalid options 
                            System.out.println("\nPlease enter a valid option");
                            continue;
                    }
                }
                
            
                
            } else if (numCustomers <= 0) {
                System.out.println("\n--- INVALID ---");
                System.out.print("Enter number of customers: ");
                numCustomers = Integer.parseInt(key.readLine());
            } else {
                System.out.println("\nSorry we do not have a table right now.");
            }
        }
    } 
}

