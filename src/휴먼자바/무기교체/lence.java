package 휴먼자바.무기교체;

public class lence extends attack{

    String name = "랜스";
    int attpoint = 15;
    int range = 4;

    public lence (){
        super.attack(name, attpoint, range);
    }
}