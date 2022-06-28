package 휴먼자바.별찍기;

import java.util.*;

import java.util.ArrayList;

public class star{


    public void draw (int x){

        String kk = "";
        int a = x;

        for(int i=0; i<a;i++){
            kk+=" ";
        }


        for(int i=0; i<x; i++){

            kk += "*";
            kk = kk.substring(1);
            System.out.println(kk);
            kk += "*";
        }
        kk = kk.substring(1);
        String dd = "";
        for(int i=0; i<x-1; i++){
            dd+=" ";
            kk = kk.substring(1);
            kk = kk.substring(1);
            System.out.println(dd+kk);
        }



    }

}
