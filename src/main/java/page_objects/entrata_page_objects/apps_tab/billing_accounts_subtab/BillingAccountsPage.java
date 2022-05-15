package page_objects.entrata_page_objects.apps_tab.billing_accounts_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BillingAccountsPage extends BasePage {
    public BillingAccountsPage(WebDriver driver) {
        super(driver);
    }

    private final By MAKE_PAYMENT_BUTTON = By.cssSelector("a[class='button action make-payment']");
    private final By CANCEL_MAKE_PAYMENT_LINK = By.id("close_make_payment_screen");
    private final By LISTING_CONTAINER = By.id("billing_accounts_list_container");

    public boolean clickMakePaymentButton() { return clickElement(MAKE_PAYMENT_BUTTON); }

    public boolean confirmCancelLinksIsVisibleForMakePaymentCurtainPage() { return confirmElementIsVisible(CANCEL_MAKE_PAYMENT_LINK); }

    public boolean confirmVisibilityOfListingContainer() { return confirmElementIsVisible(LISTING_CONTAINER);}
}
