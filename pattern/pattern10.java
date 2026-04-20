package Basics.pattern;

public class pattern10 {
    public static void main(String[] args) {
        int row = 5;
        int spc = 2;
        int str =1;

        for(int i=1;i<=row;i++){
            //space 
            for(int j=1;j<=spc;j++){
                System.out.print(" ");

            }
             // star;
            for(int k =1;k<=row;k++){
                System.out.print("*");
            }

            //space 
            if(i<=row/2){
                str+=2;
                spc--;
            }
            else{
                str-=2;
                spc++;
            }
            
           System.out.println(); 
        }
    }

}
