package Week8;


/**
 * Write a description of class Patient_Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Patient_Main
{
    public static void main(String[] args)
    {
        Patient p1= new Patient("Bishesta", 22, 18, 2000);
        Patient p2= new Patient("Aarav", 25, 14, 3000);
        p1.display();
        System.out.println("Total Bill:" + p1.calculateTotalBill());
        p2.display();
        System.out.println("Total Bill:" + p2.calculateTotalBill());
    }
}