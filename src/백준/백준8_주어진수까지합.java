package 백준;

import java.util.Scanner;

public class 백준8_주어진수까지합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int answer = 0;

        for(int i=0; i<=a; i++){
            answer += i;
        }

        System.out.println(answer);
    }
}
