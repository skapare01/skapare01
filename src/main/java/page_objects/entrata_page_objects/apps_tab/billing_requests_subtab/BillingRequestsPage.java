package page_objects.entrata_page_objects.apps_tab.billing_requests_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BillingRequestsPage extends BasePage {

    public BillingRequestsPage(WebDriver driver) {super(driver);}

    private final By BILLING_REQUESTS_LISTING_SCREEN = By.id("frm_view_delayed_billing_requests");

    public boolean confirmVisibilityOfBillingRequestsListingScreen() { return confirmElementIsVisible(BILLING_REQUESTS_LISTING_SCREEN);}
}
