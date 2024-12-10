abstract class Car{
    abstract void slogan();
    int price;
    int priceCar(){
        return price;
    }
}

class Toyota extends Car{
    void slogan(){
        System.out.println("This is Toyota");
    }

    int priceCar()
   {
       int price = 25000;
       return price;

   }
}

class BMW extends Car{
    void slogan(){
        System.out.println("This is BMW");
    }

    int priceCar()
   {
       int price = 85000;
       return price;

   }
}

class Tesla extends Car{
    void slogan(){
        System.out.println("This is Tesla");
    }

    int priceCar()
   {
       int price = 75000;
       return price;

   }
}

public class asgm11 {
    public static void main(String[] args) {
        Car car1 = new Toyota();
        car1.slogan();
        System.out.println("Price: " + car1.priceCar());

        Car car2= new BMW();
        car2.slogan();
        System.out.println("Price: " + car2.priceCar());

        Car car3 = new Toyota();
        car3.slogan();
        System.out.println("Price: " + car3.priceCar());
    }
}
