package Week8;


/**
 * Write a description of class Employee_Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employee_Main
{
    public static void main(String[] args)
    {
    Employee e1= new Employee(55000.00);
    System.out.println("Basic Salary:" + e1.getBasicSalary());
    System.out.println("Basic Salary:" + e1.calculateGrossSalary());
    }  
}