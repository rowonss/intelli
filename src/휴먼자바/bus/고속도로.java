package 휴먼자바.bus;

public class 고속도로 extends allroad implements highway, GeneralRoad {


    int value;

    고속도로(int x, String roadname){
        this.value = x;
        this.name = roadname;
    }

    public void getValue() {
        System.out.println("요금은"+this.value+"입니다");
    }


}
