package page_objects.entrata_page_objects.tools_tab.smart_community_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SmartCommunityNav extends BasePage {

    private final By OVERVIEW_TAB = By.cssSelector("li[data-href='https://testentratamation.trunk.entratadev.com/?module=smart_community_systemxxx&action=view_overview']");
    private final By SMART_AREAS_TAB = By.id("js_load_common_areas");
    private final By VACANT_AREAS_TAB = By.id("js_load_vacant_units");
    private final By OCCUPIED_UNITS_TAB = By.id("js_load_occupied_units");
    private final By NIGHTLY_RESET_TAB = By.id("js_load_nightly_reset_unit");
    private final By AUTOMATIONS_TAB = By.id("js_load_automations");
    private final By MUSIC_TAB = By.id("js_load_music");
    private final By LOADING_OVERLAY = By.className("loading-overlay");

    public SmartCommunityNav(WebDriver driver) {
        super(driver);
    }

    public boolean smartAreasTabClick() {
        return clickElement(SMART_AREAS_TAB);
    }

    public boolean vacantAreasTabClick() {
        return clickElement(VACANT_AREAS_TAB);
    }

    public boolean occupiedUnitsTabClick() {
        return clickElement(OCCUPIED_UNITS_TAB);
    }

    public boolean nightlyResetTabClick() {
        return clickElement(NIGHTLY_RESET_TAB);
    }

    public boolean automationsTabClick() {
        return clickElement(AUTOMATIONS_TAB);
    }

    public boolean musicTabClick() {
        waitForOverlayAfterClickingAutomationTab();
        return clickElement(MUSIC_TAB);
    }

    //Overlay
    private void waitForOverlayAfterClickingAutomationTab() {
        waitForOverlay(LOADING_OVERLAY);
    }
}
