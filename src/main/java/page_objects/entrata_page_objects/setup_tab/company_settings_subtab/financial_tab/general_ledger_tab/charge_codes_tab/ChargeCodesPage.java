package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.general_ledger_tab.charge_codes_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ChargeCodesPage extends BasePage {
    public ChargeCodesPage(WebDriver driver){
        super(driver); }
    private final By CORE_BUTTON = By.cssSelector("label[for='entrata_core']");
    private final By NON_CORE_BUTTON = By.cssSelector("label[for='integrated']");

    public boolean verifyVisibilityOfCoreButton(){return confirmElementIsVisible(CORE_BUTTON);}
    public boolean verifyVisibilityOfNonCoreButton(){return confirmElementIsVisible(NON_CORE_BUTTON);}
}
