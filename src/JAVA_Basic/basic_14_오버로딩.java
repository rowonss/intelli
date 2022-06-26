package JAVA_Basic;

import java.util.Arrays;

public class basic_14_오버로딩 {
    public static void main(String[] args) {

        basic_14_오버로딩 ad = new basic_14_오버로딩();

        int[]asdsssasd = {1,2,3,4,5,6};

        System.out.println(ad.add(asdsssasd));


    }
    int add(int a, int b){
        return a+b;
    }
    long add(long a, long b){
        return a+b;
    }
    int add(int []a){
        int result = 0;
        for (int j : a) {
            result += j;
        }
        return result;
    }

}

