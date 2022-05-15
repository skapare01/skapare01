package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ClientUtilitySettingsBatchesTab extends BasePage {

    public ClientUtilitySettingsBatchesTab(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By PROPERTY_BATCHES_TABLE = By.id("property_utility_batches");

    //Methods
    public boolean confirmPropertyBatchesTableIsVisible() {
        return confirmElementIsVisible(PROPERTY_BATCHES_TABLE);
    }

}