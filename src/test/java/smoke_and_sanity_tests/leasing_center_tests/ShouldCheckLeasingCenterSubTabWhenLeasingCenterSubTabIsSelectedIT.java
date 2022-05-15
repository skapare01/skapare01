package smoke_and_sanity_tests.leasing_center_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.leasing_tab.PropertyLeasingNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.leasing_tab.leasing_center_sub_tab.LeasingCenterSettings;
import static junit.framework.Assert.assertTrue;

public class ShouldCheckLeasingCenterSubTabWhenLeasingCenterSubTabIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckLeasingCenterSubTabWhenLeasingCenterSubTabIsSelectedIT() {
        super("1automationrapid");
    }

    @Test
    public void shouldCheckLeasingCenterPreferencesWhenLeasingCenterSubTabIsSelected() {
        EntrataNavBar entNavBar = new EntrataNavBar(driver);
        assertTrue("Unable to locate/select 'Setup' tab.",entNavBar.clickSetupButton());
        assertTrue("Unable to locate/select 'Properties' sub-tab.",entNavBar.clickPropertiesButton());
        PropertyListPage pListPage = new PropertyListPage(driver);
        assertTrue("Unable to locate/select 'Affordable_Automation' property.",pListPage.selectAffordableAutomationProperty());
        PropertyFirstLevelNavigation fLevelNav = new PropertyFirstLevelNavigation(driver);
        assertTrue("Unable to locate/select 'Leasing' tab.",fLevelNav.clickLeasingTab());
        PropertyLeasingNav leasingNav = new PropertyLeasingNav(driver);
        assertTrue("Unable to locate/select 'Leasing Center' sub-tab.",leasingNav.clickLeasingCenterSubTab());
        LeasingCenterSettings lCenterSet = new LeasingCenterSettings(driver);
        assertTrue("Unable to locate 'Leasing Center Preferences' header text.",lCenterSet.viewLeasingCenterPreferencesHeaderText());
    }
}
