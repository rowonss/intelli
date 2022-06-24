package decodeco;

public class Main {
    
    public static void main(String[] args) {
        
        Component ramen = new toping();
        System.out.println(ramen.make());

        Component sea = new toping("해물");
        System.out.println(sea.make());

//        Component kimchRamen = new Kimchi(new Ramen());
//        System.out.println(kimchRamen.make());
//
//        Component seafoodRamen = new Seafood(new Ramen());
//        System.out.println(seafoodRamen.make());
//
//        Component cheeseRamen = new Cheese(new Ramen());
//        System.out.println(cheeseRamen.make());
    }
}
