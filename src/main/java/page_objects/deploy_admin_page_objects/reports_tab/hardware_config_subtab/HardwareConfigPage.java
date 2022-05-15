package page_objects.deploy_admin_page_objects.reports_tab.hardware_config_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class HardwareConfigPage extends BasePage {
    public HardwareConfigPage(WebDriver driver) {
        super(driver);
    }

    private final By REFRESH_STATUS_BUTTON = By.cssSelector("a[onclick='refershStatus();']");


    public boolean confirmRefreshStatusButtonIsVisible() {
        return confirmElementIsVisible(REFRESH_STATUS_BUTTON);
    }
}
