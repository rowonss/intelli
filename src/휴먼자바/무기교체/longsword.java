package 휴먼자바.무기교체;

public class longsword extends attack{

    String name = "롱소드";
    int attpoint = 10;
    int range = 3;

    public longsword (){
        super.attack(name,attpoint, range);
    }
}
