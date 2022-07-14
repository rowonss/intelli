package 프로그래머스;

import java.util.ArrayList;

public class 땅따먹기 {
    public static void main(String[] args) {

        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};

        dkdk(land);

    }

    static void dkdk (int[][] land){

        int answer = 0;

        int index = 1000000;

        for(int i=0; i<land.length; i++){
            ArrayList<Integer> numbers1 = new ArrayList<>();
            ArrayList<Integer> numbers2 = new ArrayList<>();

            int nextlinemax = 0;
            int nextlinesecondmax = 0;

            int max = 0;
            int secondmax = 0;
            int maxindex = 0;

            for(int j=0; j<land[i].length;j++){

                if(index == j ){
                    continue;
                }
                if(land[i][j]>max){
                    int x = 0;
                    numbers1.add(land[i][j]);
                    max = land[i][j];
                    maxindex = j;
                }
            }
            secondmax = numbers1.get(numbers1.size()-2);
            System.out.println(secondmax);

            for(int j=0; j<land[i].length;j++){

                if(land[i+1][j]>nextlinemax){
                    numbers2.add(land[i+1][j]);
                    nextlinemax = land[i+1][j];
                }
            }
            System.out.println(numbers2);
            nextlinesecondmax = numbers2.get(numbers2.size()-2);

            System.out.println(nextlinemax);

            int x = 0;
            int y = 0;




            answer+=land[i][maxindex];
            index = maxindex;
        }

        System.out.println(answer);

    }
}
