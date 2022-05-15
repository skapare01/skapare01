package page_objects.client_admin_page_objects.it_tab.users_and_groups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class UsersAndGroups extends BasePage {

    public UsersAndGroups(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By USERS_AND_GROUPS_TABLE = By.id("list_users_container");
    private final By ADD_USER_BUTTON = By.xpath("//i[@class='add']");
    private final By SHOW_DISABLED = By.id("test");

    //Tab Variables
    private final By USERS_TAB = By.id("users_tab");
    private final By GROUPS_TAB = By.id("groups_tab");
    private final By PS_MODULES_TAB = By.id("ps_modules_tab");
    private final By ROLES_TAB = By.id("roles_tab");
    private final By PS_MODULES_PERMISSIONS_TAB = By.id("ps_modules_permissions_tab");

    //Methods
    public boolean addUserButtonClick() {
        return clickElement(ADD_USER_BUTTON);
    }

    public boolean confirmAddUsersIsVisible() {
        return confirmElementIsVisible(ADD_USER_BUTTON);
    }

    public boolean confirmShowDisabledIsVisible() {
        return confirmElementIsVisible(SHOW_DISABLED);
    }

    public boolean confirmUsersTabIsVisible() {
        return confirmElementIsVisible(USERS_TAB);
    }

    public boolean confirmGroupsTabIsVisible() {
        return confirmElementIsVisible(GROUPS_TAB);
    }

    public boolean confirmPsModulesTabIsVisible() {
        return confirmElementIsVisible(PS_MODULES_TAB);
    }

    public boolean confirmRolesTabIsVisible() {
        return confirmElementIsVisible(ROLES_TAB);
    }

    public boolean confirmPsModulesPermissionsTabIsVisible() {
        return confirmElementIsVisible(PS_MODULES_PERMISSIONS_TAB);
    }

}