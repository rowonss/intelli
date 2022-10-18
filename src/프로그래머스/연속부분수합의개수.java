package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class 연속부분수합의개수 {
    public static void main(String[] args) {

        int[] a = {7,9,1,1,4};

        answer(a);
    }

    static void answer (int[] elements){

        int[] zxc = new int[elements.length + elements.length];

        System.arraycopy(elements, 0, zxc, 0, elements.length);
        System.arraycopy(elements, 0, zxc, elements.length, elements.length);

        TreeSet<Integer> oh = new TreeSet<>();


        for(int i=1; i<=elements.length; i++){
           for(int j=0; j<elements.length; j++){
               oh.add(Arrays.stream(Arrays.copyOfRange(zxc,j,j+i)).sum());
           }
        }

        System.out.println(oh.size());

    }
}
