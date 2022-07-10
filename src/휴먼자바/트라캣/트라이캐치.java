package 휴먼자바.트라캣;

public class 트라이캐치 {
    public static void main(String[] args) {

        int[] score = {10,30,20};

        try{
            System.out.println(score[3]);
        }
        catch (ArrayIndexOutOfBoundsException z){
            System.out.println("ㄴㄴ");
            System.out.println(z);
        }





    }
}
