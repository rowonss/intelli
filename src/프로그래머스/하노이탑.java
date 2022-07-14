package 프로그래머스;

import java.util.ArrayList;

public class 하노이탑 {
    public static void main(String[] args) {

        ArrayList[] tower = settower(2);

        for (int i = 0; i < tower.length; i++) {
            System.out.println(tower[i]);
        }
    }

     static ArrayList[] settower (int n){
        ArrayList[] TOWER = new ArrayList[3];
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        TOWER[0] = a;
        TOWER[1] = b;
        TOWER[2] = c;

        for(int i=0; i<n+1; i++){
            TOWER[0].add(i,n-i+1);
        }

        return TOWER;

    }
}
