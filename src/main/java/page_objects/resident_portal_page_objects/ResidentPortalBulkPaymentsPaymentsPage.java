package page_objects.resident_portal_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentPortalBulkPaymentsPaymentsPage extends BasePage {

    //Variables
    private final By RESIDENT_PORTAL_BULK_PAYMENTS_MAKE_A_PAYMENT_BUTTON = By.cssSelector("a[href='/app/payments/bulk-payment/make-a-payment']");

    public ResidentPortalBulkPaymentsPaymentsPage(WebDriver driver) {
        super(driver);
    }

    //Methods
    public boolean clickMakeAPaymentButtonForABulkPayment() {
        return clickElement(RESIDENT_PORTAL_BULK_PAYMENTS_MAKE_A_PAYMENT_BUTTON, waitTimes.DEFAULT_WAIT);
    }
}
