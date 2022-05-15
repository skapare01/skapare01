package page_objects.resident_portal_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentPortalMakePaymentPage extends BasePage {

    //Variables
    private final By RESIDENT_PORTAL_PAGE_LABEL_TOP_RIGHT_CORNER = By.cssSelector(".egojplo2");
    private final By RESIDENT_PORTAL_LOAD_CIRCLE = By.cssSelector("[class='css-eesfdh e2jvwuw0']");

    public ResidentPortalMakePaymentPage(WebDriver driver) {
        super(driver);
    }

    //Methods

    public boolean makeAPaymentPageLabelUpperRightCorner() {
        waitForOverlay(RESIDENT_PORTAL_LOAD_CIRCLE);
        return confirmElementIsVisible(RESIDENT_PORTAL_PAGE_LABEL_TOP_RIGHT_CORNER, waitTimes.LONG_WAIT);
    }
}
