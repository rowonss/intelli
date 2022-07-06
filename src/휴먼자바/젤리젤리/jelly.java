package 휴먼자바.젤리젤리;

public class jelly {

    protected static String[] jellys = {"망고젤리", "딸기젤리", "포도젤리"};

    public static void viewjellylist(){
        for(int i=0; i<jellys.length;i++){
            System.out.println(jellys[i]);
        }
    }


}
