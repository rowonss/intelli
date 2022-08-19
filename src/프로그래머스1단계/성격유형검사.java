package 프로그래머스1단계;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;



public class 성격유형검사 {

    static ArrayList<Integer> num = new ArrayList<>();

    public static void main(String[] args) {
        String[] a = {"TR", "RT", "TR"};
        int[] b = {7, 1, 3};

        answer(a,b);
    }

    static StringBuilder answer(String[] survey, int[] choices){

        int[] one = {0,0};
        int[] two = {0,0};
        int[] three = {0,0};
        int[] four = {0,0};

        StringBuilder asdzxc = new StringBuilder();



        int[] zxc = new int[survey.length];

        for(int i=0; i<survey.length; i++){

            String[] quick =  survey[i].split("");

            String re = result(quick, choices[i]);

            if(Objects.equals(re, "R")){
                one[0] += num.get(i);
            }
            if(Objects.equals(re, "T")){
                one[1] += num.get(i);
            }
            if(Objects.equals(re, "C")){
                two[0] += num.get(i);
            }
            if(Objects.equals(re, "F")){
                two[1] += num.get(i);
            }
            if(Objects.equals(re, "J")){
                three[0] += num.get(i);
            }
            if(Objects.equals(re, "M")){
                three[1] += num.get(i);
            }
            if(Objects.equals(re, "A")){
                four[0] += num.get(i);
            }
            if(Objects.equals(re, "N")){
                four[1] += num.get(i);
            }
        }

        if(one[0] > one[1] || one[0] == one[1]){
            asdzxc.append("R");
        }
        else {asdzxc.append("T");}
        if(two[0] > two[1] || two[0] == two[1]){
            asdzxc.append("C");
        }
        else {asdzxc.append("F");}
        if(three[0] > three[1] || three[0] == three[1]){
            asdzxc.append("J");
        }
        else {asdzxc.append("M");}
        if(four[0] > four[1] || four[0] == four[1]){
            asdzxc.append("A");
        }
        else {asdzxc.append("N");}

        System.out.println(asdzxc);

        return asdzxc;

    }

    static String result(String[] z, int x){

        int front = 0;
        int back = 0;

        if(x == 1){
            back += 3;
        }
        else if(x== 2){
            back += 2;
        }
        else if(x== 3){
            back += 1;
        }
        else if(x== 5){
            front += 1;
        }
        else if(x== 6){
            front += 2;
        }
        else if(x== 7){
            front += 3;
        }

        if(front > back){
            num.add(front);
            return z[1];
        }
        else if(back > front){
            num.add(back);
            return z[0];
        }

        else {
            Arrays.sort(z);
        }
        num.add(front);
        return z[0];

    }

}

