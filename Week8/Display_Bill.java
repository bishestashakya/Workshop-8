package Week8;


/**
 * Write a description of class Display_Bill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Display_Bill
{
    public static void main(String[] args)
    {
        ElectricityBill e1= new ElectricityBill("Bishesta", 200);
        System.out.println("Units Consumed:" + e1.getunitsConsumed());
        System.out.println("Total Bill:" + e1.calculateBill());
    }
}