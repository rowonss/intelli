package 프로그래머스;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 기능개발 {

    static Queue<Integer> pro = new LinkedList();
    static Queue<Integer> spd = new LinkedList();
    static int i = 1;
    static int count = 0;

    public static void main(String[] args) {
        int[] pro = {93, 30, 55};
        int[] spd = {1, 30, 5};
        answer(pro, spd);
    }
    static void answer(int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int k : a) {
            pro.add(k);
        }
        for (int j : b) {
            spd.add(j);
        }
        for (int i = 1; ; i++) {
            while (spd.size() != 0) {
                if ((pro.peek() + spd.peek() * i) >= 100) {
                    pro.remove();
                    spd.remove();
                    count += 1;
                }
                else {
                    break;
                }
            }
            if(count>0){
                answer.add(count);
            }
            count = 0;
            if (spd.size() == 0) {
                break;
            }
        }
        System.out.println(answer);

    }


}
