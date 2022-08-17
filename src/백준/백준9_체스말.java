package 백준;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class 백준9_체스말 {

        public static void main(String[] args) throws IOException {
            Scanner sc = new Scanner(System.in);

            String a = sc.nextLine();

            String[] z =  a.split(" ");

            int[] b = {1,1,2,2,2,8};

            int[] answer = new int[6];

            for(int i=0; i<b.length;i++){
                answer[i] = (b[i] - Integer.parseInt(z[i]));
            }

            StringBuilder newanswer = new StringBuilder();

            for(int i=0; i< answer.length; i++){
                newanswer.append(answer[i]);
                if(i== answer.length-1){
                    break;
                }
                newanswer.append(" ");
            }

            System.out.println(newanswer);

        }
    }


