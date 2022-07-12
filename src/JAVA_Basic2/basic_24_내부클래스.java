package JAVA_Basic2;


class A {
    int i = 10;
    static class B {
        static A a = new A();
        int z = 10;
        static void method(){
            System.out.println(a.i);
        }
        static void m(){
            System.out.println(a.i);
        }
    }
}


public class basic_24_내부클래스 {
    public static void main(String[] args) {

        A a = new A();

        A.B z = new A.B();

        A.B.method();

        A.B.m();

    }
}
