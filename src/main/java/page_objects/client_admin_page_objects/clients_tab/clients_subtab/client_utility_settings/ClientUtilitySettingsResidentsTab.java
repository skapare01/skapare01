package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ClientUtilitySettingsResidentsTab extends BasePage {

    public ClientUtilitySettingsResidentsTab(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By NAME_SEARCH_TEXT_BOX = By.id("search_name");

    //Methods
    public boolean confirmNameSearchIsVisible() {
        return confirmElementIsVisible(NAME_SEARCH_TEXT_BOX);
    }

}