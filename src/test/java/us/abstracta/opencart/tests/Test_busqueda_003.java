package us.abstracta.opencart.tests;

import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.model.SeverityLevel;
import us.abstracta.opencart.bases.OpencartBaseTest;
import us.abstracta.opencart.pages.SearchResultPage;

public class Test_busqueda_003 extends OpencartBaseTest {

    private SearchResultPage searchResultPage;

    @Severity(SeverityLevel.NORMAL)
    @Test
    public void testIpad() throws Exception {
        searchResultPage = homePage.search("iPad");
    }
}
