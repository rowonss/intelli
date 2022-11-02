package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 야간전술보행 {
    public int solution(int distance, int[][] scope, int[][] times) {

        ArrayList<Integer> ans = new ArrayList();

        for(int i=0; i<scope.length; i++){
            int alltime = times[i][0]+times[i][1];

            Arrays.sort(scope[i]);

            for(int j=scope[i][0]; j<=scope[i][1]; j++){

                if(j%alltime == 0){
                    continue;
                }
                else if(j%alltime <= times[i][0]){

                    ans.add(j);
                }
            }
        }

        Collections.sort(ans);

        if(ans.size()>0){
            return ans.get(0);
        }

        return distance;
    }
}
