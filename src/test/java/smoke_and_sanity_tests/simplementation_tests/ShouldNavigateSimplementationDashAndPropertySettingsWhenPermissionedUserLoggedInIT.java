package smoke_and_sanity_tests.simplementation_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.dashboard_tab.simplementation_portal.SimplementationDashboardPage;
import page_objects.entrata_page_objects.setup_tab.profiles_subtab.ProfilesPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.AddPropertyPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;

import static org.junit.Assert.*;

public class ShouldNavigateSimplementationDashAndPropertySettingsWhenPermissionedUserLoggedInIT extends BaseBrowserTest {
    public ShouldNavigateSimplementationDashAndPropertySettingsWhenPermissionedUserLoggedInIT (){
        super("atbenterprises", SitesEnum.ENTRATA,"Entrata_7331","Xento123");}

    @Test
    public void shouldNavToSimplementationPortal_whenPermissionedUserLoggedIn(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to click Simplementation Portal.", nav.clickSimplementationPortalTab());
        SimplementationDashboardPage simplementationDashboardPage = new SimplementationDashboardPage(driver);
        assertTrue("Unable to click activate simplementation button.",simplementationDashboardPage.clickActivateSimplementation());
        assertTrue("Unable to find select property dropdown.",simplementationDashboardPage.findSelectPropertyDropdown());
    }
    @Test
    public void shouldNavToSetupProfile_whenPermissionedUserLoggedIn(){
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to click setup tab.",navBar.clickSetupButton());
        assertTrue("Unable to click profiles subtab.",navBar.clickProfilesSubtab());
        ProfilesPage profilesPage = new ProfilesPage(driver);
        assertTrue("Unable to click add profile button.", profilesPage.clickAddProfile());
        assertTrue("Unable to find occupancy type dropdown.", profilesPage.findOccupancyTypesDropdown());
        assertTrue("Unable to click cancel button.", profilesPage.clickCancelAddSettingPopup());
        assertTrue("Unable to click edit profile icon.", profilesPage.clickEditProfile());
        assertTrue("Unable to find profile name field.", profilesPage.findProfileNameField());
        assertTrue("Unable to find save profile.", profilesPage.findSaveProfile());
    }
    @Test
    public void shouldNavToAddPropertyPopup_whenPermissionUserLoggedIn(){
        EntrataNavBar navBar = new EntrataNavBar(driver);
        assertTrue("Unable to click setup tab.",navBar.clickSetupButton());
        assertTrue("Unable to click properties subtab.", navBar.clickPropertiesButton());
        PropertyListPage propertyListPage = new PropertyListPage(driver);
        assertTrue("Unable to click add property.",propertyListPage.clickAddPropertyButton());
        AddPropertyPage addPropertyPage = new AddPropertyPage(driver);
        assertTrue("Unable to find property type dropdown.",addPropertyPage.findPropertyTypeDropdown());
    }



}
