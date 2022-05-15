package smoke_and_sanity_tests.entrata_paas_tests;
import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.clients_tab.clients_subtab.ClientAdminClientProfile;

import static junit.framework.Assert.assertTrue;

public class ShouldCheckHelpSupportBoxWhenHelpSupportBoxIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckHelpSupportBoxWhenHelpSupportBoxIsSelectedIT() {
        super("KHansen");
    }

    @Test
    public void ShouldCheckHelpSupportBoxWhenHelpSupportBoxIsSelected() {
        ClientAdminClientProfile clientProfile = new ClientAdminClientProfile(driver);
        assertTrue("Unable to locate/select 'Help/Support' box in upper right corner of client screen.", clientProfile.clickHelpSupportQuestionMarkBox());
        assertTrue("Unable to locate/select 'General Help' option.", clientProfile.selectGeneralHelp());
    }
}
