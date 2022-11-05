package 프로그래머스;

import java.util.*;

public class 순위검색 {

    public static void main(String[] args) {


        String[] info = {"java backend junior pizza 150","python frontend senior chicken 210","python frontend senior chicken 150","cpp backend senior pizza 260","java backend junior chicken 80","python backend senior chicken 50"};
        String[] query = {"java and backend and junior and pizza 100","python and frontend and senior and chicken 200","cpp and - and senior and pizza 250","- and backend and senior and - 150","- and - and - and chicken 100","- and - and - and - 150"};
        System.out.println(solution(info,query));
    }

    static ArrayList<Integer> solution(String[] info, String[] query) {

        ArrayList<Integer> answer = new ArrayList<>();
        TreeMap<Integer, Integer> scores = new TreeMap<>();

        for(int i=0; i < info.length; i++){
           scores.put(Integer.parseInt(info[i].split(" ")[4]),i);
        }

        System.out.println(scores);

        for(int i=0; i< query.length; i++){

            int pass = 0;

            String[] split = query[i].split(" ");

            for(int j=scores.size(); j>=0; j--) {
                TreeMap<Integer,Integer> copy = scores;
                if (copy.pollLastEntry().getValue()>= Integer.parseInt(split[7])) {
                    if (info[j].contains(split[0]) || Objects.equals(split[0], "-")) {
                        if (info[j].contains(split[2]) || Objects.equals(split[2], "-")) {
                            if (info[j].contains(split[4]) || Objects.equals(split[4], "-")) {
                                if (info[j].contains(split[6]) || Objects.equals(split[6], "-")) {
                                        pass += 1;
                                }
                            }
                        }
                    }
                }
            }

            answer.add(pass);

        }

        return answer;
    }
}
