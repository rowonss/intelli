package 프로그래머스;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class 롤케이크 {

    public static void main(String[] args) {

        int[] a = {1, 2, 1, 3, 1, 4, 1, 2};

        System.out.println(solution(a));

    }

    static int solution(int[] topping) {

        int answer = 0;

        ArrayList<Integer> convert = new ArrayList<>();

        HashSet<Integer> A = new HashSet<>();

        HashMap<Integer,Integer> count = new HashMap<>();

        for(int i=0; i<topping.length; i++){

            convert.add(topping[i]);

            if(count.containsKey(topping[i])){
                count.replace(topping[i],count.get(topping[i])+1);
            }
            else{
                count.put(topping[i],1);
            }
        }

        int setsize = new HashSet<>(convert.subList(0,convert.size())).size();


        for(int i=0; i<convert.size(); i++){

            A.add(convert.get(i));

            if(count.containsKey(convert.get(i))){

                count.replace(convert.get(i),count.get(convert.get(i))-1);

                if(count.get(convert.get(i))==0){
                    count.remove(convert.get(i));
                    setsize -= 1;
                }
            }

            if(A.size() == setsize){
                answer += 1;
            }
        };

        return answer;
    }
}
