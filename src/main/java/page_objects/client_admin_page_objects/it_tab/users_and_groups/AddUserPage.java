package page_objects.client_admin_page_objects.it_tab.users_and_groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddUserPage extends BasePage {

    public AddUserPage(WebDriver driver) {
        super(driver);
    }

    private final By ADD_USERNAME = By.id("company_user_username");
    private final By EMPLOYEE_TYPE = By.id("employee_status_type_id");
    private final By DEPARTMENT = By.name("employee[department_id]");
    private final By FIRST_NAME = By.name("employee[name_first]");
    private final By LAST_NAME = By.name("employee[name_last]");
    private final By EMAIL = By.id("email_address");
    private final By ADD_USER_BUTTON = By.cssSelector("input[type='submit']");
    private final By ERROR_ALERT_MESSAGE = By.cssSelector("p[class='alert error slim']");
    private final By ADD_USER_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    public boolean addUsername(String name) {
        return sendKeysToElement(ADD_USERNAME, name);
    }

    public boolean employeeTypeSelect(String value) {
        return selectElementByValue(EMPLOYEE_TYPE, value);
    }

    public boolean departmentSelect(String value) {
        return selectElementByValue(DEPARTMENT, value);
    }

    public boolean firstNameInput(String name) {
        return sendKeysToElement(FIRST_NAME, name);
    }

    public boolean lastNameInput(String name) {
        return sendKeysToElement(LAST_NAME, name);
    }

    public boolean emailInput(String email) {
        return sendKeysToElement(EMAIL, email);
    }

    public boolean addUserButtonSubmitClick() {
        return clickElement(ADD_USER_BUTTON);
    }

    public boolean errorAlertMessageInvisible() {
        addUserOverlay();
        return confirmElementIsInvisible(ERROR_ALERT_MESSAGE);
    }

    private void addUserOverlay() {
        waitForOverlay(ADD_USER_OVERLAY);
    }
}