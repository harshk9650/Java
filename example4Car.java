package OPPS.ClassDemo;
class Car{
    String brand;
    int speed;

    void start(){
        System.out.println("This is "+brand);
        
    }
    void showSpeed(){
        System.out.println("The speed is: "+speed);
    }
}
public class example4Car {
    public static void main(String[] args) {
       Car c1 = new Car();
       c1.brand ="Rools Royce";
       c1.speed = 90;
       c1.start();
       c1.showSpeed(); 
    }
    
}
