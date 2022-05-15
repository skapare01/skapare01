package page_objects.client_admin_page_objects.tasks_tab.task_types_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class TaskTypes extends BasePage {

    public TaskTypes(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By TASK_TYPES_TABLE = By.id("table_view_task_types");

    //Methods
    public boolean confirmTaskTypesTableIsVisible() {
        return confirmElementIsVisible(TASK_TYPES_TABLE);
    }

}