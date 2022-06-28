package 휴먼자바.무기교체;

import java.util.Map;
import java.util.Scanner;

import static 휴먼자바.무기교체.hero.hp;
import static 휴먼자바.무기교체.slime.*;

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
            int range = (int) (Math.random() * 4);
            slime slime = new slime("슬라임" + i, hp, str, range);
        }
        System.out.println("슬라임이 " + rannum + "마리 등장했습니다!");
        System.out.println("전투에 돌입합니다!");
        System.out.println("=================");
        war();


    }

    public static void war(){
        attack attack = new attack();
        int changetime = 0;
        int slimechange = 0;
        for(int i=0;i<slname.size();) {
            Scanner sc = new Scanner(System.in);
            if(slimechange == 0) {

                System.out.println("슬라임이 일사분란하게 움직입니다!");
                for(int k=0; k<slrange.size();k++){
                    slrange.remove(k);
                }
                for(int k=0;k<slname.size();k++){
                    slrange.add((int) (Math.random() * 4));
                }
                System.out.println("슬라임들의 위치가 달라졌습니다!");
                System.out.println("슬라임 위치에 따라 무기를 변경합니다");
                System.out.println("계속 하려면 엔터");
                String x = sc.nextLine();
                int max = countrange();
                System.out.println("가장 슬라임이 많이 위치한 거리는 " + max + "입니다");
                System.out.println("계속 하려면 엔터");
                x = sc.nextLine();
                if (max == 0) {
                    punch punch = new punch();
                }
                else if(max == 1) {
                    shortsword shortsword = new shortsword();
                }
                else if(max == 2) {
                    longsword longsword = new longsword();
                }else if(max == 3) {
                    lence lence = new lence();
                }
                slimechange = 5;
            }


            for(int j=0;j<slname.size();j++){
                if(slrange.get(j)!=attack.range){
                    continue;
                };
                int hp = slhp.get(j);
                System.out.println(slname.get(j)+"의 현재 체력"+slhp.get(j));
                hp -= attack.attpoint;
                slhp.set(j,hp);
                hp = slhp.get(j);
                System.out.println(attack.attpoint+"의 데미지를 입혀"+slhp.get(j)+"가 되었습니다");
                Scanner xc = new Scanner(System.in);
                sc.nextLine();
                if(hp <= 0){
                    System.out.println(slname.get(j)+"의 체력이 0이하로 떨어졌습니다");
                    System.out.println(slname.get(j)+"이(가) 소멸됩니다");
                    slname.remove(j);
                    slhp.remove(j);
                    slstr.remove(j);
                    slrange.remove(j);
                }
            }
            slimechange -=1;
        }
        System.out.println("슬라임을 모두 무찔렀습니다!");


    }
}
