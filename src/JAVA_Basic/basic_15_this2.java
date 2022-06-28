package JAVA_Basic;

public class basic_15_this2 {
    String color;
    String type;
    int door;

    basic_15_this2(){
        this("white","auto",3);
    }
    basic_15_this2(String c, String t, int d){
        color = c;
        type = t;
        door = d;
    }
}
