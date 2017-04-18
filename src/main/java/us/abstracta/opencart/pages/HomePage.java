package us.abstracta.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import us.abstracta.opencart.bases.OpencartBasePage;
import us.abstracta.opencart.pageObjectsHandler.OpencartPageObjectsHandler;

public class HomePage extends OpencartBasePage{

    public HomePage(WebDriver driver, OpencartPageObjectsHandler handler) {
        super(driver, handler);
        if(!this.isLoaded()){
            throw new IllegalStateException("This is not HomePage");
        }
    }

    @Override
    public By getPageLoadedLocator() {
        return By.xpath("//title[contains(text(),'Your Store')]");
    }
}
