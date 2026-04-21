import java.util.Scanner;

public class JavaClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int min = Integer.MAX_VALUE;
        
        if(n==0){
            System.out.println("Invalid");
        }else{
              

        for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);
        
       

        }
        
        
        sc.close();

    }
  }       
       

