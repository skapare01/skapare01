package page_objects.entrata_page_objects.residents_tab.charges_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ChargesPage extends BasePage {

    public ChargesPage(WebDriver driver) {
        super(driver);
    }

    private final By CHARGES_PAGE = By.id("div-view-listing");


    private final By TOOLS_MENU = By.cssSelector("a[data-toolbar-id='view-data-tools-menu']");
    private final By POST_RECURRING_CHARGES_BUTTON = By.cssSelector("a[onclick*='post_recurring_chargesxxx']");
    private final By POST_DEPOSITS_INTEREST_BUTTON = By.cssSelector("a[onclick*='deposit_interestsxxx']");
    private final By POST_LATE_FEES_BUTTON = By.cssSelector("a[onclick*='view_late_fees_properties']");
    private final By GENERATE_CUSTOMER_INVOICES_BUTTON = By.cssSelector("a[onclick*='generate_customer_invoicesxxx']");
    private final By TOOLS_ICON = By.cssSelector(".view-data-side-tabs li:nth-child(3)");
    private final By POST_RECURRING_CHARGES = By.linkText("Post Recurring Charges");


    public boolean chargesPageVisible() {
        return confirmElementIsVisible(CHARGES_PAGE);
    }

    public boolean toolsMenuHover() {
        return moveToAnElementWithActions(TOOLS_MENU, waitTimes.LONG_WAIT);
    }

    public boolean postRecurringChargesButtonClick() {
        return clickElement(POST_RECURRING_CHARGES_BUTTON);
    }

    public boolean postDepositsInterestButtonClick() {
        return clickElement(POST_DEPOSITS_INTEREST_BUTTON);
    }

    public boolean postLateFeesButtonClick() {
        return clickElement(POST_LATE_FEES_BUTTON, waitTimes.LONG_WAIT);
    }

    public boolean generateCustomerInvoicesButtonClick() {
        return clickElement(GENERATE_CUSTOMER_INVOICES_BUTTON);
    }

    public boolean moveToToolsIcon(){return moveToAnElementWithActions(TOOLS_ICON, waitTimes.LONG_WAIT);}

    public boolean clickPostRecurringCharges(){return clickElement(POST_RECURRING_CHARGES, waitTimes.LONG_WAIT);}
}
