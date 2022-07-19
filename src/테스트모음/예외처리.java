package 테스트모음;

public class 예외처리 {
    public static void main(String[] args) {

        try{
            add("3", "김종기");
        }catch (NumberFormatException e){
            System.out.println("예외 발생");
        }finally {
            System.out.println("끝남");
        }
    }
    static void add (String x, String y) throws NumberFormatException{
        int a = Integer.parseInt(x) + Integer.parseInt(y);
        System.out.println(a);
    }
}
