package page_objects.resident_portal_page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentPortalMessagesAndAlertsPage extends BasePage {

    //Variables
    private final By MESSAGES_AND_ALERTS_PAGE_TITLE_LABEL = By.xpath("//h1/strong[text()='Messages']");
    private final By CHECKING_FOR_MESSAGES_LOADING_OVERLAY = By.xpath("//span[text()='Checking for messages']");
    private final By CHECKING_FOR_ALERTS_LOADING_OVERLAY = By.xpath("//span[text()='Checking for alerts']");

    //Constructor
    public ResidentPortalMessagesAndAlertsPage(WebDriver driver) {
        super(driver);
    }

    //Methods
    public boolean confirmOnMessagesAndAlertsPage() {
        waitForCheckingForMessagesLoadingOverlay();
        waitForCheckingForAlertsLoadingOverlay();
        return confirmElementIsVisible(MESSAGES_AND_ALERTS_PAGE_TITLE_LABEL);
    }
    private void waitForCheckingForMessagesLoadingOverlay() {
        waitForOverlay(CHECKING_FOR_MESSAGES_LOADING_OVERLAY);
    }
    private void waitForCheckingForAlertsLoadingOverlay() {
        waitForOverlay(CHECKING_FOR_ALERTS_LOADING_OVERLAY);
    }
}
