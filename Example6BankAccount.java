package OPPS.ClassDemo;
class BankAccount{
    int acNo;
    String acHolder;
    Double amount;
    
    // void accountNumber(){
    //     System.out.println("This is account Number: "+acNo);

    // }

    // void holderName(){
    // System.out.println("This is account Holder: "+acHolder);

    // }

    // 
    double deposit(double cash){
        amount = amount+cash;
        return amount;
    }

    double withdraw(double cash){
        amount = amount - cash;
        return amount;


    }

    void displayBalance(){
        System.out.println("This is the amount: "+amount);

    }
}
public class Example6BankAccount {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.acNo = 123;
        b1.acHolder ="Harsh";
        b1.amount = 20.0;
        
        System.out.println(b1.deposit(20.0));
        System.out.println("after the withdraw: ");
        System.out.println(b1.withdraw(20.0));
       b1.displayBalance();

    }
}
