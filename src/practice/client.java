package practice;

import java.util.*;

public class client {

    public static int money = 0;

    public static void main(String[] args) {

        user();

    }


    public static void user() {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. 메뉴 목록 " + "2. 금액 투입" + "3. 메뉴 추가");
        System.out.println("번호를 입력해주세요");
        System.out.println("현재 금액" +money+ "원");
        int num = sc.nextInt();
        if (num == 1) {
            for (int i = 0; i < machine.drinklist.size(); i++) {
                System.out.println(i + 1 + "." + machine.drinklist.get(i)+ machine.);
            }
            user();
        } else if (num == 2) {
            moneyin();
        }
        else if(num ==3){
            setting();
        }

    }

    public static void moneyin() {

        Scanner sc = new Scanner(System.in);
        System.out.println("투입할 금액을 입력해주세요");
        int moneyplus = 0;
        moneyplus = sc.nextInt();
        money += moneyplus;
        System.out.println(moneyplus + "원 투입 하셨습니다");
        System.out.println("총 금액 : " + money + "원 입니다");
        System.out.println("추가로 투입하시려면 1을");
        System.out.println("메뉴로 돌아가시려면 0을 입력 해주세요");
        int re = sc.nextInt();
        if (re == 0) {
            user();
        } else if (re == 1) {
            moneyin();
        }
    }

    public static void setting(){

        Scanner sc = new Scanner(System.in);
        System.out.println("추가하실 음료의 이름을 입력해주세요");
        String name = sc.nextLine();
        System.out.println("단가를 입력 해주세요");
        int price = sc.nextInt();
        machine machine = new machine(name, price);
        System.out.println("입고가 완료되었습니다");
        System.out.println("추가로 입고하시려면 1을");
        System.out.println("메뉴로 돌아가시려면 0을 입력 해주세요");
        int re = sc.nextInt();
        if (re == 0) {
            user();
        } else if (re == 1) {
            setting();
        }

    }

}
