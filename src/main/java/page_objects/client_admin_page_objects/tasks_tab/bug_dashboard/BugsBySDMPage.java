package page_objects.client_admin_page_objects.tasks_tab.bug_dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BugsBySDMPage extends BasePage {

    private final By OPEN_BUG_EXCLUDES_DROPDOWN = By.id("filtered_task_status_multiselect");

    public BugsBySDMPage(WebDriver driver){
        super(driver);
    }

    public boolean findOpenBugExcludesDropdown(){return confirmElementIsVisible(OPEN_BUG_EXCLUDES_DROPDOWN);}
}
