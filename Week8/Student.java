package Week8;
public class Student
{
    //Attributes
    private int id;
    private String name;
    private String address;
    private long number;
    private static String collegeName="Islington";
    
    //Constructors
    public Student(int id, String name, String address, long number)
    {
        this.id=id;
        this.name=name;
        this.address=address;
        this.number=number;
    }
    
    //Getters and Setters method
    public void setId(int id)
    {
        this.id=id;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public void setName(String name)
    {
        this.name=name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setAddress(String address)
    {
        this.address=address;
    }
    
    public String getAddress()
    {
        return this.address;
    }
    
    public void setNumber(long number)
    {
        this.number=number;
    }
    
    public long getNumber()
    {
        return this.number;
    }
    
    public void setCollegeName(String collegeName)
    {
        this.collegeName=collegeName;
    }
    
    public String getCollegeName()
    {
        return this.collegeName;
    }
    
    //Method to display info
    void display()
    {   
        System.out.println("Student ID:" + id);
        System.out.println("Student Name:" + name);
        System.out.println("Student Address:" + address);
        System.out.println("Student Phone Number:" + number);
        System.out.println("College Name:" +collegeName );
    }
}