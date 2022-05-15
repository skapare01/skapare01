package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.general_ledger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DetailsPage extends BasePage {
    public DetailsPage(WebDriver driver){
        super(driver);}
    private final By GENERAL_SETTINGS_SECTION = By.id("general-settings-view");

    public boolean checkGeneralSettings(){return confirmElementIsVisible(GENERAL_SETTINGS_SECTION,waitTimes.LONG_WAIT);}

}
