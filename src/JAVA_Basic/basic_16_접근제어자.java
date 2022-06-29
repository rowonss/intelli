package JAVA_Basic;

class mycat{
    public String name = "로원";
    private int age = 15;
    private String 종 = "아메숏";
    protected String 바보 = "바보";

}

public class basic_16_접근제어자 {
    public static void main(String[] args) {

        mycat cat = new mycat();

        System.out.println(cat.name);
        System.out.println(cat.바보);
    }
}
