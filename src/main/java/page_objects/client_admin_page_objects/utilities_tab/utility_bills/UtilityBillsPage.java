package page_objects.client_admin_page_objects.utilities_tab.utility_bills;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class UtilityBillsPage extends BasePage {
    //selectors
    private final By UPLOAD_IP_BILLS_BUTTON = By.cssSelector(".action.upload_ip_bills");
    private final By FIRST_ASSOCIATE_BUTTON_IN_BILL_LISTING_TABLE = By.xpath("//*[@id=\"billListingTable\"]//tr[1]//a[2]");
    private final By UTILITY_BILLS_OVERLAY = By.cssSelector(".loading-overlay.bg-img-medium");
    private final By UPLOAD_SUCCESS_MESSAGE = By.xpath("//p[contains(text(), 'Invoice(s) uploaded successfully.')]");

    public UtilityBillsPage(WebDriver driver) {
        super(driver);
    }
    //methods
    public boolean clickUploadIPBillsButton() {
        return clickElement(UPLOAD_IP_BILLS_BUTTON);
    }
    public boolean clickFirstAssociateButtonInBillListingTable() {
        return clickElement(FIRST_ASSOCIATE_BUTTON_IN_BILL_LISTING_TABLE, waitTimes.LONG_WAIT);
    }
    public boolean confirmVisibilityOfUploadSuccessMessage() {
        waitForOverlay(UTILITY_BILLS_OVERLAY, waitTimes.LONG_WAIT);
        return confirmElementIsVisible(UPLOAD_SUCCESS_MESSAGE, waitTimes.LONG_WAIT);
    }

}
