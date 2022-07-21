package JAVA_Basic2;

public class basic_32_Strring클래스와생성자 {
    public static void main(String[] args) {

        char[] a = {'s','d'};
        String z = new String(a);

        StringBuffer x = new StringBuffer();

        x.append("1");
        x.append("2");
        x.append("3");
        x.append("4");


        System.out.println(z);

        System.out.println(x);

        x.reverse();

        System.out.println(x);

        String k = new String(x);

        System.out.println(k);

        //스트링버퍼 진작에 쓸 걸

    }
}
