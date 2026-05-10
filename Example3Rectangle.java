package OPPS.ClassDemo;
class Rectangle{
    int length;
    int breadth;

    void area(){
        System.out.println("the area is :"+length*breadth);
    }
}
public class Example3Rectangle {
    public static void main(String[] args) {
      Rectangle r1 = new Rectangle();
      r1.length = 10;
      r1.breadth = 20;
      r1.area();  
    }
}
