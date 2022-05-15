package page_objects.client_admin_page_objects.tasks_tab.add_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddTaskPage extends BasePage {

    private final By TASK_TYPE_DROPDOWN = By.id("task_type");
    private final By CREATE_TASK_BUTTON = By.id("add_task_button");
    private final By NO_PRODUCT_ERROR_MESSAGE = By.id("error_messages");
    private final By ADD_TASK_TYPE_TEXT = By.xpath("//*[text()='Type: ']");

    public AddTaskPage(WebDriver driver){
        super(driver);
    }

    public boolean selectFeatureDropdown(){return selectElementByValue(TASK_TYPE_DROPDOWN,"7"); }

    public boolean clickCreateTaskButton(){scrollDownToBottomOfPage();
    return clickElement(CREATE_TASK_BUTTON);}

    public String getErrorMessage(){return getElementText(NO_PRODUCT_ERROR_MESSAGE);}

    public boolean viewAddTaskTypeText() {
        return confirmElementIsVisible(ADD_TASK_TYPE_TEXT);
    }
}
