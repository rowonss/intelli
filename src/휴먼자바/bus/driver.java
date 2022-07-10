package 휴먼자바.bus;

public class driver implements license {

    type type = license.type.BEGINNER;

    int money;
    int highpassPoint;
    type lisence;
    vehicle vehicle;

    allroad nowarea;
    String nowArea;

      {
        this.money = money;
        this.highpassPoint = highpassPoint;
    }

    public void getNowarea() {
        System.out.println(this.nowArea);
    }

    void drive(vehicle x) {
        this.vehicle = x;
        System.out.println(x.name + "에 탑승했습니다");
        if (x instanceof bus) {
            System.out.println("요금은" + bus.price + "입니다");
        } else {
            System.out.println("요금은" + taxi.price + "입니다");
        }
    }

    void payment(int value) {
        this.money -= value;
        System.out.println("잔액" + this.money + "입니다");
    }

    void pointpayment(int value) {
        this.highpassPoint -= value;
        System.out.println("남은 포인트는" + this.highpassPoint + "입니다");
    }

    void setspeedbylise(){
        if(this.type == license.type.BEGINNER){
            this.vehicle.setSpeed(30);
        } else if (this.type == license.type.EXPERT) {
            this.vehicle.setSpeed(60);
        }
        else {
            this.vehicle.setSpeed(100);
        }

    }

    void setLisence (type x){
        this.type = x;
    }

    void getspeed (){
        System.out.println(this.vehicle.getSpeed());
    }


    public void setNowarea(allroad nowarea) {
        this.nowarea = nowarea;
        this.nowArea = nowarea.name;
    }

    void driving(allroad x) {
        if (x instanceof highway) {
            if (this.vehicle instanceof bus) {
                System.out.println("버스는 고속도로에 진입 불가능합니다");
            } else {
                고속도로 t = (고속도로) x;
                System.out.println("고속도로에 진입합니다");
                setLisence(license.type.MASTER);
                setspeedbylise();
                setNowarea(x);
                System.out.println("요금은" + t.value + "원 입니다");
                System.out.println(t.value + "원 결제합니다");
                if (this.vehicle instanceof hipass) {
                    System.out.println("하이패스 이용자입니다");
                    System.out.println("하이패스 포인트로 대신 결제합니다");
                    pointpayment(t.value);
                }
                else{
                    payment(t.value);
                }
            }
        } else {
            System.out.println("일반 도로에 진입합니다");
            setLisence(license.type.BEGINNER);
            setspeedbylise();
            setNowarea(x);
        }
    }

}
