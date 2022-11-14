package Restaurant;

public class Menu {
    // Instance variables
    private int menus;

    /**
     * Constructor for menu 
     * @param menusGiven Number of menus given 
     * @author: Parker Yang
     * 
     */
    public Menu(int menusGiven){
        this.menus = menusGiven;
    }

    /**
     * Getter method for menus given
     * @return Menus given 
     * @author: Parker Yang
     */
    public int getMenuGiven(){
        return menus;
    }
}
