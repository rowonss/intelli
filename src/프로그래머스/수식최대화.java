package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;

public class 수식최대화 {

    static String nu = "0123456789";
    static StringBuilder a = new StringBuilder();
    static ArrayList<String> Nums = new ArrayList<>();

    public static void main(String[] args) {

        int n = 2;

        String a = "100-200*300-500+20";

        answer(a);
    }

    public static void answer(String exten) {

        for (int i = 0; i < exten.length(); i++) {
            String z = String.valueOf(exten.charAt(i));
            if (nu.contains(z)) {
                a.append(z);
            } else {
                Nums.add(String.valueOf(a));
                Nums.add(z);
                a.setLength(0);
            }
            if (i == exten.length() - 1) {
                Nums.add(String.valueOf(a));
            }
        }

        ArrayList<String> Nums1 = new ArrayList<>(Nums);
        ArrayList<String> Nums2 = new ArrayList<>(Nums);
        ArrayList<String> Nums3 = new ArrayList<>(Nums);
        ArrayList<String> Nums4 = new ArrayList<>(Nums);
        ArrayList<String> Nums5 = new ArrayList<>(Nums);
        ArrayList<String> Nums6 = new ArrayList<>(Nums);


        gob(Nums1);
        deo(Nums1);
        bbe(Nums1);

        gob(Nums2);
        bbe(Nums2);
        deo(Nums2);

        deo(Nums3);
        gob(Nums3);
        bbe(Nums3);

        deo(Nums4);
        bbe(Nums4);
        gob(Nums4);

        bbe(Nums5);
        gob(Nums5);
        deo(Nums5);

        bbe(Nums6);
        deo(Nums6);
        gob(Nums6);

        Long one = Math.abs(Long.parseLong(Nums1.get(0)));
        Long two = Math.abs(Long.parseLong(Nums2.get(0)));
        Long three = Math.abs(Long.parseLong(Nums3.get(0)));
        Long four = Math.abs(Long.parseLong(Nums4.get(0)));
        Long five = Math.abs(Long.parseLong(Nums5.get(0)));
        Long six = Math.abs(Long.parseLong(Nums6.get(0)));

        ArrayList<Long> answer = new ArrayList();

        answer.add(one);
        answer.add(two);
        answer.add(three);
        answer.add(four);
        answer.add(five);
        answer.add(six);

        Long max = Collections.max(answer);

        System.out.println(max);

    }

    static void gob(ArrayList<String> Nums) {
        if(Nums.contains("*")){

            int index = Nums.indexOf("*");
            Long re = Long.parseLong(Nums.get(index-1))*Long.parseLong(Nums.get(index+1));
            Nums.remove(index-1);
            Nums.remove(index-1);
            Nums.remove(index-1);
            Nums.add(index-1, String.valueOf(re));

            System.out.println(Nums);
            if(Nums.contains("*")){
                gob(Nums);
            }
            }
    }

    static void deo(ArrayList<String> Nums){
        if(Nums.contains("+")){
            int index = Nums.indexOf("+");
            Long re = Long.parseLong(Nums.get(index-1))+Long.parseLong(Nums.get(index+1));
            Nums.remove(index-1);
            Nums.remove(index-1);
            Nums.remove(index-1);
            Nums.add(index-1, String.valueOf(re));
            if(Nums.contains("+")){
                deo(Nums);
            }
        }
    }

    static void bbe(ArrayList<String> Nums) {
        if(Nums.contains("-")){
            int index = Nums.indexOf("-");
            Long re = Long.parseLong(Nums.get(index-1))-Long.parseLong(Nums.get(index+1));
            Nums.remove(index-1);
            Nums.remove(index-1);
            Nums.remove(index-1);
            Nums.add(index-1, String.valueOf(re));
            if(Nums.contains("-")){
                bbe(Nums);
            }
        }
    }

}
