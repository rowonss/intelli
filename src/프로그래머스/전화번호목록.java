package 프로그래머스;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class 전화번호목록 {
    public static boolean main(String[] args) {

        String[] phone_book = {"119", "97674223", "1195524421"};


        for(int i=0; i<phone_book.length; i++){
            for(int j=0; j< phone_book.length; j++){
                if(i==j){
                    continue;
                }
                if(phone_book[i].indexOf(phone_book[j])==0){
                    return false;
                }
            }
        }
        return true;
    }
}
