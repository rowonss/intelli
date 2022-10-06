package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;

public class 안전지대 {
    public static void main(String[] args) {

        int[][] board = {{0,0,0,0,0}, {0,0,0,0,0}, {0,0,0,0,0}, {0,0,1,0,0}, {0,0,0,0,0}};

        Q(board);

    }

    static void Q (int[][] board){

        ArrayList<int[]> asd = new ArrayList<>();

        asd.add(board[0]);
        asd.addAll(Arrays.asList(board));
        asd.add(board[0]);

        for(int i=1; i<asd.size()-1; i++){
            for(int j=0; j<asd.get(i).length; j++){
                if(asd.get(i)[j] % 2 == 1){
                    if(j==0){
                        asd.get(i-1)[j] += 2;
                        asd.get(i-1)[j+1] += 2;
                        asd.get(i)[j+1] += 2;
                        asd.get(i+1)[j] += 2;
                        asd.get(i+1)[j+1] += 2;
                    }
                    else if(j==asd.get(i).length-1){
                        asd.get(i-1)[j-1] += 2;
                        asd.get(i-1)[j] += 2;
                        asd.get(i)[j-1] += 2;
                        asd.get(i+1)[j] += 2;
                        asd.get(i+1)[j-1] += 2;
                    }
                    else {
                        asd.get(i-1)[j-1] += 2;
                        asd.get(i-1)[j] += 2;
                        asd.get(i-1)[j+1] += 2;
                        asd.get(i)[j-1] += 2;
                        asd.get(i)[j+1] += 2;
                        asd.get(i+1)[j] += 2;
                        asd.get(i+1)[j-1] += 2;
                        asd.get(i+1)[j+1] += 2;
                    }
                }
            }
        }

        int count = 0;

        for(int i=1; i<asd.size()-1; i++){
            for(int j=0; j<asd.get(i).length; j++){
                if(asd.get(i)[j] == 0){
                    count++;
                }
            }
        }
        System.out.println(Arrays.toString(asd.get(1)));
        System.out.println(Arrays.toString(asd.get(2)));
        System.out.println(Arrays.toString(asd.get(3)));
        System.out.println(Arrays.toString(asd.get(4)));
        System.out.println(Arrays.toString(asd.get(5)));



        System.out.println(count);
    }

}
