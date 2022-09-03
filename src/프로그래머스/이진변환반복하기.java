package 프로그래머스;

public class 이진변환반복하기 {
    public static void main(String[] args) {

        String s = "110010101001";

        answer(s);

    }

    static int[] answer(String s){

        int count = 0;
        int zerocount = 0;
        String a = s;

        while (a.length() > 1){
            System.out.println(a);
            int cnt = 0;
            count ++;
            for(int i=0; i<a.length(); i++){
                if(a.charAt(i) != '0'){
                    cnt += 1;
                }
                else {
                    zerocount ++;
                }
            }
            System.out.println(cnt);
            a = Integer.toBinaryString(cnt);
        }

        int[] ss = {count,zerocount};

        return ss;

    }
}
