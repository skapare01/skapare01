package smoke_and_sanity_tests.entrata_pricing;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.dashboard_tab.pricing_subtab.PricingDashboard;

import static org.junit.Assert.assertTrue;

public class ShouldLoadPricingDashboardWhenSelectedIT extends BaseBrowserTest {

    public ShouldLoadPricingDashboardWhenSelectedIT() { super("rmpricing");}

    @Test
    public void shouldLoadPricingDashboard_whenSelected() {

        EntrataNavBar entrataNav = new EntrataNavBar(driver);
        assertTrue("Unable to click 'Pricing' tab", entrataNav.clickPricingTab());
        PricingDashboard pricingDash = new PricingDashboard(driver);
        assertTrue("Unable to click pricing filters on Pricing dashboard", pricingDash.clickFilters());
        assertTrue("Unable to click 'Clear All' properties in pricing filters", pricingDash.clickClearProperties());
        assertTrue("Unable to click 'Add' properties button in pricing filters", pricingDash.clickAddProperties());
        assertTrue("Unable to click add 'Second Property' in pricing filters", pricingDash.clickAddPropertyName());
        assertTrue("Unable to click 'Unit Status' dropdown in pricing filters", pricingDash.clickUnitStatusDropdown());
        assertTrue("Unable to click 'All Available' in Unit Status dropdown in pricing filters", pricingDash.clickUnitStatusAllAvailable());
        assertTrue("Unable to click 'Publish Status' dropdown in pricing filters", pricingDash.clickPublishStatusDropdown());
        assertTrue("Unable to click 'Published & Unpublished' in Publish Status dropdown in pricing filters", pricingDash.clickPublishStatusAll());
        assertTrue("Unable to click 'Save' button in pricing filters", pricingDash.clickSaveFiltersButton());
        assertTrue("Unable to find property on Pricing dashboard", pricingDash.findPricingDashboardPropertyName());

    }

}
