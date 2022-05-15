package smoke_and_sanity_tests.property_management_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.pets.PetsNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.pets.PetsSubtab;

import static org.junit.Assert.assertTrue;

public class VerifyPetsAddFunctionalityIT extends BaseBrowserTest {

    public VerifyPetsAddFunctionalityIT() {
        super("avantic");
    }

    @Test //Test Case #2247810 Feature #3315059
    public void shouldVerifyPetsAddFunctionality_whenTabsAreClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Failed to click Setup tab", navBar.clickSetupButton());
        assertTrue("Failed to select Property", navBar.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        assertTrue("Failed to select Property", propList.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation propNav = new PropertyFirstLevelNavigation(driver);
        assertTrue("Failed to click Pricing tab", propNav.clickPricingTab());

        PetsNavigation petNav = new PetsNavigation(driver);
        assertTrue("Failed to click Pets subtab", petNav.clickPropertyPricingPetsTab());

        PetsSubtab pettab = new PetsSubtab(driver);
        assertTrue("Failed to click Add Pet Type button", pettab.clickAddPetTypeButton() );
    }
}
