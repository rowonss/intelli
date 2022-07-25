package 백준;

import java.util.Objects;
import java.util.Scanner;

public class 백준5_주사위세개 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();

        String[] z = a.split(" ");

        if(Objects.equals(z[0], z[1]) && Objects.equals(z[1], z[2])){
            System.out.println(10000+Integer.parseInt(z[0])*1000);
        }

        else if(Objects.equals(z[0], z[1])){
            System.out.println(1000+Integer.parseInt(z[0])*100);
        }
        else if(Objects.equals(z[1], z[2])){
            System.out.println(1000+Integer.parseInt(z[1])*100);
        }
        else if(Objects.equals(z[0], z[2])){
            System.out.println(1000+Integer.parseInt(z[2])*100);
        }
        else{
            int max = 0;
            for(int i=0; i<z.length; i++){
                if(Integer.parseInt(z[i])>max){
                    max = Integer.parseInt(z[i]);
                }

            }
            System.out.println(max*100);
        }
    }
}
