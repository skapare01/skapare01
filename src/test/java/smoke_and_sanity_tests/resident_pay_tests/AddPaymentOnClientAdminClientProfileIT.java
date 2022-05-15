package smoke_and_sanity_tests.resident_pay_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.clients_tab.clients_subtab.ClientAdminClientProfile;

import static org.junit.Assert.assertTrue;

public class AddPaymentOnClientAdminClientProfileIT extends BaseBrowserTest {

    public AddPaymentOnClientAdminClientProfileIT() {
        super("clientadmin", SitesEnum.CLIENTADMIN, "bbrogdon", "Xento123");
    }

    @Test
    public void check_Add_Payment_Option_Is_Present() {
        ClientAdminNavBar clientAdminDashboard = new ClientAdminNavBar(driver);
        ClientAdminClientProfile clientProfile = new ClientAdminClientProfile(driver);

        //Navigate to the Client within Client Admin
        assertTrue("Unable to search for CID in QuickSearch within ClientAdmin.", clientAdminDashboard.searchForSmokeAutomationRapidCID());
        assertTrue("Unable to press enter in QuickSearch within ClientAdmin.", clientAdminDashboard.pressEnterInQuickSearch());
        assertTrue("Unable to open QuickSearch result within ClientAdmin.", clientAdminDashboard.openQuickSearchResult());

        //Check the accounts associated to the clientProfile
        assertTrue("Unable to switch to new tab.", clientProfile.switchToClientProfileTab());
        assertTrue("Unable to open the Accounting tab on the client profile in Client Admin", clientProfile.openClientAccountingTab());
        assertTrue("Unable to opend the Ledger subtab of Accounting", clientProfile.openClientAccountingLedgerSubTab());
        assertTrue("Unable to click the 'Add Payment' option.", clientProfile.accountingTabAddPayment());
        assertTrue("Submit payment button is not visible.", clientProfile.submitPaymentIsVisible());

    }

}