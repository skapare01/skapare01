package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.entratamation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SmartCommonAreaPage extends BasePage {

    public SmartCommonAreaPage(WebDriver driver) {
        super(driver);
    }

    private final By SMART_COMMON_AREA_PAGE = By.id("js-smart-common-area-tab");

    public boolean smartCommonAreaPageVisible() {
        return confirmElementIsVisible(SMART_COMMON_AREA_PAGE);
    }
}
