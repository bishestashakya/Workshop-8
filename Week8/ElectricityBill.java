package Week8;


/**
 * Write a description of class ElectricityBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBill
{
    private String consumerName;
    private double unitsConsumed;
    
    ElectricityBill(String consumerName, double unitsconsumed)
    {
        this.consumerName=consumerName;
        this.unitsConsumed=unitsconsumed;
    }
    
    public void setunitsConsumed(double unitsConsumed)
    {
        this.unitsConsumed=unitsConsumed;
    }
    public double getunitsConsumed()
    {
        return this.unitsConsumed;
    }
    public double calculateBill()
    {
        double bill;
        if (unitsConsumed<=100)
        {
            bill=unitsConsumed*7.5;
        }
        else
        {
          bill=(100*7.5) +((unitsConsumed-100)*8);  
        }
        return bill;
    }
} 
