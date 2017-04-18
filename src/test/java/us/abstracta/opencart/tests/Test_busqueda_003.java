package us.abstracta.opencart.tests;

import org.testng.annotations.Test;
import us.abstracta.opencart.bases.OpencartBaseTest;
import us.abstracta.opencart.pages.SearchResultPage;

public class Test_busqueda_003 extends OpencartBaseTest {

    private SearchResultPage searchResultPage;

    @Test
    public void testIpad() throws Exception {
        searchResultPage = homePage.search("iPad");
    }
}
