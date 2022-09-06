package 프로그래머스;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class 오픈채팅방 {


    public static void main(String[] args) {

        String[] a = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};

        solution(a);

    }

    public static void solution(String[] record) {

        HashMap<String,String> user = new HashMap<>();
        ArrayList<String> answer = new ArrayList<>();

        for(int i=0; i< record.length;i++){
            String[] kkk = record[i].split(" ");
            if(kkk.length>2){
                if(!user.containsKey(kkk[1])){
                    user.put(kkk[1],kkk[2]);
                }
                else {
                    user.replace(kkk[1],kkk[2]);
                }
            }
        }

        for(int i=0; i< record.length;i++){
            String[] kkk = record[i].split(" ");
            if(Objects.equals(kkk[0], "Enter")){
                String a = user.get(kkk[1]);
                answer.add(a+"님이 들어왔습니다.");
            }
            else if(Objects.equals(kkk[0], "Leave")){
                String a = user.get(kkk[1]);
                answer.add(a+"님이 나갔습니다.");
            }
        }

        System.out.println(answer);

    }

}

//import java.util.*;
//
//class Solution {
//    public String[] solution(String[] record) {
//        ArrayList<String> answer = new ArrayList<>();
//        ArrayList<String> uid = new ArrayList<>();
//        ArrayList<String> name = new ArrayList<>();
//
//        String[][] asd = new String[record.length][3];
//
//        for (int i = 0; i < record.length; i++) {
//
//            asd[i] = record[i].split(" ");
//        }
//
//        for (int i = 0; i < asd.length; i++) {
//            if (Objects.equals(asd[i][0], "Enter")) {
//                if (uid.contains(asd[i][1])) {
//                    int ind = uid.indexOf(asd[i][1]);
//                    if (!Objects.equals(name.get(ind), asd[i][2])) {
//                        name.set(ind, asd[i][2]);
//                    }
//                } else if (!uid.contains(asd[i][1])) {
//                    uid.add(asd[i][1]);
//                    name.add(asd[i][2]);
//                }
//            }
//        }
//        for (int i = 0; i < asd.length; i++) {
//            if (Objects.equals(asd[i][0], "Change")) {
//                String zxc = asd[i][2];
//                for (int j = 0; j < uid.size(); j++) {
//                    if (Objects.equals(uid.get(j), asd[i][1])) {
//                        name.set(j, zxc);
//                    }
//                }
//            }
//        }
//        System.out.println(uid);
//        System.out.println(name);
//
//        int index = 0;
//
//        String Name = null;
//
//        for (int i = 0; i < asd.length; i++) {
//            if (Objects.equals(asd[i][0], "Enter")) {
//                for (int j = 0; j < name.size(); j++) {
//                    if (Objects.equals(asd[i][1], uid.get(j))) {
//                        Name = name.get(j);
//                    }
//                }
//                answer.add(index, Name + "님이 들어왔습니다.");
//                index += 1;
//            } else if (Objects.equals(asd[i][0], "Leave")) {
//                for (int j = 0; j < name.size(); j++) {
//                    if (Objects.equals(asd[i][1], uid.get(j))) {
//                        Name = name.get(j);
//                    }
//                }
//
//                answer.add(index, Name + "님이 나갔습니다.");
//                index += 1;
//            }
//        }
//
//
//
//        String[] ans = new String[answer.size()];
//
//        ans = answer.toArray(ans);
//
//        return ans;
//
//    }
//}