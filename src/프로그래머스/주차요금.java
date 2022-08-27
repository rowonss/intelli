package 프로그래머스;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class 주차요금 {
    public static void main(String[] args) {

        int[] fees = {180, 5000, 10, 600};
        String[] records = {"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

        answer(fees,records);
    }


    static void answer (int[] fees, String[] records){
        Map<String,String> InandOut = new TreeMap<>();
        Map<String,Integer> Result = new TreeMap<>();

        for(int i=0;i<records.length; i++){
            String[] setrecord = records[i].split(" ");
            if(Objects.equals(setrecord[2], "IN")){
                InandOut.put(setrecord[1],setrecord[0]);
            }
            else {
                int resultput = timegap(InandOut.get(setrecord[1]),setrecord[0]);
                if(Result.containsKey(setrecord[1])){
                    Result.replace(setrecord[1],Result.get(setrecord[1])+resultput);
                    InandOut.remove(setrecord[1]);
                }
                else {
                    Result.put(setrecord[1],resultput);
                    InandOut.remove(setrecord[1]);
                }
            }
        }
        for(String keys:InandOut.keySet()){
            int lastput = timegap(InandOut.get(keys),"23:59");
            Result.replace(keys,Result.get(keys)+lastput);
        }









        System.out.println(InandOut);
        System.out.println(Result);

    }
    static int timegap(String start, String end) {
        String[] S = start.split(":");
        String[] E = end.split(":");

        int Tgap = (Integer.parseInt(E[0]) - Integer.parseInt(S[0])) * 60;
        int Mgap = Integer.parseInt(E[1]) - Integer.parseInt(S[1]);

        return Tgap + Mgap;

    }
}
