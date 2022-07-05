package JAVA_Basic2;

class car {

}

class fireengine extends car {
    public void water (){
        System.out.println("모어쌍");
    }
}

public class basic_21_참조변수의형변환 {

    public static void main(String[] args) {
        car car = null;

        fireengine fe = new fireengine();

        fireengine fe2 = null;

        fe.water();

        car = fe;

//        car.water();

        fe2 = (fireengine)car; // 조상타입 -> 자손타입 형변환 생략 불가
        fe2.water();
    }





}
