package 개인공부.싱글턴패턴;

public class Settings {

    private Settings () {};
    private static Settings settings = null;

    public static Settings getSettings () {
        if (settings == null){
            settings = new Settings();
        }
        return settings;
    }

    private boolean darkMode = false;
    private int fontSize = 13;

    public boolean getDarkMode () {return darkMode;}
    public  int getFontsize () {return fontSize;}

    public void setDarkMode (boolean _darkMode){
        darkMode = _darkMode; }
    public void setFontSize (int _fontSize){
        fontSize = _fontSize; }
    }
