package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.vendors_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class VendorAccessTestAccounts extends BasePage {

    public VendorAccessTestAccounts(WebDriver driver) {
        super(driver);
    }

    private final By VENDORACCESS_TEST_ACCOUNTS_TAB = By.id("li_sub_nav_vendor_access_test_accountsxxx");
    private final By VENDORACCESS_LOGIN_BUTTON = By.cssSelector("a[href*='myvendor28']");
    private final By VENDORACCESS_PAGE = By.id("dashboard_container");
    private final By ADVANCE_BUTTON_LOCATOR = By.id("details-button");
    private final By PROCEED_LINK_LOCATOR = By.id("proceed-link");


    public boolean vendorAccessTestAccountsTabClick() {
        return clickElement(VENDORACCESS_TEST_ACCOUNTS_TAB);
    }

    public boolean vendorAccessLoginButtonClick() {
        return clickElement(VENDORACCESS_LOGIN_BUTTON);
    }

    public boolean vendorAccessPageVisible() {
        switchToRecentlyOpenedTab();
        connectionNotSecurePageBypass();
        return confirmElementIsVisible(VENDORACCESS_PAGE);
    }

    public void connectionNotSecurePageBypass() {
        if(confirmElementIsVisible(ADVANCE_BUTTON_LOCATOR)) {
            clickElement(ADVANCE_BUTTON_LOCATOR);
            clickElement(PROCEED_LINK_LOCATOR);
        }
    }
}
