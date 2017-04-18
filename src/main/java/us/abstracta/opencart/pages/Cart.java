package us.abstracta.opencart.pages;

import automationFramework.utils.datatypes.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import us.abstracta.opencart.bases.OpencartBaseElement;
import us.abstracta.opencart.page_objects_handler.OpencartPageObjectsHandler;

public class Cart extends OpencartBaseElement {

    WebElement mainElement;

    public Cart(WebDriver _driver, OpencartPageObjectsHandler _instance) {
        super(_driver, _instance);
        mainElement = findElement(By.cssSelector("#cart ul.dropdown-menu"));
    }

    public void checkout(){
        mainElement.findElement(By.linkText(" Checkout")).click();
        addWait(Wait.SHORT_WAIT);
    }

    public void viewCart(){
        mainElement.findElement(By.linkText(" View Cart")).click();
        addWait(Wait.SHORT_WAIT);
    }


}
