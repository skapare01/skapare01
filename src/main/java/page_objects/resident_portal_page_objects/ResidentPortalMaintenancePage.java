package page_objects.resident_portal_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentPortalMaintenancePage extends BasePage {

    //Variables
    private final By MAINTENANCE_PAGE_TITLE_LABEL = By.xpath("//h1/strong[text()='Maintenance Requests']");
    private final By CHECKING_FOR_MAINTENANCE_REQUEST_LOADING_OVERLAY = By.xpath("//span[text()='Checking for maintenance requests.']");
    private final By REQUEST_MAINTENANCE_BUTTON = By.cssSelector("a[href='/app/apartment/maintenance-add-request']");

    public ResidentPortalMaintenancePage(WebDriver driver) {
        super(driver);
    }

    //Methods
    private void waitForCheckingForMaintenanceRequestsLoadingOverlay() {
        waitForOverlay(CHECKING_FOR_MAINTENANCE_REQUEST_LOADING_OVERLAY);
    }

    public boolean confirmOnMaintenancePage() {
        waitForCheckingForMaintenanceRequestsLoadingOverlay();
        return confirmElementIsVisible(MAINTENANCE_PAGE_TITLE_LABEL);
    }

    public boolean clickOnRequestMaintenance() {
        return clickElement(REQUEST_MAINTENANCE_BUTTON);
    }
}
