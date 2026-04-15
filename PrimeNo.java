import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        boolean flag = true;
        for(int i=1;i<=a/2;i++){
           if(a%2==0){
            flag = false;
           }

        }
        if(flag==true){
            System.out.println("Number is prime");
        }else{
            System.out.println("Not prime");
        }// 
    }
    
}
