package smoke_and_sanity_tests.resident_verify_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.support_tab.screening_subtab.Screening_Manual_Review;
import page_objects.client_admin_page_objects.support_tab.screening_subtab.Screening_Records;

import static org.junit.Assert.assertTrue;
import static base_tests.SitesEnum.CLIENTADMIN;

public class VerifyScreeningRecordsAndManualReviewIT extends BaseBrowserTest {

    public VerifyScreeningRecordsAndManualReviewIT() {
        super("clientadmin", CLIENTADMIN, "bbrogdon", "Xento123");
    }

    @Test
    public void shouldVerifyScreeningRecordsShow_whenSearchingForSpecificApplicationId() {
        //testCase ID 2226099
        //Navigate to the Screening Dashboard
        ClientAdminNavBar clientAdmin_navBar = new ClientAdminNavBar(driver);
        assertTrue("Unable to maximize screen.", clientAdmin_navBar.maximizeWindow());
        assertTrue("Unable to move to 'Support' Tab.", clientAdmin_navBar.moveToSupportMenu());
        assertTrue("Unable to click 'Support/Screening' tab.", clientAdmin_navBar.openSupportScreening());

        //Verify applicant id on Screening Dashboard
        Screening_Records screeningRecords = new Screening_Records(driver);
        assertTrue("Unable to enter applicant ID into search field", screeningRecords.searchForApplicantId_TestCase2260999());
        assertTrue("Unable to click search option on Screening Dashboard", screeningRecords.clickScreeningSearchButton());
        assertTrue("Unable to find applicant name in results on Screening Dashboard", screeningRecords.findSpecificText_ApplicantName_TestCase2260999());
    }

    @Test
    public void shouldVerifyThatScreeningManualReviewLoadsProperly_whenNavigatingToManualReviewScreen() {
        ClientAdminNavBar clientAdmin_navBar = new ClientAdminNavBar(driver);
        Screening_Manual_Review manualReview = new Screening_Manual_Review(driver);

        //Navigate to Support >> Screening >> Screening Manual Review
        assertTrue("Unable to move to Support", clientAdmin_navBar.moveToSupportMenu());
        assertTrue("Unable to move to Support >> Screening", clientAdmin_navBar.moveToScreeningMenuOfSupport());
        assertTrue("Unable to open Support >> Screening >> Manual Review in the support submenu.", clientAdmin_navBar.openScreeningManualReview());

        //Validate that Manual review screens are visible.
        assertTrue("Unable to find Resident Verify Manual review", manualReview.confirmRVManualReviewIsVisible());
        assertTrue("Unable to find Vendor Access Manual review", manualReview.confirmVendorAccessIsVisible());
        assertTrue("Unable to find Cori CoCourt Manual review", manualReview.confirmCoriCoCourtIsVisible());
        assertTrue("Unable to find New Resident Verify Manual review", manualReview.confirmNewResidentVerifyManualReviewIsVisible());
        assertTrue("Unable to open New Resident Verify Manual Review", manualReview.openNewResidentVerifyManualReview());

   }

}