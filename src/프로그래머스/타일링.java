package 프로그래머스;

import java.util.LinkedList;
import java.util.Queue;

public class 타일링 {
    public static void main(String[] args) {
        int a = 9;
        System.out.println(answer(a));
    }

    static int answer(int a) {

        if(a == 1){
            return 1;
        }
        if(a == 2){
            return 2;
        }
        int n1 = 1;
        int n2 = 2;

        int answer = 0;

        for(int i=3; i<=a; i++){
            answer = (n1+n2) % 1000000007;
            n1 = n2;
            n2 = answer;

        }
        return answer;
    }
}
