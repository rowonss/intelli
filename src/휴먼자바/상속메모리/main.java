package 휴먼자바.상속메모리;


class one{

}

class two extends one{

}

class three extends two{

}

public class main {
    public static void main(String[] args) {

        one one = new two();


    }
}
