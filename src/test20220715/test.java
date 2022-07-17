package test20220715;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> 운전자리스트 = new ArrayList();

        System.out.println("운전자의 이름을 5번 입력 해주세요");

        while(true){
            System.out.println(운전자리스트.size()+1+"번쨰 운전자 이름을 입력하세요");
            System.out.println();
            String name = sc.nextLine();;
            운전자리스트.add(name);
            System.out.println(운전자리스트.size()+"번쨰 운전자 이름 입력 완료");
            if(운전자리스트.size()==5){
                System.out.println(운전자리스트);
                System.out.println("5명이 입력 완료되어 종료합니다");
                break;
            }
        }

        System.out.println("2번 문제 0번째 배열의 운전자와 구문 출력");
        System.out.println("아무키나 눌러서 진행");
        sc.nextLine();
        System.out.println(운전자리스트.get(0)+"이 드라이버는 달릴 수 없습니다");
        System.out.println("아무키나 눌러서 진행");
        sc.nextLine();
        System.out.println("3번 문제 면허 확인");
        System.out.println("아무키나 눌러서 진행");
        sc.nextLine();
        for(int i=0; i<운전자리스트.size(); i++){
            if(Objects.equals(운전자리스트.get(i), "김준석")){
                System.out.println("면허 확인");
            }
            else{
                System.out.println("면허 확인 완료");
            }
        }

        System.out.println("4번 문제. 0번째, 1번째 운전자 이름 출력");

        System.out.println("0번째"+운전자리스트.get(0));
        System.out.println("1번째"+운전자리스트.get(1));

        for(int i=0; i<운전자리스트.size(); i++){
            if(Objects.equals(운전자리스트.get(i), "김준석")){
                break;
            }
        }

    }
}
