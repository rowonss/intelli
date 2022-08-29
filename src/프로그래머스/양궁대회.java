package 프로그래머스;

public class 양궁대회 {
    public static void main(String[] args) {

        int n = 10;

        int[] info = {0,0,1,2,0,1,1,1,1,1,1};
        //* [1,1,1,1,1,1,1,1,0,0,2] */
        answer(n,info);

    }
    static void answer(int n, int[] info){
        int[] test = {1,1,2,0,1,2,2,0,0,0,0};
        int[] ryan = {0,0,0,0,0,0,0,0,0,0,0};

        for(int i=0; i<n; i++){
            ryan[i] += 1;
        }



        System.out.println(calc(info,test)[0]);
        System.out.println(calc(info,test)[1]);





    }

    static int[] calc (int[] a, int[]b){
        int ryanresult = 0;
        int aperesult = 0;

        for(int i=0; i<a.length; i++){
            if(a[i]-b[i]==-1){
                ryanresult += Math.abs(i-10);
            }
            else if(a[i]-b[i]>=0){
                aperesult += Math.abs(i-10);
            }
        }
        return new int[] {ryanresult,aperesult};
    }
}
