import java.util.ArrayList;
import java.util.Arrays;

public class 두개골라서더하기 {

    public static void main(String[] args){

        int[] nums = {2,1,3,4,1};
        int[] answer = Solution.solution(nums);
//        int i = 0;
        for(int num : answer) {
            System.out.print(num + " ");
        }
    }


    class Solution {
        public static int[] solution(int[] numbers) {
            ArrayList<Integer> list = new ArrayList<Integer>();
            for(int i=0; i<numbers.length-1; i++){
                for(int l=i+1; l<numbers.length; l++){
                    int sum = numbers[i]+numbers[l];
                    if(!list.contains(sum)) list.add(sum);
                };
            };

            int [] answer= new int[list.size()];
            for(int i = 0; i<list.size(); i++){
                answer[i] = list.get(i);
            };

            Arrays.sort(answer);

            return answer;
        }
    }
}