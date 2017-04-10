package us.abstracta.opencart.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import us.abstracta.opencart.bases.OpencartBasePage;
import us.abstracta.opencart.page_objects_handler.OpencartPageObjectsHandler;

public class HomePage extends OpencartBasePage{

    public HomePage(WebDriver _driver, OpencartPageObjectsHandler _handler) {
        super(_driver, _handler);
        if(!this.isLoaded()){
            throw new IllegalStateException("This is not HomePage");
        }
    }

    @Override
    public By getPageLoadedLocator() {
        return By.xpath("//title[contains(text(),'Your Store')]");
    }
}
