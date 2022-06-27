package 휴먼자바.무기교체;

public class punch extends attack{

    String name = "펀치";
    int attpoint = 5;
    int range = 1;

    public punch (){
        super.attack(name,attpoint, range);
    }


}
