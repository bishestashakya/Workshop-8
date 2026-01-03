package Week8;
public class StudentTest
{
   public static void main(String[] args)
   {
       Student s1= new Student(101, "Bishesta", "Satdobato", 9768950493L);
       
       /* Student s1=new Student();
       s1.setName("Bishesta");
       System.out.println(s1.getName());
       
       //Read values using getters
       System.out.println("Student Id:" + s1.getId());
       System.out.println("Student Name:" + s1.getName());
       System.out.println("Student Address:" + s1.getAddress());
       System.out.println("Student Number:" + s1.getNumber());
       System.out.println("College Name:" + s1.getCollegeName());
       
       //Update values using setters
       s1.setName("Aarav");
       System.out.println("Student Name:" + s1.getName()); */
       
       s1.display();

   }
}