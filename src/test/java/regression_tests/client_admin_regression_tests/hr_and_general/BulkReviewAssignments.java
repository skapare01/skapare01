package regression_tests.client_admin_regression_tests.hr_and_general;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.hr_tab.reviews_subtab.ReviewsTab;

import static org.junit.Assert.assertTrue;
import static base_tests.SitesEnum.CLIENTADMIN;

public class BulkReviewAssignments extends BaseBrowserTest {

    public BulkReviewAssignments() {
        super("clientadmin",CLIENTADMIN, "akavanaugh", "Xento123");
    }

    @Test
    public void confirmReviewsAreBulkAssigned_whenSelectingToBulkAssign() {
        //testCase 2224567

        //Navigate to HR Reviews
        ClientAdminNavBar navBar = new ClientAdminNavBar(driver);
        assertTrue("Unable to move to the HR tab.", navBar.moveToHrTab());
        assertTrue("Unable to click the Reviews subtab of the HR dropdown.", navBar.clickReviewsSubTab());

        //Confirm Bulk review functions correctly.
        ReviewsTab reviewsTab = new ReviewsTab(driver);
        assertTrue("Unable to select Bulk Assign Reviews.", reviewsTab.clickAssignBulkReview());
        assertTrue("Unable to select the first employee to be assigned the review.", reviewsTab.clickFirstBulkAssignedEmployee());
        assertTrue("Unable to click the submit button for the Bulk review assignment.", reviewsTab.clickSubmitBulkReview());

    }

}