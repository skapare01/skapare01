package page_objects.client_admin_page_objects.tasks_tab.root_cause_analysis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PrecautionaryMeasurementPage extends BasePage {
    public PrecautionaryMeasurementPage(WebDriver driver){
        super(driver);}
    private final By QAM_DROPDOWN = By.id("qam_multiselect");

public boolean findQAMDropdown(){return confirmElementIsVisible(QAM_DROPDOWN,waitTimes.LUDICROUS_WAIT);}
}
