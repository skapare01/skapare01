package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ClientUtilitySettingsBillsTab extends BasePage {

    public ClientUtilitySettingsBillsTab(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By BILL_SEARCH_TEXT_BOX = By.id("quickSearchUtilityBills");

    //Methods
    public boolean confirmAccountSearchIsVisible() {
        return confirmElementIsVisible(BILL_SEARCH_TEXT_BOX);
    }

}