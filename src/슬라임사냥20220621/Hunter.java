package 슬라임사냥20220621;

import java.util.ArrayList;

public class Hunter {

    public String name;
    public static int str;
    public static int Hp;

    public static ArrayList<String> names = new ArrayList<String>();

    public Hunter (String name){
        this.name = name;
        this.str = 10;
        this.Hp = 100;
        names.add(name);
    }
}
