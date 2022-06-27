package 휴먼자바.무기교체;

import java.util.Map;
import java.util.Scanner;

import static 휴먼자바.무기교체.hero.hp;
import static 휴먼자바.무기교체.slime.countrange;
import static 휴먼자바.무기교체.slime.slname;

public class main {
    public static void main(String[] args) {
        game();
    }

    public static void game() {
        Scanner sc = new Scanner(System.in);
        System.out.println("용사의 이름을 입력 해주세요");
        String name = sc.nextLine();
        hero newhero = new hero(name);
        System.out.println("용사" + newhero.name + "이 생성되었습니다");
        System.out.println("HP :" + hp);
        System.out.println("==================");
        System.out.println("모험을 떠납시다!");
        System.out.println("==================");
        System.out.println("슬라임 사냥을 떠난다");
        System.out.println("==================");
        battle();
    }

    public static void battle() {

        System.out.println("슬라임 숲에 도착했다");
        System.out.println("=================");
        System.out.println("=================");
        int rannum = (int) (Math.random() * 10 + 5);
        for (int i = 0; i < rannum; i++) {
            int hp = (int) (Math.random() * 30 + 10);
            int str = (int) (Math.random() * 10);
            int range = (int) (Math.random() * 4 + 1);
            slime slime = new slime("슬라임" + i, hp, str, range);
        }
        System.out.println("슬라임이 " + rannum + "마리 등장했습니다!");
        System.out.println("전투에 돌입합니다!");
        System.out.println("=================");
        war();


    }

    public static void war(){
        while (slname.size() == 0) {
            int changetime = 0;
            int slimechange = 0;
            Scanner sc = new Scanner(System.in);
            int max = countrange();
            if(slimechange == 0) {
                System.out.println("슬라임이 일사분란하게 움직입니다!");
                System.out.println("슬라임 위치에 따라 무기를 변경합니다");
                System.out.println("계속 하려면 엔터");
                String x = sc.nextLine();
                System.out.println("가장 슬라임이 많이 위치한 거리는 " + max + "입니다");
                System.out.println("계속 하려면 엔터");
                x = sc.nextLine();
                if (max == 1) {
                    punch punch = new punch();
                }
                else if(max == 2) {
                    shortsword shortsword = new shortsword();
                }
                else if(max == 3) {
                    longsword longsword = new longsword();
                }else if(max == 4) {
                    lence lence = new lence();
                }
                slimechange = 5;
            }


        }
    }
}
