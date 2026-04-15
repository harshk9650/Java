public class StrongNumber {
    public static void main(String[] args) {

        int num = 123;
        int temp = num;
        int res = 0;

        while (temp > 0) {
            int last = temp % 10;
            int prod = 1;

            for (int i = 1; i <= last; i++) {
                prod = prod * i;
            }

            res = res + prod;
            temp = temp / 10;   
        }

        if (res == num) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not strong");
        }
    }
}
