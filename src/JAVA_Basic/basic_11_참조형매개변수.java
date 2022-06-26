package JAVA_Basic;

public class basic_11_참조형매개변수 {
    int x;
    public static void main(String[] args) {
        basic_11_참조형매개변수 d = new basic_11_참조형매개변수();

        d.x = 10;
        System.out.println(d.x);

        change(d);

        System.out.println(d.x);


    }

    static void change(basic_11_참조형매개변수 c){ //참조변수이기에 읽기와 쓰기 둘 다 가능 . 주소를 알기 때문
        c.x = 1000;
        System.out.println(c.x);
    }

}
