package 프로그래머스;

import java.util.ArrayList;

public class 행려의곱셈 {
    public static void main(String[] args) {

        int[][] a = {{1,2,3,4}, {1,2,3,4}};
        int[][] b = {{1,2}, {1,2}, {1,2}, {1,2}};
        answer(a,b);
    }

    static void answer (int[][]arr1, int[][]arr2){

        ArrayList<ArrayList> ans = new ArrayList<>();

        for(int i=0;i<arr1.length;i++){
            ArrayList<Integer> inner = new ArrayList<>();
            for(int j=0;j<arr1[i].length;j++){
                int a = 0;
                for(int z=0;z<arr2[0].length;z++){
                    a += arr1[i][z] * arr2[z][j];
                }
                inner.add(a);
            }
            ans.add(inner);
        }

        System.out.println(ans);

    }
}
