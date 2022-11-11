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
}
