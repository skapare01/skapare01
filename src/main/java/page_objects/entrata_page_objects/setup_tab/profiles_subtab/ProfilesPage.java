package page_objects.entrata_page_objects.setup_tab.profiles_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ProfilesPage extends BasePage {

    private final By ADD_PROFILE = By.id("add-template");
    private final By EDIT_PROFILE = By.cssSelector(".edit");

    //Add Setting Profile popup
    private final By OCCUPANCY_TYPES_DROPDOWN = By.id("occupancy_types_multiselect");
    private final By CANCEL_BUTTON = By.cssSelector(".js-cancel");

    //Edit Setting Profile popup
    private final By PROFILE_NAME_FIELD = By.cssSelector(".js-validate-template-name");
    private final By SAVE_PROFILE = By.id("new-added");

    public ProfilesPage(WebDriver driver){
        super(driver);
    }

    public boolean clickAddProfile(){return clickElement(ADD_PROFILE);}
    public boolean findOccupancyTypesDropdown(){return confirmElementIsVisible(OCCUPANCY_TYPES_DROPDOWN);}
    public boolean clickCancelAddSettingPopup(){return clickElement(CANCEL_BUTTON);}
    public boolean clickEditProfile(){return clickElement(EDIT_PROFILE);}
    public boolean findProfileNameField(){return confirmElementIsVisible(PROFILE_NAME_FIELD);}
    public boolean findSaveProfile(){return confirmElementIsVisible(SAVE_PROFILE);}
}
