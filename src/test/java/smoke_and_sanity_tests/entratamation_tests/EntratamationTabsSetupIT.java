package smoke_and_sanity_tests.entratamation_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.PropertyNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.entratamation.*;

import static org.junit.Assert.assertTrue;

public class EntratamationTabsSetupIT extends BaseBrowserTest {

    public EntratamationTabsSetupIT() {
        super("khansen");
    }

    @Test //TC: 3253245
    public void shouldFindEntratamationTabPages_whenTabsHaveBeenClicked() {
        EntrataNavBar navBar = new EntrataNavBar(driver);
        PropertyListPage propertyListPage = new PropertyListPage(driver);
        PropertyNavigation propertyNavigation = new PropertyNavigation(driver);
        EntratamationNav entratamationNav = new EntratamationNav(driver);
        CommunityAccessPage communityAccessPage = new CommunityAccessPage(driver);
        InstallationSetupPage installationSetupPage = new InstallationSetupPage(driver);
        SiteTourPage siteTourPage = new SiteTourPage(driver);
        SmartAmenitiesPage smartAmenitiesPage = new SmartAmenitiesPage(driver);
        IntegrationPartnersPage integrationPartnersPage = new IntegrationPartnersPage(driver);
        SmartCommonAreaPage smartCommonAreaPage = new SmartCommonAreaPage(driver);
        SmartUnitsPage smartUnitsPage = new SmartUnitsPage(driver);
        assertTrue("Could not click Setup tab.", navBar.clickSetupButton());
        assertTrue("Could not click Property sub tab.", navBar.clickPropertiesButton());
        assertTrue("Could not select a property.", propertyListPage.selectFirstPropertyFromList());
        assertTrue("Could not select Entratamation sub tab.", propertyNavigation.clickEntratamationTab());
        assertTrue("Could not click Community Access tab.", entratamationNav.clickCommunityAccessTab());
        assertTrue("Could not find Community Access page.", communityAccessPage.communityAccessPageVisible());
        assertTrue("Could not click Installation Setup tab.", entratamationNav.installationSetupTabClick());
        assertTrue("Could not find Installation Setup page.", installationSetupPage.installationSetupSmartUnitsVisible());
        assertTrue("Could not click Site Tour tab.", entratamationNav.siteTourTabClick());
        assertTrue("Could not find Site Tour page.", siteTourPage.siteTourPageVisible());
        assertTrue("Could not click Smart Amenities tab.", entratamationNav.smartAmenitiesTabClick());
        assertTrue("Could not find Smart Amenities page.", smartAmenitiesPage.smartAmenitiesPageVisible());
        assertTrue("Could not click Integration Partners tab.", entratamationNav.integrationPartnersTabClick());
        assertTrue("Could not find Integration Partners page.", integrationPartnersPage.integrationPartnersPageVisible());
        assertTrue("Could not click Smart Common Area tab.", entratamationNav.smartCommonAreaTabClick());
        assertTrue("Could not find Smart Common Area page.", smartCommonAreaPage.smartCommonAreaPageVisible());
        assertTrue("Could not click Smart Units tab.", entratamationNav.smartUnitsTabClick());
        assertTrue("Could not find Smart Units page.", smartUnitsPage.smartUnitsPageVisible());
    }
}
