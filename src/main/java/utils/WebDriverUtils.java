package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

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
}
