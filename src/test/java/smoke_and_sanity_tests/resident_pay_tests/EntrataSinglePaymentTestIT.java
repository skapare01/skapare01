package smoke_and_sanity_tests.resident_pay_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.ar_payments_subtab.ARPaymentsPage;


import static org.junit.Assert.assertTrue;

public class EntrataSinglePaymentTestIT extends BaseBrowserTest {

    public EntrataSinglePaymentTestIT() {
        super("avantic");
    }

    //manual test 2224463

    @Test
    public void entrataValidateAddSinglePayment() {
        //Test Variables
        String residentSearch = "Facilities";
        String property = "267544";
        //navigate to Residents Tab
        EntrataNavBar residentsTab = new EntrataNavBar(driver);
        assertTrue("Failed to navigate to 'Residents' tab.", residentsTab.clickResidentsTab());
        assertTrue("Failed to navigate to 'AR Payments'.", residentsTab.clickARPaymentsTab());

        ARPaymentsPage arPaymentsTab = new ARPaymentsPage(driver);
        assertTrue("Failed to navigate to 'Tools' side menu", arPaymentsTab.navigateToToolsSideMenu());
        assertTrue("Failed to navigate to 'Add Payment'.", arPaymentsTab.navigateToAddSinglePaymentOption());
        assertTrue("Failed to click on 'Property' dropdown list.", arPaymentsTab.clickOnPropertyDropDown());
        assertTrue("Failed to select a property.", arPaymentsTab.selectProperty(property));
        assertTrue("Failed to add resident in search.", arPaymentsTab.addResidentSearch(residentSearch));
        assertTrue("Failed to click on any resident.", arPaymentsTab.clickOnResident());
        assertTrue("Failed to see 'Payment Code' field.", arPaymentsTab.paymentCodeIsVisible());
        assertTrue("Failed to see 'Payment Type' field", arPaymentsTab.paymentTypeIsVisible());
        assertTrue("Failed to see 'Amount' field.", arPaymentsTab.amountFieldIsVisible());
        assertTrue("Failed to see 'Check Number' field.", arPaymentsTab.checkNumberFieldIsVisible());
        assertTrue("Failed to see 'Notes' field", arPaymentsTab.notesFieldIsVisible());
        assertTrue("Failed to close popup.", arPaymentsTab.closePopup());

    }
}
