package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PropertySpaceOptionsTab extends BasePage {

    private final By EDIT_SPACE_OPTION = By.id("edit-space-options");
    public final By ADD_SPACE_OPTION = By.id("add-space-option");
    public final By SPACE_OPTION_DROPDOWN = By.name("space_options[]");
    public final By SELECTED_SPACE_OPTIONS = By.cssSelector("option[value = '103']");
    public final By SAVE_SPACE_OPTIONS = By.cssSelector("input[value = 'Save']");
    public final By CONFIRM_RATES = By.linkText("Yes");
    private final By OVERLAY = By.className("loading-overlay");
    public final By SUCCESS_MESSAGE = By.cssSelector("p[class = 'alert success slim']");
    public final By STANDARD_SHARED_SPACE_OPTION = By.xpath("//*[text() = '2 Bedroom']");
    public final By DELETE_SPACE_OPTION = By.xpath("//*[@id='space_configuration_id_103']/td[last()]/span/i");
    public final By CONFIRM_DELETE = By.linkText("Delete");

    public PropertySpaceOptionsTab(WebDriver driver){
        super(driver);}
    private void waitForLoadingOverlay(){waitForOverlay(OVERLAY);}
    public boolean confirmVisibilityofEditSpaceOptions(){return confirmElementIsVisible(EDIT_SPACE_OPTION);}
    public boolean clickEditSpaceOption(){return clickElement(EDIT_SPACE_OPTION);}
    public boolean clickAddSpaceOption(){return clickElement(ADD_SPACE_OPTION);}
    public boolean doubleClickSpaceOptionDropdown(){return doubleClickElement(SPACE_OPTION_DROPDOWN);}
    public boolean clickSpaceOption(){return clickElement(SELECTED_SPACE_OPTIONS);}
    public boolean saveSpaceOption(){return clickElement(SAVE_SPACE_OPTIONS);}
    public boolean clickConfirmRates(){return  clickElement(CONFIRM_RATES); }
    public String checkSuccessMessage(){
        waitForLoadingOverlay();
        return getElementText(SUCCESS_MESSAGE);}
    public boolean confirmStandardSharedOption(){return confirmElementIsVisible(STANDARD_SHARED_SPACE_OPTION);}
    public boolean clickDeleteSpaceOption(){return clickElement(DELETE_SPACE_OPTION);}
    public boolean clickConfirmDelete(){return clickElement(CONFIRM_DELETE);}
    }
