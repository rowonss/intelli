package JAVA_Basic2.basic_23_인터페이스의장점예제;

public class main {
    public static void main(String[] args) {

        tank tank = new tank();
        System.out.println(tank.hp);
        scv scv = new scv();

        marine marine = new marine();

        scv.repair(tank);

        System.out.println(tank.hp);
    }
}
