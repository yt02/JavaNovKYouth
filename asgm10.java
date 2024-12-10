class Car{
    int price;
    int priceCar(){
        price = 0;
        return price;
    }


}

class Toyota extends Car{
   int priceCar()
   {
       int price = 25000;
       return price;

   }
}

class BMW extends Car{
    int priceCar()
    {
        int price = 85000;
        return price;
 
    }
 }

 class Tesla extends Car{
    int priceCar()
    {
        int price = 75000;
        return price;
 
    }
 }

public class asgm10 {
    public static void main(String[] args) {
        
        Car car1 = new Toyota();
        System.out.println("price of toyota : RM " + car1.priceCar() + "\n");

        Car car2 = new BMW();
        System.out.println("price of BMW: RM " + car2.priceCar() + "\n");

        Car car3 = new Tesla();
        System.out.println("price of Tesla: Rm " + car3.priceCar() + "\n");
    }
}
