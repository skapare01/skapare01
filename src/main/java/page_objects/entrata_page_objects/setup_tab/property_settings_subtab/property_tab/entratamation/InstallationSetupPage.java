package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.entratamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class InstallationSetupPage extends BasePage {

    public InstallationSetupPage(WebDriver driver) {
        super(driver);
    }

    private final By INSTALLATION_SETUP_SMART_UNITS = By.id("js-entratamation-installation-setup");

    public boolean installationSetupSmartUnitsVisible() {
        return confirmElementIsVisible(INSTALLATION_SETUP_SMART_UNITS);
    }
}
