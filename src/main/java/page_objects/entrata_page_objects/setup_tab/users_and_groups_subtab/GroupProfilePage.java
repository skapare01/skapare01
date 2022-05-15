package page_objects.entrata_page_objects.setup_tab.users_and_groups_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GroupProfilePage extends BasePage {
    public GroupProfilePage(WebDriver driver){
        super(driver); }

    private final By GROUP_INFO = By.linkText("Group Info");
    private final By ASSIGNMENTS = By.linkText("Assignments");
    private final By PERMISSIONS = By.linkText("Permissions");
    private final By ASSIGNED_USERS = By.linkText("Assigned Users");
    private final By TRAINING = By.linkText("Training");
    private final By CHANGE_LOG = By.linkText("Change Log");

    public boolean clickGroupInfo(){return clickElement(GROUP_INFO);}
    public boolean clickAssignments(){return clickElement(ASSIGNMENTS);}
    public boolean clickPermissions(){return clickElement(PERMISSIONS);}
    public boolean clickAssignedUsers(){return clickElement(ASSIGNED_USERS);}
    public boolean clickTraining(){return clickElement(TRAINING);}
    public boolean clickChangeLog(){return clickElement(CHANGE_LOG);}
}
