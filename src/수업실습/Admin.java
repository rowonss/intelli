package 수업실습;

import java.util.ArrayList;

public class Admin {
    ArrayList<notebook> master = new ArrayList<>();

    public void registerNotebook(notebook notebook){
        master.add(notebook);
        System.out.println("등록되었습니다.");
    }

    public notebook getNotebook(String name){
        for(notebook notebook : master){
            if(notebook.modelname.equals(name)) {
                return notebook;
            }
        }
        return null;
    }

    public void notebookNames(){
        for(notebook notebook: master){
            System.out.println(notebook.modelname);
        }
    }
}
