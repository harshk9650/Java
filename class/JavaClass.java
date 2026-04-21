import java.util.Scanner;

public class JavaClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();

        }
    //arr.[0][1][2][3][4]
        // 1  2  3  2  1
        // i           j
        //   i.     j
       //       i
        int i = 0;
        int j = n-1; 
        int target = 6;


        while(i<j){ 
            
            if(arr[i]+arr[j]==target){
                System.out.println(arr[i]+" "+arr[j]);
                break;

            }else{
                i++;
                j--;

            }
            

            

            

        }   
        
        
        sc.close();

    }
  }       
       

