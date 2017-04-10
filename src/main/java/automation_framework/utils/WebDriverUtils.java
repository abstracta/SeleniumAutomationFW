package automation_framework.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebDriverUtils {

    public static boolean isElementPresent(WebDriver driver, final By Locator) {
        boolean oAux = true;

        try {
            driver.findElement(Locator);

        } catch (NoSuchElementException e) {
            oAux = false;
        }

        return oAux;
    }
	
	public static void waitTime(WebDriver _driver, int _time){
        _driver.manage().timeouts().implicitlyWait(_time, TimeUnit.SECONDS);
    }

    public static WebElement findElement(WebDriver _driver, final By _locator){
        WebElement element = null;
        try{
            element = _driver.findElement(_locator);
        }
        catch (NoSuchElementException e){
            System.err.print(e.getMessage());
        }
        return element;
    }

    public static List<WebElement> findElements(WebDriver _driver, final By _locator){
        List<WebElement> elements = null;
        try{
            elements = _driver.findElements(_locator);
        }
        catch (NoSuchElementException e){
            System.err.print(e.getMessage());
        }
        return elements;
    }

    public static void scrollToElement(WebDriver _driver, WebElement _element) {
        JavascriptExecutor jse = (JavascriptExecutor) _driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", _element);
    }

    public static void selectByText(WebElement _select, String _text){
        if (!_text.isEmpty()) {
            Select select = new Select(_select);
            select.selectByVisibleText(_text);
        }
    }

    public static void selectByValue(WebElement _select, String _value){
        if (!_value.isEmpty()) {
            Select select = new Select(_select);
            select.selectByValue(_value);
        }
    }

    public static boolean isChecked(WebElement _check) {
        return _check.getAttribute("checked") != null;
    }

    public static void checkElement(WebElement _check) {
        boolean isChecked = isChecked(_check);
        if (isChecked) return;
        _check.click();
    }

    public static void clear(WebElement _element){
        _element.clear();
    }

    public static void sendText(WebElement _element, String _text){
        clear(_element);
        _element.sendKeys(_text);
    }
}
