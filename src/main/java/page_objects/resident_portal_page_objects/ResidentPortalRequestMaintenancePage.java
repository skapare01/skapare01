package page_objects.resident_portal_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentPortalRequestMaintenancePage extends BasePage {

    //Variables
    private final By MAINTENANCE_REQUEST_PAGE_TITLE_LABEL = By.xpath("//h1/strong[text()='New Maintenance Request']");

    public ResidentPortalRequestMaintenancePage(WebDriver driver) {
        super(driver);
    }

    public boolean confirmOnMaintenancePage() {
        return confirmElementIsVisible(MAINTENANCE_REQUEST_PAGE_TITLE_LABEL);
    }
}
