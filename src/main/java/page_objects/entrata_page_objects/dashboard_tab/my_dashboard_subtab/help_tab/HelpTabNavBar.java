package page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.help_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class HelpTabNavBar extends BasePage {
    public HelpTabNavBar(WebDriver driver) {
        super(driver);
    }

    private final By TRAINING_SUB_TAB = By.id("dashboard_support_trainingxxx");
    private final By SUPPORT_TICKET_SUB_TAB = By.id("dashboard_support_ticketsxxx");

    public boolean clickTrainingSubTab() {
        return clickElement(TRAINING_SUB_TAB);
    }
    public boolean clickSupportTicketsSubTab() {
        return clickElement(SUPPORT_TICKET_SUB_TAB);
    }
}
