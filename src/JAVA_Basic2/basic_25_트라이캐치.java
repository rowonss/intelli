package JAVA_Basic2;

public class basic_25_트라이캐치 {
    public static void main(String[] args) {

        System.out.println("1");
        try{
            System.out.println("2");
            System.out.println(10/0);
            System.out.println("3");
            System.out.println(10/0);
        }
        catch (Exception e){
            System.out.println("4");
        }
        System.out.println("5");
    }
}
