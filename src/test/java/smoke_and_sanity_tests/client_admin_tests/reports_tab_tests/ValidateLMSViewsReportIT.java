package smoke_and_sanity_tests.client_admin_tests.reports_tab_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.reports_tab.legacy_reports_subtab.LegacyReportsPage;
import page_objects.client_admin_page_objects.reports_tab.legacy_reports_subtab.training_reports_subtab.LMSViewsReportPage;
import static org.junit.Assert.assertTrue;

public class ValidateLMSViewsReportIT extends BaseBrowserTest {

    public ValidateLMSViewsReportIT() {
        super("clientadmin", SitesEnum.CLIENTADMIN, "salurkar", "Entrata123");
    }

    @Test
    public void shouldValidateLMSReport_whenReportRunWithFilters() {
        ClientAdminNavBar nav = new ClientAdminNavBar(driver);
        LegacyReportsPage legacyReportsPage = new LegacyReportsPage(driver);
        LMSViewsReportPage lmsReportsPage = new LMSViewsReportPage(driver);

        assertTrue("Could not find the reports tab", nav.moveToReportsTab());
        assertTrue("Could not find the legacy reports menu item", nav.moveToLegacyReportsMenuItem());
        assertTrue("Could not find the training reports sub menu item", nav.clickTrainingReportsSubMenuItem());
        assertTrue("Could not find the lms views report link", legacyReportsPage.clickLMSViewsReport());
        assertTrue("Could not switch to the lms views report tab", nav.switchToRecentlyOpenedTab());
        assertTrue("Could not find the help resource details radio button", lmsReportsPage.clickHelpResourceDetailsRadioButton());
        assertTrue("Could not find the content type multiselect", lmsReportsPage.clickContentTypeMultiselect());
        assertTrue("Could not find the select all content types option", lmsReportsPage.clickSelectAllContentTypeMultiselect());
        assertTrue("Could not find the clients multiselect", lmsReportsPage.clickClientsMultiselect());
        assertTrue("Could not find the select all clients option", lmsReportsPage.clickSelectAllClientsMultiselect());
        assertTrue("Could not find the status multiselect", lmsReportsPage.clickStatusMultiselect());
        assertTrue("Could not find the published status option", lmsReportsPage.clickStatusMultiselectPublishedOption());
        assertTrue("Could not find the from date picker", lmsReportsPage.clickFromDatePicker());
        assertTrue("Could not find the action multiselect", lmsReportsPage.clickActionMultiselect());
        assertTrue("Could not find the added action option", lmsReportsPage.clickActionMultiselectAddedOption());
        assertTrue("Could not find the submit button", lmsReportsPage.clickSubmitButton());
        assertTrue("Could not find the lms views report table", lmsReportsPage.verifyLMSViewsReportTableIsVisible());
    }
}
