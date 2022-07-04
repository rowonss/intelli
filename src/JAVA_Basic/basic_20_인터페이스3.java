package JAVA_Basic;

abstract class unit {
    int x,y;
    abstract void move(int x, int y);
    void stop (){
        System.out.println("멈춥니다");
    }
}

interface Fightable2{
    void move(int x, int y);
    void attack(Fightable2 f);

}

class Fighter extends unit implements Fightable2{
    public void move (int x, int y){ //조상보다 접근제어자가 좁으면 안 된다
        System.out.println("이동");
    }
    public void attack(Fightable2 f){
        System.out.println("으아");
    }

    Fightable2 getfighter(){
        Fighter a = new Fighter();
        return a;
    }

}

public class basic_20_인터페이스3 {
    public static void main(String[] args) {

        Fighter z = new Fighter();

        Fightable2 x = z.getfighter();

    }
}
