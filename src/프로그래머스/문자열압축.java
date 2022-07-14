package 프로그래머스;

import java.util.Objects;

public class 문자열압축 {

    public static void main(String[] args) {

        System.out.println(main(15));


    }

    static int main(int n) {

        int setting = Integer.bitCount(n);

        while (true){
            int x = n+=1;

            int show = Integer.bitCount(x);

            if(show == setting){
                return x;
            }
        }

    }
}
