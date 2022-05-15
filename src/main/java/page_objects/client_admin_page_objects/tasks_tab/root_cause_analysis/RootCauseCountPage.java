package page_objects.client_admin_page_objects.tasks_tab.root_cause_analysis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class RootCauseCountPage extends BasePage {

    private final By ROOT_CAUSE_ANALYSIS_COUNT_REPORT = By.id("RootCauseCountReport");
    private final By MULTIPLE_USERS_DROPDOWN = By.id("employee_multiselect");

    public RootCauseCountPage(WebDriver driver){
        super(driver);}

    public boolean findRCACountReport(){return confirmElementIsVisible(ROOT_CAUSE_ANALYSIS_COUNT_REPORT);}
    public boolean findMultipleUsersDropdown(){return confirmElementIsVisible(MULTIPLE_USERS_DROPDOWN);}
}
