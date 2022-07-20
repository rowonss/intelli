package JAVA_Basic2;

public class basic_31_toString의오버라이딩 {
    public static void main(String[] args) {
        System.out.println(new card().toString());
    }
}

class card{
    String kind;
    int number;
    card(){
        this("spade", 1);
    }
    card (String kind, int number){
        this.kind = kind;
        this.number = number;
    }
    public String toString(){
        return "kind :" + kind + ", number :" + number;
    }

}
