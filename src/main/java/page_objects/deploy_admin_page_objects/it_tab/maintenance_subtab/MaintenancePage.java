package page_objects.deploy_admin_page_objects.it_tab.maintenance_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MaintenancePage extends BasePage {
    public MaintenancePage(WebDriver driver) {
        super(driver);
    }

    //Top Button/Checkbox Locators:
    private final By ADD_MAINTENANCE_BUTTON = By.id("add_maintenance");


    //Top Button/Checkbox Locators:
    public boolean clickAddMaintenanceButton() { return clickElement(ADD_MAINTENANCE_BUTTON); }
}
