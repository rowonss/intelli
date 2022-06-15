import java.util.*;

public class 소수구하기 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 넣어주세요");
        int numbers = scanner.nextInt();
        int num = numbers;
        String answer = Solution2.solution(num);
        System.out.println(answer);

        }
    }
    class Solution2 {
        public static String solution(int nums) {
            Boolean answer = true;
            String tr = "소수입니다";
            String fa = "소수가 아닙니다";
            int count = 0;
            for (int i = 1; i <= nums; i++) {

                if (nums % i == 0) {
                    count += 1;}

            }
            if (count == 2) {
                return tr;
            } else {
                return fa;
            }
        }
    }


