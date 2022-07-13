package 프로그래머스;

import java.util.ArrayList;

public class 백이십사 {

    static int i = 9;
    static int T = 1;
    static int s = 0;
    static int x = 0;

    public static void main(String[] args) {


        System.out.println(40%3);
//        1->1
        System.out.println(40/3);
        System.out.println(13%3);
//         1->1
        System.out.println(13/3);
        System.out.println(4%3);
//        1->1
        System.out.println(4/3);
        System.out.println(1%3);
//        1->1

        ArrayList<String> asd = new ArrayList<>();

        while (true) {
            s = i % 3;
            x = i / 3;
            if (s == 0) {
                asd.add("4");
            } else if (s == 1) {
                asd.add("1");
            } else {
                asd.add("2");
            }
            if (x == 0) {
                break;
            }
            i = x;
        }

        System.out.println(asd);


    }
}

//11 12  13  14  15  16  17  18  19  20  21
//42 44 111 112 114 121 122 124 141 142 144
//  22  23  24  25  26  27  28  29  30
// 211 212 214 221 222 224 241 242 244
// 31  32  33  34  35  36   37  38  39  40
// 411 412 414 421 422 424 441 442 444 1111