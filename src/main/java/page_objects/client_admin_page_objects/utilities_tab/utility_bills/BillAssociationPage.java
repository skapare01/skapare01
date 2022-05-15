package page_objects.client_admin_page_objects.utilities_tab.utility_bills;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

import java.util.Properties;

public class BillAssociationPage extends BasePage {
    //Bill Details
    private final By BILL_DATE_PICKER = By.cssSelector(".form-icon.date");
    private final By DATE_PICKER_TODAY_BUTTON = By.cssSelector("button[data-handler='today']");
    private final By INVOICE_NUMBER_FIELD = By.id("invoice_number");
    private final By TOTAL_AMOUNT_FIELD = By.id("total_amount");
    private final By BILL_DETAILS_NEXT_BUTTON = By.id("submit_utility_bill_details");
    //Properties
    private final By SEARCH_PROPERTY_DROPDOWN = By.id("form-search-field");
    private final By ASPEN_ASSET_MANAGEMENT = By.id("1030924");
    private final By PROPERTIES_NEXT_BUTTON = By.id("submit_ap_payee_property");

    public BillAssociationPage(WebDriver driver) {
        super(driver);
    }

    //Bill Details methods
    public boolean clickBillDatePicker() {
        return clickElement(BILL_DATE_PICKER);
    }
    public boolean clickDatePickerTodayButton() {
        return clickElement(DATE_PICKER_TODAY_BUTTON);
    }
    public boolean enterInvoiceNumber(String invoiceNumber) {
        return sendKeysToElement(INVOICE_NUMBER_FIELD, invoiceNumber);
    }
    public boolean enterTotalAmount(String totalAmount) {
        return sendKeysToElement(TOTAL_AMOUNT_FIELD, totalAmount);
    }
    public boolean clickBillDetailsNextButton() {
        return clickElement(BILL_DETAILS_NEXT_BUTTON);
    }
    public boolean clickSearchPropertyDropdown() {
        return clickElement(SEARCH_PROPERTY_DROPDOWN);
    }
    public boolean selectAspenAssetManagementInPropertyDropdown() {
        return clickElement(ASPEN_ASSET_MANAGEMENT);
    }
    public boolean clickPropertiesNextButton() {
        return clickElement(PROPERTIES_NEXT_BUTTON);
    }
}
