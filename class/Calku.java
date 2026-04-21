class Rectangle  {
    int length;
    int breadth;

    void display(){
        System.out.println("the length is: "+length);
        System.out.println("the breadth is: "+breadth);
    }
    void area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
        int areaa = length*breadth;
        System.out.println("The area of rectangle is: "+areaa);
        
    }

    
}
class Calku{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        r1.length=10;
        r1.breadth=20;
        r1.display();
        // r1.area();
    }

}
