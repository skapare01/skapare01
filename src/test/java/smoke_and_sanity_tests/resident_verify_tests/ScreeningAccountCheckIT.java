package smoke_and_sanity_tests.resident_verify_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.clients_tab.clients_subtab.ClientAdminClientProfile;
import page_objects.client_admin_page_objects.support_tab.screening_subtab.Screening_Data_Providers;

import static org.junit.Assert.assertTrue;
import static base_tests.SitesEnum.CLIENTADMIN;

public class ScreeningAccountCheckIT extends BaseBrowserTest {

    public ScreeningAccountCheckIT() {
        super("clientadmin", CLIENTADMIN, "bbrogdon", "Xento123");
    }

    @Test
    public void shouldVerifyThatClientProfileHasScreeningAccountAssociated_whenNavigatingToClientAccounts() {
        //testCase3183261_A
        ClientAdminNavBar clientAdminDashboard = new ClientAdminNavBar(driver);

        //Maximize window
        assertTrue("Unable to maximize the browser window for the test.", clientAdminDashboard.maximizeWindow());

        //Navigate to the Client within Client Admin
        assertTrue("Unable to search for the CID in QuickSearch within ClientAdmin.", clientAdminDashboard.searchForSmokeAutomationRapidCID());
        assertTrue("Unable to press enter in QuickSearch within ClientAdmin.", clientAdminDashboard.pressEnterInQuickSearch());
        assertTrue("Unable to open the QuickSearch result within ClientAdmin.", clientAdminDashboard.openQuickSearchResult());

        //Check the accounts associated to the clientProfile
        ClientAdminClientProfile clientProfile = new ClientAdminClientProfile(driver);
        assertTrue("Unable to switch to newly opened browser tab from selecting the CID in the QuickSearch result.", clientProfile.switchToClientProfileTab());
        assertTrue("Unable to open the 'Accounting Tab' on the Client Profile within Client Admin", clientProfile.openClientAccountingTab());
        assertTrue("Unable to find 'Property Accounts' under the Client's Accounting tab, of the Client Profile in Client Admin", clientProfile.clientPropertyAccountsVisible());
        assertTrue("Unable to find 'Screening Accounts' under the Client's Accounting tab, of the Client Profile in Client Admin.", clientProfile.clientScreeningAccountsVisible());
        assertTrue("Unable to open the 'Screening Accounts' under the Client's Accounting tab, of the Client Profile in Client Admin.", clientProfile.openClientScreeningAccount());
        assertTrue("Unable to open the 'Edit Screening Account' option on the Client's Screening Account, of the Client Profile in Client Admin.", clientProfile.openEditScreeningAccount());
        assertTrue("'Edit Screening Account button' did not open the 'Edit Screening Account Overlay' within the Client Profile in Client Admin.", clientProfile.editScreeningAccountOverlayIsVisible());

    }

    @Test
    public void shouldCheckAllLiveScreeningDataProvidersPresent_whenNavigatingToTheListOfScreeningVendors() {
        //testCase3183261_B
        ClientAdminNavBar caNav = new ClientAdminNavBar(driver);

        //Navigate to the Data Providers Screen
        assertTrue("Unable to move to 'Support Tab' of Client Admin.", caNav.moveToSupportMenu());
        assertTrue("Unable to move to Screening sub menu of the Support dropdown of Client Admin.", caNav.moveToScreeningMenuOfSupport());
        assertTrue("Unable to click 'Data Providers' of Support >> Screening >> Data Providers of Client Admin.", caNav.openScreeningDataProviders());

        //Check live data providers.
        Screening_Data_Providers screeningScreeningDataProviders = new Screening_Data_Providers(driver);
        assertTrue("Unable to open 'Screening Data Providers' on Support/Screening/ScreeningDataProviders.", screeningScreeningDataProviders.openScreeningDataProviders());
        assertTrue("Unable to open 'Live data Providers'", screeningScreeningDataProviders.openLivedataProviders());

        //The following asserts are passing in the name from the test. This is done after discussion with David to be temporary for now and to look into having the method read from a PoJo in the future.
        assertTrue("'Taz-National' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("Taz-National"));
        assertTrue("'Taz-National-County' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("Taz-National-County"));
        assertTrue("'Taz-National-State' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("Taz-National-State"));
        assertTrue("'Taz-Eviction-Tradehouse' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("Taz-Eviction-Tradehouse"));
        assertTrue("'RV-Criminalcat' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("RV-CriminalCat"));
        assertTrue("'RV-Income' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("RV-Income"));
        assertTrue("'Greystar-Eviction' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("Greystar-Eviction"));
        assertTrue("'ExperianCredit' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("ExperianCredit"));
        assertTrue("'ExperianBusinessCredit' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("ExperianBusinessCredit"));
        assertTrue("'ExperianBusinessPremier' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("ExperianBusinessPremier"));
        assertTrue("'JRK-Eviction' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("JRK-Eviction"));
        assertTrue("'Taz-State-Entrata-Review' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("Taz-State-Entrata-Review"));
        assertTrue("'Taz-County-Entrata-Review' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("Taz-County-Entrata-Review"));
        assertTrue("'StateCountyEviction' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("StateCountyEviction"));
        assertTrue("'CriminalAutoCompleteLive' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("CriminalAutoCompleteLive"));
        assertTrue("'Pinnacle-Eviction' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("Pinnacle-Eviction"));
        assertTrue("'Fraud-Detection-Live' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("Fraud-Detection-Live"));
        assertTrue("'RentBureau' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("RentBureau"));
        assertTrue("'CorporateVerification' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("CorporateVerification"));
        assertTrue("'PassportVisaVerification' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("PassportVisaVerification"));
        assertTrue("'Lincoln-Eviction' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("Lincoln-Eviction"));
        assertTrue("'AMLI-Eviction' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("AMLI-Eviction"));
        assertTrue("'DNR' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("DNR"));
        assertTrue("'CoCourt-State' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("CoCourt-State"));
        assertTrue("'Precise-Id-Live' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("Precise-Id-Live"));
        assertTrue("'SOR-ONLY' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("SOR-ONLY"));
        assertTrue("'EquifaxCredit' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("EquifaxCredit"));
        assertTrue("'VOILIVE' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("VOILIVE"));
        assertTrue("'VOILIVEVERSION2' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("VOILIVEVERSION2"));
        assertTrue("'EquifaxCreditReport' is not able to be found on the list of Live Data Providers.", screeningScreeningDataProviders.verifyDataProvider("EquifaxCreditReport"));

    }

}