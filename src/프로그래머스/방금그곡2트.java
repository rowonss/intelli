package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class 방금그곡2트 {

    public static void main(String[] args) {

        String m = "CC#BCC#BCC#BCC#B";
        String[] musicinfos = {"00:00,23:59,FOO,CC#B", "04:00,04:34,BAR1,CC#BCC#BCC#B","04:00,04:34,BAR2,CC#BCC#BCC#B","04:00,04:34,BAR3,CC#BCC#BCC#B"};
        String code = "ABCDEFG";
        String sharp = "A#B#C#D#E#F#G#";

        System.out.println(song(m, musicinfos));
    }

    static String song(String m, String[] musicinfos) {
        ArrayList<Integer> musictime = new ArrayList<>();
        ArrayList<String> musicname = new ArrayList<>();

        String code = "ABCDEFG";

        for (int i = 0; i < musicinfos.length; i++) {
            String[] a = musicinfos[i].split(",");
            String longlong = "";
            String catcher = m;
            for (int j = 0; j < 100; j++) {
                longlong += a[3];
            }
            m = m.replace("A#", "a");
            m = m.replace("B#", "b");
            m = m.replace("C#", "c");
            m = m.replace("D#", "d");
            m = m.replace("E#", "e");
            m = m.replace("F#", "f");
            m = m.replace("G#", "g");

            longlong = longlong.replace("A#", "a");
            longlong = longlong.replace("B#", "b");
            longlong = longlong.replace("C#", "c");
            longlong = longlong.replace("D#", "d");
            longlong = longlong.replace("E#", "e");
            longlong = longlong.replace("F#", "f");
            longlong = longlong.replace("G#", "g");

            String codes = "";


            int gapgap = timegap(a[0], a[1]);

            for (int k = 0; k < gapgap; k++) {
                String add = "";
                codes += String.valueOf(longlong.charAt(k));
            }
            System.out.println(codes);

            if (codes.contains(m)) {
                if (!musicname.contains(a[2])) {
                    musicname.add(a[2]);
                    musictime.add(gapgap);
                }
            }
        }

        System.out.println(musicname);
        System.out.println(musictime);

        if (musicname.size() == 0) {
            return "(None)";
        }

        if (musicname.size() == 1) {
            return musicname.get(0);
        }
        else {
            if (Collections.frequency(musictime, Collections.max(musictime)) > 1) {
                return musicname.get(musictime.indexOf(Collections.max(musictime)));
            }
            return musicname.get(musictime.indexOf(Collections.max(musictime)));
        }

    }

    static int timegap(String start, String end) {
        String[] S = start.split(":");
        String[] E = end.split(":");

        int Tgap = 0;
        int Mgap = 0;

        Tgap = Integer.parseInt(E[0]) - Integer.parseInt(S[0]);
        if (Integer.parseInt(E[1]) > Integer.parseInt(S[1])) {
            Mgap = Integer.parseInt(E[1]) - Integer.parseInt(S[1]);
        } else {
            Mgap = Integer.parseInt(E[1]) + 60 - Integer.parseInt(S[1]);
        }

        int gaps = Mgap;
        if (Tgap != 0) {
            gaps += (Tgap - 1) * 60;
        }
        return gaps;

    }
}
