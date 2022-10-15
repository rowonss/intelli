//package 프로그래머스;
//
//import java.util.*;
//import java.util.stream.IntStream;
//
//public class 특이한정렬 {
//    public static void main(String[] args) {
//
//        int[] a = {1, 2, 3, 4, 5, 6};
//        int b = 4;
//
//        answer(a,b);
//    }
//
//    static void answer (int[] numlist, int n){
//
//        ArrayList<Integer> nums = new ArrayList();
//
//
//
//
//
//        for(int i=0; i<numlist.length; i++){
//            nums.add(numlist[i]);
//        }
//
//        Collections.sort(nums, Collections.reverseOrder());
//
//        HashMap<Integer,Integer> a = new HashMap();
//
//        for(int i=0; i<nums.size(); i++){
//            a.put(nums.get(i),Math.abs(n-nums.get(i)));
//        }
//
//        a = sortByValue(a);
//
//        String a = 'asd';
//
//        System.out.println(a);
//
//
//        ArrayList<Integer> answer = new ArrayList<>();
//
//        Object[] z;
//
//        System.out.println(a);
//
//
//
//
//        for(int i=0; i<z.length; i++){
//            if(i!=z.length-1){
//                if(Objects.equals(a.get(z[i]), a.get(z[i + 1]))){
//                    answer.add((Integer) z[i+1]);
//                    answer.add((Integer) z[i]);
//                    i++;
//                }
//                else{
//                    answer.add((Integer) z[i]);
//                }
//            }
//            else {
//                answer.add((Integer) z[i]);
//            }
//        }
//
//        System.out.println(answer);
//
//    }
//
//    public static HashMap<Integer, Integer> sortByValue(HashMap<Integer, Integer> hm){
//        // 1
//        List<Map.Entry<Integer, Integer> > list =
//                new LinkedList<Map.Entry<Integer, Integer>>(hm.entrySet());
//        // 2
//        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
//            public int compare(Map.Entry<Integer, Integer> o1,
//                               Map.Entry<Integer, Integer> o2)
//            {
//                return (o1.getValue()).compareTo(o2.getValue());
//            }
//        });
//        // 3
//        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
//        for (Map.Entry<Integer, Integer> aa : list) {
//            temp.put(aa.getKey(), aa.getValue());
//        }
//        // 4
//        return temp;
//    }
//}
