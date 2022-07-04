package JAVA_Basic;

interface fightable {
    void move (int x, int y);
    void attack(fightable f);
}

public class basic_19_인터페이스2 implements fightable{
    public static void main(String[] args) {

        fightable asd = new basic_19_인터페이스2();

        asd.attack(asd);

    }

    @Override
    public void move(int x, int y) {
        System.out.println("안녕");
    }

    @Override
    public void attack(fightable f) {
        System.out.println("머여이게");
        System.out.println(f);
    }


}
