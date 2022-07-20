package JAVA_Basic2;

import java.util.Objects;
import java.lang.*;

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

    public boolean equals(Object obj){
        if(obj instanceof card){
            return false;
        }
        card c = (card)obj;
        return this.kind.equals(c.kind) && this.number == c.number;
    }
    public int hashCode(){
        return Objects.hash(kind, number);
    }

}
