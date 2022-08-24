package 프로그래머스;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class 두큐합같게 {

    public static void main(String[] args) {

        int[] queue1 = {3,2,7,2};
        int[] queue2 = {4,6,5,1};

        System.out.println(q(queue1,queue2));

    }

    static long q (int[] queue1, int[] queue2){
        long sum = 0;
        Queue<Long> a = new LinkedList();
        Queue<Long> b = new LinkedList();
        ArrayList<Long> zxc = new ArrayList<>();
        for(int i=0; i<queue1.length; i++){
            zxc.add((long) queue1[i]);
            zxc.add((long) queue2[i]);
            sum += queue1[i];
            a.add((long) queue1[i]);
            sum += queue2[i];
            b.add((long) queue2[i]);
        }
        long harf = sum/2;

        for(int i=0; i<zxc.size();i++){
            if(zxc.get(i)>harf){
                return -1;
            }
        }

        long count = 0;
        long SSum = Sum(a);
        long gap = SSum - harf;

        while(true){
            if(gap == 0){
                return count;
            }
            else if(gap > 0){
                gap -= a.peek();
                b.add(a.poll());
                count++;
            }
            else {
                gap += b.peek();
                a.add(b.poll());
                count++;
            }
            if(count > 500){
                return -1;
            }
        }
    }
    static long Sum (Queue<Long> que){
        long kkk = 0;
        Queue<Long> zxc = new LinkedList<>(que);

        for(int i=0; i<que.size(); i++){

            kkk += zxc.poll();

        }
        return kkk;

    }
}
