package 프로그래머스;

public class 땅따먹기 {
    public static void main(String[] args) {

        int[][] land = {{1,2,3,5},{5,6,7,8},{4,3,2,1}};

        dkdk(land);

    }

    static void dkdk (int[][] land){

        int answer = 0;

        int index = 1000000;

        for(int i=0; i<land.length; i++){
            int max = 0;
            int maxindex = 0;
            for(int j=0; j<land[i].length;j++){
                if(index == j ){
                    continue;
                }
                if(land[i][j]>max){
                    int x = 0;




                    max = land[i][j];
                    System.out.println(max);
                    maxindex = j;

                }
            }





            answer+=land[i][maxindex];
            index = maxindex;
        }

        System.out.println(answer);

    }
}
