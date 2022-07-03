package 휴먼자바.자동채널변경;

import static 휴먼자바.자동채널변경.searchable.change;

public class 채널목록 implements searchable{

    void 기본 (){};

    void

    static void chanchan (int x){
        int ch = change(x);
        if(ch == 10){
            System.out.println("스포츠채널입니다");
        }
        else if(ch == 20){
            System.out.println("게임채널입니다");
        }
        else if(ch == 25){
            System.out.println("드라마채널입니다");
        }
        else if(ch == 120){
            System.out.println("영화채널입니다");
        }

    }


}
