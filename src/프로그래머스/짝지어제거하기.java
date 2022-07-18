package 프로그래머스;

import java.util.Objects;
import java.util.Stack;

public class 짝지어제거하기 {

    public static void main(String[] args) {

        System.out.println(answer("baabaa"));

    }

    public static int answer(String a) {

       Stack st = new Stack();
        st.push(String.valueOf(a.charAt(0)));

       for(int i=1; i<a.length();i++){
           String zxc = (String) st.peek();
           String asd = String.valueOf(a.charAt(i));
           if(Objects.equals(zxc, asd)){
               st.pop();
           }
           else{
               st.push(asd);
           }
       }

       if(st.empty() == true){
           return 0;
       }
       else {
           return 1;
       }


    }

}
