package Basics.pattern;

public class pattern8 {
    public static void main(String[] args) {
        for(int row = 1;row<=3;row++ ){

            for(int col = 1; col <= row; col++){
                System.out.print("*");
            }
            
            System.out.println();
        }

        for(int j=0;j<=2;j++){
            for(int k=1;k<=2-j;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
