import java.util.*;

public class 소수구하기 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("소수를 구하는 배열에 넣은 수자를 순서대로 넣어주세요");
        int numbers = scanner.nextInt();

        int[] select = int()

        int[] num = {};
        int answer = Solution2.solution(num);
        System.out.println(answer);
    }
    class Solution2 {
        public static int solution(int[] nums) {
            int answer = 0;

            for (int fir = 0; fir < nums.length - 2; fir++) {
                for (int sec = fir + 1; sec < nums.length - 1; sec++) {
                    for (int thr = sec + 1; thr < nums.length; thr++) {
                        int count =0;
                        int sum = nums[fir] + nums[sec] + nums[thr];

                        for(int k=1; k<=sum; k++){
                            if(sum%k==0){
                                count+=1;
                            }
                        }
                        if(count==2){
                            answer+=1;
                        }
                        count=0;
                    }

                }
            }
            return answer;

        }
    }
}
