package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.amenities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class UnitSpaceAmenitiesSubtab extends BasePage {

    private final By UNIT_SPACE_AMENITIES_TAB = By.id("property_pricing_amenities_unit_spacexxx");
    private final By UNIT_SPACE_AMENITIES_EDIT_BUTTON = By.cssSelector("i[class='edit js-edit-unit-space-amenity']");
    private final By UNIT_SPACE_AMENITIES_ADD_BUTTON = By.cssSelector("a[class='button action js-add-unit-space-amenities']");
    private final By UNIT_SPACE_AMENITIES_SAVE_BUTTON = By.cssSelector("input[type='submit']");
    private final By UNIT_SPACE_AMENITIES_DELETE_BUTTON = By.cssSelector("a[class='button small highlight-gray border text-dark-gray left add-tip tip-top  binded']");
    private final By UNIT_SPACE_AMENITIES_CONTINUE_BUTTON = By.cssSelector("a[class='button small actions-btn']");
    private final By MANAGE_UNIT_SPACE_PLUS_ICON = By.cssSelector("i[class='form-icon add js-add-new']");
    private final By AMENITY_NAME_TEXT_BOX = By.cssSelector("input[name='rate_association[0][name]']");
    private final By SYSTEM_AMENITY_TYPE_DROPDOWN = By.cssSelector("div[class='form-select-dropdown js-system-amenities js-new hide']");
    private final By ASSIGNED_UNIT_SPACES_DROPDOWN = By.cssSelector("div[class='form-multiselect binded binded-hover-intent']");
    private final By ASSIGNED_UNIT_VALUE = By.cssSelector("input[value='4987162']");
    private final By MANAGE_UNIT_SPACE_AMENITIES_SAVE_BUTTON = By.cssSelector("input[class='form-submit']");

    public UnitSpaceAmenitiesSubtab(WebDriver driver) { super(driver); }

    public boolean clickUnitSpaceAmenitiesTab() {return clickElement(UNIT_SPACE_AMENITIES_TAB);}
    public boolean clickUnitSpaceAmenitiesEditButton() {return clickElement(UNIT_SPACE_AMENITIES_EDIT_BUTTON); }
    public boolean clickUnitSpaceAmenitiesSaveButton() {return clickElement(UNIT_SPACE_AMENITIES_SAVE_BUTTON); }
    public boolean clickUnitSpaceAmenitiesDeleteButton() {return clickElement(UNIT_SPACE_AMENITIES_DELETE_BUTTON); }
    public boolean clickUnitSpaceAmenitiesContinueButton() {return clickElement(UNIT_SPACE_AMENITIES_CONTINUE_BUTTON); }
    public boolean clickUnitSpaceAmenitiesAddButton() { return clickElement(UNIT_SPACE_AMENITIES_ADD_BUTTON); }
    public boolean clickManageUnitSpacePlusIcon() { return clickElement(MANAGE_UNIT_SPACE_PLUS_ICON, waitTimes.LONG_WAIT); }
    public boolean sendKeysAmenityNameTextBox() { return sendKeysToElement(AMENITY_NAME_TEXT_BOX, "1st Floor", waitTimes.LONG_WAIT); }
    public boolean doubleClickSystemAmenityTypeDropDown() { return doubleClickElement(SYSTEM_AMENITY_TYPE_DROPDOWN, waitTimes.LONG_WAIT); }
    public boolean doubleClickAssignedUnitSpacesDropDown() { return doubleClickElement(ASSIGNED_UNIT_SPACES_DROPDOWN, waitTimes.LONG_WAIT); }
    public boolean confirmAssignedUnitSpacesValueVisible() { return confirmElementIsVisible(ASSIGNED_UNIT_VALUE, waitTimes.LONG_WAIT); }
    public boolean doubleClickValueAssignedUnitSpacesDropDown() { return doubleClickElement(ASSIGNED_UNIT_VALUE, waitTimes.LONG_WAIT); }
    public boolean clickManageUnitSpaceAmenitiesSaveButton() { return clickElement(MANAGE_UNIT_SPACE_AMENITIES_SAVE_BUTTON); }

    public String getTextOfAmenityNameTextBox() { return getElementText(AMENITY_NAME_TEXT_BOX, waitTimes.LONG_WAIT); }
}
