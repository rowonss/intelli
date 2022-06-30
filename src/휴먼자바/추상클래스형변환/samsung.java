package 휴먼자바.추상클래스형변환;

public class samsung extends computer{

    String name = "asd";

    @Override
    void getname() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        computer asd = new computer(){};

        asd.getname();

    }
}
