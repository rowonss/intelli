package 개인공부.싱글턴패턴;

public class FIRST {

    private Settings settings = Settings.getSettings();

    public void setAndPrintSettings (){
        settings.setDarkMode(true);
        settings.setFontSize(15);

        System.out.println(settings.getDarkMode() + " " + settings.getFontsize());
    }
}
