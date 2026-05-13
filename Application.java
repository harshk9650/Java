import java.util.Scanner;
class Application {
    public static void main(String[] args) {

        String[] str = {
            "What is Java?",
            "Who is me?",
            "What do you want in your life?" ,
            "What is JVM?"
        };
         
        String[] vikalp = {"a) Programming Language b) IDE c) Food d) Coffee",
        " a) Student b) Working Employee c) Bro d) Tharki",
        "a) gaddi b)Bndi c)Kothi d) Something else ",
        "a) Java virtual machine b)Java vanue Machine c)Java machine d)no Java found"};

        char[] answers = {'a', 'a', 'd', 'a'};
        

		int score = 0;

        for (int i = 0; i < str.length; i++) {

            System.out.println(str[i]);
            System.out.println(vikalp[i]);

            System.out.print("Enter your answer (a/b/c/d): ");

            Scanner sc = new Scanner(System.in);
            char my_ans = sc.next().charAt(0);

            if (my_ans == answers[i]) {
                System.out.println("Right Answer");
                score++;
            } else {
                System.out.println("Wrong Answer");

            }

            
        }

        System.out.println("Score out of 4/"+score);
    }
}






        
    