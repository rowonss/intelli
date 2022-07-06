package 휴먼자바.젤리젤리;

import java.util.Scanner;

import static 휴먼자바.젤리젤리.customer.customers;

public class main{
    public static void main(String[] args) {

        customer 김종기 = new customer("김종기");

        System.out.println("주문 대기중인 손님");
        for(int i=0; i<customers.size(); i++){
            System.out.println(customers.get(i));
        }
        System.out.println("판매중인 젤리 목록");
        jelly.viewjellylist();
        Scanner sc = new Scanner(System.in);
        String jelly = sc.nextLine();

        김종기.selectjelly(jelly);

        김종기.selectedjelly();


    }
}
