
import java.util.Scanner;

public class Asgm8 {
    private int age;
    private String name;
    private double weight,height;

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public double getWeight()
    {
        return weight;
    }

    public double getHeight()
    {
        return height;
    }

   public void setName(String name)
   {
    this.name = name;
   }

    public void setAge(int age)
   {
    this.age = age;
   }

   public void setWeight(double weight)
   {
    this.weight = weight;
   }

   public void setHeight(double height)
   {
    this.height = height;
   }

   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter your name: ");
    Asgm8 info = new Asgm8();
    info.setName(scan.nextLine());
    System.out.print("Enter your age: ");
    info.setAge(scan.nextInt());
    System.out.print("Enter your height in cm: ");
    info.setHeight(scan.nextDouble());
    System.out.print("Enter your weight: ");
    info.setWeight(scan.nextDouble());
    System.out.println();

    System.out.println("The person name is " 
    + info.getName() + " and he/she is " 
    + info.getAge() + "years old and his/her BMI is  "  
    + ((info.getHeight()-100))/info.getWeight());
   
    System.out.println();
}
   

}
