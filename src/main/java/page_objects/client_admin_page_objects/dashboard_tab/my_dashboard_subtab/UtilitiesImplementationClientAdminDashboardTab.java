package page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class UtilitiesImplementationClientAdminDashboardTab extends BasePage {

    public UtilitiesImplementationClientAdminDashboardTab(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By IMPLEMENTATION_CONSULTANTS_MULTISELECT = By.id("implementation_consultants_multiselect");
    private final By UTILITIES_IMPLEMENTATION_OVERLAY = By.cssSelector("[class='loading-overlay bg-img-medium']");

    //Methods
    public boolean confirmImplementationConsultantsMultiSelectIsVisible() {
        waitForOverlay(UTILITIES_IMPLEMENTATION_OVERLAY);
        return confirmElementIsVisible(IMPLEMENTATION_CONSULTANTS_MULTISELECT, waitTimes.UNREASONABLE_WAIT);
    }

}