package JAVA_Basic;

public class basic_10_기본형매개변수 {
    private int x;

    public static void main(String[] args) {
        basic_10_기본형매개변수 d = new basic_10_기본형매개변수();
        d.x = 10;
        System.out.println(d.x);
        change(d.x);


        
    }

    static void change(int x){ // 기본형 매개변수수
        x = 1000;
       System.out.println(x);
    }
}
