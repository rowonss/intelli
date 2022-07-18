package 프로그래머스;

import java.util.Arrays;
import java.util.Comparator;


public class 전화번호목록 {
    public static void main(String[] args) {

        String[] phone_book = {"119", "97674223", "1195524421"};

        answer(phone_book);

    }

    public static boolean answer(String[] phone_book){


        Arrays.sort(phone_book, Comparator.reverseOrder());




        for(int i=0; i<phone_book.length-1; i++) {
            if (phone_book[i].indexOf(phone_book[i + 1]) == 0) {
                return false;
            }
        }
        return true;
    }
}
