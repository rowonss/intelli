package 프로그래머스;

import java.util.ArrayList;
import java.util.Arrays;


public class 자물쇠와열쇠 {

    public static void main(String[] args) {


        System.out.println(main());
    }

    public static boolean main() {

        int[][] key = {{0, 0, 0}, {1, 0, 0}, {0, 1, 1}};
        int[][] lock = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};


        int[][] mat1 = new int[key.length][key[0].length];
        int[][] mat2 = new int[key.length][key[0].length];
        int[][] mat3 = new int[key.length][key[0].length];
        int[][] mat4 = new int[key.length][key[0].length];

        for (int i = 0; i < mat1.length; i++) {
            Arrays.fill(mat1[i], 0);
            Arrays.fill(mat2[i], 0);
            Arrays.fill(mat3[i], 0);
            Arrays.fill(mat4[i], 0);
        }


        int j = 0;
        for (int i = key.length - 1; i >= 0; i--) {
            for (int k = 0; k < key.length; k++) {
                mat1[k][i] = key[j][k];
            }
            j++;
        }
        j = 0;

        ArrayList<Integer> kkk = new ArrayList<>();
        ArrayList<Integer> kkk2 = new ArrayList<>();
        ArrayList<Integer> kkk3 = new ArrayList<>();
        ArrayList<Integer> kkk4 = new ArrayList<>();
        ArrayList<Integer> bms = new ArrayList<>();
        ArrayList<Integer> bms2 = new ArrayList<>();
        ArrayList<Integer> bms3 = new ArrayList<>();
        ArrayList<Integer> bms4 = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            kkk.add(0);
        }

        for (int i = 0; i < key.length; i++) {
            for (int z = 0; z < key.length; z++) {
                kkk.add(mat1[i][j]);
            }
            for (int p = 0; p < lock.length + (lock.length - key.length); p++) {
                kkk.add(0);
            }
        }
        for (int[] ints : lock) {
            for (int z = 0; z < lock.length; z++) {
                bms.add(ints[j]);
            }
            {
                for (int p = 0; p < lock.length; p++) {
                    bms.add(3);
                }
            }
        }
        for (int i = 0; i < 1000; i++) {
            kkk.add(0);
        }


        for (int i = 0; i < 1; i++) {

            ArrayList<Integer> ssb = new ArrayList<>();

            ssb = bms;

            for (int p = 0; p < kkk.size() + 100; p++) {
                ArrayList<Integer> la = new ArrayList<>();


                for (int g = p; g < ssb.size() + p; g++) {
                    la.add(kkk.get(g));
                }
                System.out.println(la.size());

                for (int jk = 0; jk < ssb.size(); jk++) {
                    int r = ssb.get(jk) + la.get(jk);
                    ssb.set(jk, r);
                }


                int count = 0;
                for (int zxc = 0; zxc < ssb.size(); zxc++) {
                    if (ssb.get(zxc) == 1) {
                        count += 1;
                    }
                }


                if (count == lock.length * lock.length) {
                    return true;
                }
                count = 0;
                ssb = bms;

            }
        }

//        -------------------------------------------------------------------------------------------2


        for (int i = key.length - 1; i >= 0; i--) {
            for (int k = 0; k < key.length; k++) {
                mat2[k][i] = mat1[j][k];
            }
            j++;
        }
        j = 0;


        for (int i = 0; i < 1000; i++) {
            kkk2.add(0);
        }

        for (int i = 0; i < key.length; i++) {
            for (int z = 0; z < key.length; z++) {
                kkk2.add(mat2[i][j]);
            }
            for (int p = 0; p < lock.length + (lock.length - key.length); p++) {
                kkk2.add(0);
            }
        }
        for (int i = 0; i < lock.length; i++) {
            for (int z = 0; z < lock.length; z++) {
                bms2.add(lock[i][j]);
            }
            {
                for (int p = 0; p < lock.length; p++) {
                    bms2.add(3);
                }
            }
        }
        for (int i = 0; i < 1000; i++) {
            kkk2.add(0);
        }


        for (int i = 0; i < 1; i++) {

            ArrayList<Integer> ssb = new ArrayList<>();

            ssb = bms2;

            for (int p = 0; p < kkk2.size() + 100; p++) {
                ArrayList<Integer> la = new ArrayList<>();


                for (int g = p; g < ssb.size() + p; g++) {
                    la.add(kkk2.get(g));
                }


                for (int jk = 0; jk < ssb.size(); jk++) {
                    int r = ssb.get(jk) + la.get(jk);
                    ssb.set(jk, r);
                }


                int count = 0;
                for (int zxc = 0; zxc < ssb.size(); zxc++) {
                    if (ssb.get(zxc) == 1) {
                        count += 1;
                    }
                }


                if (count == lock.length * lock.length) {
                    return true;
                }
                count = 0;
                ssb = bms2;

            }
        }

//        --------------------------------------------------------------------3

        for (int i = key.length - 1; i >= 0; i--) {
            for (int k = 0; k < key.length; k++) {
                mat3[k][i] = mat2[j][k];
            }
            j++;
        }
        j = 0;


        for (int i = 0; i < 1000; i++) {
            kkk3.add(0);
        }

        for (int i = 0; i < key.length; i++) {
            for (int z = 0; z < key.length; z++) {
                kkk3.add(mat3[i][j]);
            }
            for (int p = 0; p < lock.length + (lock.length - key.length); p++) {
                kkk3.add(0);
            }
        }
        for (int i = 0; i < lock.length; i++) {
            for (int z = 0; z < lock.length; z++) {
                bms3.add(lock[i][j]);
            }
            {
                for (int p = 0; p < lock.length; p++) {
                    bms3.add(3);
                }
            }
        }
        for (int i = 0; i < 1000; i++) {
            kkk3.add(0);
        }


        for (int i = 0; i < 1; i++) {

            ArrayList<Integer> ssb = new ArrayList<>();

            ssb = bms3;

            for (int p = 0; p < kkk3.size() + 100; p++) {
                ArrayList<Integer> la = new ArrayList<>();


                for (int g = p; g < ssb.size() + p; g++) {
                    la.add(kkk3.get(g));
                }


                for (int jk = 0; jk < ssb.size(); jk++) {
                    int r = ssb.get(jk) + la.get(jk);
                    ssb.set(jk, r);
                }


                int count = 0;

                for (int zxc = 0; zxc < ssb.size(); zxc++) {
                    if (ssb.get(zxc) == 1) {
                        count += 1;
                    }
                }


                if (count == lock.length * lock.length) {
                    return true;
                }
                count = 0;
                ssb = bms3;

            }
        }

//----------------------------------------------------------------------------

        for (int i = key.length - 1; i >= 0; i--) {
            for (int k = 0; k < key.length; k++) {
                mat4[k][i] = mat3[j][k];
            }
            j++;
        }
        j = 0;


        for (int i = 0; i < 1000; i++) {
            kkk4.add(0);
        }

        for (int i = 0; i < key.length; i++) {
            for (int z = 0; z < key.length; z++) {
                kkk4.add(mat4[i][j]);
            }
            for (int p = 0; p < lock.length + (lock.length - key.length); p++) {
                kkk4.add(0);
            }
        }
        for (int i = 0; i < lock.length; i++) {
            for (int z = 0; z < lock.length; z++) {
                bms4.add(lock[i][j]);
            }
            {
                for (int p = 0; p < lock.length; p++) {
                    bms4.add(3);
                }
            }
        }
        for (int i = 0; i < 1000; i++) {
            kkk4.add(0);
        }


        for (int i = 0; i < 1; i++) {

            ArrayList<Integer> ssb = new ArrayList<>();

            ssb = bms4;

            for (int p = 0; p < kkk4.size() + 100; p++) {
                ArrayList<Integer> la = new ArrayList<>();


                for (int g = p; g < ssb.size() + p; g++) {
                    la.add(kkk4.get(g));
                }


                for (int jk = 0; jk < ssb.size(); jk++) {
                    int r = ssb.get(jk) + la.get(jk);
                    ssb.set(jk, r);
                }


                int count = 0;
                for (int zxc = 0; zxc < ssb.size(); zxc++) {
                    if (ssb.get(zxc) == 1) {
                        count += 1;
                    }
                }


                if (count == lock.length * lock.length) {
                    return true;
                }
                count = 0;
                ssb = bms4;

            }
        }
        return false;
    }
}

