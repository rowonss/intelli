package 프로그래머스;

import java.util.Arrays;

public class 가장큰정사각형찾기 {
    public static void main(String[] args) {
        int[][] a = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};

        answer(a);
        System.out.println();
        System.out.println();
        System.out.println();
    }
    static void answer(int[][] a){

        int x = a[0].length;
        int y = a.length;
        int q = 0;
        int value = 0;

        if(x>y){
            q = x;
        }
        else if(y>x){
            q = y;
        }
        else{
            q = x;
        }

        value = q*q;

        while(true){
            int kkk = 0;
            for(int i=0; i<q; i++){
                for(int j=0; j<a[i].length-q;j++){
                    int[] arr = Arrays.copyOfRange(a[i],j,j+q);
                    for(int zxc = 0; zxc<arr.length;zxc++){
                        kkk += arr[zxc];
                    }
                }
            }
        }



    }
}
