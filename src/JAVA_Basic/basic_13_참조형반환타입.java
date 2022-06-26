package JAVA_Basic;

public class basic_13_참조형반환타입 {
    int x;

    public static void main(String[] args) {
        basic_13_참조형반환타입 d = new basic_13_참조형반환타입();
        d.x = 10;

        basic_13_참조형반환타입 d2 = copy(d);

        System.out.println(d.x);
        System.out.println(d2.x);

    }

    static basic_13_참조형반환타입 copy(basic_13_참조형반환타입 c){
        basic_13_참조형반환타입 tmp = new basic_13_참조형반환타입();

        tmp.x = c.x;

        return tmp;

    }
}
