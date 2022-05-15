package regression_tests.property_management_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.addons.AddonsNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.addons.RentableItemsSubtab;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

public class VerifyRentableItemsGroupFunctionalityIT extends BaseBrowserTest {

    public VerifyRentableItemsGroupFunctionalityIT() {
        super("demoold");
    }

    @Test //Test Case #2228300
    public void shouldVerifyRentableItemsGroupSaves_whenEditedAndSaved() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Failed to click Setup tab", navBar.clickSetupButton());
        assertTrue("Failed to select Property", navBar.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        assertTrue("Failed to select Property", propList.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation propNav = new PropertyFirstLevelNavigation(driver);
        assertTrue("Failed to click Pricing Tab", propNav.clickPricingTab());

        AddonsNavigation addNav = new AddonsNavigation(driver);
        assertTrue("Failed to click Addons subtab", addNav.clickPropertyPricingAddonsTab());
        assertTrue("Failed to click Rentable Items Addons tab", addNav.clickRentableItemsAddonsTab());

        RentableItemsSubtab rentTab = new RentableItemsSubtab(driver);
        assertTrue("Failed to click Rentable Items Edit button", rentTab.clickRentableItemsEditButton());
        assertTrue("Failed to type value in Custom Marketing Description text box", rentTab.sendKeysRentableItemsTextBox());
        assertTrue("Failed to click Rentable Item Save button", rentTab.clickRentableItemsSaveButton());
        assertNotEquals("Failed to confirm value change in Custom Marketing Description text box", "test", rentTab.getTextOfRentableItemsTextBox());
    }

    @Test //Test Case #2228301
    public void shouldVerifyRentableItemsGroupDelete_whenDeletedAndConfirmed() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Failed to click Setup tab", navBar.clickSetupButton());
        assertTrue("Failed to select Property", navBar.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        assertTrue("Failed to select Property", propList.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation propNav = new PropertyFirstLevelNavigation(driver);
        assertTrue("Failed to click Pricing Tab", propNav.clickPricingTab());

        AddonsNavigation addNav = new AddonsNavigation(driver);
        assertTrue("Failed to click Addons subtab", addNav.clickPropertyPricingAddonsTab());
        assertTrue("Failed to click Rentable Items Addons tab", addNav.clickRentableItemsAddonsTab());

        RentableItemsSubtab rentTab = new RentableItemsSubtab(driver);
        assertTrue("Failed to click Rentable Items Edit button", rentTab.clickRentableItemsEditButton());
        assertTrue("Failed to click Rentable Items Delete Button", rentTab.clickRentableItemsDeleteButton());
        assertTrue("Failed to click Rentable Items Yes Button", rentTab.clickRentableItemsYesButton());
    }

    @Test //Test Case #2228304
    public void shouldVerifyRentableItemsManageInventory_whenEditedAndSaved() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Failed to click Setup tab", navBar.clickSetupButton());
        assertTrue("Failed to select Property", navBar.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        assertTrue("Failed to select Property", propList.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation propNav = new PropertyFirstLevelNavigation(driver);
        assertTrue("Failed to click Pricing Tab", propNav.clickPricingTab());

        AddonsNavigation addNav = new AddonsNavigation(driver);
        assertTrue("Failed to click Addons subtab", addNav.clickPropertyPricingAddonsTab());
        assertTrue("Failed to click Rentable Items Addons tab", addNav.clickRentableItemsAddonsTab());

        RentableItemsSubtab rentTab = new RentableItemsSubtab(driver);
        assertTrue("Failed to click Rentable Items Manage Inventory button", rentTab.clickRentableItemsManageInventoryButton());
        assertTrue("Failed to click Rentable Items Manage Inventory Edit button", rentTab.clickRentableItemsManageInventoryEditButton());
        assertTrue("Failed to type value in Rentable Items Manage Inventory text box", rentTab.sendKeysRentableItemsManageInventoryTextBox());
        assertTrue("Failed to click Rentable Item Manage Inventory Save button", rentTab.clickRentableItemsManageInventorySaveButton());
        assertNotEquals("Failed to confirm value change in Manage Inventory Description text box", "test", rentTab.getTextOfRentableItemsManageInventoryTextBox());
    }

    @Test //Test Case #2228299
    public void shouldVerifyAddRentableItemsGroup_whenAddedAndSaved() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Failed to click Setup tab", navBar.clickSetupButton());
        assertTrue("Failed to select Property", navBar.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        assertTrue("Failed to select Property", propList.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation propNav = new PropertyFirstLevelNavigation(driver);
        assertTrue("Failed to click Pricing Tab", propNav.clickPricingTab());

        AddonsNavigation addNav = new AddonsNavigation(driver);
        assertTrue("Failed to click Addons subtab", addNav.clickPropertyPricingAddonsTab());
        assertTrue("Failed to click Rentable Items Addons tab", addNav.clickRentableItemsAddonsTab());

        RentableItemsSubtab rentTab = new RentableItemsSubtab(driver);
        assertTrue("Failed to click Rentable Items Add Rentable Item Category button", rentTab.clickAddRentableItemCategoryButton());
        assertTrue("Failed to click Add Rentable Item Category Type Dropdown", rentTab.clickRentableItemCategoryTypeDropdown());
        assertTrue("Failed to click Garage Value 275 from Dropdown", rentTab.clickValueGarageFromTypeDropDown());
        assertTrue("Failed to toggle Yes on Customize the Name & Description for this Property", rentTab.clickCustomizeNameToggle());
        assertFalse("Failed to type value in Rentable Item Category Custom Name text box", rentTab.sendKeysRentableItemCustomNameTextBox());
        assertTrue("Failed to click Rentable Item Category Save button", rentTab.clickRentableItemCategorySaveButton());
        assertNotEquals("Failed to confirm value change in Rentable Item Category Custom Name text box", "Garage", rentTab.getTextOfRentableItemCustomNameTextBox());

    }

}

