package 휴먼자바.자동채널변경;

import java.util.Scanner;


public class main extends 채널목록{

    public int 채널 = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        채널목록 list = new 채널목록();

        System.out.println("tv 전원을 켭니다");

        System.out.println("원하시는 채널 번호를 입력 해주세요");

        int num = sc.nextInt();

        chanchan(num);

    }
}
