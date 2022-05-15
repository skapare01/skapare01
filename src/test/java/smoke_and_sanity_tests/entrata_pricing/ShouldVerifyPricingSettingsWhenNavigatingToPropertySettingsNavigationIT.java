package smoke_and_sanity_tests.entrata_pricing;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.PricingNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.optimization_subtab.OptimizationNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.optimization_subtab.definition_subtab.DefinitionSettings;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.optimization_subtab.influencers_subtab.InfluencersSettings;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.optimization_subtab.operations_subtab.OperationsSettings;

import static org.junit.Assert.assertTrue;

public class ShouldVerifyPricingSettingsWhenNavigatingToPropertySettingsNavigationIT extends BaseBrowserTest {

    public ShouldVerifyPricingSettingsWhenNavigatingToPropertySettingsNavigationIT() { super("rmpricing");}

    @Test
    public void shouldVerifyPricingSettings_whenNavigatingToPropertySettingsNavigation() {

        EntrataNavBar entrataNavigation = new EntrataNavBar(driver);
        assertTrue("Unable to click 'Setup' tab",entrataNavigation.clickSetupButton());
        assertTrue("Unable to click 'Properties' tab",entrataNavigation.clickPropertiesButton());
        PropertyListPage propertyList = new PropertyListPage(driver);
        assertTrue("Unable to select 'Battlefield Park Apartments' from property list", propertyList.clickPropertyBattlefieldPark());
        PropertyFirstLevelNavigation propertySettings = new PropertyFirstLevelNavigation(driver);
        assertTrue("Unable to click 'Pricing' tab in property settings", propertySettings.clickPricingTab());
        PricingNav pricingNavigation = new PricingNav(driver);
        assertTrue("Unable to click 'Optimization' tab in property settings", pricingNavigation.clickOptimizationTab());
        OptimizationNav optimizationNavigation = new OptimizationNav(driver);
        assertTrue("Unable to click 'Influencers' tab in property settings", optimizationNavigation.clickInfluencersTab());
        InfluencersSettings influencersSettings = new InfluencersSettings(driver);
        assertTrue("Unable to find 'Edit Rent Constraints' button in Influencers settings", influencersSettings.findEditRentConstraints());
        assertTrue("Unable to find 'Edit Expiration Management' button in Influencers settings", influencersSettings.findEditExpirationButton());
        assertTrue("Unable to find 'Edit Sustainable Occupancy' button in Influencers settings", influencersSettings.findEditSustainableOccupancyButton());
        assertTrue("Unable to find 'Edit Anchor Rent' button in Influencers settings", influencersSettings.findEditAnchorRentButton());
        assertTrue("Unable to find 'Edit Analytics' button in Influencers settings", influencersSettings.findEditAnalyticsButton());
        assertTrue("Unable to click 'Operations' tab in property settings", optimizationNavigation.clickOperationsTab());
        OperationsSettings operationsSettings = new OperationsSettings(driver);
        assertTrue("Unable to find 'Edit Reason Codes' button in Operations settings", operationsSettings.findEditReasonCodes());
        assertTrue("Unable to find 'Edit Publishing Constraints' button in Operations settings", operationsSettings.findEditPublishingConstraints());
        assertTrue("Unable to find 'Edit Optimization' button in Operations settings", operationsSettings.findEditOptimization());
        assertTrue("Unable to click 'Definition' tab in property settings", optimizationNavigation.clickDefinitionTab());
        DefinitionSettings definitionSettings = new DefinitionSettings(driver);
        assertTrue("Unable to find 'Edit Pricing' button in Definition settings", definitionSettings.findEditPricing());

    }

}
