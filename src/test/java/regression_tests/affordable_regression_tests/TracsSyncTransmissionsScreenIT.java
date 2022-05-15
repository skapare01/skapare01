package regression_tests.affordable_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.tracs_transmissions_subtab.TracsTransmissionsPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TracsSyncTransmissionsScreenIT extends BaseBrowserTest {
    public TracsSyncTransmissionsScreenIT() {
        super("arentrataandcommercials");
    }

    @Test //Test Case ID: #2236879
    public void shouldVerifyTracsSyncTransmissionsUi_whenNavigatingToResidentsTracsSubTabAndClickingSyncTransmissions() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        //click Residents tab on main Dashboard and then Tracs Transmissions sub tab
        assertTrue("Failed to click Residents tab on main dashboard", nav.clickResidentsTab());
        assertTrue("Failed to click Tracs Transmissions sub tab under Residents tab", nav.clickTracsTransmissionsSubTab());

        //Begin verifying TRACS Sync Transmissions UI
        TracsTransmissionsPage tracs = new TracsTransmissionsPage(driver);
        assertTrue("Failed to click Sync Transmissions button on Tracs Transmissions page", tracs.clickSyncButtonTracs());
        assertEquals("Failed to match the Title to 'Sync Transmissions'","Sync Transmissions", tracs.verifySyncTransmissionsWindowTitle());
        assertTrue("Unable to confirm Environment URL dropdown in Sync Transmission window", tracs.verifyEnvironmentUrlDropdown());
        assertTrue("Unable to confirm User ID field in Sync Transmissions window", tracs.verifyUserIdFieldSyncTransmissions());
        assertTrue("Unable to confirm Password field in Sync Transmissions window", tracs.verifyPasswordFieldSyncTransmissions());
        assertTrue("Unable to confirm 'Need Help Logging In' link in Sync Transmissions window", tracs.verifyNeedHelpLoggingInLinkSyncTransmissions());
        assertTrue("Unable to confirm Login button in Sync Transmissions window", tracs.verifyLoginButtonSyncTransmissionsScreen());
        assertTrue("Unable to confirm Cancel link in Sync Transmissions window", tracs.verifyCancelLinkSyncTransmissions());

    }
}
