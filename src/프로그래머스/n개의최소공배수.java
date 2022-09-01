package 프로그래머스;

import java.util.ArrayList;

public class n개의최소공배수 {
    public static void main(String[] args) {


        int[] a = {1,2,3};
        answer(a);

    }

    static void answer (int[] arr){

        int min = first(arr[0],arr[1]);

        for(int i=2;i<arr.length;i++){
            min =  first(min, arr[i]);
        }

        System.out.println(min);

    }

    static int first (int a, int b){
        return a*b/second(a,b);
    }
    static int second (int a, int b){
        int R;
        while (b != 0){
            R = a % b;
            a = b;
            b = R;
        }
        return a;
    }

}
