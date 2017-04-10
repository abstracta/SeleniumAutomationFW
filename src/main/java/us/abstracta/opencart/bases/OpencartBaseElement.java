package us.abstracta.opencart.bases;

import automation_framework.page_objects.BaseElement;
import org.openqa.selenium.WebDriver;
import us.abstracta.opencart.page_objects_handler.OpencartPageObjectsHandler;

public class OpencartBaseElement extends BaseElement{

    protected static OpencartPageObjectsHandler pageObjectsHandler;

    public OpencartBaseElement(WebDriver _driver, OpencartPageObjectsHandler _handler) {
        super(_driver);
        pageObjectsHandler = _handler;
    }

    public OpencartPageObjectsHandler getPageObjectsHandler() {
        return pageObjectsHandler;
    }

}
