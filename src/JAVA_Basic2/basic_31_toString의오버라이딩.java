package JAVA_Basic2;

import java.util.Objects;
import java.lang.*;

public class basic_31_toString의오버라이딩 {
    public static void main(String[] args) {
        card c1 = new card();
        card c2 = new card();
        System.out.println(new card().toString());
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

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

    public boolean equals(Object obj){
        if(!(obj instanceof card)){
            return false;
        }
        card c = (card)obj;
        return this.kind.equals(c.kind) && this.number == c.number;
    }
    public int hashCode(){
        return Objects.hash(kind, number);
    }

}
