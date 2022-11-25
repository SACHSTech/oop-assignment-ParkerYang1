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
     * @param fName First name
     * @param lName Last name
     * @author: Parker Yang
     */
    public Human(String fName, String lName){
        firstName = fName;
        lastName = lName;
    }

    /**
     * Getter method to get first name
     * @return First name
     * @author: Parker Yang
     */
    public String getFirstName(){
        return firstName;
    }

    /**
     * Getter method to get last name
     * @return Last name
     * @author: Parker Yang
     */
    public String getLastName(){
        return lastName;
    }
}
