package JAVA_Basic;

public class basic_12_참조형반환타입 {
    int x;

    public static void main(String[] args) {
        basic_12_참조형반환타입 d = new basic_12_참조형반환타입();
        d.x = 10;

        basic_12_참조형반환타입 d2 = copy(d);

        System.out.println(d.x);
        System.out.println(d2.x);

    }

    static basic_12_참조형반환타입 copy(basic_12_참조형반환타입 c){
        basic_12_참조형반환타입 tmp = new basic_12_참조형반환타입();

        tmp.x = c.x;

        return tmp;

        //반환 타입이 참조형인 경우 객체의 주소를 반환한다

    }
}
