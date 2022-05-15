package page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class UEMDashboardClientAdminTab extends BasePage {

    public UEMDashboardClientAdminTab(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By UTILITY_MANAGEMENT_SPECIALISTS_MULTISELECT = By.id("utility_management_specialists_multiselect_caption");

    //Methods
    public boolean confirmUtilityManagementSpecialistMultiselectIsVisible() {
        return confirmElementIsVisible(UTILITY_MANAGEMENT_SPECIALISTS_MULTISELECT);
    }

}