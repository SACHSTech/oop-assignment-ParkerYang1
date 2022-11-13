package Restaurant;

/**
 * OOP Assignment Rice class
 * @author: Parker Yang
 * 
 */

public class Rice extends Food{
    // Instance variables
    private String type;

    /**
     * Constructor for rice
     * @param orderID The number code for each food
     * @param numServings Numbers of servings for each food
     * @param riceType Type of rice for the dish
     * @author: Parker Yang
     * 
     */
    public Rice(int orderID, int numServings, String riceType){
        super(orderID, numServings);
        this.type = riceType;
    }

    /**
     * Getter method for type of rice
     * @return Type of rice
     * @author: Parker Yang
     * 
     */
    public String getType(){
        return type;
    }
}
