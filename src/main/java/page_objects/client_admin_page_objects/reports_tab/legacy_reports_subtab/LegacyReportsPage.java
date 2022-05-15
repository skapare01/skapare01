package page_objects.client_admin_page_objects.reports_tab.legacy_reports_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LegacyReportsPage extends BasePage {

    private final By LMS_VIEWS_REPORT = By.linkText("LMS Views Report");

    public LegacyReportsPage(WebDriver driver) {
        super(driver);
    }

    public boolean clickLMSViewsReport() {
        return clickElement(LMS_VIEWS_REPORT);
    }
}
