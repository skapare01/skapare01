package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.charges_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DepositInterestsPage extends BasePage {
    public DepositInterestsPage(WebDriver driver){
        super(driver);}

    private final By EDIT_SETTINGS_BUTTON = By.id("deposit_interest_posting-button");

    public boolean verifyEditSettingsButton(){return confirmElementIsVisible(EDIT_SETTINGS_BUTTON);}
}
