package JAVA_Basic;

import java.util.Arrays;

public class basic_8_String배열 {
    public static void main(String[] args) {
        String[] strarr = {"가위","바위","보"};
        System.out.println(Arrays.toString(strarr));

        for(int i=0; i<10; i++){
            int temp = (int)(Math.random()*3);
            System.out.println(strarr[temp]);
        }


    }
}
