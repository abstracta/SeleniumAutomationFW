package automationFramework.handlers;

import com.applitools.eyes.Eyes;
import org.openqa.selenium.WebDriver;

public class PageObjectsHandler {

    protected WebDriver driver = null;
    protected Eyes eyes = null;

    protected PageObjectsHandler(WebDriver driver, Eyes eyes){
        this.driver = driver;
        this.eyes = eyes;
    }
}
