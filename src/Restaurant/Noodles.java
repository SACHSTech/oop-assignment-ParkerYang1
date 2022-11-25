package Restaurant;

/**
 * OOP Assignment Noodles class
 * @author: Parker Yang
 * 
 */

public class Noodles extends Food{
    // Instance variables
    private String sauce;

    /**
     * Constructor for noodles 
     * @param orderID The number code for each food
     * @param numServings Numbers of servings for each food
     * @param noodleSauce Sauce for the noodles 
     * @author: Parker Yang
     * 
     */
    public Noodles(int orderID, int numServings, String noodleSauce){
        super(orderID, numServings);
        this.sauce = noodleSauce;
    }

    /**
     * Getter method for sauce 
     * @return The sauce for the noodles 
     * @author: Parker Yang
     * 
     */
    public String getSauce(){
        return sauce; 
    }

    /**
     * Converts the order info to a String
     * @return Information of order
     * @author: Parker Yang
     * 
     */
    public String toString(){
        return "We will get " + this.getQuantity() + " servings of #" + this.getOrderNum() + " with " + this.getSauce() + ".";
    }
}

