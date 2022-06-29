package 휴먼자바.별찍기;

import java.util.*;

import java.util.ArrayList;

public class star{


    public void draw (int x){

        String top = "";

        for(int i = 0; i<x/4; i++){
            top+=" ";
        }

        for(int i = 0; i<x/2; i++){
            top+="*";
        }

        String tt = "";

        System.out.println(top);

        for(int j = 0; j<x;j++){

            tt += "*";

            for(int i = 0 ; i<x-2; i++){
                tt += " ";
            }

            tt += "*";

            System.out.println(tt);
            tt = "";

        }


        System.out.println(top);


    }

}
