package Basics;

public class ArmsstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int temp =num;
        int res = 0;

        while(temp>0){
            int last = temp%10;
            int cube = last*last*last;
            System.out.println("Cube "+cube);
            res = res+cube;
            temp=temp/10;
        }
        System.out.println(res);
        if(res == num){
            System.out.println("Armsstrong");
        }
        else{
            System.out.println("Not arm");
        }
    }

}
