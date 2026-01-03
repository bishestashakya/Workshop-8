package Week8;


/**
 * Write a description of class ShoopingApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoopingApp
{
    public static void main(String[] args)
    {
        ShoppingCart s1= new ShoppingCart("Cookies", 500, 20.0);
        System.out.println("Total price before discount:" + s1.calculateTotal());
        System.out.println("Total price after discount:" + s1.calculateTotal());
        s1.display();
    }
}