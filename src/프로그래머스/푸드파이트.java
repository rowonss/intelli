package 프로그래머스;

public class 푸드파이트 {
    public String solution(int[] food) {
        String answer = "";

        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                answer += Integer.toString(i);
            }
        }



        String plus = "";

        for(int i=answer.length()-1; i>=0; i--){
            plus += answer.charAt(i);
        }

        return answer+"0"+plus;
    }
}
