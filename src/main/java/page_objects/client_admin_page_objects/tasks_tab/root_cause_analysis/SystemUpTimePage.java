package page_objects.client_admin_page_objects.tasks_tab.root_cause_analysis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SystemUpTimePage extends BasePage {

    private final By SYSTEM_UP_TIME_REPORT = By.id("ViewOutageReoprt");
    private final By YEARS_DROPDOWN = By.id("report_year");

    public SystemUpTimePage(WebDriver driver){
        super(driver);}

    public boolean findSystemUpTimeReport(){return confirmElementIsVisible(SYSTEM_UP_TIME_REPORT);}
    public boolean findYearsDropdown(){return confirmElementIsVisible(YEARS_DROPDOWN);}
}
