package 프로그래머스1단계;

public class 부족한금액구하기 {

    public static void main(String[] args){
        int price = 3;
        int money = 20;
        int count = 4;
        System.out.println(solution(price, money, count));
        //출력한다 -> 무엇을? -> 솔루션에 세 인자값을 넣은 것을
    }

    public static long solution(int price, int money, int count){
        long answer = 0;
        long sum = 0;

        for(int i =1; i<count+1; i++){
            sum+=price*i;
        }
        if(sum > money){
            answer = sum - money;
        }
        return answer;

    }
}
