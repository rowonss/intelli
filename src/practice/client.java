package practice;

import java.util.*;

public class client {

    public static int money = 0;

    public static void main(String[] args) {
        machine set = new machine();

        user();

    }


    public static void user() {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. 메뉴 목록 " + "2. 음료 구매" + "3. 메뉴 추가"  + "4. 금액 투입");
        System.out.println("번호를 입력해주세요");
        System.out.println("현재 금액" +money+ "원");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("===========================");
            for (int i = 0; i < machine.drinklist.size(); i++) {
                System.out.println(i + 1 + "." + machine.drinklist.get(i)+" "+machine.drinkprice.get(i)+"원");
            }
            System.out.println("===========================");
            user();
        } else if (num == 4) {
            moneyin();
        }
        else if(num ==3){
            setting();
        }
        else if(num ==2){
            buy();
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

    public static void buy(){
        Scanner sc = new Scanner(System.in);
        System.out.println("투입된 금액 : "+money+"원");
        System.out.println("구매하실 상품의 번호를 선택해주세요");
        System.out.println("구매를 취소하시려면 0을 눌러주세요");
        for (int i = 0; i < machine.drinklist.size(); i++) {
            System.out.println(i + 1 + "." + machine.drinklist.get(i)+" "+machine.drinkprice.get(i)+"원");
        }
        int num = sc.nextInt();
        if(num==0){
            user();
        }
        if(money<machine.drinkprice.get(num-1)){
            System.out.println("잔액이 부족합니다");
            buy();
        }
        System.out.println(machine.drinklist.get(num-1)+"이(가) 나왔습니다");
        money -= machine.drinkprice.get(num-1);
        System.out.println("남은 금액은 "+money+"원 입니다");
        System.out.println("추가로 구입하시려면 1을");
        System.out.println("메뉴로 돌아가시려면 0을 입력 해주세요");
        int re = sc.nextInt();
        if (re == 0) {
            user();
        } else if (re == 1) {
            buy();
        }



    }

}
