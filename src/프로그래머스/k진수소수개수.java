package 프로그래머스;

import java.util.ArrayList;
import java.util.Scanner;

public class k진수소수개수 {
    public static void main(String[] args) {
        ArrayList<Integer> prime = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num <= 1) return;

        boolean[] arr = new boolean[num+1];
        arr[0] = arr[1] = false;
        for(int i=2; i<=num; i+=1) {
            arr[i] = true;
        }


        for(int i=2; i*i<=num; i+=1) {
            for(int j=i*i; j<=num; j+=i) {
                arr[j] = false;
            }
        }
        System.out.println("Prime number list from 2 to " + num + " : ");
        for(int i=0; i<=num; i+=1) {
            if(true == arr[i]) {
                prime.add(i);
            }
        }
        System.out.println(prime);

        String a = Integer.toString(437674,3);

        System.out.println(a);





    }
}
