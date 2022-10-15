package 프로그래머스;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 택배상자 {

    public static void main(String[] args) {
        int[] a = {4, 3, 1, 2, 5};

        System.out.println(answer(a));

    }

    static int answer (int[] order){

        Queue<Integer> belt = new LinkedList<>();
        Stack<Integer> sub = new Stack<>();

        int answer =0;
        for(int i=0; i<order.length; i++){
            belt.offer(i+1);
        };

        int selected = 0;

        for (int j : order) {

            while (true) {

                if (j < selected) {
                    if (sub.peek() == j) {
                        selected = sub.peek();
                        sub.pop();
                        answer += 1;
                        break;
                    } else {
                        return answer;
                    }
                }
                else if(!belt.isEmpty()){
                    if (belt.peek() == j) {
                        selected = belt.peek();
                        belt.poll();
                        answer += 1;
                        break;
                    } else {
                        sub.push(belt.poll());
                    }

                }
            }

        }

        return answer;

    }
}
