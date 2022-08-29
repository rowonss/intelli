package 프로그래머스;

import javax.swing.*;
import java.util.*;

public class 주차요금 {
    public static void main(String[] args) {

        int[] fees = {1, 10, 1, 11};
        String[] records = {"00:00 1234 IN", "00:02 1234 OUT"};

        System.out.println(answer(fees,records));
    }


    static ArrayList<Integer> answer (int[] fees, String[] records){
        TreeMap<String,String> InandOut = new TreeMap<>();
        TreeMap<String,Integer> Result = new TreeMap<>();
        ArrayList<Integer> answer = new ArrayList<>();

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
            if(!Result.containsKey(keys)){
                Result.put(keys,lastput);
            }
            else {
                Result.replace(keys,Result.get(keys)+lastput);
            }
        }

        for(String keys: Result.keySet()){
            int trash = 0;
            if(Result.get(keys) > fees[0]){
                if((Result.get(keys)-fees[0])%fees[2]>0){
                    trash = fees[3];
                }
                Result.replace(keys,(Result.get(keys)-fees[0])/fees[2]*fees[3]+fees[1]+trash);
            }
            else {
                Result.replace(keys,fees[1]);
            }
            answer.add(Result.get(keys));
        }
        return answer;
    }
    static int timegap(String start, String end) {
        String[] S = start.split(":");
        String[] E = end.split(":");

        int Tgap = (Integer.parseInt(E[0]) - Integer.parseInt(S[0])) * 60;
        int Mgap = Integer.parseInt(E[1]) - Integer.parseInt(S[1]);

        return Tgap + Mgap;

    }
}
