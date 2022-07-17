package browser;

import org.checkerframework.checker.units.qual.C;

import java.util.Locale;

public class FactoryBrowser {

    public static IBrowser make(String browserType){
        IBrowser browser;

        switch (browserType.toLowerCase()){
            case "chrome":
                browser = new Chrome();
                break;
            default:
                browser = new Firefox();
                break;
        }
        return browser;
    }
}
