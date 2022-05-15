package regression_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.BasePage;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.lease_tab.LeaseNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.lease_tab.LeaseTermStructuresPage;
import utils.RandomGenerator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LeaseTermStructuresIT extends BaseBrowserTest {
    public LeaseTermStructuresIT() {
        super("campusapartments");
    }


    @Test
    public void shouldAddAndDeleteLeaseTermStructureTest_WhenStudentPropertyIsActive(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        // navigates from home page to company>>lease> lease term structures
        assertTrue("Unable to click setup tab.", nav.clickSetupButton());
        assertTrue("Unable to click company subtab.", nav.clickCompanyButton());
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        assertTrue("Unable to click leasing tab.", companyFirstLevelNavigation.clickLeasingTab());
        LeaseNav leaseNav = new LeaseNav(driver);
        assertTrue("Unable to click lease term structures subtab.", leaseNav.clickLeaseStructuresTab());
        //Adds lease term Structure
        LeaseTermStructuresPage termPage = new LeaseTermStructuresPage(driver);
        assertTrue("Unable to click 'Add Term Structure' button.", termPage.clickAddTermStructure());
        assertTrue("Unable to enter lease term structure name.", termPage.enterLeaseTermStructureName());
        // adds property Campus Hill Lehigh 2 to lease term structure
        assertTrue("Unable to click add property button.", termPage.clickAddProperty());
        assertTrue("The property list is not displaying.", termPage.addPropertyToLeaseTermStructure());
        // adds property to lease term structure and verifies it is now on the property list
        assertTrue("Unable to enter property name in search field.",termPage.enterPropertyInSearchFilter());
        assertEquals("Unable to click add button next to specified property.", "Campus Hill - Lehigh 2", termPage.addProperty());
        assertTrue("Unable to click save lease term button", termPage.clickSaveLeaseTermButton());
        assertTrue("Add lease term structure success message did not appear.", termPage.waitForSuccessMessage());
        assertEquals("Lease term structure inserted/updated successfully, It will take some time to update the affected rates.", termPage.getSuccessMessageText());
        assertTrue("Unable to add lease term structure that was just added.", termPage.findAddedLeaseTerm());
        //Starts process to delete the lease term structure that was just created
        assertTrue("Unable to click on the edit icon next to the last lease term structure on page.", termPage.editLeaseStructure());
        assertTrue("Delete button is present while property is still associated to lease term structure.", termPage.checkDeleteButton());
        assertTrue("Unable to click delete button next to property in associated property list.", termPage.deletePropertyFromStructure());
        assertTrue("Unable to click save lease term structure button.", termPage.clickSaveLeaseTermButton());
        assertTrue("Unable to click confirm change.", termPage.confirmChange());
        assertTrue("Unable to click on the edit icon next to the last lease term structure on page after deleting property.", termPage.editLeaseStructure());
        assertTrue("Cannot delete lease term structure.", termPage.clickDeleteStructure());
        assertTrue("Success Message did not appear.", termPage.waitForSuccessMessage());
        assertEquals("Lease term structure deleted successfully.", termPage.getSuccessMessageText());
        assertTrue("Deleted structure is still present.", termPage.checkDeletedStructure());


    }

    @Test
    public void ShouldAddLeaseTermWindowForPortRepublicProperty_WhenPropertyIsActive(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to click setup tab.", nav.clickSetupButton());
        assertTrue("Unable to click company subtab.", nav.clickCompanyButton());
        CompanyFirstLevelNavigation companyFirstLevelNavigation = new CompanyFirstLevelNavigation(driver);
        assertTrue("Unable to click leasing tab.", companyFirstLevelNavigation.clickLeasingTab());
        LeaseNav leaseNav = new LeaseNav(driver);
        assertTrue("Unable to click lease term structures tab", leaseNav.clickLeaseStructuresTab());
        //navigates to the add lease term button for the Port Republic student property
        LeaseTermStructuresPage termPage = new LeaseTermStructuresPage(driver);
        assertTrue("Unable to click expand arrow to expand lease term structure.", termPage.clickPortRepublicLeaseTermExpand());
        assertTrue("Unable to move to add button.",termPage.moveToAddPropertyButton());
        assertTrue("Unable to click add lease term button.", termPage.clickPortRepublicAddLeaseTerm());
        //assertTrue("add lease term is not displaying", termPage.addLeaseTerm());
        assertTrue("Unable to click occupancy dropdown.", termPage.clickOccupancyDropdown());
        String leaseTermName = RandomGenerator.randomName();
        assertTrue("Cannot enter lease term name.", termPage.enterLeaseTermName(leaseTermName));
        //enters dates for all date picker fields for add lease term page
        assertTrue("Cannot enter 'renewal billing start date' in date picker.", termPage.inputRenewalBillingStart("10192022"));
        assertTrue("Cannot enter 'renewal lease start date' in date picker.", termPage.inputRenewalLeaseStart("10192022"));
        assertTrue("Cannot enter 'prospect lease start date' in date picker", termPage.inputProspectLeaseStart("10192022"));
        assertTrue("Cannot enter 'all lease end date' in date picker.", termPage.inputAllLeaseEnd("05312023"));
        assertEquals("All lease end Date does not match all billing end date.", termPage.checkAllLeaseEndDate(), termPage.checkAllBillDate());
        assertTrue("Property link not clickable.", termPage.selectPropertyForLeaseWindow());
        assertTrue("Add property button not present.", termPage.clickAddPropertyToLeaseWindow());
        assertTrue("Recently added property not found in added property list.", termPage.clickAddRepublicProperty());
        assertTrue("Unable to click update button.", termPage.clickUpdateButton());
        assertTrue("Unable to click save button.", termPage.clickSave());
        assertTrue("Success Message did not appear after saving lease term window.", termPage.waitForSuccessMessage());
        assertEquals("Success message text is not displaying the expected text.","Lease terms inserted/updated successfully, It will take some time to update the affected rates.", termPage.getSuccessMessageText());

    }
}
