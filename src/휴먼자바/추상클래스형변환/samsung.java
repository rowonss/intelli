package 휴먼자바.추상클래스형변환;

public class samsung extends computer{

    String name = "asd";

    @Override
    public void getname() {
        System.out.println(name);
    }

    @Override
    public void get() {
        System.out.println("난 보이드야");
    }

    public static void main(String[] args) {
        samsung asd = new samsung(){};

        asd.getname();

        asd.get();


    }
}
