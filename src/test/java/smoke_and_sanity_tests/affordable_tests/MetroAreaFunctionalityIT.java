package smoke_and_sanity_tests.affordable_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.PropertyNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.affordable.AffordableNavTabs;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.affordable.IncomeLimitsPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MetroAreaFunctionalityIT extends BaseBrowserTest {

    public MetroAreaFunctionalityIT() {
        super("arentrataandcommercials");
    }

    @Test //Test Case ID: #2241911
    public void shouldValidateEditingSavingFunctionality_whenUpdatingMetroAreaIncomeLimit() {
        //Main Dashboard click Setup and then Properties subtab
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab", nav.clickSetupButton());
        assertTrue("Unable to locate Properties sub tab", nav.clickPropertiesButton());

        //Search for Property
        PropertyListPage searchAffProp = new PropertyListPage(driver);
        assertTrue("Unable to find Property input field", searchAffProp.clickPropertyInput());
        assertTrue("Unable to enter property name", searchAffProp.searchPropertyName("MB Tax Credit"));
        assertTrue("Could not submit search for property name", searchAffProp.pressEnterInPropertySearch());
        assertTrue("Could not find property to click", searchAffProp.selectFirstPropertyFromList());

        //Click on Property tab
        PropertyFirstLevelNavigation prop = new PropertyFirstLevelNavigation(driver);
        assertTrue("Property", prop.clickPropertyTab());

        //Click on Affordable sub-tab
        PropertyNavigation propNav = new PropertyNavigation(driver);
        assertTrue("Unable to find the Affordable tab", propNav.clickPropertyAffordableMainTab());

        //Click Income Limits sub-tab
        AffordableNavTabs affNav = new AffordableNavTabs(driver);
        assertTrue("Unable to click Income Limits sub-tab", affNav.clickPropertyIncomeLimitsTab());

        IncomeLimitsPage inc = new IncomeLimitsPage(driver);
        assertEquals("Metro Area", inc.confirmIncomeLimitsMetro());
        assertEquals("HUD Income Limits", inc.confirmIncomeLimitsHud());
        assertEquals("Federal Tax Credits Income Limits", inc.confirmIncomeLimitsFederal());
        assertEquals("Custom Tax Credit Income Limits", inc.confirmIncomeLimitsCustom());
        assertTrue("Unable to click Edit Metro Area button", inc.clickEditMetroAreaButton());
        assertTrue("Unable to locate Cancel button", inc.confirmCancelExists());
        assertTrue("Unable to confirm Federal radio button", inc.confirmFederalRadioButtonExists());
        assertTrue("Unable to confirm Custom radio button", inc.confirmCustomRadionButtonExists());
        assertTrue("Unable to select Metro area by value in Metro Area dropdown", inc.selectMetroAreaByValueDropdown("NCNTY13109N13109"));
        assertTrue("Unable to locate Save button", inc.clickSaveButton());
        assertTrue("Unable to locate success message after saving Metro Area", inc.confirmSuccessMessage());

    }
}
