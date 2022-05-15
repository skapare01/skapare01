package smoke_and_sanity_tests.resident_utility_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.clients_tab.clients_subtab.ClientsNavBar;
import page_objects.client_admin_page_objects.clients_tab.clients_subtab.client_utility_settings.*;

import static org.junit.Assert.assertTrue;
import static base_tests.SitesEnum.CLIENTADMIN;

public class VerifyClientUtilitySettingsIT extends BaseBrowserTest {

    public VerifyClientUtilitySettingsIT() {
        super("clientadmin", CLIENTADMIN, "dkamle", "Xento123");
    }

    @Test

    public void verifyRUClientSettingsInClientAdmin_whenTabOpened() {
        ClientAdminNavBar clientAdminNavBar = new ClientAdminNavBar(driver);

        //Navigate to Avantic Residential client profile.
        assertTrue("Unable to search for the CID \"13576\" in the ClientAdmin QuickSearch bar.", clientAdminNavBar.searchForAvanticResidentialCID());
        assertTrue("Unable to press \"Enter\" in the ClientAdmin>QuickSearch.", clientAdminNavBar.pressEnterInQuickSearch());
        assertTrue("Unable to open the QuickSearch result (Avantic) within ClientAdmin.", clientAdminNavBar.openQuickSearchResult());
        assertTrue("Unable to switch to the newly created tab for the Avantic ClientAdmin profile.", clientAdminNavBar.switchToRecentlyOpenedTab());

        //Open Client Utilities Tab
        ClientsNavBar clientsNavBar = new ClientsNavBar(driver);
        assertTrue("Unable to open the \"Utilities\" tab on the Client Profile.", clientsNavBar.openClientUtilitiesTab());

        //Open each of the Utilities sub tab and verify that they loaded appropriately.
        ClientUtilitySettingsNavBar utilitySettingsNavBar = new ClientUtilitySettingsNavBar(driver);
        assertTrue("Unable to open Client Utility Settings Dashboard.", utilitySettingsNavBar.openDashboard());
        ClientUtilityDashboardSettings utilitySettingsDashboard = new ClientUtilityDashboardSettings(driver);
        assertTrue("Client Utility Settings \"Dashboard\" tab did not open properly.", utilitySettingsDashboard.confirmCommoditiesIsVisible());

        assertTrue("Unable to open Client Utility Settings \"Residents\" tab.", utilitySettingsNavBar.openResidents());
        ClientUtilitySettingsResidentsTab utilitySettingsResidents = new ClientUtilitySettingsResidentsTab(driver);
        assertTrue("Client Utility Settings Residents did not load properly.", utilitySettingsResidents.confirmNameSearchIsVisible());

        assertTrue("Unable to open Client Utility Settings \"Bill Accounts\" tab.", utilitySettingsNavBar.openBillAccounts());
        ClientUtilitySettingsBillAccountsTab utilitySettingsBillAccounts = new ClientUtilitySettingsBillAccountsTab(driver);
        assertTrue("Client Utility Settings \"Bill Accounts\" tab did not load properly.", utilitySettingsBillAccounts.confirmAccountSearchIsVisible());

        assertTrue("Unable to open Client Utility Settings \"Bills\" tab.", utilitySettingsNavBar.openBills());
        ClientUtilitySettingsBillsTab utilitySettingsBills = new ClientUtilitySettingsBillsTab(driver);
        assertTrue("Client Utility Settings \"Bills\" tab did not load properly.", utilitySettingsBills.confirmAccountSearchIsVisible());

        assertTrue("Unable to open Client Utility Settings \"Bill Audits\" tab.", utilitySettingsNavBar.openBillAudits());
        ClientUtilitySettingsBillAuditsTab utilitySettingsBillAudits = new ClientUtilitySettingsBillAuditsTab(driver);
        assertTrue("Client Utility Settings \"Bill Audits\" tab did not load properly.", utilitySettingsBillAudits.confirmAuditEmailQueueIsVisible());

        assertTrue("Unable to open Client Utility Settings \"Batches\" tab.", utilitySettingsNavBar.openBatches());
        ClientUtilitySettingsBatchesTab utilitySettingsBatches = new ClientUtilitySettingsBatchesTab(driver);
        assertTrue("Client Utility Settings \"Batches\" tab did not load properly.", utilitySettingsBatches.confirmPropertyBatchesTableIsVisible());

        assertTrue("Unable to open Client Utility Settings \"Meters\" tab.", utilitySettingsNavBar.openMeters());
        ClientUtilitySettingsMetersTab utilitySettingsMeters = new ClientUtilitySettingsMetersTab(driver);
        assertTrue("Client Utility Settings \"Meters\" tab did not load properly.", utilitySettingsMeters.confirmPropertyMetersTableIsVisible());

        assertTrue("Unable to open Client Utility Settings \"Transmissions\" tab.", utilitySettingsNavBar.openTransmissions());
        ClientUtilitySettingsTransmissionsTab utilitySettingsTransmissions = new ClientUtilitySettingsTransmissionsTab(driver);
        assertTrue("Client Utility Settings \"Transmissions\" tab did not load properly.", utilitySettingsTransmissions.confirmUtilityTransmissionsTableIsVisible());

        assertTrue("Unable to open the Client Utility Settings \"Property Units\" tab.", utilitySettingsNavBar.openPropertyUnits());
        ClientUtilitySettingsPropertyUnitsTab utilitySettingsPropertyUnits = new ClientUtilitySettingsPropertyUnitsTab(driver);
        assertTrue("Client Utility Settings \"Property Units\" tab did not load properly.", utilitySettingsPropertyUnits.confirmPropertyUnitsTableIsVisible());

        assertTrue("Unable to open the Client Utility Settings \"Utility Logs\" tab", utilitySettingsNavBar.openUtilityLogs());
        ClientUtilitySettingsUtilityLogsTab utilitySettingsUtilityLogs = new ClientUtilitySettingsUtilityLogsTab(driver);
        assertTrue("Client Utility Settings \"Utility Logs\" did not load properly.", utilitySettingsUtilityLogs.confirmPropertyUtilityLogsTableIsVisible());

        assertTrue("Unable to open the Client Utility Settings \"Settings\" tab.", utilitySettingsNavBar.openSettings());
        ClientUtilitySettingsSettingsTab utilitySettingsSettingsTab = new ClientUtilitySettingsSettingsTab(driver);
        assertTrue("Client Utility Settings \"Settings\" tab did not load properly.", utilitySettingsSettingsTab.confirmPropertySettingsBillingIsVisible());

        assertTrue("Unable to open Client Utility Settings \"Utility Logs\" tab", utilitySettingsNavBar.openUtilityLogs());
        assertTrue("Unable to open the Client Utility Settings \"Energy Star\" tab.", utilitySettingsNavBar.openEnergyStarTab());
        ClientUtilitySettingsEnergyStarTab utilitySettingsEnergyStar = new ClientUtilitySettingsEnergyStarTab(driver);
        assertTrue("Client Utility Settings \"Energy Star\" did not load properly.", utilitySettingsEnergyStar.confirmImportToEnergyStarContainerIsVisible());

    }

}