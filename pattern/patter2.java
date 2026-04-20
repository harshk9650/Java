package Basics.pattern;

public class patter2 {
    public static void main(String[] args) {
        for(int row = 1;row<4;row++){
            for(int col = 1;col<row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
