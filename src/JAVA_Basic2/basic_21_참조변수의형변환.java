package JAVA_Basic2;

class car {

    public void asd(){};

}

class fireengine extends car {
    public void water (){
        System.out.println("모어쌍");
    }
}

public class basic_21_참조변수의형변환 {

    public static void main(String[] args) {

        car car = new car();

        fireengine fe = new fireengine();

        fireengine fe2 = null;

        fe.water();

//        car.water();

        fe2 = (fireengine)car;




    }





}
