package JAVA_Basic;

public class basic_4_임의의_정수_만들기 {
    //난수만들기
    //주로 게임에 활용
    public static void main(String[] args){
        for (int i = 1; i<=20; i++){
//            System.out.println((int)(Math.random()*10)+1); //1~10까지
            System.out.println((int)(Math.random()*11)-5);
            //-5 ~ 5 까지
            //1~10까지
            //형변환시 괄호 처리 잘 하기
        }

    }

}
