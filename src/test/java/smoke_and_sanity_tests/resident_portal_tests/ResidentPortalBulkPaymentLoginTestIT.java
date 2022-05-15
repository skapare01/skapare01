package smoke_and_sanity_tests.resident_portal_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.login.ResidentPortalLoginPage;
import page_objects.resident_portal_page_objects.ResidentPortalBulkPaymentsPaymentsPage;

import static org.junit.Assert.assertTrue;

public class ResidentPortalBulkPaymentLoginTestIT extends BaseBrowserTest {
    public ResidentPortalBulkPaymentLoginTestIT() {
        super("s3", SitesEnum.RESIDENTPORTAL, "testtt_higerfee.com@r.com", "Xento123");
    }

    @Test
    public void shouldLoginToResidentPortalSuccessfully_whenBulkPaymentsWorkflowIsAnOption() {
        ResidentPortalLoginPage bulkLogin = new ResidentPortalLoginPage(driver);
        assertTrue("Failed to click 'Make a Bulk Payment' button in the Resident Portal Login process!", bulkLogin.clickMakeABulkPaymentButton());

        ResidentPortalBulkPaymentsPaymentsPage bulkPaymentPage = new ResidentPortalBulkPaymentsPaymentsPage(driver);
        assertTrue("Failed to click the 'Make Payment' button on the payments page in Resident Portal!", bulkPaymentPage.clickMakeAPaymentButtonForABulkPayment());

    }
}
