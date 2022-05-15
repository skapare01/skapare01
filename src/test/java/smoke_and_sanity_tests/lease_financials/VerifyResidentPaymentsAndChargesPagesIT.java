package smoke_and_sanity_tests.lease_financials;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.ar_payments_subtab.ARPaymentsPage;
import page_objects.entrata_page_objects.residents_tab.ar_payments_subtab.BulkPaymentsPage;
import page_objects.entrata_page_objects.residents_tab.charges_subtab.ChargesPage;
import page_objects.entrata_page_objects.residents_tab.charges_subtab.PostRecurringChargesPage;

import static org.junit.Assert.*;

public class VerifyResidentPaymentsAndChargesPagesIT extends BaseBrowserTest {
    public VerifyResidentPaymentsAndChargesPagesIT(){
        super("fourmidable");}
    @Test
    public void shouldNavigateToARPaymentsAndChargesPages_whenPMEnabled(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to click Residents Tab.",nav.clickResidentsTab());
        assertTrue("Unable to click AR Payments Tab.", nav.clickARPaymentsTab());
        ARPaymentsPage arPaymentsPage = new ARPaymentsPage(driver);
        assertTrue("Unable to click add bulk payments.",arPaymentsPage.clickAddBulkPayments());
        BulkPaymentsPage bulkPaymentsPage = new BulkPaymentsPage(driver);
        assertTrue("Unable to find number of payments field.",bulkPaymentsPage.verifyNumberOfPaymentField());
        assertTrue("Cannot click cancel.", bulkPaymentsPage.clickCancel());
        assertTrue("Cannot click close.", bulkPaymentsPage.clickClose());
        assertTrue("Cannot click Charges Tab.", nav.clickChargesTab());
        ChargesPage chargesPage = new ChargesPage(driver);
        assertTrue("Unable to find tools icon.", chargesPage.moveToToolsIcon());
        assertTrue("Unable to click post recurring charges.", chargesPage.clickPostRecurringCharges());
        PostRecurringChargesPage postRecurringChargesPage = new PostRecurringChargesPage(driver);
        assertTrue("Unable to find apply Button.",postRecurringChargesPage.verifyApplyButtonPresent());
    }
}
