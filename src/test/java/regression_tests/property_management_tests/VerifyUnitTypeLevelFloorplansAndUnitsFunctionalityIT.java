package regression_tests.property_management_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units.FloorPlansAndUnitsNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units.FloorplanNav;

import static org.junit.Assert.assertTrue;

public class VerifyUnitTypeLevelFloorplansAndUnitsFunctionalityIT extends BaseBrowserTest {

    public VerifyUnitTypeLevelFloorplansAndUnitsFunctionalityIT() { super("avantic"); }

    @Test // Test Case #2247428
    public void shouldVerifyUnitTypeLevelFloorplansAndUnitsAddFunctionality_whenTabsAreClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("failed to click Setup Tab", navBar.clickSetupButton());
        assertTrue("failed to select Property", navBar.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        assertTrue("failed to select Property", propList.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation propNav = new PropertyFirstLevelNavigation(driver);
        assertTrue("failed to click Property Tab", propNav.clickPropertyTab());

        FloorplanNav floorNav = new FloorplanNav(driver);
        assertTrue("failed to click Floorplans and Units Tab", floorNav.clickFloorplansTab());

        FloorPlansAndUnitsNavigation floNav = new FloorPlansAndUnitsNavigation(driver);
        assertTrue("failed to click Unit Type Subtab", floNav.clickUnitTypeSubtab());
        assertTrue("failed to click Add Button", floNav.clickAddButton());
        assertTrue("failed to type Unit Type Name", floNav.sendKeysUnitTypeName());
        assertTrue("failed to click Add Unit Type Button", floNav.clickAddUnitTypeButton());

    }
}
