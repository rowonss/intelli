package 프로그래머스;

import java.util.ArrayList;

public class 옹알이 {
    public static void main(String[] args) {


        String[] a = {"aya", "yee", "u", "maa"};

        answer(a);
        System.out.println();

    }

    public static void  answer(String[] a) {

        int count = 0;

        ArrayList<Integer> asd = new ArrayList<>();

        asd.add(1);

        System.out.println(asd.get(0));

        for(int i=0; i<a.length; i++){
            if(a[i].contains("ayaaya") || a[i].contains("mama") || a[i].contains("woowoo") || a[i].contains("yeye")){
                continue;
            }

            a[i] = a[i].replace("aya", " ");
            a[i] = a[i].replace("ye", " ");
            a[i] = a[i].replace("woo", " ");
            a[i] = a[i].replace("ma", " ");
            a[i] = a[i].replace(" ", "");
            if(a[i].length() == 0){
                count += 1;
            }
        }
        System.out.println(count);
    }
}


