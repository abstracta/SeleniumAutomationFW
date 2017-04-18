package automationFramework.page_objects;

import automationFramework.utils.WebDriverUtils;
import automationFramework.utils.datatypes.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BaseElement {

    protected static WebDriver driver;

    public BaseElement(WebDriver driver) {
        BaseElement.driver = driver;
    }

    public void addWait(Wait wait){
        WebDriverUtils.addWait(this.driver, wait);
    }

    public void clear(WebElement element){
        WebDriverUtils.clear(element);
    }

    public void sendText(WebElement element, String text){
        WebDriverUtils.sendText(element, text);
    }

    public WebElement findElement(final By locator){
        return WebDriverUtils.findElement(this.driver, locator);
    }

    public List<WebElement> findElements(final By locator){
        return WebDriverUtils.findElements(this.driver, locator);
    }
}
