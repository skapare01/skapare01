package smoke_and_sanity_tests.marketing_hub_tests.ils_portal_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.support_tab.ils_portal_subtab.ILSSetupPage;

import static base_tests.SitesEnum.CLIENTADMIN;
import static org.junit.Assert.assertTrue;

public class ILSPortalSetupTabGeneralVerificationInClientAdminIT extends BaseBrowserTest {

    public ILSPortalSetupTabGeneralVerificationInClientAdminIT() {
        super("clientadmin", CLIENTADMIN, "bbrogdon", "Xento123");
    }

    //Manual Test ID 2570588

    @Test
    public void shouldDisplayClientAdminILSSetupTabUI_whenUserNavigatesToTab() {
        ClientAdminNavBar caNav = new ClientAdminNavBar(driver);
        //Navigate to ILS Setup Tab in Client Admin
        assertTrue("Failed to locate and hover over 'Support' tab in Client Admin.",
                caNav.moveToSupportMenu());
        assertTrue("Failed to locate and select 'ILS Portal' Sub-tab in Client Admin.",
                caNav.selectILSPortalSubtab());

        ILSSetupPage iLSSetupTab = new ILSSetupPage(driver);
        //Verification of 'ILS Setup' tab opening
        assertTrue("Failed to verify that 'ILS Setup' tab opened by default when selecting 'ILS Portal' tab.",
                iLSSetupTab.confirmPageLandedOnILSSetupTab());
        //Verification of 'ILS Setup' tab Column Headers
        assertTrue("Failed to find 'ILS ID' column header in 'ILS Setup' tab.",
                iLSSetupTab.findILSIDColumnHeader_ILSSetup());
        assertTrue("Failed to find 'ILS Name' column header in 'ILS Setup' tab.",
                iLSSetupTab.findILSNameColumnHeader_ILSSetup());
        assertTrue("Failed to find 'Directory Name' column header in 'ILS Setup' tab.",
                iLSSetupTab.findDirectoryIDColumnHeader_ILSSetup());
        assertTrue("Failed to find 'Service Restrictions' column header in 'ILS Setup' tab.",
                iLSSetupTab.findServiceRestrictionsColumnHeader_ILSSetup());
        assertTrue("Failed to find 'Is Published' column header in 'ILS Setup' tab.",
                iLSSetupTab.findIsPublishedColumnHeader_ILSSetup());
        assertTrue("Failed to find 'Is Enabled' column header in 'ILS Setup' tab.",
                iLSSetupTab.findIsEnabledColumnHeader_ILSSetup());
        assertTrue("Failed to find 'Last Updated' column header in 'ILS Setup' tab.",
                iLSSetupTab.findLastUpdatedColumnHeader_ILSSetup());
    }
}
