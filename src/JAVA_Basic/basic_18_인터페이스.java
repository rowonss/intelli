package JAVA_Basic;

abstract class 추상클래스 {


    abstract void asd();

    abstract void dkdk();

    abstract void dkdk(int x);
}

interface 인터페이스 {
    int i = 5;
    int k = 2;

    default void zkzk(int x) {
        System.out.println("으아");
    }
}

public class basic_18_인터페이스 extends 추상클래스 implements 인터페이스 {


//    public void zkzk(int x){
//        System.out.println("성공");
//    }

    @Override
    void asd() {
        System.out.println("ddd");
    }

    @Override
    void dkdk() {
    }

    @Override
    void dkdk(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println("ㅎㅇ");
        }
    }

    public static void main(String[] args) {

        basic_18_인터페이스 asd = new basic_18_인터페이스() {
        };

        asd.asd();

        asd.dkdk(i);

        asd.zkzk(3);


    }
}

class test{

}
