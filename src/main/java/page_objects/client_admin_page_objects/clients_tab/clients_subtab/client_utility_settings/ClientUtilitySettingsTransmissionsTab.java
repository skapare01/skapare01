package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ClientUtilitySettingsTransmissionsTab extends BasePage {

    public ClientUtilitySettingsTransmissionsTab(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By UTILITY_TRANSMISSIONS_TABLE = By.id("utility_transmissions");

    //Methods
    public boolean confirmUtilityTransmissionsTableIsVisible() {
        return confirmElementIsVisible(UTILITY_TRANSMISSIONS_TABLE);
    }

}