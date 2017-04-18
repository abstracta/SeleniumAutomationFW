package us.abstracta.opencart.tests.smoke;

import org.testng.annotations.Test;
import us.abstracta.opencart.bases.OpencartBaseTest;
import us.abstracta.opencart.pages.SearchResultPage;

public class Test_busqueda_001 extends OpencartBaseTest {

    private SearchResultPage searchResultPage;

    @Test
    public void testIphone() throws Exception {
        searchResultPage = homePage.search("iPhone");
    }
}
