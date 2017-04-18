package us.abstracta.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import us.abstracta.opencart.bases.OpencartBasePage;
import us.abstracta.opencart.pageObjectsHandler.OpencartPageObjectsHandler;

public class SearchResultPage extends OpencartBasePage{

    private Header header;

    public SearchResultPage(WebDriver driver, OpencartPageObjectsHandler handler) {
        super(driver, handler);
        header = getPageObjectsHandler().getHeader();
        if(!this.isLoaded()){
            throw new IllegalStateException("This is not HomePage");
        }
    }

    public By getPageLoadedLocator() {
        return By.xpath("//title[contains(text(),'Search - ')]");
    }
}
