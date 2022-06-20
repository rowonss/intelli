package day20220620;

public class carinfo {

    public String model;
    public String color;
    public int maxspeed;
    public int minspeed;



    public carinfo(String model){this.model = model;}
    public carinfo(int maxspeed){this.maxspeed = maxspeed;}
    public carinfo(String model, int maxspeed){
        this.model = model;
        this.maxspeed = maxspeed;
    }
    public carinfo(int maxspeed,int minspeed){
        this.maxspeed = maxspeed;
        this.minspeed = minspeed;
    }
}
