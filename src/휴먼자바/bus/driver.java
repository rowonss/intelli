package 휴먼자바.bus;

public class driver {

    int money;
    int highpassPoint;
    int speed;

    vehicle vehicle;


    driver (int x, int y, vehicle z){
        this.money = x;
        this.highpassPoint = y;
        this.vehicle = z;
    }

    void drive(){
        System.out.println(this.vehicle.name+"에 탑승했습니다");
        if(this.vehicle instanceof bus){
            System.out.println("요금은"+bus.price+"입니다");
        }
        else {

        }

    }
    driver (vehicle x){
        this.vehicle = x;
    }

    void driving(road x){
        if(x instanceof highway){
            if(this.vehicle instanceof bus){
                System.out.println("버스는 고속도로에 진입 불가능합니다");
            }
            else{
                고속도로 t = (고속도로) x;
                System.out.println("고속도로에 진입합니다");
                System.out.println("요금은"+t.value+"원 입니다");
            }
        }
        else{
            System.out.println("일반 도로에 진입합니다");
        }
    }

}
