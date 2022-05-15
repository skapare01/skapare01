package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.charges_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ChargesNav extends BasePage {
    public ChargesNav(WebDriver driver){
        super(driver);}

    private final By GENERAL_TAB = By.id("property_financial_charges_generalxxx");
    private final By LEDGERS_TAB = By.id("property_financial_charges_ledger_typesxxx");
    private final By CHARGES_CODES_TAB = By.id("property_financial_charges_charge_codesxxx");
    private final By DEPOSIT_INTERESTS_TAB = By.id("property_finanicial_charges_deposit_interestsxxx");

    public boolean clickGeneralTab(){return clickElement(GENERAL_TAB);}
    public boolean clickLedgersTab(){return clickElement(LEDGERS_TAB);}
    public boolean clickChargesCodeTab(){return clickElement(CHARGES_CODES_TAB);}
    public boolean clickDepositInterestsTab(){return clickElement(DEPOSIT_INTERESTS_TAB);}
}
