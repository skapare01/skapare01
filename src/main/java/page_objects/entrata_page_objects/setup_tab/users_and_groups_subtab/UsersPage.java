package page_objects.entrata_page_objects.setup_tab.users_and_groups_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class UsersPage extends BasePage {
    public UsersPage(WebDriver driver){
        super(driver);}

    private final By ADD_USER = By.cssSelector(".add_company_users_info");
    private final By TOOLS_ICON = By.cssSelector("a[data-toolbar-id = 'view-data-tools-menu']");
    private final By ADD_BULK_USERS = By.linkText("Add Bulk Users");
    private final By BULK_ENABLE_OR_DISABLE_COMPANY_USERS = By.linkText("Bulk Enable or Disable Company Users");


    // bulk add user popup
    private final By ADD_MORE_USERS = By.id("add_more_user_loader");
    private final By ADD_COMPANY_USER_TABLE = By.id("addCompanyUserTable");
    //add user popup
    private final By FIRST_NAME_FIELD = By.id("js_first_name");
    private final By LAST_NAME_FIELD = By.id("js_last_name");
    private final By USERNAME = By.cssSelector("div[id = 'js_username'] > .form-field ");
    private final By FIRST_USER = By.cssSelector(".js_view_company_user > td > em");



    public boolean clickAddUser(){return clickElement(ADD_USER);}
    public boolean findFirstNameField(){return confirmElementIsVisible(FIRST_NAME_FIELD);}
    public boolean findLastNameField(){return confirmElementIsVisible(LAST_NAME_FIELD);}
    public boolean findUserName(){return confirmElementIsVisible(USERNAME);}
    public boolean moveToTools(){return moveToAnElementWithActions(TOOLS_ICON);}
    public boolean clickAddBulkUsers(){return clickElement(ADD_BULK_USERS,waitTimes.LONG_WAIT);}
    public boolean findAddMoreUsers(){
        return confirmElementIsVisible(ADD_MORE_USERS,waitTimes.LONG_WAIT);}
    public boolean findCompanyUserTable(){return confirmElementIsVisible(ADD_COMPANY_USER_TABLE);}
    public boolean clickBulkEnableUsers(){return clickElement(BULK_ENABLE_OR_DISABLE_COMPANY_USERS);}
    public boolean clickFirstUser(){return clickElement(FIRST_USER);}

    }

