package 휴먼자바.별찍기;

import java.util.Scanner;

public class star {
    public void draw(int x, int y) {

        String[][] arr = new String[x][y];

        for(int i=0; i<x; i++){
            for(int j=0; j<y ; j++){
                 arr[i][j] = "";
            }

        }
        int min = 1;
        int harf = (int) y/2;

        for(int i=0; i<x; i++){
            for(int j=0; j<harf; j++){
                arr[i][j] = "";
                arr[i][j]+="   ";
            }
            harf -= min;

            if(harf==1){
                min = -1;
            }
        }

        for(int i=0; i<x; i++){
            for(int j=0; j<y/2; j++){
                if(arr[i][j]==""){
                    arr[i][j]+="@  ";
                }
            }
        }





        for(int i=10; i<29; i++){
            for(int j=11; j<y/2; j++){
                        arr[i][j]="";
                        arr[i][j]=".  ";
            }
        }

        int maa = 1;


        for(int i=10; i<29; i++){
            for(int j=y/2-1-maa ; j>10; j--){
                arr[i][j]="   ";
            }

            maa++;

        }

        int mee =1;

        for(int i=21; i<29; i++){
            for(int j=11 ; j<11+mee; j++){
                arr[i][j]="   ";
            }
            mee++;



        }

        for(int i=0; i<x;i++){
            int k=y/2;
            for(int j=y/2; j<y; j++){
                arr[i][j] = arr[i][k];
                k--;
            }
        }


        String show = "";

        for(int i=0; i<x; i++){
            for(int j=0; j<y ; j++){
                show += arr[i][j];
            }
            show += "\n";
        }

        System.out.println(show);




    }
}


