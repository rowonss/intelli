package 백준;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter zxc = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;


        int a = Integer.parseInt(br.readLine());

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();


        for(int i=0; i<a; i++){

            st = new StringTokenizer(br.readLine());

            zxc.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");

        }
        zxc.close();

    }
}

//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int a = Integer.parseInt(br.readLine());
//
//
//        zxc.close();
//
//    }
//}