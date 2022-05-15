package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FinancialNav extends BasePage {

    public FinancialNav(WebDriver driver) {
        super(driver);
    }

    //Financial Tab Names
    private final By MANAGEMENT_FEES_TAB = By.id("li_nav_management_fees_setupxxx");
    private final By GENERAL_LEDGER_TAB = By.id("li_nav_general_ledgerxxx");
    private final By CATALOGS_TAB = By.id("li_nav_asset_tracking_setupxxx");
    private final By ACCOUNTS_PAYABLE_TAB = By.id("li_nav_accounts_payablexxx");
    private final By VENDORS_TAB = By.id("li_nav_vendors_setupxxx");
    private final By APPROVALS_TAB = By.id("li_nav_routesxxx");
    private final By BANK_ACCOUNTS_TAB = By.id("li_nav_bank_accountsxxx");


    //Financial Tab Navigation Methods
    public boolean clickManagementFeesTab() {return clickElement(MANAGEMENT_FEES_TAB);}

    public boolean clickGeneralLedgerTab() {return clickElement(GENERAL_LEDGER_TAB);}

    public boolean catalogsTabClick() {return clickElement(CATALOGS_TAB);}

    public boolean clickAccountsPayableTab() {return clickElement(ACCOUNTS_PAYABLE_TAB);}

    public boolean vendorsTabClick() {return clickElement(VENDORS_TAB);}

    public boolean confirmVisibilityAccountsPayableTab() {return confirmElementIsVisible(ACCOUNTS_PAYABLE_TAB);}

    public boolean confirmVisibilityApprovalsTab() {return confirmElementIsVisible(APPROVALS_TAB);}

    public boolean clickApprovalsTab() {return clickElement(APPROVALS_TAB);}

    public boolean confirmVisibilityOfBankAccountsTab() {return confirmElementIsVisible(BANK_ACCOUNTS_TAB);}

    public boolean clickBankAccountsTab() {return clickElement(BANK_ACCOUNTS_TAB);}
}
