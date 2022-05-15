package page_objects.client_admin_page_objects.dashboard_tab.my_dashboard_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class UtilityBillingDashboardClientAdminTab extends BasePage {

    public UtilityBillingDashboardClientAdminTab(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By UTILITY_BILLING_DASHBOARD = By.id("utility_billing_dashboard");

    //Methods
    public boolean confirmUtilityBillingDashboardIsVisible() {
        return confirmElementIsVisible(UTILITY_BILLING_DASHBOARD);
    }

}