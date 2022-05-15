package regression_tests.student_tests;


import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.lease_tab.LeaseNav;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.lease_tab.CompanySpaceOptionsPage;

import static org.junit.Assert.*;

public class CompanySpaceOptionsIT extends BaseBrowserTest {
    public CompanySpaceOptionsIT() {
        super("campusapartments");
    }

    @Test
    public void shouldChecksDefaultSpaceOptionsAndFunctionalityToAddAndRemoveCompanySpaceOptions_whenStudentOccupancyEnabled(){
        // Test Case 2226204 - validate default space option on company level
        CompanySpaceOptionsPage spaceOptionPage = new CompanySpaceOptionsPage(driver);
        EntrataNavBar nav = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation settings = new CompanyFirstLevelNavigation(driver);
        LeaseNav leaseNav = new LeaseNav(driver);
        assertTrue("Unable to click on setup tab.", nav.clickSetupButton());
        assertTrue("Unable to click on leasing subtab.", settings.clickLeasingTab());
        assertTrue("Unable to click space options tab. ", leaseNav.clickSpaceOptionsTab());
        assertEquals("Private Space Option not found.", "Private", spaceOptionPage.checkForPrivateSpaceOption());
        assertEquals("Shared space option not found.", "Shared", spaceOptionPage.checkForSharedSpaceOption());
        assertEquals("Property count for private and shared space options are not equal.", spaceOptionPage.checkPrivatePropertyCount(), spaceOptionPage.checkSharedPropertyCounty());
        assertTrue("Edit icon is present for private space option and should not be.", spaceOptionPage.checkForPrivateEditIcon());
        assertTrue("Edit icon is present for shared space option and should not be.", spaceOptionPage.checkForSharedEditIcon());
        assertTrue("Unable to click add space option button.", spaceOptionPage.clickAddSpaceOption());
        assertTrue("Unable to select specified space count.", spaceOptionPage.selectSpaceCount("3"));
        assertTrue("Unable to enter space option title.", spaceOptionPage.enterSpaceOptionTitle("Best Space Option"));
        assertTrue("Unable to select student occupancy from occupancy type dropdown.", spaceOptionPage.selectStudentOccupancy());
        assertTrue("Unable to click add property button.", spaceOptionPage.clickAddProperty());
        assertTrue("Unable to click specified property to add.", spaceOptionPage.clickProperty());
        assertTrue("Unable to click save button.", spaceOptionPage.clickSaveButton());
        assertTrue("cannot find recently added space option on space option list.", spaceOptionPage.confirmAddedSpaceOption());
        assertTrue("Cannot find last edit icon after adding space option.", spaceOptionPage.clickEditSpaceOption());
        assertTrue("Cannot click delete property.", spaceOptionPage.clickDeletePropertyFromSpaceOption());
        assertTrue("Unable to click save button after deleting property.", spaceOptionPage.clickSaveButton());
        assertTrue("unable to confirm changes after deleting property and saving", spaceOptionPage.clickConfirmButton());
        assertEquals("Success message not displaying correctly.", "Space option updated successfully ", spaceOptionPage.checkSuccessMessage());
        assertTrue("Cannot find last edit icon after deleting property from last space option.", spaceOptionPage.clickEditSpaceOption());
        assertTrue("Cannot click delete space option", spaceOptionPage.clickDeleteSpaceOption());
        assertTrue("Cannot accept confirm delete alert popup", spaceOptionPage.confirmDelete());
        assertFalse("Deleted space option is still showing on space option list.", spaceOptionPage.confirmAddedSpaceOption());


    }
}
