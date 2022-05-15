package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FinancialNav extends BasePage {

    public FinancialNav(WebDriver driver) {
        super(driver);}

    private final By PAYMENTS_TAB = By.id("property_financial_paymentsxxx");
    private final By GENERAL_LEDGER_TAB = By.id("property_financial_general_ledgerxxx");
    private final By CHARGES_TAB = By.id("property_financial_chargesxxx");
    private final By CLOSINGS_TAB = By.id("property_financial_closingsxxx");
    private final By DELINQUENCY_TAB = By.id("property_financial_delinquencyxxx");


    public boolean clickPaymentsTab(){return clickElement(PAYMENTS_TAB);}
    public boolean clickGeneralLedgerTab(){return clickElement(GENERAL_LEDGER_TAB,waitTimes.LONG_WAIT);}
    public boolean clickChargesTab(){return  clickElement(CHARGES_TAB);}
    public boolean clickClosingsTab(){return clickElement(CLOSINGS_TAB,waitTimes.LONG_WAIT);}
    public boolean clickDelinquencyTab(){return clickElement(DELINQUENCY_TAB);}

}
