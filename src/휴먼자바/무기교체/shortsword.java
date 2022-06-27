package 휴먼자바.무기교체;

public class shortsword extends attack{

    String name = "숏소드";
    int attpoint = 8;
    int range = 2;

    public shortsword (){
        super.attack(name, attpoint, range);
    }
}
