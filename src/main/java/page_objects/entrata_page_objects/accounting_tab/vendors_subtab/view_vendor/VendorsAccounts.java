package page_objects.entrata_page_objects.accounting_tab.vendors_subtab.view_vendor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class VendorsAccounts extends BasePage {

    private final By ACCOUNTS_TAB = By.id("ap_payee_accounts_tab");
    private final By ACCOUNTS_INFORMATION = By.id("div_vendor_accounts");
    private final By ADD_ACCOUNT_BUTTON = By.cssSelector("a[onclick*='Add Account']");
    private final By ACCOUNT_NUMBER = By.name("ap_payee_account[account_number]");
    private final By ACCOUNT_DESCRIPTION = By.name("ap_payee_account[account_description]");
    private final By LOCATION = By.name("ap_payee_account[ap_payee_location_id]");
    private final By SELECT_LOCATION = By.xpath("//*[@id=\"gl_account_id\"]/option[2]");
    private final By DEFAULT_REMITTANCE = By.xpath("//*[@id=\"account_number_parent\"]/div[4]/div");
    private final By SELECT_REMITTANCE = By.xpath("//*[@id=\"ap_remittance_id\"]/li");
    private final By DEFAULT_GL_ACCOUNT = By.name("ap_payee_gl_account_id");
    private final By DEFAULT_PROPERTY = By.name("ap_payee_account[default_property_name]");
    private final By UTILITY_BILL_RECEIPT_TYPE = By.name("ap_payee_account[utility_bill_receipt_type_id]");
    private final By ENABLE_INVOICE_TRACKING = By.id("audit_this_account_div");
    private final By DISABLE_THIS_ACCOUNT = By.id("disable_account");
    private final By USE_SUB_ACCOUNT_NUMBER = By.id("sub_account_number");
    private final By INVOICE_PROCESSING_RECAPTURE_TOTAL_ONLY = By.xpath("//*[@id=\"account_number_parent\"]/div[18]/div");
    private final By ADD_ACCOUNT_SUBMIT = By.id("submit_add_ap_payee_account");
    private final By SUCCESS_BANNER = By.cssSelector("p[class='alert success slim']");


    public VendorsAccounts(WebDriver driver) {
        super(driver);
    }

    public boolean accountsTabClick() {
        return clickElement(ACCOUNTS_TAB);
    }

    public boolean addAccountButtonClick() {
        return clickElement(ADD_ACCOUNT_BUTTON);
    }

    public boolean accountNumberInput(String num) {
        return sendKeysToElement(ACCOUNT_NUMBER, num);
    }

    public boolean selectLocation() {
        return clickElement(SELECT_LOCATION);
    }

    public boolean defaultRemittanceClick() {
        return clickElement(DEFAULT_REMITTANCE);
    }

    public boolean selectRemittance() {
        return clickElement(SELECT_REMITTANCE);
    }

    public boolean addAccountSubmitClick() {
        return clickElement(ADD_ACCOUNT_SUBMIT);
    }


    //Visibility

    public boolean accountsInformationVisible() {
        return confirmElementIsVisible(ACCOUNTS_INFORMATION);
    }

    public boolean addAccountButtonVisible() {
        return confirmElementIsVisible(ADD_ACCOUNT_BUTTON);
    }

    public boolean accountNumberVisible() {
        return confirmElementIsVisible(ACCOUNT_NUMBER, waitTimes.LONG_WAIT);
    }

    public boolean accountDescriptionVisible() {
        return confirmElementIsVisible(ACCOUNT_DESCRIPTION);
    }

    public boolean locationVisible() {
        return confirmElementIsVisible(LOCATION);
    }

    public boolean defaultRemittanceVisible() {
        return confirmElementIsVisible(DEFAULT_REMITTANCE);
    }

    public boolean defaultGlAccountVisible() {
        return confirmElementIsVisible(DEFAULT_GL_ACCOUNT);
    }

    public boolean defaultPropertyVisible() {
        return confirmElementIsVisible(DEFAULT_PROPERTY);
    }

    public boolean utilityBillVisible() {
        return confirmElementIsVisible(UTILITY_BILL_RECEIPT_TYPE);
    }

    public boolean enableInvoiceTrackingVisible() {
        return confirmElementIsVisible(ENABLE_INVOICE_TRACKING);
    }

    public boolean disableAccountVisible() {
        return confirmElementIsVisible(DISABLE_THIS_ACCOUNT);
    }

    public boolean useSubAccountNumberVisible() {
        return confirmElementIsVisible(USE_SUB_ACCOUNT_NUMBER);
    }

    public boolean invoiceProcessingVisible() {
        return confirmElementIsVisible(INVOICE_PROCESSING_RECAPTURE_TOTAL_ONLY);
    }

    public boolean successBannerVisible() {
        return confirmElementIsVisible(SUCCESS_BANNER);
    }
}
