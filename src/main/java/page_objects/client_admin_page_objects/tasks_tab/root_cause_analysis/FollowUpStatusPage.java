package page_objects.client_admin_page_objects.tasks_tab.root_cause_analysis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FollowUpStatusPage extends BasePage {

    private final By VIEW_FOLLOW_UP_REPORT = By.linkText("View Follow-up Report");

    public FollowUpStatusPage(WebDriver driver){
        super(driver);}

    public boolean findViewFollowUpReport(){return confirmElementIsVisible(VIEW_FOLLOW_UP_REPORT);}
}
