package Week8;
public class ATM
{
    public static void main(String[] args)
    {
    BankAccount b1= new BankAccount(1000001L, 50000.00, "Bishesta");
    System.out.println("Initial Balance:" + b1.getBalance());
    b1.deposit(4000);
    System.out.println("Balance after deposit:" + b1.getBalance());
    if (b1.withdraw(7000))
    {
        System.out.println("Successful!");
    }
    else
    {
        System.out.println("Insufficicent Balance!");
    }
    System.out.println("Final Balance:" + b1.getBalance());
    }
}
