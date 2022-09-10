package 프로그래머스;

import java.util.ArrayList;
import java.util.TreeSet;

public class 추석트래픽 {
    public static void main(String[] args) {

        String[] a = {"2016-09-15 20:59:57.421 0.351s",
                "2016-09-15 20:59:58.233 1.181s",
                "2016-09-15 20:59:58.299 0.8s",
                "2016-09-15 20:59:58.688 1.041s",
                "2016-09-15 20:59:59.591 1.412s",
                "2016-09-15 21:00:00.464 1.466s",
                "2016-09-15 21:00:00.741 1.581s",
                "2016-09-15 21:00:00.748 2.31s",
                "2016-09-15 21:00:00.966 0.381s",
                "2016-09-15 21:00:02.066 2.62s"} ;

        answer(a);
    }
    static void answer (String[] lines){
        TreeSet<Long> starttime = new TreeSet<>();
        TreeSet<Long> endtime = new TreeSet<>();

        String numbers = "0123456789";

        for(int i=0;i<lines.length;i++){
            String[] first = lines[i].split(" ");
            String a = "";
            String b = "";

            a = first[1].replace(":","");
            a = a.replace(".","");
            b = first[2].replace(".","");
            b = b.replace("s","");

            starttime.add(Long.valueOf(a));
            endtime.add((Long.parseLong(a)+Long.parseLong(b)));

        }

        Long start = starttime.first();

        System.out.println(start);

        System.out.println(starttime);

        System.out.println();
        System.out.println();

        System.out.println();

        int max = 0;

        while (true){



        }

    }



}
