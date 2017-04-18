package automationFramework.pageObjects;

import automationFramework.utils.GetProperties;
import automationFramework.utils.WebDriverUtils;
import automationFramework.utils.datatypes.Wait;
import com.applitools.eyes.Eyes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class BasePage {

    protected static WebDriver driver;
    protected static Eyes eyes;
    protected static GetProperties properties = new GetProperties();

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        addWait(Wait.SHORT_WAIT);
    }

    public void checkWindow(String title){
        this.eyes.checkWindow(title);
    }

    public void setEyes(Eyes eyes){
        this.eyes = eyes;
    }

    public Eyes getEyes(){
        return this.eyes;
    }

    public void addWait(Wait wait){
        WebDriverUtils.addWait(this.driver, wait);
    }

    public WebElement findElement(final By locator){
        return WebDriverUtils.findElement(this.driver, locator);
    }

    public List<WebElement> findElements(final By locator){
        return WebDriverUtils.findElements(this.driver, locator);
    }

    public void scrollToElement(WebElement element){
        WebDriverUtils.scrollToElement(this.driver, element);
    }

    public void selectByText(WebElement select, String text){
        WebDriverUtils.selectByText(select, text);
    }

    public void selectByValue(WebElement select, String text){
        WebDriverUtils.selectByValue(select, text);
    }

    public boolean isChecked(WebElement check) {
        return WebDriverUtils.isChecked(check);
    }

    public void checkElement(WebElement check) {
        WebDriverUtils.checkElement(check);
    }

    public void clear(WebElement element){
        WebDriverUtils.clear(element);
    }

    public void sendText(WebElement element, String text){
        WebDriverUtils.sendText(element, text);
    }

    protected final boolean isLoaded(){
        return WebDriverUtils.isElementPresent(this.driver, this.getPageLoadedLocator());
    }

    public abstract By getPageLoadedLocator();

}
