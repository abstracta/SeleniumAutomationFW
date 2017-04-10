package automation_framework.page_objects;

import automation_framework.utils.WebDriverUtils;
import automation_framework.utils.datatypes.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static automation_framework.utils.Constants.LONG_TIMEOUT;
import static automation_framework.utils.Constants.TIMEOUT;
import static automation_framework.utils.Constants.SHORT_TIMEOUT;

public class BaseElement {

    protected static WebDriver driver;

    public BaseElement(WebDriver _driver) {
        BaseElement.driver = _driver;
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

    public void clear(WebElement _element){
        WebDriverUtils.clear(_element);
    }

    public void sendText(WebElement _element, String _text){
        WebDriverUtils.sendText(_element, _text);
    }

    public WebElement findElement(final By _locator){
        return WebDriverUtils.findElement(this.driver, _locator);
    }

    public List<WebElement> findElements(final By _locator){
        return WebDriverUtils.findElements(this.driver, _locator);
    }

}
