package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.import_data_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ImportData extends BasePage {

    public ImportData(WebDriver driver) {
        super(driver);
    }

    private final By IMPORT_DATA_PAGE = By.id("data_upload");

    public boolean importDataPageVisible() {
        return confirmElementIsVisible(IMPORT_DATA_PAGE);
    }
}
