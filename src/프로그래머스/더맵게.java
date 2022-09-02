package 프로그래머스;


import java.util.*;

public class 더맵게 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 9, 10, 12};
        int b = 7;

        System.out.println(answer(a,b));
    }

    static int answer (int[] scoville, int K){

        PriorityQueue<Integer> que = new PriorityQueue<>();
        PriorityQueue<Integer> zxc = new PriorityQueue<>();

        for(int i=0;i<scoville.length;i++){
            que.add(scoville[i]);
        }

        while(true){
            if(que.size()==0){
                break;
            }
            int a = que.peek();
            if(a<K){
                zxc.add(a);
                que.poll();
            }
            else {
                break;
            }
        }

        int max = zxc.size()-2;

        while (zxc.size()>=1){
            que.add(zxc.poll());
        }

        int count = 0;

        while (max>=0 && que.size()>1){
            System.out.println(max);
            if(max == 0){
                return count;
            }
            int min1 = 0;
            int min2 = 0;

            min1 = que.poll();
            min2 = que.poll();

            int min3 = min1 + (min2*2);
            count ++;

            if(que.size()==0){
                if(min3<K){
                    return -1;
                }
                else {
                    return count;
                }
            }

            if(min3 < K){
                que.add(min3);
            }
            else {
                que.add(min3);
                max --;
            }
        }

        return count;

    }
}
