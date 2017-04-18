package us.abstracta.opencart.bases;

import automationFramework.page_objects.BaseElement;
import org.openqa.selenium.WebDriver;
import us.abstracta.opencart.page_objects_handler.OpencartPageObjectsHandler;

public class OpencartBaseElement extends BaseElement{

    protected static OpencartPageObjectsHandler pageObjectsHandler;

    public OpencartBaseElement(WebDriver driver, OpencartPageObjectsHandler handler) {
        super(driver);
        pageObjectsHandler = handler;
    }

    public OpencartPageObjectsHandler getPageObjectsHandler() {
        return pageObjectsHandler;
    }
}
