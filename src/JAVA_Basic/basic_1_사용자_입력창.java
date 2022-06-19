package JAVA_Basic;

import javax.swing.*;

public class basic_1_사용자_입력창 {
    public static void main (String[] args){

        int answer = (int) (Math.random()*100) + 1;
        int input = 0;
        String temp = "";
        int count = 0;

        do{
            count ++;
            temp = JOptionPane.showInputDialog("1~100 사이의 숫자를 입력하세요" +
                    "끝내려면 -1을 입력하세요");
            if(temp==null || temp.equals("-1")) break;
            System.out.println("입력값 : "+temp);
            input = Integer.parseInt(temp);
        }
        while(true);

    }
}
