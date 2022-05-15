package page_objects.client_admin_page_objects.tasks_tab.root_cause_analysis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class UrgentVsImmediatePage extends BasePage{

    private final By URGENT_IMMEDIATE_TASK_CHART = By.id("UrgentVsImmediateTaskChart");
    private final By SDM_DROPDOWN = By.id("project_managers_multiselect");

        public UrgentVsImmediatePage(WebDriver driver){
            super(driver);}

    public boolean findUrgentImmediateTaskChart(){return confirmElementIsVisible(URGENT_IMMEDIATE_TASK_CHART);}
    public boolean findSDMDropdown(){return confirmElementIsVisible(SDM_DROPDOWN);}


}
