package smoke_and_sanity_tests.property_management_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.PricingNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.specials.SpecialsNavigation;
import static org.junit.Assert.assertTrue;

public class VerifyUnitSpaceLevelSpecialsSetupIT extends BaseBrowserTest {
    public VerifyUnitSpaceLevelSpecialsSetupIT() {
        super("avantic");
    }

    @Test //Test Case #2228348 (stop at unit space tab)
    public void shouldVerifyUnitSpaceLevelSpecialsSetup_whenTabsAreClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("failed to click setup tab", navBar.clickSetupButton());
        assertTrue("failed to select property", navBar.clickPropertiesButton());

        PropertyListPage propList = new PropertyListPage(driver);
        assertTrue("failed to select property", propList.selectFirstPropertyFromList());

        PropertyFirstLevelNavigation propNav = new PropertyFirstLevelNavigation(driver);
        assertTrue("failed to click pricing tab", propNav.clickPricingTab());

        PricingNav pricingNav = new PricingNav(driver);
        assertTrue("failed to click Specials subtab",pricingNav.clickSpecialsTab());

        SpecialsNavigation testSpecials = new SpecialsNavigation(driver);
        assertTrue("failed to click unit space specials tab", testSpecials.clickUnitSpaceSpecialsTab());
    }
}