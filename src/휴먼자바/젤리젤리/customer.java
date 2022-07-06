package 휴먼자바.젤리젤리;

import java.util.ArrayList;

public class customer extends jelly implements eat, select{

    String name;

    static ArrayList<String> customers = new ArrayList<>();

    public customer(String name){
        this.name = name;
        customers.add(name);
    }

    private ArrayList<String> selectedjelly = new ArrayList<String>();


    @Override
    public void eat() {
        System.out.println("쪨리를 먹다");

    }

    @Override
    public void selectjelly(String jellyname) {
        for(int i=0; i<jellys.length; i++){
            if(jellys[i]==jellyname){
                selectedjelly.add(jellys[i]);
            }
        }
    }

    public void selectedjelly() {
        for(int i=0; i<jellys.length; i++){
            System.out.println(selectedjelly.get(i));
            }
        }
    }

