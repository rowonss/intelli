package JAVA_Basic2;

class product {
    int price;
    int bonus;

    product (int x){
        this.price = x;
    }
}

class tv extends product{
    tv(){
        super(100);
    }
}
//class computer extends product{
//
//}
//class audio extends product{}

class buyer {
    int money = 1000;
    int bonus = 1000;

    void buy(product t){
        money -= t.price;
        bonus -= t.bonus;

    }
}

public class basic_22_매개변수의다형성 {
    public static void main(String[] args) {

        buyer me = new buyer();

        tv tv = new tv();

        me.buy(tv);

        System.out.println(me.money);

    }
}
