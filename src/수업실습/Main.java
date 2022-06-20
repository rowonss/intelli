package 수업실습;

import java.util.*;

public class Main {

    public Admin admin = new Admin();

    public static void main(String[] args) {

        Main main = new Main();
        main.user();
    }

    public void user () {
        Scanner sc = new Scanner(System.in);

        System.out.println("매장에 오신 것을 환영합니다!");
        System.out.println("1. 제품목록  2. 제품등록  3. 제품검색");

        int num = sc.nextInt();

        if(num==1){
            admin.notebookNames();
            user();
        }
        if(num==2){
            this.set();
        }
        if(num==3){
            search();
        }
    }

    public void set(){
        Scanner inset = new Scanner(System.in);
        System.out.println("등록하시려는 제품의 이름을 적어주세요");
        String inname = inset.nextLine();
        System.out.println("제품의 cpu를 적어주세요");
        String incpu = inset.nextLine();
        System.out.println("제품의 ram 용량을 적어주세요");
        int inram = inset.nextInt();
        System.out.println("제품의 ssd 용량을 적어주세요");
        int inssd = inset.nextInt();
        System.out.println("제품의 모니터 사이즈를 적어주세요");
        int insize = inset.nextInt();


        notebook name = new notebook(inname, incpu, inram, inssd, insize);

        admin.registerNotebook(name);
        user();
    }

    public void search(){
        Scanner modelname = new Scanner(System.in);
        System.out.println("원하시는 제품의 이름을 작성해주세요");

        String nana = modelname.nextLine();

        notebook notebook = admin.getNotebook(nana);
        if( notebook != null){
            notebook.getinfo();
        }

//        System.out.println(notebook.names);
    }
}
