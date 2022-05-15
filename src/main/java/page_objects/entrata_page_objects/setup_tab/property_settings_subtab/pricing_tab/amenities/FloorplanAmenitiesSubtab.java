package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.amenities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FloorplanAmenitiesSubtab extends BasePage {

    private final By FLOORPLAN_AMENITIES_TAB = By.id("property_pricing_amenities_floor_planxxx");
    private final By FLOORPLAN_AMENITIES_ADD_BUTTON = By.cssSelector("a[class='button action js-add-floor-plan-amenities']");
    private final By FLOORPLAN_AMENITIES_FIRST_DROPDOWN = By.cssSelector("i[class='form-icon dropdown']");
    private final By FLOORPLAN_AMENITIES_FIRST_OPTION = By.cssSelector("li[name='1']");
    private final By ASSIGNED_FLOORPLAN = By.cssSelector("div[class='form-multiselect binded binded-hover-intent']");
    private final By ASSIGNED_FLOORPLAN_STUDIO_OPTION = By.cssSelector("input[name='rate_association[0][ar_cascade_reference_ids][]']");
    private final By FLOORPLAN_AMENITIES_PLUS_ICON_BUTTON = By.cssSelector("i[class='form-icon add js-add-new']");
    private final By FLOORPLAN_AMENITIES_EDIT_BUTTON = By.cssSelector("i[class='edit js-edit-floor-plan-amenity']");
    private final By FLOORPLAN_AMENITIES_SAVE_BUTTON = By.cssSelector("input[type='submit']");
    private final By FLOORPLAN_AMENITIES_DELETE_BUTTON = By.cssSelector("a[class='button small highlight-gray border text-dark-gray left add-tip tip-top  binded']");
    private final By FLOORPLAN_AMENITIES_CONTINUE_BUTTON = By.cssSelector("a[class='button small actions-btn']");
    private final By FLOORPLAN_OVERLAY = By.cssSelector("div[class='loading-overlay']");



    public FloorplanAmenitiesSubtab(WebDriver driver) { super(driver); }
    public boolean clickFloorplanAmenitiesTab() {return clickElement(FLOORPLAN_AMENITIES_TAB); }
    public boolean clickFloorplanAmenitiesAddButton() {floorplanOverlayWait(); return clickElement(FLOORPLAN_AMENITIES_ADD_BUTTON); }
    public boolean clickAmenityNameDropdown() {
        return clickElement(FLOORPLAN_AMENITIES_FIRST_DROPDOWN);
    }
    public boolean clickAmenityNameFirstOption() {
        return clickElement(FLOORPLAN_AMENITIES_FIRST_OPTION);
    }
    public boolean clickAssignedFloorplanDropdown() {
        return clickElement(ASSIGNED_FLOORPLAN);
    }
    public boolean clickAssignedFloorplanStudioOption() {
        return clickElement(ASSIGNED_FLOORPLAN_STUDIO_OPTION);
    }
    public boolean clickFloorplanAmenityPlusIconButton() {return clickElement(FLOORPLAN_AMENITIES_PLUS_ICON_BUTTON); }
    public boolean clickFloorplanAmenitiesEditButton() {floorplanOverlayWait(); return clickElement(FLOORPLAN_AMENITIES_EDIT_BUTTON); }
    public boolean clickFloorplanAmenitiesSaveButton() {return clickElement(FLOORPLAN_AMENITIES_SAVE_BUTTON); }
    public boolean clickFloorplanAmenitiesDeleteButton() {return clickElement(FLOORPLAN_AMENITIES_DELETE_BUTTON); }
    public boolean clickFloorplanAmenitiesContinueButton() {return clickElement(FLOORPLAN_AMENITIES_CONTINUE_BUTTON); }
    private void floorplanOverlayWait() {
        waitForOverlay(FLOORPLAN_OVERLAY);
    }


}
