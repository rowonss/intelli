package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class 방금그곡2트 {

    public static void main(String[] args) {

        String m = "CC#BCC#BCC#";
        String[] musicinfos = {"00:00,00:30,FOO,CC#B"};


        System.out.println(song(m, musicinfos));
    }

    static String song(String m, String[] musicinfos) {
        String answer = "";
        int time = 0;

        for (int i = 0; i < musicinfos.length; i++) {

            String[] a = musicinfos[i].split(",");

            String longlong = "";

            int gapgap = timegap(a[0], a[1]);

            for (int j = 0; j < gapgap; j++) {
                longlong += a[3];
            }

            m = m.replace("A#", "a");
            m = m.replace("C#", "c");
            m = m.replace("D#", "d");
            m = m.replace("E#", "e");
            m = m.replace("F#", "f");
            m = m.replace("G#", "g");

            longlong = longlong.replace("A#", "a");
            longlong = longlong.replace("C#", "c");
            longlong = longlong.replace("D#", "d");
            longlong = longlong.replace("E#", "e");
            longlong = longlong.replace("F#", "f");
            longlong = longlong.replace("G#", "g");

            StringBuilder codes = new StringBuilder();

            for (int k = 0; k < gapgap; k++) {
                codes.append(longlong.charAt(k));
            }
            if (codes.toString().contains(m)) {
                if (!Objects.equals(answer, "")) {
                    if (time < gapgap) {
                        answer = a[2];
                        time = gapgap;
                    }
                } else {
                    answer = a[2];
                    time = gapgap;
                }
            }
        }
        if (!Objects.equals(answer, "")) {
            return answer;
        } else {
            return "(None)";
        }
    }

    static int timegap(String start, String end) {
        String[] S = start.split(":");
        String[] E = end.split(":");

        int Tgap = (Integer.parseInt(E[0]) - Integer.parseInt(S[0])) * 60;
        int Mgap = Integer.parseInt(E[1]) - Integer.parseInt(S[1]);

        return Tgap + Mgap;

    }
}