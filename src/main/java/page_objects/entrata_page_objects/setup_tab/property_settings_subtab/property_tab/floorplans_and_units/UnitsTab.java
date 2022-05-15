package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class UnitsTab extends BasePage {
    public UnitsTab(WebDriver driver) {
        super(driver);}

    private final By UNIT_SEARCH_INPUT = By.id("unit_number");
    private final String SEARCH_VALUE_ONE = "13";
    private final By SECOND_UNIT_ON_PAGE = By.xpath("//*[@id='view_property_units']/table/tbody/tr[3]");
    private final By OVERLAY = By.className("loading-overlay");

    // Selected Unit Popup
    private final By SPACE_CONFIGURATIONS_TAB = By.linkText("Space Configuration");
    private final By EDIT_UNIT_SPACE_CONFIGURATIONS = By.cssSelector("a[onclick = 'loadUnitSpaceConfigurations();']");
    private final By MERGE_SPACES = By.id("merge-spaces");
    private final By CLOSE_EDIT_UNIT_SPACES = By.cssSelector("button[title = 'Close']");
    private final By ClOSE_UNIT_SPACE = By.className("close-button");

    public boolean searchForUnit(){return sendKeysToElement(UNIT_SEARCH_INPUT,SEARCH_VALUE_ONE);}
    public boolean hitEnterOnSearch(){return pressEnter(UNIT_SEARCH_INPUT);}
    public boolean clickSecondUnit(){ waitForOverlay(OVERLAY);
        return clickElement(SECOND_UNIT_ON_PAGE);}
    public boolean clickSpaceConfiguration(){return clickElement(SPACE_CONFIGURATIONS_TAB);}
    public boolean clickEditSpaceConfiguration(){return clickElement(EDIT_UNIT_SPACE_CONFIGURATIONS);}
    public boolean VerifyEditUnitSpacesIsVisible(){return confirmElementIsVisible(MERGE_SPACES);}
    public boolean clickCloseEditUnitSpaces(){return clickElement(CLOSE_EDIT_UNIT_SPACES);}
    public boolean clickCloseUnitSpace(){return clickElement(ClOSE_UNIT_SPACE);}




}
