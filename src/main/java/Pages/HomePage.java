package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {

    @FindBy(how = How.XPATH, using = "//div[@id='search']//button[@class='btn btn-default btn-lg' and @type='button']")
    private WebElement btnSearch;

    @FindBy(how = How.XPATH, using = "//input[@name='search']")
    private WebElement inpSearch;

    public void searchProduct(String search) {
        inpSearch.sendKeys(search);
    }

    @Override
    public By getPageLoadedLocator() {
        return By.xpath("//title[contains(text(),'Your Store')]");
    }

    public HomePage(WebDriver driver) {
        super(driver);
        if (!this.isLoaded()) {
            throw new IllegalStateException(
                    "This is not the Home Page");
        }
    }
}