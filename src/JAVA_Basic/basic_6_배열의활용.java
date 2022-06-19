package JAVA_Basic;

public class basic_6_배열의활용 {
    public static void main(String[] args){
        int[] score = {100, 80, 90, 50, 10, 20};
        int sum = 0;
        float average;
        for(int i=0; i<score.length; i++){
            sum += score[i];
        }
        average = sum / (float)(score.length);
        System.out.println(average);
}
}
