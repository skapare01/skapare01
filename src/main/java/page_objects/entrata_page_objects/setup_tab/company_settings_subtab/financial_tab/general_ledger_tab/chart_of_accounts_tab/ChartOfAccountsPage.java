package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.general_ledger_tab.chart_of_accounts_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ChartOfAccountsPage extends BasePage {

    public ChartOfAccountsPage(WebDriver driver) {
        super(driver);
    }

    private final By ADD_REPORTING_MASK_BUTTON = By.id("js-add-reporting-mask");
    private final By ADD_REPORTING_MASK_POPUP_MASK_NAME_FIELD = By.cssSelector("input[name='reporting_mask[name]']");
    private final By ADD_REPORTING_MASK_POPUP_CLOSE_BUTTON = By.cssSelector("button[title='Close']");
    private final By ADD_REPORTING_MASK_POPUP_SAVE_BUTTON = By.id("js-save-reporting-mask");
    private final By ADD_REPORTING_MASK_SUCCESS_MESSAGE = By.cssSelector("p[class='alert success slim']");
    private final By MASTER_GL_TREE_LIST_ITEM = By.id("js-chart-of-account");

    public boolean clickAddReportingMaskButton() {
        return clickElement(ADD_REPORTING_MASK_BUTTON);
    }

    public boolean verifyAddReportingMaskPopupIsVisible() {
        return confirmElementIsVisible(ADD_REPORTING_MASK_POPUP_MASK_NAME_FIELD);
    }

    public boolean closeAddReportingMaskPopup() {
        return clickElement(ADD_REPORTING_MASK_POPUP_CLOSE_BUTTON);
    }

    public boolean enterReportingMaskName() {
        return sendKeysToElement(ADD_REPORTING_MASK_POPUP_MASK_NAME_FIELD, "Test Reporting Mask");
    }

    public boolean clickSaveReportingMaskButton() {
        return clickElement(ADD_REPORTING_MASK_POPUP_SAVE_BUTTON);
    }

    public boolean verifyAddReportingMaskSuccessMessage() {
        return confirmElementIsVisible(ADD_REPORTING_MASK_SUCCESS_MESSAGE);
    }

    public boolean clickMasterGLTreeLineItem() {
        return clickElement(MASTER_GL_TREE_LIST_ITEM);
    }

}
