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
        System.out.println("제품명 : "+this.modelname);
        System.out.println("CPU : "+this.cpu);
        System.out.println("RAM : "+this.ram+"G");
        System.out.println("SSD : "+this.ssd+"GB");
        System.out.println("모니터사이즈 : "+this.monitorsize+"인치");
    }


}
