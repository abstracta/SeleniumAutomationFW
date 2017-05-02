package us.abstracta.opencart.bases;

import automationFramework.tests.BaseTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import us.abstracta.opencart.pageObjectsHandler.OpencartPageObjectsHandler;
import us.abstracta.opencart.pages.HomePage;

public class OpencartBaseTest extends BaseTest {

    protected OpencartPageObjectsHandler pageObjectsHandler;
    protected HomePage homePage;

    @BeforeMethod
    public void initialize() {
        pageObjectsHandler = OpencartPageObjectsHandler.getInstance(driver, eyes);
        homePage = pageObjectsHandler.getHomePage();
    }

    @AfterMethod
    public void dispose() {
        OpencartPageObjectsHandler.setInstanceNull();
    }
}
