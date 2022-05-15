package page_objects.client_admin_page_objects.tasks_tab.bug_dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PriorityPerReleasePage extends BasePage {

    private final By PRIORITY_BUGS_PER_RELEASE_CHART = By.id("ViewUrgentImmediatePriorityBugByReleaseDiv");

    public PriorityPerReleasePage(WebDriver driver){
        super(driver); }

    public boolean findPriorityBugsPerReleaseChart(){return confirmElementIsVisible(PRIORITY_BUGS_PER_RELEASE_CHART);}
}
