package page_objects.client_admin_page_objects.clients_tab.clients_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ClientAdminClientProfile extends BasePage {
    private final By CLIENT_ACCOUNTING_TAB = By.id("accounting");
    private final By CLIENT_INFO_TAB = By.id("info");
    private final By CLIENT_ACCOUNTING_LEDGER_SUBTAB = By.id("ledger");
    private final By CLIENT_DOCUMENTS_SUBTAB = By.xpath("//a[text()='Documents']");
    private final By LEDGER_ADD_PAYMENT = By.id("add_payment_full_ledger");
    private final By SUBMIT_ADD_PAYMENT_BUTTON = By.id("submit_add_payment_button");
    private final By ADD_DOCUMENTS_BUTTON = By.cssSelector("a[class='button action add-document']");
    private final By GREEN_SAVE_ADD_DOCUMENTS_BUTTON = By.id("submit_document");
    private final By CLIENT_PROPERTY_ACCOUNTS = By.id("property_accounts");
    private final By CLIENT_SCREENING_ACCOUNTS = By.id("screening_accounts");
    private final By EDIT_SCREENING_ACCOUNT_BUTTON = By.cssSelector("#screening_account_tab > div.clearfix.margin20-bottom > a");
    private final By EDIT_SCREENING_ACCOUNT_OVERLAY_SUBMIT_BUTTON = By.cssSelector("#save_account_only");
    private final By CLIENT_HOME_OPPORTUNITIES = By.xpath("//*[text()='Opportunities']");
    private final By CREATE_NEW_OPPORTUNITY_BTN = By.xpath("//*[text()=' Create New Opportunity']");
    private final By OPPORTUNITY_INFO_HEADER_TEXT = By.xpath("//h6[text()='Opportunity Info']");
    private final By HELP_SUPPORT_QUESTION_MARK_BOX =  By.id("support");
    private final By HELP_SUPPORT_GENERAL_HELP = By.xpath("//*[text()='General Help']");

    public ClientAdminClientProfile (WebDriver driver) {
        super(driver);
    }

    public boolean openClientAccountingTab() {
        return clickElement(CLIENT_ACCOUNTING_TAB);
    }

    public boolean clickClientInfoTab() { return clickElement(CLIENT_INFO_TAB); }

    public boolean openClientAccountingLedgerSubTab() {
        return clickElement(CLIENT_ACCOUNTING_LEDGER_SUBTAB);
    }

    public boolean clickClientDocumentsSubTab() { return clickElement(CLIENT_DOCUMENTS_SUBTAB); }

    public boolean accountingTabAddPayment() {
        return clickElement(LEDGER_ADD_PAYMENT);
    }

    public boolean submitPaymentIsVisible() {
        return confirmElementIsVisible(SUBMIT_ADD_PAYMENT_BUTTON);
    }

    public boolean clickAddDocumentsButton() { return clickElement(ADD_DOCUMENTS_BUTTON); }

    public boolean confirmGreenSaveButtonIsPresentForAddDocumentWindow() { return confirmElementIsVisible(GREEN_SAVE_ADD_DOCUMENTS_BUTTON); }

    public boolean clientPropertyAccountsVisible() {
        return confirmElementIsVisible(CLIENT_PROPERTY_ACCOUNTS);
    }

    public boolean clientScreeningAccountsVisible() {
        return confirmElementIsVisible(CLIENT_SCREENING_ACCOUNTS);
    }

    public boolean openClientScreeningAccount() {
        return clickElement(CLIENT_SCREENING_ACCOUNTS);
    }

    public boolean openEditScreeningAccount()   {
        return clickElement(EDIT_SCREENING_ACCOUNT_BUTTON);
    }

    public boolean editScreeningAccountOverlayIsVisible() {
        return confirmElementIsVisible(EDIT_SCREENING_ACCOUNT_OVERLAY_SUBMIT_BUTTON);
    }

    public boolean switchToClientProfileTab() {
        return switchToRecentlyOpenedTab();
    }

    public boolean selectClientHomeOpportunitiesTab() {
        return clickElement(CLIENT_HOME_OPPORTUNITIES,waitTimes.LONG_WAIT);
    }

    public boolean clickCreateNewOpportunityBtn() {
        return clickElement(CREATE_NEW_OPPORTUNITY_BTN);
    }

    public boolean opportunityInfoHeaderText() {
        return confirmElementIsVisible(OPPORTUNITY_INFO_HEADER_TEXT);
    }

    public boolean clickHelpSupportQuestionMarkBox() {
        return clickElement(HELP_SUPPORT_QUESTION_MARK_BOX);
    }

    public boolean selectGeneralHelp() {
        return clickElement(HELP_SUPPORT_GENERAL_HELP);
    }

}
