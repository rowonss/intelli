package 휴먼자바.무기교체;

import java.util.ArrayList;

public class slime {

    String name;
    int hp;
    int str;
    int range;

    public static ArrayList<String> slname = new ArrayList();
    public static ArrayList<Integer> slhp = new ArrayList();
    public static ArrayList<Integer> slstr = new ArrayList();
    public static ArrayList<Integer> slrange = new ArrayList();

    public slime(String name, int hp, int str, int range) {
        this.name = name;
        this.hp = hp;
        this.str = str;
        this.range = range;
        slname.add(name);
        slhp.add(hp);
        slstr.add(str);
        slrange.add(range);

    }

    public void setrange(int range) {
        this.range = range;
    }

    public static int countrange() {

        int[] arr = {0, 0, 0, 0};

        for (int i = 0; i < slrange.size(); i++) {
            if (slrange.get(i) == 0) {
                arr[0] += 1;

            } else if (slrange.get(i) == 1) {
                arr[1] += 1;

            } else if (slrange.get(i) == 2) {
                arr[2] += 1;
            } else if (slrange.get(i) == 3) {

                arr[3] += 1;
            }
        }
        int max = arr[0];
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

}
