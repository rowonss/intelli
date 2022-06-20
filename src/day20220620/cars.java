package day20220620;

import java.util.Scanner;

public class cars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String carname = sc.nextLine();
        carinfo k3 = new carinfo(carname);

        carinfo k5 = new carinfo("그차", 100);
//        carinfo avante = new carinfo("아방이",100);
        carinfo avante = new carinfo(10, 150);
        System.out.println(avante.minspeed);
    }
}
