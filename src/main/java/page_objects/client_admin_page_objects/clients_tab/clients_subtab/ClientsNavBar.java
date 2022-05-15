package page_objects.client_admin_page_objects.clients_tab.clients_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ClientsNavBar extends BasePage {

    public ClientsNavBar(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By UTILITIES_CLIENT_PROFILE_TAB = By.id("utilities");

    //Methods
    public boolean openClientUtilitiesTab() {
        return clickElement(UTILITIES_CLIENT_PROFILE_TAB);
    }

}