package page_objects.client_admin_page_objects.tasks_tab.view_tasks_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddTask extends BasePage {

    public AddTask(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By CREATE_TASK_ID = By.id("create_task_div");

    //Methods
    public boolean confirmCreateTaskIdIsVisible() {
        return confirmElementIsVisible(CREATE_TASK_ID);
    }

}