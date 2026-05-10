package OPPS.ClassDemo;
class Book{
    int bookid;
    String tittle;
    String author;

    void showBook(){
        System.out.println("This is rno: "+bookid);
        System.out.println("This is name: "+tittle);
        System.out.println("This is mrks: "+author);
    }

    
}
public class Examplecar2 {
    public static void main(String[] args) {
        Book s1 = new Book();
        s1.bookid = 22;
        s1.tittle ="Harsh";
        s1.author = "ME";
        s1.showBook();
        Book s2 = new Book();
        s2.bookid = 23;
        s2.tittle ="arsh";
        s2.author = "You";
        s2.showBook();
    }
    
        
}
