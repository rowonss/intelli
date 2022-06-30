package 개인공부.싱글턴패턴;

public class SECOND {

    private Settings settings = Settings.getSettings();

    public void printSettings(){
        System.out.println(settings.getDarkMode()+ " " + settings.getFontsize());
    }
}
