package 프로그래머스;

import java.util.ArrayList;

public class 영어끝말잇기 {
    public static void main(String[] args) {
        String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        int n = 5;

        answer(n, words);

    }

    static void answer(int n, String[] words) {

        int index = 0;

        ArrayList<String> word = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {

            if (word.contains(words[i])){
                word.add(words[i]);
                index = i+1;
                break;
            }

            if (words[i].charAt(words[i].length() - 1) != words[i + 1].charAt(0)) {
                word.add(words[i]);
                word.add(words[i+1]);
                index = i+2;
                break;
            }
            word.add(words[i]);
        }

        int result = (int)Math.ceil(word.size()/n);
        int result2 = word.size()%n;

        if(result2 == 0){
            result2 = n;
        }

        if(word.size()%n!=0){
            result += 1;
        }

        System.out.println(result);
        System.out.println(result2);




    }
}
