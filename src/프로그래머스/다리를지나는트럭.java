package 프로그래머스;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {

    public static void main(String[] args) {
        int[] a = {10};

        System.out.println(solution(100,100,a));
    }

    static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;

        Queue<Integer> A = new LinkedList();

        for(int i=0; i<bridge_length; i++){
            A.add(0);
        }

        int remain = 0;
        int turn = 0;
        boolean gone = true;

        while(true){

            remain -= A.poll();

            if(remain+truck_weights[turn] <= weight){
                A.add(truck_weights[turn]);
                remain += truck_weights[turn];
                turn += 1;
                if(turn == truck_weights.length){
                    gone = false;
                }
            }
            else {
                A.add(0);
            }

            if(!gone){
                while(!A.isEmpty()){
                    remain -= A.poll();
                    answer += 1;
                }

                break;
            }

            answer += 1;

        }
        return answer;
    }
}
