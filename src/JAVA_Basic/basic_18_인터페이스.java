package JAVA_Basic;

abstract class 추상클래스 {


    abstract void asd();

    abstract void dkdk();

    abstract void dkdk(int x);
}

interface 인터페이스 {
    int i = 5;

    default void zkzk(){
        System.out.println("dkdk");
    };
}

public class basic_18_인터페이스 extends 추상클래스 implements 인터페이스 {


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

//    @Override
//    void zkzk(){;}

    public static void main(String[] args) {

        basic_18_인터페이스 asd = new basic_18_인터페이스() {
        };

        asd.asd();

        asd.dkdk(i);

        asd.zkzk();


    }
}

class test{

}
