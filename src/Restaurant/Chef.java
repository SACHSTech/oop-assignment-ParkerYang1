package Restaurant;

/**
* OOP Assignment Chef class
* @author: Parker Yang
* 
*/

public class Chef extends Human{
    private int salary; 

    /**
     * Constructor for Chef
     * @param fName first name
     * @param lName last name
     * @param jobSalary salary for chef
     * @author: Parker Yang
     */
    public Chef(String fName, String lName, int jobSalary){
        super(fName, lName);
        this.salary = jobSalary;
    }

    /**
     * Getter method for salary 
     * @return salary 
     * @author: Parker Yang
     */
    public int getSalary(){
        return salary;
    }
}
