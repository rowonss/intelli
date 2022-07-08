package 휴먼자바.bus;

public class 고속도로 implements highway, road{

    int value;

    고속도로(int x){
        this.value = x;
    }

    public void getValue() {
        System.out.println("요금은"+this.value+"입니다");
    }


}
