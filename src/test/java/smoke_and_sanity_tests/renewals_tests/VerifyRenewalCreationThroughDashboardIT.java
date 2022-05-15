package smoke_and_sanity_tests.renewals_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.MyDashboardNav;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.residents_tab.RenewalsSubtab;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.more_actions_dropdown.create_renewal_offer_renew_resident.CreateRenewalOfferPage;
import page_objects.entrata_page_objects.reports_tab.ReportsBasePage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.more_actions_dropdown.create_renewal_offer_renew_resident.RenewalOfferSuccessfulPage;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class VerifyRenewalCreationThroughDashboardIT extends BaseBrowserTest {
    public VerifyRenewalCreationThroughDashboardIT() {
        super("village");
    }

    @Test
    public void shouldVerifyRenewalCreationFromEntrata_whenCreatingAndGeneratingOfferFromEntrataDashboard() { //Renewal TC: 3238910
        MyDashboardNav dash = new MyDashboardNav(driver);
        assertTrue("Approvals Tab was not Visible", dash.approvalsTabIsVisible());
        assertTrue("Leads Tab was not Visible", dash.leadsTabIsVisible());
        assertTrue("Applicants Tab was not Visible", dash.applicantsTabIsVisible());
        assertTrue("Residents Tab was not Visible", dash.residentsTabIsVisible());
        assertTrue("Res Portal Tab was not Visible", dash.resPortalTabIsVisible());
        assertTrue("Maintenance Tab was not Visible", dash.maintenanceTabIsVisible());
        assertTrue("Financial Tab was not Visible", dash.financialTabIsVisible());
        assertTrue("Help Tab was not Visible", dash.helpTabIsVisible());
        assertTrue("Residents Tab was not clickable", dash.clickResidentsTab());
        assertTrue("Contact Needed tab was not Visible", dash.contactNeededSubTab());
        assertTrue("Not Progressing tab was not Visible", dash.notProgressingSubTab());
        assertTrue("Move in Reviews tab was not Visible", dash.moveInReviewsSubTab());
        assertTrue("Move in Tab was not Visible", dash.moveInsSubTab());
        assertTrue("Evictions tab was not Visible", dash.evictionsSubTab());
        assertTrue("move out tab was not Visible", dash.moveOutsSubTab());
        assertTrue("renewals Tab was not Visible", dash.renewalsSubTab());
        assertTrue("transfers Tab was not Visible", dash.transfersSubTab());
        assertTrue("extensions Tab was not Visible", dash.extensionsSubTab());
        assertTrue("rentable items Tab was not Visible", dash.rentableItemsSubTab());
        assertTrue("resident reviews Tab was not Visible", dash.residentReviewsSubTab());
        assertTrue("posting tool Tab was not Visible", dash.postingToolSubTab());
        assertTrue("vehicles Tab was not Visible", dash.vehiclesSubTab());
        assertTrue("escalations Tab was not Visible", dash.escalationsSubTab());
        assertTrue("violations Tab was not Visible", dash.violationsSubTab());
        assertTrue("hazards Tab was not Visible", dash.hazardsSubTab());
        assertTrue("accommodations Tab was not Visible", dash.accommodationsSubTab());
        assertTrue("renewals Tab was not able to be clicked", dash.renewalsSubTabClick());
        RenewalsSubtab dashRen = new RenewalsSubtab(driver);
        assertTrue("Create offers tab not visible", dashRen.createOffersTabIsVisible());
        assertTrue("Pending offers tab not visible", dashRen.pendingOffersTab());
        assertTrue("resubmit tab not visible", dashRen.resubmitTab());
        assertTrue("generate lease tab not visible", dashRen.generateLeaseTab());
        assertTrue("non renewing tab not visible", dashRen.nonRenewingTab());
        assertTrue("requests tab not visible", dashRen.requestsTab());
        assertTrue("Create offers tab not able to be clicked", dashRen.createOffersTabClick());
        MyDashboardNav propFilter = new MyDashboardNav(driver);
        assertTrue("unable to click on dashboard Filter", propFilter.dashboardFilter());
        assertTrue("unable to click on remove all properties", propFilter.dashboardFilterRemoveAllProperties());
        assertTrue("unable to click on add property button", propFilter.dashboardFilterAddPropertyButton());
        assertTrue("unable to click on property list dropdown", propFilter.dashboardFilterPropertyListDropdown());
        assertTrue("unable to click on add specific property", propFilter.dashboardFilterAddProperty());
        assertTrue("unable to click on dashboard filter button", propFilter.dashboardFilterButton());
        RenewalsSubtab createOffersFirstInstance = new RenewalsSubtab(driver);
        assertTrue("unable to click on look ahead days", createOffersFirstInstance.lookAheadDaysClick());
        assertTrue("unable to clear existing number on look ahead days", createOffersFirstInstance.lookAheadDaysClear());
        assertTrue("unable to enter text '999' on look ahead days", createOffersFirstInstance.lookAheadDaysEnterKeys999());
        assertTrue("unable to press enter for look ahead days", createOffersFirstInstance.lookAheadDaysPressEnter());
        assertTrue("Unable to click on create offer Button for first resident", createOffersFirstInstance.createRenewalOffersButtonForFirstResident());
        CreateRenewalOfferPage createOffer = new CreateRenewalOfferPage(driver);
        assertTrue("renewal offer page did not load, could not verify save changes button visible", createOffer.createRenewalOfferPageVerifyPageLoadsWithSaveChangesButtonVis());
        assertTrue("Unable to close create renewal offer screen", createOffer.closeCreateRenewalOfferPage());
        RenewalsSubtab createOffersSecondInstance = new RenewalsSubtab(driver);
        assertTrue("Page did not go back to Dashboard, residents, create offers tab", createOffersSecondInstance.residentsAwaitingRenewalOffersHeadingVis());
        assertTrue("unable to click on look ahead days", createOffersSecondInstance.lookAheadDaysClick());
        assertTrue("unable to clear existing number on look ahead days", createOffersSecondInstance.lookAheadDaysClear());
        assertTrue("unable to enter text '30' on look ahead days", createOffersSecondInstance.lookAheadDaysEnterKeys30());
        assertTrue("unable to press enter for look ahead days", createOffersSecondInstance.lookAheadDaysPressEnter());
        assertTrue("Unable to checkmark first resident", createOffersSecondInstance.checkmarkFirstResident());
        ReportsBasePage bp = new ReportsBasePage(driver);
        assertEquals("Unable to store fist listed name under create offers", createOffersSecondInstance.storeFirstNameOnList(), bp.innerText);
        assertTrue("Unable to click on create offer Button for first resident", createOffersSecondInstance.createRenewalOffersButtonForFirstResident());
        CreateRenewalOfferPage renewalCreationPage = new CreateRenewalOfferPage(driver);
        assertTrue("Unable to see CUSTOM tab", renewalCreationPage.customIntervalTabText());
        assertTrue("Unable to see lease end date", renewalCreationPage.leaseEndDate());
        assertTrue("Unable to see lease end date", renewalCreationPage.leaseExpirationDate());
        //lease terms and rent
        assertTrue("Unable to see Lease Term Column", renewalCreationPage.leaseTermColumn());
        //renewalSpecials
        assertTrue("Unable to see renewal specials header", renewalCreationPage.renewalSpecialsHeading());
        //Add-ons
        assertTrue("Unable to see Add-ons header", renewalCreationPage.addOnsHeading());
        //Amenities
        assertTrue("Unable to see Amenities header", renewalCreationPage.amenitiesHeading());
        //Pets
        assertTrue("Unable to see Pets header", renewalCreationPage.petsHeading());
        //Other Charges
        assertTrue("Unable to see Other Charges header", renewalCreationPage.otherChargesHeading());
        //Concessions
        assertTrue("Unable to see concessions header", renewalCreationPage.concessionsHeading());
        //Lease Utilities
        assertTrue("Unable to see Lease utilities header", renewalCreationPage.leaseUtilitiesHeading());
        assertTrue("Unable to click create renewal button", renewalCreationPage.saveChangesButtonClick());
        RenewalOfferSuccessfulPage renewalSuccess = new RenewalOfferSuccessfulPage(driver);
        assertTrue("Unable to see Offer Successful page header",renewalSuccess.offerCreatedSuccessfullyPageHeader());
        assertTrue("Unable to see success banner",renewalSuccess.renewalCreatedSuccessBanner());
        assertTrue("Unable to see email offer button",renewalSuccess.emailOfferButton());
        assertTrue("Unable to see print offer button",renewalSuccess.printOfferButton());
        assertTrue("Unable to see close offer button",renewalSuccess.closeOfferButton());
        assertTrue("Unable to click top banner close button",renewalSuccess.topCloseButton());
        RenewalsSubtab afterRenewalCreation = new RenewalsSubtab(driver);
        assertTrue("Page did not go back to create offers screen, did not see header: Residents Awaiting Renewal Offers", afterRenewalCreation.residentsAwaitingHeader());
        assertNotEquals("Resident was still on create offers list,", afterRenewalCreation.getFirstNameOnListVerifyNotSameAsStored(), bp.innerText);
    }
}
