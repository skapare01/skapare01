package page_objects.entrata_page_objects.setup_tab.users_and_groups_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BulkEnableOrDisableCompanyUserPage extends BasePage {
    public BulkEnableOrDisableCompanyUserPage(WebDriver driver){
        super(driver); }
    private final By DISABLED_USERS_TAB = By.linkText("Disabled Users");
    private final By ENABLED_USERS_TAB = By.linkText("Enabled Users");
    private final By ENABLED_BUTTON = By.cssSelector("div[onclick = 'bulkResetUserStatus(0);']");
    private final By DISABLED_BUTTON = By.cssSelector("div[onclick = 'bulkResetUserStatus(1);']");


    public boolean clickEnabledUsersTab(){return clickElement(ENABLED_USERS_TAB);}
    public boolean clickDisableUsersTab(){return clickElement(DISABLED_USERS_TAB);}
    public boolean findEnabledButton(){return confirmElementIsVisible(ENABLED_BUTTON);}
    public boolean findDisabledButton(){return confirmElementIsVisible(DISABLED_BUTTON);}

}
