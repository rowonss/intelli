package 프로그래머스;

public class 최대값과최솟값 {
    public static void main(String[] args) {
        String a = "-1 -2 -3 -4";
        answer(a);
    }

    static String answer(String a) {

        String[] kkk = a.split(" ");

        int max = -100;
        int maxindex = 0;
        int min = 0;
        int minindex = 0;

        int z = 0;

        for (int i = 0; i < kkk.length; i++) {
            if (Integer.parseInt(kkk[i]) > max) {
                max = Integer.parseInt(kkk[i]);
                maxindex = i;
            }
        }
        z = max;
        for (int i = 0; i < kkk.length; i++) {
            if (Integer.parseInt(kkk[i]) < z) {
                z = Integer.parseInt(kkk[i]);
                minindex = i;
            }
        }


        return kkk[minindex]+" "+kkk[maxindex];
    }
}
