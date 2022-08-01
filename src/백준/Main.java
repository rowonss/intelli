package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        System.out.println();

        for(int i=0; i<a; i++){

            int z = Integer.parseInt(br.readLine())+ Integer.parseInt(br.readLine());
            System.out.println(z);

        }

    }
}