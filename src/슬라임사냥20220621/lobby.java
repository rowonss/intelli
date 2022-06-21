package 슬라임사냥20220621;

import java.util.*;

public class lobby {




    public static void main(String[] args) {
        lobby lobby = new lobby();
        lobby.main();
    }

    public void main (){
        Scanner sc = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("던전 오브 슬라임");
        System.out.println("==============");
        System.out.println("=1. 캐릭터생성 =");
        System.out.println("=2. 게임 시작 =");
        System.out.println("=3.   종료   =");
        System.out.println("메뉴 번호를 입력해주세요");
        int num = sc.nextInt();

        if(num == 1){
            makehunter();
        } else if (num == 2) {
            start();
        }
    }

    public void makehunter(){
        Scanner sc = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("  캐릭터 생성  ");
        System.out.println("==============");
        System.out.println("캐릭터의 이름을 정해주세요!");
        String input = sc.nextLine();
        Hunter name = new Hunter(input);
        System.out.println("==============");
        System.out.println("*생성 되었습니다*");
        System.out.println("==============");
        main();

    }

    public void start(){
        Scanner se = new Scanner(System.in);
        System.out.println("==============");
        System.out.println("   캐릭터 목록  ");
        for(int i=0;i<Hunter.names.size();i++){
            System.out.println("["+(i+1)+"]"+" "+Hunter.names.get(i));
        }
        System.out.println("==============");
        System.out.println("캐릭터의 번호를 입력해주세요");
        int number = se.nextInt();
        System.out.println(number+"번 "+Hunter.names.get(number-1)+"를 선택하셨습니다");
        System.out.println("==============");
        System.out.println("던전으로 이동합니다");
         dun();

    }

    public void dun(){
        System.out.println("===============");
        System.out.println("던전에 입장했습니다");
        System.out.println("===============");
        move();
    }
    public void game(){
        Scanner move = new Scanner(System.in);
        int slimeHp = (int)(Math.random()*50+20);
        int slimestr = (int)(Math.random()*10+5);
        slime slime = new slime("초록 슬라임", slimeHp, slimestr);
        System.out.println("초록 슬라임이 나타났다!!");
        System.out.println("이름 :"+slime.name);
        System.out.println("체력 :"+slime.Hp);
        System.out.println("공격력 :"+slime.str);
        System.out.println("====================");
        System.out.println("1. 싸운다 2. 도망간다");
        int mm = move.nextInt();
        if(mm==1){
            battle();
        }
        else if(mm==2){
            int random = (int)(Math.random()*3);
            if(random==1){
                System.out.println("도주에 실패했습니다!");
                battle();
            }
            else{
                System.out.println("도주에 성공했습니다!");
                slime = null;
                move();
            }
        }
    }

    public void move(){
        Scanner move = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("====1. 왼쪽 =======2. 오른쪽=====");
        System.out.println("===============================");
        System.out.println("===============================");
        System.out.println("방향을 입력하세요");
        int mm = move.nextInt();
        int random = (int)(Math.random()*3);
        if(random==1){
            game();
        }
        else{
            move();
        }

    }
    public void battle(){

        System.out.println("=================================================================_______===================");
        System.out.println("======[1. 공격하기]===============================================(  © ©  )==================");
        System.out.println("======[2. 스킬사용]===============================================(___=___)==================");
        System.out.println("==========================================================이름 :"+slime.name+"===================");
        System.out.println("==========================================================체력 :"+slime.Hp+"=========================");
        System.out.println("==========================================================공격력 :"+slime.str+"========================");
        System.out.println("===========================================================================================");
        System.out.println("===========================================================================================");
        System.out.println("===========================================================================================");




    }
}
