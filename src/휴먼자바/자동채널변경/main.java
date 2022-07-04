package 휴먼자바.자동채널변경;

import java.util.Scanner;


public class main{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("tv 전원을 켭니다");

        System.out.println("원하시는 채널 번호를 입력 해주세요");

        int num = sc.nextInt();

        채널목록.chanchan(num);

    }
}
