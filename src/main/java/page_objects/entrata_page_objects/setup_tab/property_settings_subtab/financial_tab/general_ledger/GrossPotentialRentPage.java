package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.general_ledger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GrossPotentialRentPage extends BasePage {
    public GrossPotentialRentPage(WebDriver driver){
        super(driver);}

    private final By EDIT_GPR_SETTINGS_BUTTON = By.id("gpr-button");

    public boolean confirmEditGPRAvailable(){return confirmElementIsVisible(EDIT_GPR_SETTINGS_BUTTON,waitTimes.LONG_WAIT);}
}
