package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.data_management_tab.migrations_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Workbooks extends BasePage {

    public Workbooks(WebDriver driver) {
        super(driver);
    }

    private final By MIGRATION_WORKBOOKS = By.id("migration_workbooks");

    public boolean migrationWorkbooksPageVisible() {
        return confirmElementIsVisible(MIGRATION_WORKBOOKS);
    }
}
