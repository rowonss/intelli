package 프로그래머스;

import java.util.Objects;

class 다음큰숫자 {
    public int solution(int n) {

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
