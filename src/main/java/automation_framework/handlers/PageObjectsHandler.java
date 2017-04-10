package automation_framework.handlers;

import com.applitools.eyes.Eyes;
import org.openqa.selenium.WebDriver;

public class PageObjectsHandler {

    protected WebDriver driver = null;
    protected Eyes eyes = null;

    protected PageObjectsHandler(WebDriver _driver, Eyes _eyes){
        driver = _driver;
        eyes = _eyes;
    }
}
