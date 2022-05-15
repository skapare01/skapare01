package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.movein_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MoveinSchedulerPage extends BasePage {
    public MoveinSchedulerPage (WebDriver driver){
        super(driver);}

    private final By SCHEDULE_DROPDOWN = By.id("move_in_scheduler_id");

    public boolean confirmScheduleDropdownIsVisible(){return confirmElementIsVisible(SCHEDULE_DROPDOWN);}
}
