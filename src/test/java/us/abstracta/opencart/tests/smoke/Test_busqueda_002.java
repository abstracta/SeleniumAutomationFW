package us.abstracta.opencart.tests.smoke;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Severity;
import ru.yandex.qatools.allure.model.SeverityLevel;
import us.abstracta.opencart.bases.OpencartBaseTest;
import us.abstracta.opencart.pages.SearchResultPage;

public class Test_busqueda_002 extends OpencartBaseTest {

    private SearchResultPage searchResultPage;

    @Severity(SeverityLevel.CRITICAL)
    @Test
    public void testImac() throws Exception {
        searchResultPage = homePage.search("iMac");
        Assert.assertTrue(false,"This is an unexpected Error");
    }
}
