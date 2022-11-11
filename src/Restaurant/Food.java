package Restaurant;

/**
 * OOP Assignment Food superclass
 * @author: Parker Yang
 * 
 */

public class Food {
    // Instance variables
    private int orderNum;
    private int quantity; 

    /**
     * Constructor for food 
     * @param orderID The number code for each food
     * @param numServings Numbers of servings for each food
     * @author: Parker Yang 
     * 
     */
    public Food(int orderID, int numServings){
        orderNum = orderID;
        quantity = numServings; 
    }

    /**
     * Getter method for order number
     * @return The number code for the desired food
     * @author: Parker Yang
     * 
     */
    public int getOrderNum(){
        return orderNum;
    }

    /**
     * Getter method for quantity 
     * @return Quantity of servings for each food
     * @author: Parker Yang
     * 
     */
    public int getQuantity(){
        return quantity; 
    } 
}
