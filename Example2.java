package OPPS;
class Student{
    int rollNo;
    String name;
    int marks;
    void display(){
        System.out.println("This is rno: "+rollNo);
        System.out.println("This is name: "+name);
        System.out.println("This is mrks: "+marks);
    }
}
public class Example2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollNo = 22;
        s1.name ="Harsh";
        s1.marks = 100;
        s1.display();
        Student s2 = new Student();
        s2.rollNo = 23;
        s2.name ="arsh";
        s2.marks = 10;
        s2.display();
    }
}
