package smoke_and_sanity_tests.client_admin_tests.training_and_knowledge_base;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.trainings_tab.content_audit_subtab.ContentAuditDashboardPage;
import page_objects.client_admin_page_objects.trainings_tab.content_audit_subtab.ContentAuditSettings;

import static org.junit.Assert.assertTrue;
public class ContentAuditIT extends BaseBrowserTest {
    public ContentAuditIT(){
        super("clientadmin", SitesEnum.CLIENTADMIN,"rjensen","Entrata123");
    }

    @Test
    public void shouldNavigatetoContentAuditPageAndCheckTabs_whenPermissionedUserLoggedIn(){
        ClientAdminNavBar clientAdminNavBar = new ClientAdminNavBar(driver);
        assertTrue("Unable to hover over Client Admin training tab.",clientAdminNavBar.moveToTrainingTab());
        assertTrue("Unable to click content audit dashboard subtab.",clientAdminNavBar.clickContentAuditDash());
        ContentAuditDashboardPage contentAuditDashPage = new ContentAuditDashboardPage(driver);
        assertTrue("Unable to click video review tab.",contentAuditDashPage.clickVideosReviewTab());
        assertTrue("Unable to click video tab.",contentAuditDashPage.clickVideosTab());
        assertTrue("Unable to click articles tab.", contentAuditDashPage.clickArticlesTab());
        assertTrue("Unable to click language tab.",contentAuditDashPage.clickLanguageTab());
        assertTrue("Unable to click summary page.",contentAuditDashPage.clickSummaryTab());
        assertTrue("Unable to click courses tab.",contentAuditDashPage.clickCoursesTab());
        assertTrue("Unable to click search bar on left side filter.", contentAuditDashPage.clickSearchBar());
        assertTrue("Unable to click content audit settings button.",contentAuditDashPage.clickSettingsButton());
    }
    @Test
    public void shouldCheckAbilityToEditUserGuideAuditDetails_whenPermissionedUserLoggedIn(){
        ClientAdminNavBar clientAdminNavBar = new ClientAdminNavBar(driver);
        assertTrue("Unable to hover over Client Admin training tab.",clientAdminNavBar.moveToTrainingTab());
        assertTrue("Unable to click content audit dashboard subtab.",clientAdminNavBar.clickContentAuditDash());
        ContentAuditDashboardPage contentAuditDashPage = new ContentAuditDashboardPage(driver);
        assertTrue("Unable to click content audit settings button.",contentAuditDashPage.clickSettingsButton());
        ContentAuditSettings settings = new ContentAuditSettings(driver);
        assertTrue("Unable to click training audit settings guide tab.", settings.clickGuideTab());
        assertTrue("Unable to click edit icon for first displaying user guide.",settings.clickFirstEditButton());
        assertTrue("Cannot enter audit date month after clicking edit icon.",settings.enterMonth("3"));
        assertTrue("Cannot enter audit date day after clicking edit icon.",settings.enterDay("10"));
        assertTrue("Cannot enter audit date year after clicking edit icon.",settings.enterYear("2022"));
        assertTrue("Unable to select adjust frequency value after clicking edit icon.", settings.selectFrequency("120"));
        assertTrue("Unable to click assigned dropdown in edit audit section.",settings.clickAssignedDropdown());
        assertTrue("Unable to click first option in assigned dropdown of edit audit sections.",settings.clickAssignedFirstOption());
        assertTrue("Unable to click on save button in edit audit section of guide tab.",settings.clickSaveButton());

    }
}
