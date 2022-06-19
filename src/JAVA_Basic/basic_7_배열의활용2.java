package JAVA_Basic;

public class basic_7_배열의활용2 {
    public static void main(String [] args){
        int [] score = {24,6,43,8,56,98,12};
        int max = score[0];
        int min = score[0];

        for(int i=0; i<score.length; i++){
            if(score[i] > max){
                max = score[i];
            }
            else if(score[i] < min) {
                min = score[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
