package smoke_and_sanity_tests.renewals_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentFilterPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.ResidentProfileCurtainPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.more_actions_dropdown.create_renewal_offer_renew_resident.CreateRenewalOfferPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.more_actions_dropdown.create_renewal_offer_renew_resident.RenewalOfferSuccessfulPage;
import page_objects.entrata_page_objects.residents_tab.renewals_subtab.resident_renewal_profile.ResidentRenewalProfileCurtainPage;

import static junit.framework.Assert.assertTrue;


public class CreateRenewalOfferFromResidentsMoreActionsIT extends BaseBrowserTest {

    public CreateRenewalOfferFromResidentsMoreActionsIT() {
        super("village");
    }

    @Test
    public void shouldVerifyRenewalCreationFromEntrata_whenCreatingRenewalFromResidentMoreActions() { //2248990
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Could not click on residents tab", nav.clickResidentsTab());
        AllResidentsPage allRes = new AllResidentsPage(driver);
        assertTrue("Could not click on all residents filter", allRes.clickResidentFilter());
        AllResidentFilterPage allResFilter = new AllResidentFilterPage(driver);
        assertTrue("Could not clear All Properties from filter", allResFilter.clickClearAll());
        assertTrue("Could not click on 'add' button to add property to filter", allResFilter.clickAddPropertyButton());
        assertTrue("Could not select property 'village bend east' from property dropdown", allResFilter.clickOnSpecificFilteredProperty("The Village Bend East"));
        assertTrue("Could not click on Filter button", allResFilter.clickFilterResidents());
        assertTrue("Could not click on first resident on all residents list", allRes.clickFirstResidentOnList());
        ResidentProfileCurtainPage resProfile = new ResidentProfileCurtainPage(driver);
        assertTrue("Could not click on household tab", resProfile.clickResidentProfileHouseholdTab());
        //todo: remove once dev seed is established/stabilized
        if(resProfile.confirmViewRenewalProgressVisible()){
            ResidentProfileCurtainPage afterSuccess = new ResidentProfileCurtainPage(driver);
            assertTrue("Could not click on view renewal progress button", afterSuccess.clickViewRenewalProgress());
            ResidentRenewalProfileCurtainPage renewed = new ResidentRenewalProfileCurtainPage(driver);
            assertTrue("Could not click on More actions Dropdown for renewal account", renewed.residentRenewalMoreActionsDropdown());
            assertTrue("Could not click on cancel renewal offer on more actions dropdown", renewed.moreActionsClickCancelRenewalProgress());
            assertTrue("Could not see 'renewal offer: cancelled' text for renewal status", renewed.renewalOfferCancelledTextVisible());
            RenewalOfferSuccessfulPage renewalSuccess = new RenewalOfferSuccessfulPage(driver);
            assertTrue("Unable to click top banner close button",renewalSuccess.topCloseButton());
            assertTrue("Unable to close renewal tab and return to primary tab.", renewalSuccess.closeRenewalTab());
            assertTrue("Could not click on Resident account close button", afterSuccess.clickMainHeaderCloseButton());

            assertTrue("Could not click on first resident on all residents list", allRes.clickFirstResidentOnList());
        }
        assertTrue("Could not click on More actions Dropdown", resProfile.clickOnMoreActionsDropdown());
        assertTrue("Could not click create renewal offer from more actions dropdown", resProfile.moreActionsDropdownClickCreateRenewalOffer());
        CreateRenewalOfferPage renewalCreationPage = new CreateRenewalOfferPage(driver);
        assertTrue("Unable to see CUSTOM tab", renewalCreationPage.customIntervalTabText());
        assertTrue("Unable to see lease end date", renewalCreationPage.leaseEndDate());
        assertTrue("Unable to see lease expiration date", renewalCreationPage.leaseExpirationDate());
        //lease terms and rent
        assertTrue("Unable to see Lease Term Column", renewalCreationPage.leaseTermColumn());
        assertTrue("Unable to click Select first lease terms check box", renewalCreationPage.selectFirstLeaseTermsCheckBox());
        assertTrue("Unable to clear Base Renewal Rent text box for first lease term", renewalCreationPage.clearTextBoxForBaseRenewalRentLeaseTermOne());
        assertTrue("Unable to enter in 1000 for Base Renewal Rent text box for first lease term", renewalCreationPage.enterIn1000ForBaseRenewalRentLeaseTermOne());
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
        ResidentProfileCurtainPage afterSuccess = new ResidentProfileCurtainPage(driver);
        assertTrue("Could not click on Resident account close button", afterSuccess.clickMainHeaderCloseButton());
        assertTrue("Could not click on first resident on all residents list", allRes.clickFirstResidentOnList());
        assertTrue("Could not click on view renewal progress button", afterSuccess.clickViewRenewalProgress());
        ResidentRenewalProfileCurtainPage renewed = new ResidentRenewalProfileCurtainPage(driver);
        assertTrue("Could not click on More actions Dropdown for renewal account", renewed.residentRenewalMoreActionsDropdown());
        assertTrue("Could not click on cancel renewal offer on more actions dropdown", renewed.moreActionsClickCancelRenewalProgress());
        assertTrue("Could not see 'renewal offer: cancelled' text for renewal status", renewed.renewalOfferCancelledTextVisible());
    }
}
