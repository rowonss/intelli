package 휴먼자바.무기교체;

public class slime {

    String name;
    int hp;
    int str;

    int range;

    public slime (String name, int hp, int str, int range){
        this.name = name;
        this.hp = hp;
        this.str = str;
        this.range = range;
    }

    public void setrange (int range){
        this.range = range;
    }

}
