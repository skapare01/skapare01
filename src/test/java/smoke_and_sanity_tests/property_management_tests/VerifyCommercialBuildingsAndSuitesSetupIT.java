package smoke_and_sanity_tests.property_management_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.PropertyNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.commercial_buildings_and_suites.CommercialBuildingsAndSuitesNavigation;
import static org.junit.Assert.assertTrue;

public class VerifyCommercialBuildingsAndSuitesSetupIT extends BaseBrowserTest {

    public VerifyCommercialBuildingsAndSuitesSetupIT() {
        super("xento1");
    }

    @Test //Test Case #2255456
    public void shouldVerifyCommercialBuildingsAndSuitesSetup_whenTabsAreClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Failed to click Setup tab", navBar.clickSetupButton());
        assertTrue("Failed to click properties subtab", navBar.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        assertTrue("Failed to select '0009 property management new' property from property list.", propList.clickPropertyManagementNew());

        PropertyFirstLevelNavigation propNav = new PropertyFirstLevelNavigation(driver);
        assertTrue("Failed to click Property tab", propNav.clickPropertyTab());

        PropertyNavigation propertyNavigation = new PropertyNavigation(driver);
        assertTrue("Failed to click Commercial Building and Suites tab", propertyNavigation.clickCommercialBuildingAndSuitesTab());

        CommercialBuildingsAndSuitesNavigation commNav = new CommercialBuildingsAndSuitesNavigation(driver);
        assertTrue("Failed to click Buildings and Floors subtab", commNav.clickBuildingsAndFloorsSubtab());
        assertTrue ("Failed to click Suites subtab", commNav.clickSuitesSubtab());

    }

}









