package page_objects.entrata_page_objects.setup_tab.users_and_groups_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class UserProfilePage extends BasePage {
    public UserProfilePage (WebDriver driver){
        super(driver);}

    private final By PROFILE = By.linkText("Profile");
    private final By ASSIGNMENTS = By.linkText("Assignments");
    private final By PERMISSIONS = By.linkText("Permissions");
    private final By COURSES = By.linkText("Courses");
    private final By DOCUMENTS = By.linkText("Documents");
    private final By CHANGE_LOG = By.linkText("Change Log");
    private final By LOGIN_HISTORY = By.linkText("Login History");

    public boolean clickProfile(){return clickElement(PROFILE);}
    public boolean clickAssignments(){return clickElement(ASSIGNMENTS);}
    public boolean clickPermissions(){return clickElement(PERMISSIONS);}
    public boolean clickCourses(){return clickElement(COURSES);}
    public boolean clickDocuments(){return clickElement(DOCUMENTS);}
    public boolean clickChangeLog(){return clickElement(CHANGE_LOG);}
    public boolean clickLoginHistory(){return clickElement(LOGIN_HISTORY);}
}
