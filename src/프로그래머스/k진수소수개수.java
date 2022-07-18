package 프로그래머스;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class k진수소수개수 {
    public static void main(String[] args) {

    }
        int n = 437674;
        int k = 3;

        String a = Integer.toString(n, k);

        int answer = 0;

        String[] asd = a.split("0");

        public int solution(int n, int k) {
            String a = Integer.toString(n, k);

            int answer = 0;
            String[] asd = a.split("0");

            for (int i = 0; i < asd.length; i++) {
                if (Objects.equals(asd[i], "")) {
                    continue;
                }
                int count = 0;
                long zxc = Long.parseLong(asd[i]);
                if (is.isprime(zxc)) {
                    answer += 1;
                }
            }

            System.out.println(answer);

            return answer;
        }
}
 class is {
    public static boolean isprime(long n){
        if(n <= 1) return false;
        else if(n == 2) return true;
        for(int i = 2; i <= Math.sqrt(n); i++)
            if(n % i == 0)
                return false;
        return true;
    }
}

