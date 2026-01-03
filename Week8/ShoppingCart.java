package Week8;


/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    private String itemName;
    private double itemPrice;
    private double quantity;
    
    ShoppingCart(String itemName, double itemPrice, double quantity)
    {
        this.itemName=itemName;
        this.itemPrice=itemPrice;
        this.quantity=quantity;
    }
    public void setQuantity(double quantity)
    {
        this.quantity=quantity;
    }
    public double getQuantity()
    {
        return this.quantity;
    }
    public double calculateTotal()
    {
        return (itemPrice*quantity);
    }
    public double calculateDiscountedTotal(double discountPercent)
    {
        return itemPrice=itemPrice-(0.20*itemPrice);
    }
    public void display()
    {
        System.out.println("Item Name:" + itemName);
        System.out.println("Item Price:" + itemPrice);
        System.out.println("Item Quantity:" + quantity);
    }
}