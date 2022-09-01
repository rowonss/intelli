package 프로그래머스;

import java.util.*;

public class 더맵게 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 9, 10, 12};
        int b = 7;

        System.out.println(answer(a,b));
    }

    static int answer (int[] scoville, int K){
        int maxindex;
        TreeSet<Integer> tree = new TreeSet<>();
        for(int i=0;i<scoville.length;i++){
            tree.add(scoville[i]);
        }

        TreeSet<Integer> asd = new TreeSet<>();

        for(int i=0; i<tree.headSet(K).size()+1;i++){
            asd.add(tree.first());
            tree.pollFirst();
        }

        int count = 0;

        System.out.println(asd);

        while (asd.size() >= 1){

            int min1 = asd.first();
            tree.pollFirst();
            int min2 = asd.first();
            tree.pollFirst();
            int min3 = min1 + (min2*2);
            count ++;
            if(min3 < K){
                asd.add(min3);
            }
        }

        return count;

    }
}
