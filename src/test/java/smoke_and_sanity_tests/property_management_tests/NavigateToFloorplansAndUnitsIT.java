package smoke_and_sanity_tests.property_management_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units.FloorPlansAndUnitsNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units.FloorplanNav;

import static org.junit.Assert.assertTrue;

public class NavigateToFloorplansAndUnitsIT extends BaseBrowserTest {

    public NavigateToFloorplansAndUnitsIT() { super("avantic");}

    @Test //Test Case #2251223
    public void shouldNavigateToFloorplansAndUnits_whenTabsAreClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("failed to click setup tab", navBar.clickSetupButton());
        assertTrue("failed to select property", navBar.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        assertTrue("failed to select property", propList.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation propNav = new PropertyFirstLevelNavigation(driver);
        assertTrue("failed to click property tab", propNav.clickPropertyTab());

        FloorplanNav floorNav = new FloorplanNav(driver);
        assertTrue("failed to click floorplans and units tab", floorNav.clickFloorplansTab());

        FloorPlansAndUnitsNavigation floorplanNav = new FloorPlansAndUnitsNavigation(driver);
        assertTrue("failed to click floorplans subtab", floorplanNav.clickFloorplansSubtab());

    }
}
