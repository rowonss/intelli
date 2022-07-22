package JAVA_Basic2;

public class basic_33_joiner_스트링버퍼 {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        String str = String.join("", arr);
        System.out.println(str);

        StringBuffer a = new StringBuffer();



        a.append("aa").append("aaa");

        System.out.println(a);

        String s = a.toString();

        System.out.println(a.getClass());






    }
}
