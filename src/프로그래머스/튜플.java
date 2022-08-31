package 프로그래머스;

import java.util.*;

public class 튜플 {
    public static void main(String[] args) {
        String a = "{{2},{2,1},{2,1,3},{2,1,3,4}}";

        answer(a);

    }

    static void answer (String s) {

        String num = "0123456789";

        String build = "";

        Map<String,Integer> numbers = new LinkedHashMap<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for(int i=0; i<s.length();i++){
            if(num.contains(Character.toString(s.charAt(i)))){
                build+=s.charAt(i);
            }
            else {
                if(numbers.containsKey(build)){
                    numbers.replace(build,numbers.get(build)+1);
                    build = "";
                }
                else {
                    numbers.put(build,1);
                    build = "";
                }

            }
        }

        numbers.remove("");

        Map<String,Integer> result = sortMapByValue(numbers);

        for(String key : result.keySet()){
            answer.add(Integer.parseInt(key));
        }

    }

    private static Map<String, Integer> sortMapByValue(Map<String, Integer> numbers) {
        List<Map.Entry<String, Integer>> entries = new LinkedList<>(numbers.entrySet());
        entries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        LinkedHashMap<String, Integer> result = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }
}
