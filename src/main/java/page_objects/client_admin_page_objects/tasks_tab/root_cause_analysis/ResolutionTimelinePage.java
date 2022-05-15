package page_objects.client_admin_page_objects.tasks_tab.root_cause_analysis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResolutionTimelinePage extends BasePage {

    private final By RESOLUTION_TIMELINE_REPORT = By.id("ResolutionTimelineReport");
    private final By PDM_DROPDOWN = By.id("project_managers_multiselect");

    public ResolutionTimelinePage(WebDriver driver){
        super(driver);}

    public boolean findResolutionTimelineReport(){return confirmElementIsVisible(RESOLUTION_TIMELINE_REPORT);}
    public boolean findPDMDropdown(){return confirmElementIsVisible(PDM_DROPDOWN);}



}
