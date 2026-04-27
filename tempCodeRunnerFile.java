package OPPS;
class Carr{
        int sNo;
        String name;
        String model;

   void detail(){
            System.out.println("the car is: "+sNo);
            System.out.println("the car is: "+name);
            System.out.println("the car is: "+model);
        }
        
    }
public class DemoOpps {
    
    public static void main(String[] args) {
        Carr c1 = new Carr();
        c1.sNo = 10;
        c1.model = "Rools Royce";
        c1.model = "Phantom";
        c1.detail();
        
    }

}
