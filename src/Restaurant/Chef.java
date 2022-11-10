package Restaurant;

/**
* OOP Assignment Chef class
* @author: Parker Yang
* 
*/

public class Chef extends Human{
    // Instance variables 
    private int salary; 

    /**
     * Constructor for Chef
     * @param fName First name
     * @param lName Last name
     * @param jobSalary Salary for chef
     * @author: Parker Yang
     * 
     */
    public Chef(String fName, String lName, int jobSalary){
        super(fName, lName);
        this.salary = jobSalary;
    }

    /**
     * Getter method for salary 
     * @return Salary 
     * @author: Parker Yang
     * 
     */
    public int getSalary(){
        return salary;
    }

    /**
     * Outputs sentence with information about the chef
     * @return Introduction of chef
     * @author: Parker Yang
     * 
     */
    public String toString(){
        return "Hello, my name is" + this.getFirstName() + " " + this.getLastName() + " and I will be your chef for today. " + "(Salary: " + salary + ")"; 
    }

}
