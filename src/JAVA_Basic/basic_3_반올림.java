package JAVA_Basic;

public class basic_3_반올림 {
    public static void main(String[] args){
        long result = Math.round(4.52);
        // 실수를 소수점 첫 째자리에서 반올림한 정수를 반환
        double pi = 3.141592;
        double shortpi = Math.round(pi * 1000) / 1000.0;
        // 원하는 소수자리까지 반환
        // 1000을 곱하고 1000으로 나누면 된다
        System.out.println(shortpi);
    }
}
