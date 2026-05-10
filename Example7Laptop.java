package OPPS.ClassDemo;
class Laptop{
    String brand;
    String ram;
    int price;

    Laptop(String brand,String ram,int price){
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }
    void display(){
        System.out.println("The brand is: "+brand);
        System.out.println("The ram is: "+ram);
        System.out.println("The price is: "+price);
    }
}
public class Example7Laptop {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("Assus", "7gb",300);
        l1.display();
    }
    
}
