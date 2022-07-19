package JAVA_Basic2;

public class basic_28_예외되던지기 {
    public static void main(String[] args) {

        try {

            test();

        } catch (Exception e) {
            System.out.println("완료");
        }

    }

    static void test() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("예외 처리 됨");
            throw e;
        }
    }
}
