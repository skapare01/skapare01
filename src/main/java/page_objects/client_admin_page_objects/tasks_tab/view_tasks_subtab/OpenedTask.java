package page_objects.client_admin_page_objects.tasks_tab.view_tasks_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class OpenedTask extends BasePage {

    public OpenedTask(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By TASK_TITLE = By.id("form_task_title");

    //Methods
    public boolean confirmTaskTitleIsVisible() {
        return confirmElementIsVisible(TASK_TITLE);
    }

}