package 패턴공부.싱글톤패턴;

public class FIRST {

    private Settings settings = Settings.getSettings();

    public void setAndPrintSettings (){
        settings.setDarkMode(true);
        settings.setFontSize(20);

        System.out.println(settings.getDarkMode() + " " + settings.getFontsize());
    }
}
