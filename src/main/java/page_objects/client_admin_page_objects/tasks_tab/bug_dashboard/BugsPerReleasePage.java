package page_objects.client_admin_page_objects.tasks_tab.bug_dashboard;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BugsPerReleasePage extends BasePage {

    private final By BUGS_PER_RELEASE_CHART = By.id("ViewBugByRelease");

    public BugsPerReleasePage(WebDriver driver){
        super(driver);}

    public boolean findBugsPerReleaseChart(){return confirmElementIsVisible(BUGS_PER_RELEASE_CHART,waitTimes.LONG_WAIT);}

}
