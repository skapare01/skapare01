package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.smart_devices_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SmartDevicesPage extends BasePage {

    public SmartDevicesPage(WebDriver driver) {
        super(driver);
    }

    private final By SMART_DEVICES_PAGE = By.id("customer_system_container");

    public boolean smartDevicesPageVisible() {
        return confirmElementIsVisible(SMART_DEVICES_PAGE);
    }
}
