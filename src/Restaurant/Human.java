package Restaurant;

/**
* OOP Assignment Human Superclass
* @author: Parker Yang
* 
*/

public class Human {
    // Instance variables 
    private String firstName;
    private String lastName; 

    /**
     * Constructor for human
     * @param fName first name
     * @param lName last name
     * @author: Parker Yang
     */
    public Human(String fName, String lName){
        firstName = fName;
        lastName = lName;
    }

    /**
     * Getter method to get first name
     * @return first name
     * @author: Parker Yang
     */
    public String getFirstName(){
        return firstName;
    }

}
