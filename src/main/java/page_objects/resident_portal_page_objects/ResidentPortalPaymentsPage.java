package page_objects.resident_portal_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentPortalPaymentsPage extends BasePage {

    //Variables
    private final By RESIDENT_PORTAL_MAKE_PAYMENT_BUTTON = By.cssSelector("a[href='/app/payments/make-payment']");
    private final By RESIDENT_PORTAL_LOAD_CIRCLE = By.cssSelector("[class='css-eesfdh e2jvwuw0']");

    public ResidentPortalPaymentsPage(WebDriver driver) {
        super(driver);
    }

    //Methods
    public boolean clickMakePaymentButton() {
        waitForOverlay(RESIDENT_PORTAL_LOAD_CIRCLE);
        return clickElement(RESIDENT_PORTAL_MAKE_PAYMENT_BUTTON, waitTimes.LONG_WAIT);
    }

}
