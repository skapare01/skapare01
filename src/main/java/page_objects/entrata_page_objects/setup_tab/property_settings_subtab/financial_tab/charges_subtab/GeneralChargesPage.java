package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.charges_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.general_ledger.GeneralLedgerNav;

public class GeneralChargesPage extends BasePage {
    public GeneralChargesPage (WebDriver driver){
        super(driver);}
    private final By EDIT_PROPERTY_CHARGE_SETTING = By.id("scheduled-button");

    public boolean verifyEditPropertyChargeSetting(){return confirmElementIsVisible(EDIT_PROPERTY_CHARGE_SETTING);}
}
