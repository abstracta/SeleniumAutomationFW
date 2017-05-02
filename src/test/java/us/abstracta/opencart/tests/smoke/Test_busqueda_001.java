package us.abstracta.opencart.tests.smoke;

import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.model.SeverityLevel;
import us.abstracta.opencart.bases.OpencartBaseTest;
import us.abstracta.opencart.pages.SearchResultPage;

public class Test_busqueda_001 extends OpencartBaseTest {

    private SearchResultPage searchResultPage;

    @Severity(SeverityLevel.MINOR)
    @Test
    public void seacrchItem() throws Exception {
        searchResultPage = homePage.search("iPhone");
    }
}
