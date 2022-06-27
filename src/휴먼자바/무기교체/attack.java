package 휴먼자바.무기교체;

public class attack {

    public static String name;

    public static int attpoint;

    public static int range;

    public void attack (String name, int attpoint, int range){
        attack.name = name;
        attack.attpoint = attpoint;
        attack.range = range;
        System.out.println("무기를"+name+"로(으로) 변경했습니다");
        System.out.println("공격력은"+attpoint+"입니다");
        System.out.println("범위는"+range+"입니다");
        System.out.println(range+"에 위치한 슬라임만 공격합니다");

    }



}
