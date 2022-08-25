package 프로그래머스;

import java.util.ArrayList;

public class 방금그곡 {
    public static void main(String[] args) {

        String m = "ABCDEFG";
        String[] musicinfos = {"12:00,12:14,HELLO,CDEFGAB", "13:00,13:05,WORLD,ABCDEF"};

        song(m, musicinfos);

    }

    static void song (String m, String[] musicinfos){

        ArrayList<String[]> mu = new ArrayList();
        ArrayList<String> musics = new ArrayList();

        for(int i=0; i< musicinfos.length; i++){
            String[] a = musicinfos[i].split(",");
            timegap(a[0],a[1]);
        }

    }

    static int timegap(String start, String end){
        String[] S = start.split(":");
        String[] E = end.split(":");

        int Tgap = 0;
        int Mgap = 0;


    }
}
