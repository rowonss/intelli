package 휴먼자바.별찍기;

import java.util.*;

import java.util.ArrayList;

public class star{


    public void draw (int x, int y){

        String[] tt = new String[x];

        for (int i=0; i<x;i++ )
        {
            tt[i] = "";
            if(i>9 && i<20){
                for(int z=0; z<6; z++){
                    tt[i]+="*";
                }
                for(int j=0; j<11; j++){
                    tt[i]+=" ";
                }
                for(int k=0; k<43;k++){
                    tt[i] +="*";
                }
            }

            else{
            for (int j = 0; j < y; j++) {

                tt[i] += "*";
            }
        }
        }

        for(int i=10; i<20; i++){


        }



        for(int i=0; i<x; i++){
            System.out.println(tt[i]);
        }



    }

}
