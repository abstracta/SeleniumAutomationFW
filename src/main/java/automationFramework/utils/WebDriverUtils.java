package automationFramework.utils;

import automationFramework.utils.datatypes.Wait;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static automationFramework.utils.Constants.LONG_TIMEOUT;
import static automationFramework.utils.Constants.SHORT_TIMEOUT;
import static automationFramework.utils.Constants.TIMEOUT;

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
	
	public static void waitTime(WebDriver driver, int time){
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public static void addWait(WebDriver driver, Wait wait){
        switch (wait){
            case LONG_WAIT:
                waitTime(driver, LONG_TIMEOUT);
                break;
            case MEDIUM_WAIT:
                waitTime(driver, TIMEOUT);
                break;
            case SHORT_WAIT:
                waitTime(driver, SHORT_TIMEOUT);
                break;
            default:
                waitTime(driver, SHORT_TIMEOUT);
                break;
        }
    }

    public static WebElement findElement(WebDriver driver, final By locator){
        WebElement element = null;
        try{
            element = driver.findElement(locator);
        }
        catch (NoSuchElementException e){
            System.err.print(e.getMessage());
        }
        return element;
    }

    public static List<WebElement> findElements(WebDriver driver, final By locator){
        List<WebElement> elements = null;
        try{
            elements = driver.findElements(locator);
        }
        catch (NoSuchElementException e){
            System.err.print(e.getMessage());
        }
        return elements;
    }

    public static void scrollToElement(WebDriver driver, WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void selectByText(WebElement comboBox, String text){
        if (!text.isEmpty()) {
            Select select = new Select(comboBox);
            select.selectByVisibleText(text);
        }
    }

    public static void selectByValue(WebElement comboBox, String value){
        if (!value.isEmpty()) {
            Select select = new Select(comboBox);
            select.selectByValue(value);
        }
    }

    public static boolean isChecked(WebElement check) {
        return check.getAttribute("checked") != null;
    }

    public static void checkElement(WebElement check) {
        boolean isChecked = isChecked(check);
        if (isChecked) return;
        check.click();
    }

    public static void clear(WebElement element){
        element.clear();
    }

    public static void sendText(WebElement element, String text){
        clear(element);
        element.sendKeys(text);
    }
}
