package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.data_cleanup_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ClearCurrentData extends BasePage {

    public ClearCurrentData(WebDriver driver) {
        super(driver);
    }

    private final By CLEAR_CURRENT_DATA_PAGE = By.id("view_data_cleanup_container");

    public boolean clearCurrentDataPageVisible() {
        return confirmElementIsVisible(CLEAR_CURRENT_DATA_PAGE);
    }
}
