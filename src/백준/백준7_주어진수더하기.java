package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class 백준7_주어진수더하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        StringBuffer asd = new StringBuffer();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        for(int i=0; i<a; i++){
            int z = Integer.parseInt(br.readLine())+ Integer.parseInt(br.readLine());

        }

    }

    public String solution(String phone_number) {

        String a = phone_number;
        StringBuilder answer = new StringBuilder();

        for(int i =0; i<a.length()-4; i++){
            answer.append("*");
        }

        for(int i=a.length()-4; ; i++){
            answer.append(a.charAt(i));
        }


    }
}
