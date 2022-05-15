package page_objects.entrata_page_objects.setup_tab.users_and_groups_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GroupsPage extends BasePage {
    public GroupsPage(WebDriver driver){
        super(driver);}
    private final By ADD_GROUP_BUTTON = By.cssSelector(".create_company_group_info");
    private final By FIRST_GROUP = By.cssSelector(".view_group > td > em");


    //add group popup
    private final By GROUP_NAME_FIELD = By.id("group_name");
    private final By DESCRIPTION = By.cssSelector("textarea[name='company_group[description]']");




    public boolean clickAddGroupButton(){return clickElement(ADD_GROUP_BUTTON);}
    public boolean findGroupNameField(){return confirmElementIsVisible(GROUP_NAME_FIELD);}
    public boolean findDescriptionField(){return confirmElementIsVisible(DESCRIPTION);}
    public boolean clickFirstGroup(){return clickElement(FIRST_GROUP);}



}
