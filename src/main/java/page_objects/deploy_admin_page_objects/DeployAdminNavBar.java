package page_objects.deploy_admin_page_objects;

import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import org.openqa.selenium.By;

public class DeployAdminNavBar extends BasePage {
    public DeployAdminNavBar(WebDriver driver) {
        super(driver);
    }

    //Top Navigation Bar Locators:
    private final By RELEASE_TAB = By.id("Release");
    private final By MAINTENANCES_TAB = By.id("Maintenances");
    private final By CONNECT_TAB = By.id("Connect");
    private final By IT_TAB = By.id("IT");
    private final By REPORTS_TAB = By.id("Reports");

    //Dashboard Sub-tabs:
    private final By USERS_AND_PERMISSIONS_SUBTAB = By.id("sub_nav_module_27");

    //Release Sub-tabs:
    private final By DATABASE_DEPLOYMENTS_SUBTAB = By.linkText("Database Deployments");

    //Maintenances Sub-tabs:
    private final By VIEW_MAINTENANCE_SUBTAB = By.linkText("View Maintenance");

    //Connect Sub-tabs:
    private final By DATABASES_SUBTAB = By.linkText("Databases");

    //IT Sub-tabs:
    private final By MAINTENANCE_SUBTAB = By.linkText("Maintenance");

    //Reports Sub-tabs:
    private final By HARDWARE_CONFIG_SUBTAB = By.linkText("Hardware Config");


    //Top Navigation Bar Methods:
    public boolean hoverOverReleaseTab() {
        return moveToAnElementWithActions(RELEASE_TAB);
    }

    public boolean hoverOverConnectTab() {
        return moveToAnElementWithActions(CONNECT_TAB);
    }

    public boolean hoverOverItTab() {
        return moveToAnElementWithActions(IT_TAB);
    }

    public boolean hoverOverMaintenancesTab() {
        return moveToAnElementWithActions(MAINTENANCES_TAB);
    }

    public boolean hoverOverReportsTab() {
        return moveToAnElementWithActions(REPORTS_TAB);
    }

    //Dashboard Sub-tabs Methods:
    public boolean clickUsersAndPermissionsSubtab() {
        return clickElement(USERS_AND_PERMISSIONS_SUBTAB);
    }

    //Release Sub-tabs Methods:
    public boolean clickDatabaseDeploymentsSubtab() {
        return clickElement(DATABASE_DEPLOYMENTS_SUBTAB);
    }

    //Maintenances Sub-tabs Methods:
    public boolean clickViewMaintenanceSubtab() {
        return clickElement(VIEW_MAINTENANCE_SUBTAB);
    }

    //Connect Sub-tabs Methods:
    public boolean clickDatabasesSubtab() {
        return clickElement(DATABASES_SUBTAB);
    }

    //IT Sub-tabs Methods:
    public boolean clickMaintenanceSubtab() {
        return clickElement(MAINTENANCE_SUBTAB);
    }

    //Reports Sub-tabs Methods:
    public boolean clickHardwareConfig() {
        return clickElement(HARDWARE_CONFIG_SUBTAB);
    }
}
