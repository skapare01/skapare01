package regression_tests.property_management_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.PricingNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.amenities.AmenitiesNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.amenities.UnitSpaceAmenitiesSubtab;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class VerifyUnitSpaceLevelAmenitiesFunctionalityIT extends BaseBrowserTest {

    public VerifyUnitSpaceLevelAmenitiesFunctionalityIT() { super("avantic"); }

    @Test //Test Case #2247755
    public void shouldVerifyUnitSpaceLevelAmenitiesEditFunctionality_whenTabsAreClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Failed to click Setup tab", navBar.clickSetupButton());
        assertTrue("Failed to select Property button", navBar.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        assertTrue("Failed to select property", propList.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation propNav = new PropertyFirstLevelNavigation(driver);
        assertTrue("Failed to click Pricing tab", propNav.clickPricingTab());

        PricingNav priceNav = new PricingNav(driver);
        assertTrue("Failed to click Amenities subtab",priceNav.clickPropertyPricingAmenitiesTab());

        AmenitiesNavigation amenNav = new AmenitiesNavigation(driver);
        assertTrue("Failed to click Property Amenities tab", amenNav.clickPropertyAmenitiesTab());

        UnitSpaceAmenitiesSubtab unitsub = new UnitSpaceAmenitiesSubtab(driver);
        assertTrue("Failed to click Unit Space Amenities tab", unitsub.clickUnitSpaceAmenitiesTab());
        assertTrue("Failed to click Unit Space Amenities Edit button", unitsub.clickUnitSpaceAmenitiesEditButton());
        assertTrue("Failed to click Save button", unitsub.clickUnitSpaceAmenitiesSaveButton());

    }

    @Test //Test Case #2247756
    public void shouldVerifyUnitSpaceLevelAmenitiesDeleteFunctionality_whenTabsAreClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Failed to click Setup tab", navBar.clickSetupButton());
        assertTrue("Failed to select Property button", navBar.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        assertTrue("Failed to select property", propList.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation propNav = new PropertyFirstLevelNavigation(driver);
        assertTrue("Failed to click Pricing tab", propNav.clickPricingTab());

        PricingNav priceNav = new PricingNav(driver);
        assertTrue("Failed to click Amenities subtab",priceNav.clickPropertyPricingAmenitiesTab());

        AmenitiesNavigation amenNav = new AmenitiesNavigation(driver);
        assertTrue("Failed to click Property Amenities tab", amenNav.clickPropertyAmenitiesTab());

        UnitSpaceAmenitiesSubtab unitsub = new UnitSpaceAmenitiesSubtab(driver);
        assertTrue("Failed to click Unit Space Amenities tab", unitsub.clickUnitSpaceAmenitiesTab());
        assertTrue("Failed to click Unit Space Amenities Edit button", unitsub.clickUnitSpaceAmenitiesEditButton());
        assertTrue("Failed to click Unit Space Amenities Delete button", unitsub.clickUnitSpaceAmenitiesDeleteButton());
        assertTrue("Failed to click Unit Space Amenities Continue button", unitsub.clickUnitSpaceAmenitiesContinueButton());

    }

    @Test //Test Case #2247754
    public void shouldVerifyUnitSpaceLevelAmenitiesAddFunctionality_whenTabsAreClicked() {

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

        UnitSpaceAmenitiesSubtab unitsub = new UnitSpaceAmenitiesSubtab(driver);
        assertTrue("Failed to click Unit Space Amenities tab", unitsub.clickUnitSpaceAmenitiesTab());
        assertTrue("Failed to click Add Unit Space Amenities button", unitsub.clickUnitSpaceAmenitiesAddButton());
        assertTrue("Failed to click Manage Unit Space Amenities Plus icon", unitsub.clickManageUnitSpacePlusIcon());
        assertTrue("Failed to type test in Amenity Name Text Box", unitsub.sendKeysAmenityNameTextBox());
        assertTrue("Failed to double click System Amenity Type Dropdown", unitsub.doubleClickSystemAmenityTypeDropDown());
        assertTrue("Failed to double click Assigned Unit Spaces Dropdown", unitsub.doubleClickAssignedUnitSpacesDropDown());
        assertTrue("Failed to confirm Assigned Unit Spaces Value is visible", unitsub.confirmAssignedUnitSpacesValueVisible());
        assertTrue("Failed to select value from Assigned Unit Spaces Dropdown", unitsub.doubleClickValueAssignedUnitSpacesDropDown());
        assertTrue("Failed to click Manage Unit Space Amenities Save Button", unitsub.clickManageUnitSpaceAmenitiesSaveButton());
        assertNotEquals("Failed to confirm value change in Amenity Name Text Box", "1st Floor", unitsub.getTextOfAmenityNameTextBox());

    }
}
