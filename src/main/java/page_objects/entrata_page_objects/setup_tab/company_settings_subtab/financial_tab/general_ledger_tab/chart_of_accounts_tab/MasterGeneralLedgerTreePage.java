package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.general_ledger_tab.chart_of_accounts_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

import java.util.Random;

public class MasterGeneralLedgerTreePage extends BasePage {

    public MasterGeneralLedgerTreePage(WebDriver driver) {
        super(driver);
    }

    Random rand = new Random();

    private final By MASTER_GL_TREE_ACCOUNTS_TABLE = By.id("js-view-accounts-table");
    private final By MASTER_GL_TREE_INCOME_STATEMENT_TAB = By.cssSelector("li[class='js-view-tab ']");
    private final By INCOME_STATEMENT_ADD_GROUP_BUTTON = By.cssSelector("a[class='button action js-add-group']");
    private final By ADD_GROUP_POPUP_ACCOUNT_TYPE_DROPDOWN = By.cssSelector("select[name='group[gl_account_type_id]']");
    private final By ACCOUNT_TYPE_DROPDOWN_SELECTION = By.cssSelector("option[value='4']");
    private final By SHOW_GROUP_NAME_ON_REPORTS_TOGGLE = By.cssSelector("div[class='onoff slim on']");
    private final By ADD_GROUP_POPUP_GROUP_NAME_FIELD = By.cssSelector("input[class='form-field wide5']");
    private final By ADD_ACCOUNT_GROUP_BUTTON = By.id("js-save-new-group");
    private final By SUCCESS_MESSAGE = By.cssSelector("p[class='alert success slim']");
    private final By MASTER_GL_TREE_ADD_ACCOUNTS_BUTTON = By.cssSelector("a[class='button action nohref js-add-account binded-nohref-click']");
    private final By ADD_ACCOUNT_NUMBER_FIELD_1 = By.id("js-account-number-segment-0");
    private final By ADD_ACCOUNT_NUMBER_FIELD_2 = By.id("js-account-number-segment-1");
    private final By ADD_ACCOUNT_POPUP_ACCOUNT_NAME_FIELD = By.cssSelector("input[name='account[account_name]']");
    private final By ADD_ACCOUNT_POPUP_ACCOUNT_TYPE_DROPDOWN = By.id("js-account-type");
    private final By ADD_ACCOUNT_POPUP_ACCOUNT_TYPE_DROPDOWN_SELECTION = By.cssSelector("option[value='4']");
    private final By ADD_ACCOUNT_POPUP_USAGE_TYPE = By.id("js-usage");
    private final By ADD_ACCOUNT_POPUP_USAGE_TYPE_SELECTION = By.cssSelector("option[value='422']");
    private final By ADD_ACCOUNT_POPUP_GROUP_TYPE = By.id("js-groups");
    private final By ADD_ACCOUNT_POPUP_GROUP_TYPE_SELECTION = By.cssSelector("span[class='header']");
    //Only the xpath worked for this selector. Other selectors didn't work. May need to talk to development about it.
    private final By ADD_ACCOUNT_POPUP_GROUP_TYPE_SUB_SELECTION = By.xpath("//*[@class=\"js-group-list\"]/li[1]");
    private final By ADD_ACCOUNT_POPUP_SAVE_BUTTON = By.id("js-save-new-and-continue");
    private final By ADD_ACCOUNT_POPUP_ASSOCIATE_ACCOUNT_SAVE_BUTTON = By.id("js-save-associate-accounts");

    public boolean verifyMasterGLTreeAccountsTable() {
        return confirmElementIsVisible(MASTER_GL_TREE_ACCOUNTS_TABLE);
    }

    public boolean clickIncomeStatementTab() {
        return clickElement(MASTER_GL_TREE_INCOME_STATEMENT_TAB);
    }

    public boolean clickAddGroupButton() {
        return clickElement(INCOME_STATEMENT_ADD_GROUP_BUTTON);
    }

    public boolean clickAccountTypeDropdown() {
        return clickElement(ADD_GROUP_POPUP_ACCOUNT_TYPE_DROPDOWN);
    }

    public boolean clickAccountTypeDropdownSelection() {
        return clickElement(ACCOUNT_TYPE_DROPDOWN_SELECTION);
    }

    public boolean clickShowGroupNameOnReportsToggle() {
        return clickElement(SHOW_GROUP_NAME_ON_REPORTS_TOGGLE);
    }

    public boolean enterGroupName() {
        return sendKeysToElement(ADD_GROUP_POPUP_GROUP_NAME_FIELD, "Test Group");
    }

    public boolean clickAddAccountGroupButton() {
        return clickElement(ADD_ACCOUNT_GROUP_BUTTON);
    }

    public boolean verifyAccountGroupAddedSuccessMessage() {
        return confirmElementIsVisible(SUCCESS_MESSAGE);
    }

    public boolean clickAddAccountButtonOnMasterGLTree() {
        return clickElement(MASTER_GL_TREE_ADD_ACCOUNTS_BUTTON);
    }

    public boolean enterAccountNumberFieldOneOnAddAccountPopup() {
        return sendKeysToElement(ADD_ACCOUNT_NUMBER_FIELD_1, String.format("%03d", rand.nextInt(899)+100));
    }

    public boolean enterAccountNumberFieldTwoOnAddAccountPopup() {
        return sendKeysToElement(ADD_ACCOUNT_NUMBER_FIELD_2, String.format("%03d", rand.nextInt(899)+100));
    }

    public boolean enterAccountNameOnAddAccountPopup() {
        return sendKeysToElement(ADD_ACCOUNT_POPUP_ACCOUNT_NAME_FIELD, "Test Account");
    }

    public boolean clickAddAccountPopupAccountTypeDropdown() {
        return clickElement(ADD_ACCOUNT_POPUP_ACCOUNT_TYPE_DROPDOWN);
    }

    public boolean clickAddAccountPopupAccountTypeDropdownSelection() {
        return clickElement(ADD_ACCOUNT_POPUP_ACCOUNT_TYPE_DROPDOWN_SELECTION);
    }

    public boolean clickAddAccountPopupUsageTypeDropdown() {
        return clickElement(ADD_ACCOUNT_POPUP_USAGE_TYPE);
    }

    public boolean clickAddAccountPopupUsageTypeDropdownSelection() {
        return clickElement(ADD_ACCOUNT_POPUP_USAGE_TYPE_SELECTION);
    }

    public boolean clickAddAccountPopupGroupDropdown() {
        return clickElement(ADD_ACCOUNT_POPUP_GROUP_TYPE);
    }

    public boolean clickAddAccountPopupGroupDropdownSelection() {
        return clickElement(ADD_ACCOUNT_POPUP_GROUP_TYPE_SELECTION);
    }

    public boolean clickAddAccountPopupGroupDropdownSubSelection() {
        return clickElement(ADD_ACCOUNT_POPUP_GROUP_TYPE_SUB_SELECTION);
    }

    public boolean clickAddAccountPopupSaveButton() {
        return clickElement(ADD_ACCOUNT_POPUP_SAVE_BUTTON);
    }

    public boolean verifyAccountInfoAddedSuccessMessage() {
        return confirmElementIsVisible(SUCCESS_MESSAGE);
    }

    public boolean clickAddAccountPopupAssociateAccountSaveButton() {
        return clickElement(ADD_ACCOUNT_POPUP_ASSOCIATE_ACCOUNT_SAVE_BUTTON);
    }

    public boolean verifyAccountAddedSuccessMessage() {
        return confirmElementIsVisible(SUCCESS_MESSAGE);
    }

}
