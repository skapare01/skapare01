package page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class COADashboardClientAdminTab extends BasePage {

    public COADashboardClientAdminTab(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By CLIENT_MULTISELECT = By.id("client_multiselect");

    //Methods
    public boolean confirmClientMultiselectIsVisible() {
        return confirmElementIsVisible(CLIENT_MULTISELECT);
    }

}