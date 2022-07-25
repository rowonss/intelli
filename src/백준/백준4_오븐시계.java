package 백준;

import java.util.Scanner;

public class 백준4_오븐시계 {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            String a = sc.nextLine();
            int b = sc.nextInt();

            String[] z = a.split(" ");

            int q = Integer.parseInt(z[0]);
            int w = Integer.parseInt(z[1]);

            int answerright = (w+b)%60;
            int answerleft = (q+((w+b)/60))%24;

        System.out.println(answerleft+" "+answerright);

    }
}
