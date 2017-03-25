package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverUtils;

import java.util.concurrent.TimeUnit;

public abstract class BasePage {

    public static WebDriver driver;

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public final boolean isLoaded() {
        return WebDriverUtils.isElementPresent(BasePage.driver,
                this.getPageLoadedLocator());
    }

    public abstract By getPageLoadedLocator();
}
