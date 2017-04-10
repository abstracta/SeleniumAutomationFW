package automation_framework.page_objects;

import automation_framework.utils.GetProperties;
import automation_framework.utils.WebDriverUtils;
import automation_framework.utils.datatypes.Wait;
import com.applitools.eyes.Eyes;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static automation_framework.utils.Constants.LONG_TIMEOUT;
import static automation_framework.utils.Constants.TIMEOUT;
import static automation_framework.utils.Constants.SHORT_TIMEOUT;

public abstract class BasePage {

    protected static WebDriver driver;
    protected static Eyes eyes;
    protected static GetProperties properties = new GetProperties();

    public BasePage(WebDriver _driver) {
        BasePage.driver = _driver;
        addWait(Wait.SHORT_WAIT);
    }

    public void checkWindow(String _title){
        this.eyes.checkWindow(_title);
    }

    public void setEyes(Eyes _eyes){
        this.eyes = _eyes;
    }

    public Eyes getEyes(){
        return this.eyes;
    }

    public void addWait(Wait _wait){
        switch (_wait){
            case LONG_WAIT:
                WebDriverUtils.waitTime(this.driver, LONG_TIMEOUT);
                break;
            case MEDIUM_WAIT:
                WebDriverUtils.waitTime(this.driver, TIMEOUT);
                break;
            case SHORT_WAIT:
                WebDriverUtils.waitTime(this.driver, SHORT_TIMEOUT);
                break;
            default:
                WebDriverUtils.waitTime(this.driver, SHORT_TIMEOUT);
                break;
        }
    }

    public WebElement findElement(final By _locator){
        return WebDriverUtils.findElement(this.driver, _locator);
    }

    public List<WebElement> findElements(final By _locator){
        return WebDriverUtils.findElements(this.driver, _locator);
    }

    public void scrollToElement(WebElement _element){
        WebDriverUtils.scrollToElement(this.driver, _element);
    }

    public void selectByText(WebElement _select, String _text){
        WebDriverUtils.selectByText(_select, _text);
    }

    public void selectByValue(WebElement _select, String _text){
        WebDriverUtils.selectByValue(_select, _text);
    }

    public boolean isChecked(WebElement _check) {
        return WebDriverUtils.isChecked(_check);
    }

    public void checkElement(WebElement _check) {
        WebDriverUtils.checkElement(_check);
    }

    public void clear(WebElement _element){
        WebDriverUtils.clear(_element);
    }

    public void sendText(WebElement _element, String _text){
        WebDriverUtils.sendText(_element, _text);
    }

    protected final boolean isLoaded(){
        return WebDriverUtils.isElementPresent(this.driver, this.getPageLoadedLocator());
    }

    public abstract By getPageLoadedLocator();

}
