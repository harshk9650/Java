class Car{
    String model;
    int speed;
    void increse(int val){
        speed = speed+val;
    }

    void details(){
        System.out.println("mOdel is this one: "+model);
        System.out.println("speed is this one: "+speed);
    }

}
public static void main(String[] args){
    Car c1 = new Car();
    c1.model = "b34At";
    c1.speed = 20;

    c1.increse(30);

    c1.details();


}