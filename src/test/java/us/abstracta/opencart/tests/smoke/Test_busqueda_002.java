package us.abstracta.opencart.tests.smoke;

import org.testng.annotations.Test;
import us.abstracta.opencart.bases.OpencartBaseTest;
import us.abstracta.opencart.pages.SearchResultPage;

public class Test_busqueda_002 extends OpencartBaseTest {

    private SearchResultPage searchResultPage;

    @Test
    public void testImac() throws Exception {
        searchResultPage = homePage.search("iMac");
    }
}
