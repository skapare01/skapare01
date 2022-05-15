package smoke_and_sanity_tests.property_management_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.pets.PetsNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import static org.junit.Assert.assertTrue;

public class NavigateToPetsIT extends BaseBrowserTest {

    public NavigateToPetsIT() {
        super("avantic");
    }

    @Test //Test Case #2251250 (stop at pets tab)
    public void shouldNavigateToPets_whenTabsAreClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("failed to click setup tab", navBar.clickSetupButton());
        assertTrue("failed to select property", navBar.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        assertTrue("failed to select property", propList.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation propNav = new PropertyFirstLevelNavigation(driver);
        assertTrue("failed to click pricing tab", propNav.clickPricingTab());

        PetsNavigation petNav = new PetsNavigation(driver);
        assertTrue("failed to click pets subtab",petNav.clickPropertyPricingPetsTab());
    }
}
