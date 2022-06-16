package 프로그래머스1단계;

public class 소수구하기 {
    class Solution {
        public int solution(int[] nums) {
            int answer = 0;

            for (int fir = 0; fir < nums.length - 2; fir++) {
                for (int sec = fir + 1; sec < nums.length - 1; sec++) {
                    for (int thr = sec + 1; thr < nums.length; thr++) {
                        int count = 0;
                        int sum = (nums[fir] + nums[sec] + nums[thr]);
                        for (int k = 1; k <= sum; k++) {
                            if (sum % k == 0) {
                                count += 1;
                            }
                        }
                        if (count == 2) {
                            answer += 1;
                        }
                        count = 0;
                    }

                }
            }
            return answer;
        }
    }
}
