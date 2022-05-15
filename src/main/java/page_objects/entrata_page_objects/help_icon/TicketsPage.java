package page_objects.entrata_page_objects.help_icon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class TicketsPage extends BasePage {

    private final By CONTACT_SUPPORT = By.id("contact-support");
    private final By INBOX_TAB = By.id("inbox_tickets_and_tasks_tab");
    private final By ACTIVE_TAB = By.id("active_tickets_and_tasks_tab");
    private final By VERIFICATION_REQUIRED_TAB = By.id("verification_required_tickets_and_tasks_tab");
    private final By RESOLVED_TAB = By.id("resolved_tickets_and_tasks_tab");

    public TicketsPage(WebDriver driver){
        super(driver);
    }

    public boolean clickContactSupport(){return clickElement(CONTACT_SUPPORT);}
    public boolean clickInboxTab(){return clickElement(INBOX_TAB);}
    public boolean clickActiveTab(){return clickElement(ACTIVE_TAB);}
    public boolean clickVerificationRequiredTab(){return clickElement(VERIFICATION_REQUIRED_TAB);}
    public boolean clickResolvedTab(){return clickElement(RESOLVED_TAB);}
}
