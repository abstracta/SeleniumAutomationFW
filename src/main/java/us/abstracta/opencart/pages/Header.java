package us.abstracta.opencart.pages;

import automation_framework.utils.datatypes.Wait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import us.abstracta.opencart.bases.OpencartBaseElement;
import us.abstracta.opencart.page_objects_handler.OpencartPageObjectsHandler;

public class Header extends OpencartBaseElement {

    @FindBy(how = How.NAME, using = "search")
    WebElement searchText;

    @FindBy(how = How.CSS, using = "#logo a")
    WebElement logo;

    @FindBy(how = How.CSS, using = "#search button.btn")
    WebElement searchButton;

    @FindBy(how = How.CSS, using = "#cart button")
    WebElement cartButton;

    public Header(WebDriver _driver, OpencartPageObjectsHandler _instance) {
        super(_driver, _instance);
    }

    public HomePage goToHome(){
        logo.click();
        addWait(Wait.SHORT_WAIT);
        return getPageObjectsHandler().getHomePage();
    }

    public SearchResultPage search(String _product){
        sendText(searchText, _product);
        searchButton.click();
        addWait(Wait.SHORT_WAIT);
        return getPageObjectsHandler().getSearchResultPage();
    }

    public Cart showCart(){
        cartButton.click();
        return getPageObjectsHandler().getCart();
    }
}
