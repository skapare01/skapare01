package regression_tests.property_management_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.PricingNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.amenities.AmenitiesNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.amenities.FloorplanAmenitiesSubtab;

import static org.junit.Assert.assertTrue;

public class VerifyFloorPlanLevelAmenitiesFunctionalityIT extends BaseBrowserTest {

    public VerifyFloorPlanLevelAmenitiesFunctionalityIT() {
        super("demoold");
    }

    @Test //Test Case #2247749
    public void shouldVerifyFloorPlanLevelAmenitiesEditFunctionality_whenTabsAreClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Failed to click Setup tab", navBar.clickSetupButton());
        assertTrue("Failed to select Property button", navBar.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        assertTrue("Failed to select property", propList.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation propNav = new PropertyFirstLevelNavigation(driver);
        assertTrue("Failed to click Pricing tab", propNav.clickPricingTab());

        PricingNav priceNav = new PricingNav(driver);
        assertTrue("Failed to click Amenities subtab", priceNav.clickPropertyPricingAmenitiesTab());

        AmenitiesNavigation amenNav = new AmenitiesNavigation(driver);
        assertTrue("Failed to click Property Amenities tab", amenNav.clickPropertyAmenitiesTab());

        FloorplanAmenitiesSubtab flosub = new FloorplanAmenitiesSubtab(driver);
        assertTrue("Failed to click Floorplan Amenities tab", flosub.clickFloorplanAmenitiesTab());
        assertTrue("Failed to click Floorplan Amenities Edit Button", flosub.clickFloorplanAmenitiesEditButton());
        assertTrue("Failed to click Save button", flosub.clickFloorplanAmenitiesSaveButton());

    }

    @Test // Test# 2247750
    public void shouldVerifyFloorPlanLevelAmenitiesDeleteFunctionality_whenTabsAreClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Failed to click Setup tab", navBar.clickSetupButton());
        assertTrue("Failed to select Property button", navBar.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        assertTrue("Failed to select property", propList.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation propNav = new PropertyFirstLevelNavigation(driver);
        assertTrue("Failed to click Pricing tab", propNav.clickPricingTab());

        PricingNav priceNav = new PricingNav(driver);
        assertTrue("Failed to click Amenities subtab", priceNav.clickPropertyPricingAmenitiesTab());

        AmenitiesNavigation amenNav = new AmenitiesNavigation(driver);
        assertTrue("Failed to click Property Amenities tab", amenNav.clickPropertyAmenitiesTab());

        FloorplanAmenitiesSubtab flosub = new FloorplanAmenitiesSubtab(driver);
        assertTrue("Failed to click Floorplan Amenities tab", flosub.clickFloorplanAmenitiesTab());

        //Add a floor plan
        assertTrue("Failed to click Add Floor Plan Amenities.", flosub.clickFloorplanAmenitiesAddButton());
        assertTrue("Failed to click Amenity Name dropdown.", flosub.clickAmenityNameDropdown());
        assertTrue("Failed to click the first option on the Amenity Name list.", flosub.clickAmenityNameFirstOption());
        assertTrue("Failed to click Assigned Floor Plans dropdown.", flosub.clickAssignedFloorplanDropdown());
        assertTrue("Failed to click Studio option for Assigned Floor Plans.", flosub.clickAssignedFloorplanStudioOption());
        assertTrue("Failed to click Save button for Assigned Floor Plans.", flosub.clickFloorplanAmenitiesSaveButton());

        assertTrue("Failed to click Floorplan Amenities Edit Button", flosub.clickFloorplanAmenitiesEditButton());
        assertTrue("Failed to click Floorplan Amenities Delete button", flosub.clickFloorplanAmenitiesDeleteButton());
        assertTrue("Failed to click Floorplan Amenities Continue button", flosub.clickFloorplanAmenitiesContinueButton());

    }

    @Test // Test #2247748 (stop at + button)
    public void shouldVerifyFloorPlanLevelAmenitiesAddFunctionality_whenTabsAreClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Failed to click Setup tab", navBar.clickSetupButton());
        assertTrue("Failed to select Property button", navBar.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        assertTrue("Failed to select property", propList.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation propNav = new PropertyFirstLevelNavigation(driver);
        assertTrue("Failed to click Pricing tab", propNav.clickPricingTab());

        PricingNav priceNav = new PricingNav(driver);
        assertTrue("Failed to click Amenities subtab", priceNav.clickPropertyPricingAmenitiesTab());

        AmenitiesNavigation amenNav = new AmenitiesNavigation(driver);
        assertTrue("Failed to click Property Amenities tab", amenNav.clickPropertyAmenitiesTab());

        FloorplanAmenitiesSubtab flosub = new FloorplanAmenitiesSubtab(driver);
        assertTrue("Failed to click Floorplan Amenities tab", flosub.clickFloorplanAmenitiesTab());
        assertTrue("Failed to click Add Floorplan Amenities button", flosub.clickFloorplanAmenitiesAddButton());
        assertTrue("Failed to click Plus Icon Floorplan Amenity Button", flosub.clickFloorplanAmenityPlusIconButton());
    }
}
