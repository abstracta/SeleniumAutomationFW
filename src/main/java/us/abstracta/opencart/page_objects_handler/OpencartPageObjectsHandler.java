package us.abstracta.opencart.page_objects_handler;

import automation_framework.handlers.PageObjectsHandler;
import com.applitools.eyes.Eyes;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import us.abstracta.opencart.pages.Cart;
import us.abstracta.opencart.pages.Header;
import us.abstracta.opencart.pages.HomePage;
import us.abstracta.opencart.pages.SearchResultPage;

public class OpencartPageObjectsHandler extends PageObjectsHandler {

    private static OpencartPageObjectsHandler instance = null;

    private HomePage homePage;
    private Header header;
    private Cart cart;
    private SearchResultPage searchResultPage;

    protected OpencartPageObjectsHandler(WebDriver _driver, Eyes _eyes) {
        super(_driver, _eyes);
    }

    public static OpencartPageObjectsHandler getInstance(WebDriver _driver, Eyes _eyes){
        if (instance == null){
            instance = new OpencartPageObjectsHandler(_driver, _eyes);
        }
        return instance;
    }

    public HomePage getHomePage(){
        if (homePage == null) {
            homePage = new HomePage(driver, instance);
            PageFactory.initElements(driver, homePage);
            homePage.setEyes(eyes);
        }
        return homePage;
    }

    public SearchResultPage getSearchResultPage(){
        if (searchResultPage == null) {
            searchResultPage = new SearchResultPage(driver, instance);
            PageFactory.initElements(driver, searchResultPage);
            searchResultPage.setEyes(eyes);
        }
        return searchResultPage;
    }

    public Header getHeader(){
        if (header == null) {
            header = new Header(driver, instance);
            PageFactory.initElements(driver, header);
        }
        return header;
    }

    public Cart getCart(){
        if (cart == null) {
            cart = new Cart(driver, instance);
            PageFactory.initElements(driver, cart);
        }
        return cart;
    }

}
