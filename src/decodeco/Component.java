package decodeco;

public class Component {

    String name;

    public Component (String name){
        this.name = name;
    }
    public String make(){
        return this.name + "완성";
    };
}
