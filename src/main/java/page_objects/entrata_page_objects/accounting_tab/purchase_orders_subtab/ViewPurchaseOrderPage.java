package page_objects.entrata_page_objects.accounting_tab.purchase_orders_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ViewPurchaseOrderPage extends BasePage {

    public ViewPurchaseOrderPage(WebDriver driver) {super(driver);}

    private final By APPROVAL_BUTTON = By.id("view_po_approve");
    private final By APPROVAL_OVERLAY = By.cssSelector("[class='loading-overlay bg-img-medium']");

    public boolean clickViewPurchaseOrderApprovalButton() {
        waitForOverlay(APPROVAL_OVERLAY);
        return clickElement(APPROVAL_BUTTON, waitTimes.UNREASONABLE_WAIT);}
}
