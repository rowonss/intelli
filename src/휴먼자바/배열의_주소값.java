package 휴먼자바;

import java.util.Arrays;

public class 배열의_주소값 {

    public static void main(String[] args){
        System.out.println("test");
        int[] arr = null;
        int[] arr_1 = null;
//        System.out.println(arr[0]);
        System.out.println(arr);
        arr = new int[3];
        arr_1 = new int[3];
        System.out.println(arr);
        System.out.println(arr_1);
        //배열을 대입 했을 때와 for문 등을 통해 복사 했을 때의 차이를 생각하면
        //주소에 대해 이해할 수 있다
//        Arrays.copyOf() 를 사용하면 다른 주소로서 복사 가능하다
    }
}
