package us.abstracta.opencart.tests;

import org.testng.annotations.Test;
import us.abstracta.opencart.bases.OpencartBaseTest;
import us.abstracta.opencart.pages.Cart;
import us.abstracta.opencart.pages.SearchResultPage;

public class VisualRegression extends OpencartBaseTest {

    private SearchResultPage searchResultPage;
    private Cart cart;

    @Test
    public void checkVisualState(){
       /* homePage.checkWindow("Home Page");
        searchResultPage = homePage.search("iphone");
        searchResultPage.checkWindow("Search Result Item: Iphone");
        cart = searchResultPage.showCart();
        searchResultPage.checkWindow("Empty Cart");*/
    }
}
