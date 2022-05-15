package smoke_and_sanity_tests.entrata_pricing.web_recon;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.PropertyNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.competitors_tab.CompetitorSettings;

import static org.junit.Assert.assertTrue;

public class ShouldVerifyCompetitorSettingsWhenUsingPropertySettingsNavigationIT extends BaseBrowserTest {

    public ShouldVerifyCompetitorSettingsWhenUsingPropertySettingsNavigationIT() { super("rmpricing");}

    @Test
    public void shouldVerifyCompetitorSettings_whenUsingPropertySettingsNavigation() {

        EntrataNavBar entrataNavigation = new EntrataNavBar(driver);
        assertTrue("Unable to click 'Setup' tab",entrataNavigation.clickSetupButton());
        assertTrue("Unable to click 'Properties' tab",entrataNavigation.clickPropertiesButton());
        PropertyListPage propertyList = new PropertyListPage(driver);
        assertTrue("Unable to select 'Battlefield Park Apartments' from property list", propertyList.clickPropertyBattlefieldPark());
        PropertyFirstLevelNavigation propertySettings = new PropertyFirstLevelNavigation(driver);
        assertTrue("Unable to click 'Property' tab in property settings", propertySettings.clickPropertyTab());
        PropertyNavigation propertyNavigation = new PropertyNavigation(driver);
        assertTrue("Unable to click 'Competitors' tab in property settings", propertyNavigation.clickCompetitorsTab());
        CompetitorSettings competitorSettings = new CompetitorSettings(driver);
        assertTrue("Unable to find 'Competitor List' on competitors settings page", competitorSettings.waitForOverlayAndFindCompetitorList());
        assertTrue("Unable to find 'Selected Competitors' on competitors settings page ", competitorSettings.waitForOverlayAndFindSelectedCompetitors());

    }

}
