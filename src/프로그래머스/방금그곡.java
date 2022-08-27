package 프로그래머스;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class 방금그곡 {
    public static void main(String[] args) {

        String m = "ABC";
        String[] musicinfos = {"23:55,00:05,HI,ABC#ABC"};

        System.out.println(song(m, musicinfos));

    }

    static String song (String m, String[] musicinfos){

        ArrayList<Integer> musictime = new ArrayList<>();
        ArrayList<String> musicname = new ArrayList<>();

        ArrayList<String> musics = new ArrayList();
        String code = "ABCDEFG";

        for(int i=0; i< musicinfos.length; i++){
            String[] a = musicinfos[i].split(",");
            String longlong = "";
            for(int j=0;j<1000;j++){
                longlong += a[3];
            }
            ArrayList<String> codes = new ArrayList<>();
            ArrayList<String> catcher = new ArrayList<>();

            int gapgap = timegap(a[0],a[1]);

            for(int k=0;k<gapgap;k++){
                String add ="";
                add += String.valueOf(longlong.charAt(k));
                String s = String.valueOf(longlong.charAt(k + 1));
                if(!code.contains(s)){
                    add += s;
                    gapgap++;
                    k++;
                }
                codes.add(add);
            }

            for(int q=0; q<m.length(); q++){
                String zzz ="";
                zzz += String.valueOf(m.charAt(q));
                String s = "";
                if(q!=m.length()-1){
                    s = String.valueOf(m.charAt(q + 1));
                }

                if(!code.contains(s)){
                    zzz += s;
                    q++;
                }
                catcher.add(zzz);
            }

            System.out.println(codes);

            if(catcher.size() > codes.size()){
                continue;
            }

            for(int z=0; z<codes.size()-catcher.size()+1;z++){
                String jerry = "";
                String caught = "";

                for(int l=0;l<catcher.size();l++){
                    caught += catcher.get(l);
                    jerry += codes.get(z+l);
                }

                if(jerry.equals(caught)){
                    if(!musicname.contains(a[2])){
                        musicname.add(a[2]);
                        musictime.add(timegap(a[0],a[1]));
                        break;
                    }
                }
            }
        }

        if(musicname.size()==1){
            return musicname.get(0);
        }
        else if(musicname.size()>1){

            if(Collections.frequency(musictime,Collections.max(musictime))>1){
               return musicname.get(0);
            }
            return musicname.get(musictime.indexOf(Collections.max(musictime)));
        }
        else {
            return "(None)";
        }
    }

    static int timegap(String start, String end){
        String[] S = start.split(":");
        String[] E = end.split(":");

        int Tgap = 0;
        int Mgap = 0;

        Tgap = Integer.parseInt(E[0])-Integer.parseInt(S[0]);
        if(Integer.parseInt(E[1]) > Integer.parseInt(S[1])){
            Mgap = Integer.parseInt(E[1])-Integer.parseInt(S[1]);
        }
        else{
            Mgap = Integer.parseInt(E[1])+60-Integer.parseInt(S[1]);
        }

        int gaps = Mgap;
        if(Tgap!=0){
            gaps += (Tgap-1)*60;
        }
        return gaps;

    }
}
