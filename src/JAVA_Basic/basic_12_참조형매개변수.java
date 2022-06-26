package JAVA_Basic;

public class basic_12_참조형매개변수 {
    int x;
    public static void main(String[] args) {
        basic_12_참조형매개변수 d = new basic_12_참조형매개변수();

        d.x = 10;
        System.out.println(d.x);

        change(d);

        System.out.println(d.x);


    }

    static void change(basic_12_참조형매개변수 d){
        d.x = 1000;
        System.out.println(d.x);
    }

}
