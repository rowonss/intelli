package 프로그래머스;

import java.util.ArrayList;

public class 모음사전 {
    public static void main(String[] args) {

        String word = "AAAAE";

        answer(word);
    }

    static void answer(String word) {

        String[] alpha = {"A", "E", "I", "O", "U"};

        ArrayList answer = new ArrayList<>();

        StringBuilder al = new StringBuilder();

        for (int a = 0; a < 5; a++) {
            al.append(alpha[a]);
            answer.add(al);
            for (int b = 0; b < 5; b++) {
                al.append(alpha[b]);
                answer.add(al);
                for (int c = 0; c < 5; c++) {
                    al.append(alpha[c]);
                    answer.add(al);
                    for (int d = 0; d < 5; d++) {
                        al.append(alpha[d]);
                        answer.add(al);
                        for (int e = 0; e < 5; e++) {
                            al.append(alpha[e]);
                            answer.add(al);
                            if (e == 4) {
                                al.delete(4, 4);
                            }
                        }
                        if (d == 4) {
                            al.delete(4, 4);
                        }
                    }
                    if (c == 4) {
                        al.delete(4, 4);
                    }
                }
                if (b == 4) {
                    al.delete(4, 4);
                }
            }
            if (a == 4) {
                al.delete(4, 4);
            }
        }

        System.out.println(answer.get(0));
    }
}
