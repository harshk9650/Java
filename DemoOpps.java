package OPPS;

class Carr {
    int sNo;
    String name;
    String model;

    void detail() {
        System.out.println("Serial No: " + sNo);
        System.out.println("Car Name: " + name);
        System.out.println("Model: " + model);
    }
}

public class DemoOpps {
    public static void main(String[] args) {
        Carr c1 = new Carr();

        c1.sNo = 10;
        c1.name = "Rolls Royce";
        c1.model = "Phantom";

        c1.detail();
    }
}