package smoke_and_sanity_tests.property_management_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.addons.AddonsNavigation;

import static org.junit.Assert.assertTrue;

public class NavigateToAddonsIT extends BaseBrowserTest {

    public NavigateToAddonsIT() {
        super("avantic");
    }

    @Test //Test Case #2251226 (stop at rentable items tab)
    public void shouldNavigateToAddons_whenTabsAreClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("failed to click setup tab", navBar.clickSetupButton());
        assertTrue("failed to select property", navBar.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        assertTrue("failed to select property", propList.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation propNav = new PropertyFirstLevelNavigation(driver);
        assertTrue("failed to click pricing tab", propNav.clickPricingTab());

        AddonsNavigation addNav = new AddonsNavigation(driver);
        assertTrue("failed to click addons subtab",addNav.clickPropertyPricingAddonsTab());
        assertTrue("failed to click rentable items addons tab", addNav.clickRentableItemsAddonsTab());
    }
}