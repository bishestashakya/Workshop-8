package Week8;
public class Employee
{
    private double basicSalary;
    
    Employee(double basicSalary)
    {
        this.basicSalary=basicSalary;
    }
    
    public void setSalary(double salary)
    {
        this.basicSalary=basicSalary;
    }
    public double getSalary()
    {
        return this.basicSalary;
    }
    
    public double calculateGrossSalary()
    {
        double grossSalary;
        return grossSalary=basicSalary + (0.20*basicSalary);
    }
    public double getBasicSalary()
    {
        return basicSalary;
    }
}