package 프로그래머스1단계;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Objects;



public class 성격유형검사 {
    public static void main(String[] args) {
        String[] a = {"AN","CF","MJ","RT","NA"};
        int[] b = {5,3,2,7,5};

        answer(a,b);
    }

    static void answer(String[] survey, int[] choices){

        StringBuilder asdzxc = new StringBuilder();

        for(int i=0; i<survey.length; i++){

            String[] quick =  survey[i].split("");


            asdzxc.append(result(quick, choices[i]));

        }

        System.out.println(asdzxc);

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
            return z[0];
        }
        else if(back > front){
            return z[1];
        }

        else {
            Arrays.sort(z);
        }
        return z[0];

    }

}

