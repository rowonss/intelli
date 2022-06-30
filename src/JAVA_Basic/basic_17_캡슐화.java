package JAVA_Basic;

class time {
    int hour;
    int minute;
    int second;

    public void setHour(int hour) {
        if(0>hour || hour>23) return;
        this.hour = hour;
    }
}

public class basic_17_캡슐화 {
    public static void main(String[] args) {
        time t = new time();
        t.setHour(22);
        System.out.println(t.hour);
    }
}
