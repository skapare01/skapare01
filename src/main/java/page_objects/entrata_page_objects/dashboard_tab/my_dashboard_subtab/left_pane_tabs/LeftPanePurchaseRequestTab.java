package page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.left_pane_tabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LeftPanePurchaseRequestTab extends BasePage {
    public LeftPanePurchaseRequestTab(WebDriver driver) {
        super(driver);
    }

    private final By ADD_REQUEST_BTN= By.xpath("//*[normalize-space()='Add Request']");
    private final By PURCHASE_REQUEST_HEADER_TEXT = By.xpath("//h6[text()='Purchase Request']");

    public boolean clickAddRequestBtn() {
        return clickElement(ADD_REQUEST_BTN);
    }
    public boolean locatePurchaseRequestHeaderText() {
        return confirmElementIsVisible(PURCHASE_REQUEST_HEADER_TEXT);
    }
}
