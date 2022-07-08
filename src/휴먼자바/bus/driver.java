package 휴먼자바.bus;

public class driver {

    int money;
    int highpassPoint;
    int speed;

    vehicle vehicle;


    driver (int x, int y){
        this.money = x;
        this.highpassPoint = y;
    }

    void drive(vehicle x){
        System.out.println(x.name+"에 탑승했습니다");
        if(x instanceof bus){
            System.out.println("요금은"+bus.price+"입니다");
        }

    }

    driver (vehicle x){
        this.vehicle = x;
    }

}
