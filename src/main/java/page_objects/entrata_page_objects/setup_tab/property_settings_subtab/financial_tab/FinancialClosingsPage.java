package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FinancialClosingsPage extends BasePage {
    public FinancialClosingsPage(WebDriver driver){
        super(driver);}

    private final By EDIT_ADVANCED_SETTINGS = By.id("advance-info-button");

    public boolean verifyEditAdvancedSettingsButton(){return confirmElementIsVisible(EDIT_ADVANCED_SETTINGS,waitTimes.LONG_WAIT);}
}
