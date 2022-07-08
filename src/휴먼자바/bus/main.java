package 휴먼자바.bus;

public class main {
    public static void main(String[] args) {


        bus bus = new bus("버스");

        taxi taxi = new taxi("택시");


        driver 김종기 = new driver(5000,1000);


        김종기.drive(taxi);

        고속도로 경부고속도로 = new 고속도로(3000, "경부고속도로");

        김종기.driving(경부고속도로);

        김종기.getNowarea();

        일반도로 천안도로 = new 일반도로("천안도로");








    }
}
