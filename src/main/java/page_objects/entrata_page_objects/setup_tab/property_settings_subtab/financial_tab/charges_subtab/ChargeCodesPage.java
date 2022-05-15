package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.charges_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ChargeCodesPage extends BasePage {
    public ChargeCodesPage(WebDriver driver){
        super(driver);}
    private final By CUSTOMIZE_CHARGE_CODES = By.linkText("Customize Charge Codes");

    public boolean verifyCustomizeChargeCodes(){return confirmElementIsVisible(CUSTOMIZE_CHARGE_CODES);}
}
