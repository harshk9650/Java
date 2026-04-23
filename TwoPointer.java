import java.util.Scanner;

public class TwoPointer {
   
public static void main(String[] args) {
    
    int[] arr = {10,20,30,40,50};
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your k: ");
    int k = sc.nextInt();
    int[] temp = new int[k];

    for(int i=0;i<k;i++){
        temp[i]=arr[i]; 
    }

    for(int i=0;i<arr.length-k;i++){
        arr[i]=arr[i+k];
        
    }
    
    for(int i=0;i<temp.length;i++){
        arr[arr.length-k+i]=temp[i];
    }

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

}

}

