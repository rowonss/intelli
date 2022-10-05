package 프로그래머스;

public class 옹알이 {
    public static void main(String[] args) {


        String[] a = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};

        answer(a);

    }

    public static void  answer(String[] a) {

        int count = 0;

        for(int i=0; i<a.length; i++){
            if(a[i].contains("ayaaya") || a[i].contains("mama") || a[i].contains("woowoo") || a[i].contains("yeye")){
                continue;
            }

            a[i] = a[i].replace("aya", "");
            a[i] = a[i].replace("ye", "");
            a[i] = a[i].replace("woo", "");
            a[i] = a[i].replace("ma", "");
            if(a[i].length() == 0){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
