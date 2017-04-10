package us.abstracta.opencart.pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import us.abstracta.opencart.bases.OpencartBasePage;
import us.abstracta.opencart.page_objects_handler.OpencartPageObjectsHandler;

public class SearchResultPage extends OpencartBasePage{

    private Header header;

    public SearchResultPage(WebDriver _driver, OpencartPageObjectsHandler _handler) {
        super(_driver, _handler);
        header = getPageObjectsHandler().getHeader();
        if(!this.isLoaded()){
            throw new IllegalStateException("This is not HomePage");
        }
    }

    public By getPageLoadedLocator() {
        return By.xpath("//title[contains(text(),'Search - ')]");
    }

}
