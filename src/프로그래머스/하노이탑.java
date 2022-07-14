package 프로그래머스;

import java.util.ArrayList;

public class 하노이탑 {
    public static void main(String[] args) {

        ArrayList<ArrayList> tower = settower(2);

//        for (int i = 0; i < tower.length; i++) {
//            System.out.println(tower[i]);
//        }


    }

    static ArrayList<ArrayList> settower(int n) {
        ArrayList<ArrayList> TOWER = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();

        TOWER.add(a);
        TOWER.add(b);
        TOWER.add(c);

        for (int i = 0; i < n + 1; i++) {
            TOWER.get(0).add(i, n - i + 1);
        }

        ArrayList<int[]> answer = new ArrayList<>();

        System.out.println(TOWER.get(0).get(TOWER.get(0).size() - 1));

        int k = TOWER.get(0).size();

        while (true) {

            int stop = 0;

            for (int i = 0; i < 3; i++) {
                    for (int j = 2; j >= 0; j--) {
                        if (TOWER.get(j).size() == 0) {
                            TOWER.get(j).add(TOWER.get(i).get(TOWER.get(i).size() - 1));
                            TOWER.get(i).remove(TOWER.get(i).size()-1);
                            int[] kkk = {i,j};
                            answer.add(kkk);
                            stop+=1;
                            break;
                        }
                        else if ((int) TOWER.get(i).get(TOWER.get(i).size() - 1) < (int) TOWER.get(j).get(TOWER.get(j).size() - 1)) {
                        int[] kkk = {i,j};
                        answer.add(kkk);
                        stop+=1;
                        break;

                    }
                        if(stop == 1){
                            stop = 0;
                            break;
                        }
                }
            }

            for(int i=0; i<answer.size();i++){
                System.out.println(answer.get(i));
            }
            if(k == TOWER.get(2).size()){
                return TOWER;
            }
            return TOWER;
        }


    }
}


