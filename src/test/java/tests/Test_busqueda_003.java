package tests;

import Pages.BaseTest;
import Pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Test_busqueda_003 extends BaseTest {

    @Test
    public void testIpad() throws Exception {

        HomePage hompePage = PageFactory.initElements(driver, HomePage.class);
        hompePage.searchProduct("iPad");
    }
}
