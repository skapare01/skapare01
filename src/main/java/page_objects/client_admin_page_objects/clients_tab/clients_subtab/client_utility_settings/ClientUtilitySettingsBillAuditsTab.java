package page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ClientUtilitySettingsBillAuditsTab extends BasePage {

    public ClientUtilitySettingsBillAuditsTab(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By AUDIT_EMAIL_QUEUE = By.id("view-audit-email-queue");

    //Methods
    public boolean confirmAuditEmailQueueIsVisible() {
        return confirmElementIsVisible(AUDIT_EMAIL_QUEUE);
        }

}