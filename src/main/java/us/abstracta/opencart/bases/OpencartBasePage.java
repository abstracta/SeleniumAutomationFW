package us.abstracta.opencart.bases;

import automation_framework.page_objects.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import us.abstracta.opencart.page_objects_handler.OpencartPageObjectsHandler;
import us.abstracta.opencart.pages.Cart;
import us.abstracta.opencart.pages.Header;
import us.abstracta.opencart.pages.HomePage;
import us.abstracta.opencart.pages.SearchResultPage;

public abstract class OpencartBasePage extends BasePage {

    protected static OpencartPageObjectsHandler pageObjectsHandler;
    protected Header header;
    protected Cart cart;

    public OpencartBasePage(WebDriver _driver, OpencartPageObjectsHandler _handler) {
        super(_driver);
        OpencartBasePage.pageObjectsHandler = _handler;
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

    public SearchResultPage search(String _item){
        return header.search(_item);
    }

    public Cart showCart(){
        return header.showCart();
    }

    public abstract By getPageLoadedLocator();
}
