package 가위바위보;


import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("가위바위보 게임에 오신 것을 환영합니다 호호");
        System.out.println("1. 가위 2. 바위 3. 보");
        int num = sc.nextInt();
        int com = (int)(Math.random()*3+1);

        if(num == com){
            System.out.println("비겼습니다!!");
        }
        else if(num == 1){
            if(com == 2){
                System.out.println("상대는 바위!!");
                System.out.println("졌습니다!!");
            }
            else {
                System.out.println("상대는 보!!");
                System.out.println("이겼습니다!!");
            }
        }
        else if(num==2){
            if(com == 3){
                System.out.println("상대는 보!!");
                System.out.println("졌습니다!!");
            }
            else{
                System.out.println("상대는 가위!!");
                System.out.println("이겼습니다!!");
            }
        }
        else{
            if(com==1){
                System.out.println("상대는 가위!!");
                System.out.println("졌습니다!!");
            }
            else {
                System.out.println("상대는 바위!!");
                System.out.println("이겼습니다!!");
            }
        }

    }
}
