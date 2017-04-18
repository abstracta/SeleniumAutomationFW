package us.abstracta.opencart.bases;

import automationFramework.pageObjects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import us.abstracta.opencart.pageObjectsHandler.OpencartPageObjectsHandler;
import us.abstracta.opencart.pages.Cart;
import us.abstracta.opencart.pages.Header;
import us.abstracta.opencart.pages.HomePage;
import us.abstracta.opencart.pages.SearchResultPage;

public abstract class OpencartBasePage extends BasePage {

    protected static OpencartPageObjectsHandler pageObjectsHandler;
    protected Header header;
    protected Cart cart;

    public OpencartBasePage(WebDriver driver, OpencartPageObjectsHandler handler) {
        super(driver);
        OpencartBasePage.pageObjectsHandler = handler;
        header = getPageObjectsHandler().getHeader();
        cart = getPageObjectsHandler().getCart();
    }

    public OpencartPageObjectsHandler getPageObjectsHandler() {
        return pageObjectsHandler;
    }

    public void setPageObjectsHandler(OpencartPageObjectsHandler pageObjectsHandler) {
        this.pageObjectsHandler = pageObjectsHandler;
    }

    public HomePage goToHome(){
        return header.goToHome();
    }

    public SearchResultPage search(String item){
        return header.search(item);
    }

    public Cart showCart(){
        return header.showCart();
    }

    public abstract By getPageLoadedLocator();
}
