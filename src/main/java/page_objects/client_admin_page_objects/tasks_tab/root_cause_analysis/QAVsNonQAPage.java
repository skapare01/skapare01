package page_objects.client_admin_page_objects.tasks_tab.root_cause_analysis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class QAVsNonQAPage extends BasePage {

    private final By QA_VS_NONQA_CHART = By.id("QaApprovedVsNonQaApprovedChart");
    private final By TASK_PRIORITY_DROPDOWN = By.id("Priorities_multiselect");

    public QAVsNonQAPage(WebDriver driver){
        super(driver);}

    public boolean findQAChart(){return confirmElementIsVisible(QA_VS_NONQA_CHART);}
    public boolean findTaskPriorityDropdown(){return confirmElementIsVisible(TASK_PRIORITY_DROPDOWN);}

}
