package regression_tests.web_recon_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.PropertyNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.competitors_tab.CompetitorSettings;

import static org.junit.Assert.assertTrue;

public class ShouldCreateManualCompetitorWhenUsingAddCompetitorIT extends BaseBrowserTest {

    public ShouldCreateManualCompetitorWhenUsingAddCompetitorIT(){
        super("rmpricing");
    }

    @Test
    public void shouldCreateManualCompetitor_whenUsingAddCompetitor() {
        //Test should be run in larger window as smaller windows cause inconsistent results
        EntrataNavBar entrataNavigation = new EntrataNavBar(driver);
        assertTrue("Unable to click 'Setup' tab",entrataNavigation.clickSetupButton());
        assertTrue("Unable to click 'Properties' tab",entrataNavigation.clickPropertiesButton());
        PropertyListPage propertyList = new PropertyListPage(driver);
        assertTrue("Unable to select 'Battlefield Park Apartments' from property list", propertyList.clickPropertyBattlefieldPark());
        PropertyFirstLevelNavigation propertySettingsNavigation = new PropertyFirstLevelNavigation(driver);
        assertTrue("Unable to click 'Property' tab in property settings", propertySettingsNavigation.clickPropertyTab());
        PropertyNavigation propertyNavigation = new PropertyNavigation(driver);
        assertTrue("Unable to click 'Competitors' tab in property settings", propertyNavigation.clickCompetitorsTab());
        CompetitorSettings competitorSettings = new CompetitorSettings(driver);
        assertTrue("Unable to find 'Competitor List' in competitors settings", competitorSettings.waitForOverlayAndFindCompetitorList());
        assertTrue("Unable to find 'Selected Competitors' in competitors settings ", competitorSettings.waitForOverlayAndFindSelectedCompetitors());
        assertTrue("Unable to click 'Add' competitors button", competitorSettings.clickAddCompetitor());
        assertTrue("Unable to add 'Competitor Name' on Add Competitor page", competitorSettings.addCompetitorName("The Place"));
        assertTrue("Unable to add 'Competitor Address' on Add Competitor page", competitorSettings.addCompetitorAddress("12 Main Street"));
        assertTrue("Unable to add 'Competitor City' on Add Competitor page", competitorSettings.addCompetitorCity("Provo"));
        assertTrue("Unable to select 'Competitor State' on Add Competitor page", competitorSettings.selectCompetitorState("UT"));
        assertTrue("Unable to add 'Competitor Zip Code' on Add Competitor page", competitorSettings.addCompetitorZipCode("84097"));
        assertTrue("Unable to click 'Save' button on Add Competitor page", competitorSettings.clickAddCompetitorSaveButton());
        assertTrue("Unable to find add competitor save message", competitorSettings.findAddCompetitorSaveMessage());

    }

}
