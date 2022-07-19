package 프로그래머스;

import java.util.Stack;

public class 짝지어제거하기 {

    static Stack<Character> st = new Stack<>();

    public static void main(String[] args) {
        String asd = "cdcd";
        System.out.println(answer(asd));

    }

    public static int answer(String a) {

        for (int x = 0; x < a.length(); x++) {
            char z = a.charAt(x);
            if(!st.isEmpty() && st.peek() == z){
                st.pop();
            }
            else{
                st.push(z);
            }
        }

        if (st.empty()) {
            return 1;
        } else {
            return 0;
        }
    }

}
