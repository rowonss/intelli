package JAVA_Basic;

class time {
    private int hour;
    private int minute;
    private int second;

    public void setHour(int hour) {
        if(hourrange(hour)) return;
        this.hour = hour;
    }

    private boolean hourrange(int hour) {
        return 0 > hour || hour > 23;
    }

    public int gethour(){
        return hour;
    }
}

public class basic_17_캡슐화 {
    public static void main(String[] args) {
        time t = new time();
        t.setHour(22);
        System.out.println(t.gethour());
    }
}
