package page_objects.client_admin_page_objects.tasks_tab.root_cause_analysis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PriorityBugsPage extends BasePage {

    private final By BUGS_PER_RELEASE_CHART = By.id("ViewPriorityBugReport");
    private final By SDM_DROPDOWN = By.id("project_managers_multiselect");

    public PriorityBugsPage(WebDriver driver){
        super(driver);}

    public boolean findBugsChart(){return confirmElementIsVisible(BUGS_PER_RELEASE_CHART);}
    public boolean findSDMDropdown(){return confirmElementIsVisible(SDM_DROPDOWN);}

}
