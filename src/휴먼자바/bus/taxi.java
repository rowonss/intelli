package 휴먼자바.bus;

public class taxi extends vehicle implements hipass {

    static int price = 2000;

    static int speed;

    taxi(String x){
        super.name = x;
    }

    public static void setSpeed(int speed) {
        taxi.speed = speed;
    }
}
