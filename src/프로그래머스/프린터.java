package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class 프린터 {
    public static void main(String[] args) {
        int[] a = {2, 1, 3, 2};
        int b = 2;
        System.out.println(answer(a, b));
    }

    static int answer(int[] a, int b) {

        ArrayList<Integer> printer = new ArrayList();
        ArrayList<Integer> index = new ArrayList();

        for (int i=0;i<a.length; i++) {
            printer.add(a[i]);
            if (i == b) {
                index.add(1);
            } else {
                index.add(0);
            }
        }
        int count = 0;
        while (true){
            System.out.println(index);
            if(printer.get(0)>= Collections.max(printer)){
                if(index.get(0)==1){
                    count++;
                    return count;
                }
                else {
                    count++;
                    printer.remove(0);
                    index.remove(0);
                }
            }
            else {
                printer.add(printer.get(0));
                index.add(index.get(0));
                printer.remove(0);
                index.remove(0);
            }

        }
    }
}
