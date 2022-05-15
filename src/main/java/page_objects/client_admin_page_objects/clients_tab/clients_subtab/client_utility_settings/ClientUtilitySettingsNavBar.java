package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ClientUtilitySettingsNavBar extends BasePage {

    public ClientUtilitySettingsNavBar(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By DASHBOARD_TAB = By.id("property_dashboard");
    private final By RESIDENTS_TAB = By.id("residents");
    private final By BILL_ACCOUNTS_TAB = By.id("bill_accounts");
    private final By BILLS_TAB = By.id("property_utility_bills");
    private final By BILL_AUDITS_TAB = By.id("property_utility_bill_audits");
    private final By BATCHES_TAB = By.id("property_utility_batches");
    private final By METERS_TAB = By.id("property_meter_devices");
    private final By TRANSMISSIONS_TAB = By.id("property_utility_transmissions");
    private final By PROPERTY_UNITS_TAB = By.id("property_utility_property_units");
    private final By UTILITY_LOGS_TAB = By.id("view_utility_table_logs");
    private final By SETTINGS_TAB = By.id("property_utility_settings_system");
    private final By ENERGY_STAR_TAB = By.id("property_utility_energy_star");
    //Overlay Selector
    private final By OVERLAY_SELECTOR = By.cssSelector("[class='loading-overlay bg-img-medium']");
    //Methods
    public boolean openDashboard() {
        return clickElement(DASHBOARD_TAB);
    }

    public boolean openResidents() {
        return clickElement(RESIDENTS_TAB);
    }

    public boolean openBillAccounts() {
        return clickElement(BILL_ACCOUNTS_TAB);
    }

    public boolean openBills() {
        return clickElement(BILLS_TAB);
    }

    public boolean openBillAudits() {
        return clickElement(BILL_AUDITS_TAB);
    }

    public boolean openBatches() {
        return clickElement(BATCHES_TAB);
    }

    public boolean openMeters() {
        return clickElement(METERS_TAB);
    }

    public boolean openTransmissions() {
        return clickElement(TRANSMISSIONS_TAB);
    }

    public boolean openPropertyUnits() {
        return clickElement(PROPERTY_UNITS_TAB);
    }

    public boolean openUtilityLogs() {
        return clickElement(UTILITY_LOGS_TAB);
    }

    public boolean openSettings() {
        return clickElement(SETTINGS_TAB);
    }

    public boolean openEnergyStarTab() {waitForPotentialOverlayEnergyStarTab();
        return clickElement(ENERGY_STAR_TAB);
    }

    private void waitForPotentialOverlayEnergyStarTab(){
        waitForOverlay(OVERLAY_SELECTOR);
    }
}