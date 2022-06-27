package 휴먼자바.무기교체;

import java.util.Scanner;

import static 휴먼자바.무기교체.hero.hp;

public class main {
    public static void main(String[] args) {
        game();
    }

    public static void game(){
        Scanner sc = new Scanner(System.in);
        System.out.println("용사의 이름을 입력 해주세요");
        String name = sc.nextLine();
        hero newhero = new hero(name);
        System.out.println("용사"+newhero.name+"이 생성되었습니다");
        System.out.println("HP :"+hp);
        System.out.println("==================");
        System.out.println("모험을 떠납시다!");
        System.out.println("==================");
        System.out.println("슬라임 사냥을 떠난다");
        System.out.println("==================");
        battle();
    }

    public static void battle(){

        System.out.println("슬라임 숲에 도착했다");
        System.out.println("=================");
        System.out.println("=================");
        System.out.println("전투에 돌입합니다!");


    }
}
