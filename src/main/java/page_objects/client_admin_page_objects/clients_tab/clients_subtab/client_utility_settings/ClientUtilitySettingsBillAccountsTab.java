package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ClientUtilitySettingsBillAccountsTab extends BasePage {

    public ClientUtilitySettingsBillAccountsTab(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By ACCOUNT_SEARCH_TEXT_BOX = By.id("searchCombobox");

    //Methods
    public boolean confirmAccountSearchIsVisible() {
        return confirmElementIsVisible(ACCOUNT_SEARCH_TEXT_BOX);
    }

}