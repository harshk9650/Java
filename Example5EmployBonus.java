package OPPS.ClassDemo;
class Employe{
    String name;
    double salary;

    double calculateBonus(){
        double bonus = salary;
        if(salary > 50000){
            
            bonus= salary*0.10;
        }
        else if(salary > 30000){
            bonus= salary*0.07;
        }
        else{
            bonus= salary*0.5;
        }
        return salary+bonus;
    }
}
public class Example5EmployBonus {
    public static void main(String[] args) {
        Employe e1 = new Employe();
        e1.name = "Harsh";
        e1.salary = 30000;
        System.out.println(e1.calculateBonus());
    }
}
