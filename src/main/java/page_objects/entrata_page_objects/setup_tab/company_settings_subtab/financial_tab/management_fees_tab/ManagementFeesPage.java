package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.management_fees_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

import static utils.RandomGenerator.randomName;

public class ManagementFeesPage extends BasePage {

    public ManagementFeesPage(WebDriver driver) {
        super(driver);
    }

    private final By ADD_MANAGEMENT_FEE_TEMPLATE_BUTTON = By.id("js-open-add-calculation");
    private final By MANAGEMENT_FEE_TEMPLATE_NAME_FIELD = By.cssSelector("input[name='fee_template[name]']");
    private final By MANAGEMENT_FEE_TEMPLATE_CLOSE_BUTTON = By.cssSelector("button[title='Close']");
    private final By MANAGEMENT_FEE_TEMPLATE_VENDOR_DROPDOWN = By.cssSelector("i[data-load-all-quick-search-data='true']");
    private final By MANAGEMENT_FEE_TEMPLATE_VENDOR_DROPDOWN_SELECTION = By.id("1");
    private final By MANAGEMENT_FEE_TEMPLATE_PROPERTY_LIST = By.id("property_list");
    private final By MANAGEMENT_FEE_TEMPLATE_PROPERTY_LIST_SELECTION = By.cssSelector("li[class='property-group-record']");
    private final By MANAGEMENT_FEE_TEMPLATE_EXPENSE_ACCOUNT_DROPDOWN = By.cssSelector("#frm_add_management_fee_calcuation > fieldset.wide4.binded > div:nth-child(9) > div.form-search-combobox.wide5 > i");
    private final By MANAGEMENT_FEE_TEMPLATE_EXPENSE_ACCOUNT_SELECTION = By.cssSelector("li[class='ui-menu-item']");
    private final By MANAGEMENT_FEE_TEMPLATE_PERCENT_OF_REVENUE_FIELD = By.cssSelector("input[class='form-percent make_amount_monetary']");
    private final By MANAGEMENT_FEE_TEMPLATE_ADD_BUTTON = By.id("add_calculation");
    private final By MANAGEMENT_FEE_TEMPLATE_ADDED_SUCCESS_MESSAGE = By.cssSelector("p[class='alert success slim']");


    public boolean addManagementFeeTemplate() {
        return clickElement(ADD_MANAGEMENT_FEE_TEMPLATE_BUTTON);
    }

    public boolean verifyAddManagementFeeTemplate() {
        return confirmElementIsVisible(MANAGEMENT_FEE_TEMPLATE_NAME_FIELD);
    }

    public boolean closeAddManagementFeeTemplate() {
        return clickElement(MANAGEMENT_FEE_TEMPLATE_CLOSE_BUTTON);
    }

    public boolean enterManagementFeeTemplateName() {
        return sendKeysToElement(MANAGEMENT_FEE_TEMPLATE_NAME_FIELD, randomName());
    }

    public boolean clickCompanyVendorDropdown() {
        return clickElement(MANAGEMENT_FEE_TEMPLATE_VENDOR_DROPDOWN);
    }

    public boolean clickCompanyVendorDropdownSelection() {
        return clickElement(MANAGEMENT_FEE_TEMPLATE_VENDOR_DROPDOWN_SELECTION);
    }

    public boolean verifyPropertyListVisible() {
        return confirmElementIsVisible(MANAGEMENT_FEE_TEMPLATE_PROPERTY_LIST);
    }

    public boolean clickPropertyListSelection() {
        return clickElement(MANAGEMENT_FEE_TEMPLATE_PROPERTY_LIST_SELECTION);
    }

    public boolean clickManagementFeeExpenseAccountDropdown() {
        return clickElement(MANAGEMENT_FEE_TEMPLATE_EXPENSE_ACCOUNT_DROPDOWN);
    }

    public boolean clickManagementFeeExpenseAccountSelection() {
        return clickElement(MANAGEMENT_FEE_TEMPLATE_EXPENSE_ACCOUNT_SELECTION);
    }

    public boolean enterPercentOfRevenue() {
        return sendKeysToElement(MANAGEMENT_FEE_TEMPLATE_PERCENT_OF_REVENUE_FIELD, "10");
    }

    public boolean clickAddTemplateButton() {
        return clickElement(MANAGEMENT_FEE_TEMPLATE_ADD_BUTTON);
    }

    public boolean verifySuccessMessageAppears() {
        return confirmElementIsVisible(MANAGEMENT_FEE_TEMPLATE_ADDED_SUCCESS_MESSAGE);
    }
}
