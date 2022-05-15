package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.general_ledger_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GeneralLedgerNav extends BasePage {

    public GeneralLedgerNav(WebDriver driver) {
        super(driver);
    }

    //General Ledger Sub Tab Names
    private final By CHART_OF_ACCOUNTS_TAB = By.id("li_sub_nav_chart_of_accountsxxx");
    private final By CHARGE_CODES_TAB = By.id("li_sub_nav_ar_codesxxx");

    //General Ledger Sub Tab Navigation Methods

    public boolean clickChartOfAccountsTab() {
        return clickElement(CHART_OF_ACCOUNTS_TAB);
    }
    public boolean clickChargeCodesTab(){return clickElement(CHARGE_CODES_TAB);}
}
