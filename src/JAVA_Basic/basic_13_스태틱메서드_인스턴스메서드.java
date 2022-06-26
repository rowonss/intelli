package JAVA_Basic;

public class basic_13_스태틱메서드_인스턴스메서드 {

    int a, b;

    int add(){
        return a+b;
    }

    static int add(int a, int b){

        return a+b;
    }
    public static void main(String[] args) {
        basic_13_스태틱메서드_인스턴스메서드 add = new basic_13_스태틱메서드_인스턴스메서드();
        adad();

        System.out.println(add.add());

        add.a = 6;

        add.b = 7;

        System.out.println(add.add());

        System.out.println(add(3,6));

    }

    public static void adad(){
        basic_13_스태틱메서드_인스턴스메서드 add = new basic_13_스태틱메서드_인스턴스메서드();

        add.a = 3;

        add.b = 2;

        System.out.println(add.add());

        System.out.println(add(9,8));
    }
}
