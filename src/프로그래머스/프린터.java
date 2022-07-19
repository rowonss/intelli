package 프로그래머스;

import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.IntStream;

public class 프린터 {
    public static void main(String[] args) {
        int[] a = {1, 1, 9, 1, 1, 1};
        int b = 0;
        answer(a,b);
    }

    static void answer (int[] a, int b){

        Queue<Integer> printer = new LinkedList();
        for(int i=0; i<a.length; i++){
            printer.add(a[i]);
        }

        int count = 1;
        int answer = 0;

        int mine = b;

        while (true){
            if(printer.peek() < maxnum(a)){
                mine -= 1;
                if(mine == 0){
                    mine = a.length-1;
                }
                printer.add(printer.peek());
                printer.remove();
            }
            else if(printer.peek() == maxnum(a)){
                printer.remove();
                if(mine == 0){
                    answer = count;
                    break;
                }
                remove(a,maxindex(a));
                mine -= 1;
                if(mine == 0){
                    mine = a.length-1;
                }
            }
        }
        System.out.println(answer);

    }

    static int maxnum(int[] a){
        int max = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        return max;
    }
    static int maxindex(int[] a){
        int maxindex = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]>maxindex){
                maxindex = i;
            }
        }
        return maxindex;
    }

    public static int[] remove(int[] a, int index)
    {
        if (a == null || index < 0 || index >= a.length) {
            return a;
        }

        return IntStream.range(0, a.length)
                .filter(i -> i != index)
                .map(i -> a[i])
                .toArray();
    }

}
