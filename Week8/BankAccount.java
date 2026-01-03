package Week8;
public class BankAccount
{
    private long accNumber;
    private double balance;
    private String name;
    BankAccount(long accNumber, double balance, String name)
    {
        this.accNumber=accNumber;
        this.balance=balance;
        this.name=name;
    }
    
    public void setBalance(double balance)
    {
        this.balance=balance;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    
    
    
    
    public void deposit(double amount)
    {
        balance=balance+amount;
    }
    
    public boolean withdraw(double amount)
    {
        if (amount>0 && amount<=balance)
        {
            balance=balance-amount;
            return true;
        }
        else
        {
            return false;
        }
    }
}