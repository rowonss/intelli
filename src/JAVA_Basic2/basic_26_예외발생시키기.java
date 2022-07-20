package JAVA_Basic2;

public class basic_26_예외발생시키기 {
    public static void main(String[] args) {
        try{
            Exception e = new Exception("고의로 발생");
            throw e;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        throw new RuntimeException(); // 언체크드 에러


    }
}
