package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.leasing_tab.leasing_center_sub_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LeasingCenterSettings extends BasePage {
    public LeasingCenterSettings(WebDriver driver) {
        super(driver);
    }

    private final By LEASING_CENTER_PREFERENCES_HEADER_TEXT = By.xpath("//h4[text()='Leasing Center Preferences']");

    public boolean viewLeasingCenterPreferencesHeaderText() {
        return confirmElementIsVisible(LEASING_CENTER_PREFERENCES_HEADER_TEXT);
    }
}
