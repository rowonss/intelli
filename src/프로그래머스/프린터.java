package 프로그래머스;

import java.util.LinkedList;
import java.util.Queue;

public class 프린터 {
    public static void main(String[] args) {
        int[] a = {2, 1, 3, 2};
        int b = 2;
        answer(a,b);
    }

    static void answer (int[] a, int b){

        Queue<Integer> printer = new LinkedList();

        int mine = b;
        a[b] = 99;

        while(true){

        }

    }

    static int[] maxnum(int[] a){
        int maxindex = 0;
        int max = 0;
        int[] re = {maxindex, max};

        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return re;
    }
}
