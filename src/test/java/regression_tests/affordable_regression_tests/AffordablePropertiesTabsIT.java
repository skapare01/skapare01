package regression_tests.affordable_regression_tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.PropertyNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.affordable.AffordableNavTabs;

public class AffordablePropertiesTabsIT extends BaseBrowserTest {
    public AffordablePropertiesTabsIT() {
        super("arentrataandcommercials");
    }

    @Test
    public void shouldConfirmAffordableSpecificTabs_WhenNavigatingThroughSetupPropertiesDashboard() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to locate Settings tab", nav.clickSetupButton());
        assertTrue("Unable to locate Properties sub tab", nav.clickPropertiesButton());

        PropertyListPage searchAffProp = new PropertyListPage(driver);
        assertTrue("Unable to find Property input field", searchAffProp.clickPropertyInput());
        assertTrue("Unable to enter property name", searchAffProp.searchPropertyName("MB Tax Credit"));
        assertTrue("Could not submit search for property name", searchAffProp.pressEnterInPropertySearch());
        assertTrue("Could not find property to click", searchAffProp.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation prop = new PropertyFirstLevelNavigation(driver);
        assertEquals("Property", prop.confirmPropertyTab());

        PropertyNavigation propNav = new PropertyNavigation(driver);
        assertEquals("Affordable", propNav.confirmAffordableTab());
        assertTrue("Could not find Affordable Tab", propNav.clickPropertyAffordableMainTab());

        AffordableNavTabs affTab = new AffordableNavTabs(driver);
        assertEquals("HUD", affTab.confirmHudTab());
        assertEquals("TAX CREDITS", affTab.confirmTaxCreditTab());
        assertEquals("INCOME LIMITS", affTab.confirmIncomeLimitsTab());

    }
}