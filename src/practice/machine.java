package practice;

import java.util.ArrayList;

public class machine {

    public static ArrayList<String> drinklist = new ArrayList<>();
    public static ArrayList<Integer> drinkprice = new ArrayList<>();

    private String name;
    private int price;

    machine(String name, int price){
        this.name = name;
        this.price = price;
        drinklist.add(name);
        drinkprice.add(price);
    }

    machine(){
        drinklist.add("코카콜라");
        drinkprice.add(1500);
        drinklist.add("스프라이트");
        drinkprice.add(1300);
        drinklist.add("펩시");
        drinkprice.add(1000);
    }

}
