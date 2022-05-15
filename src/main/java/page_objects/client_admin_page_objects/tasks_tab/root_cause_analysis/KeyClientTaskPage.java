package page_objects.client_admin_page_objects.tasks_tab.root_cause_analysis;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class KeyClientTaskPage extends BasePage {

    private final By KEY_CLIENT_TASK_CHART = By.id("KeyClientTaskChart");
    private final By KEY_CLIENT_DROPDOWN = By.id("KeyClients_multiselect");

    public KeyClientTaskPage(WebDriver driver){
        super(driver);}

    public boolean findKeyClientTaskChart(){return confirmElementIsVisible(KEY_CLIENT_TASK_CHART);}
    public boolean findKeyClientDropdown(){return confirmElementIsVisible(KEY_CLIENT_DROPDOWN);}

}
