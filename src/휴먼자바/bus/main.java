package 휴먼자바.bus;

public class main {
    public static void main(String[] args) {


        bus bus = new bus("버스");

        taxi taxi = new taxi("택시");


        driver 김종기 = new driver(5000,1000,bus);


        김종기.drive();

        고속도로 경부고속도로 = new 고속도로(3000);

        김종기.driving(경부고속도로);








    }
}
