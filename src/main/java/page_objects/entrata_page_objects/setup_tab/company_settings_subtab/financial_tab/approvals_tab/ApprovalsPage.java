package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.approvals_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ApprovalsPage extends BasePage {

    private final By APPROVALS_CONTAINER = By.id("routes_container");
    private final By EDIT_APPROVAL_SETTINGS_BUTTON = By.linkText("Edit Approval Settings");
    private final By PURCHASE_ORDER_ADVANCED_ROUTING_TOGGLE_ON =
            By.xpath("//*[@id=\"editRoutesSetup\"]/table/tbody/tr[2]/td[2]/div/span[text() = 'Yes']");
    private final By PURCHASE_ORDER_ADVANCED_ROUTING_TOGGLE_OFF =
            By.xpath("//*[@id=\"editRoutesSetup\"]/table/tbody/tr[2]/td[2]/div/span[text() = 'No']");
    private final By SAVE_APPROVAL_SETTINGS_BUTTON = By.cssSelector("input[value='Save']");
    private final By APPROVAL_SETTINGS_SAVE_SUCCESS_MESSAGE = By.xpath("//p[contains(text(), 'Approval settings updated successfully.')]");

    public ApprovalsPage(WebDriver driver) {super(driver);}

    public boolean confirmVisibilityApprovalsContainer() {return confirmElementIsVisible(APPROVALS_CONTAINER);}
    public boolean clickEditApprovalSettingsButton() {
        return clickElement(EDIT_APPROVAL_SETTINGS_BUTTON);
    }
    public boolean confirmVisibilityOfPurchaseOrderAdvancedRoutingToggleOn() {
        return confirmElementIsVisible(PURCHASE_ORDER_ADVANCED_ROUTING_TOGGLE_ON);
    }
    public boolean clickPurchaseOrderAdvancedRoutingToggleToTurnOff() {
        return clickElement(PURCHASE_ORDER_ADVANCED_ROUTING_TOGGLE_ON);
    }
    public boolean confirmVisibilityOfPurchaseOrderAdvancedRoutingToggleOff() {
        return confirmElementIsVisible(PURCHASE_ORDER_ADVANCED_ROUTING_TOGGLE_OFF);
    }
    public boolean clickSaveApprovalSettingsButton() {
        return clickElement(SAVE_APPROVAL_SETTINGS_BUTTON);
    }
    public boolean confirmVisibilityOfApprovalSettingsSaveSuccessMessage() {
        return confirmElementIsVisible(APPROVAL_SETTINGS_SAVE_SUCCESS_MESSAGE);
    }

}
