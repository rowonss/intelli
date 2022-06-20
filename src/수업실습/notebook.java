package 수업실습;

import java.util.ArrayList;

public class notebook {

    public String modelname;
    public String cpu;
    public int ram;
    public int ssd;
    public int monitorsize;

    public static ArrayList<String> names = new ArrayList<String>();

    public notebook(String modelname, String cpu, int ram, int ssd, int monitorsize){
        this.modelname = modelname;
        this.cpu = cpu;
        this.ram = ram;
        this.ssd = ssd;
        this.monitorsize = monitorsize;
        names.add(modelname);
    }

    public notebook(String modelname){
        this.modelname = modelname;
        names.add(modelname);
    }

    public void getinfo (){
        System.out.println(this.modelname);
        System.out.println(this.cpu);
        System.out.println(this.ram);
        System.out.println(this.ssd);
        System.out.println(this.monitorsize);
    }


}
