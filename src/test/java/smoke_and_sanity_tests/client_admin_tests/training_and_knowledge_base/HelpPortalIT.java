package smoke_and_sanity_tests.client_admin_tests.training_and_knowledge_base;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.quick_menu.help_portal.HelpPortalPage;

import static org.junit.Assert.*;

public class HelpPortalIT extends BaseBrowserTest {
    public HelpPortalIT(){
        super("clientadmin", SitesEnum.CLIENTADMIN,"bparker","Entrata123");}

    @Test
    public void shouldNavigatetoHelpPortalRedBarSections_whenPermissionedUserLoggedIn(){
        ClientAdminNavBar clientAdminNavBar = new ClientAdminNavBar(driver);
        assertTrue("unable to find quick menu",clientAdminNavBar.moveToQuickMenu());
        assertTrue("unable to click help portal",clientAdminNavBar.clickHelpPortal());
        HelpPortalPage helpPortalPage = new HelpPortalPage(driver);
        assertTrue("unable to click user guides", helpPortalPage.clickUserGuides());
        assertTrue("unable to expand first guide section", helpPortalPage.clickFirstArrow());
        assertTrue("unable to find view button", helpPortalPage.confirmViewButtonVisible());
        assertTrue("unable to click close window",helpPortalPage.clickCloseWindow());
        assertTrue("unable to click training videos",helpPortalPage.clickTrainingVideos());
        assertTrue("unable to click first expansion arrow", helpPortalPage.clickArrow());
        assertTrue("unable to find view button",helpPortalPage.confirmViewButtonVisible());
        assertTrue("unable to click close window",helpPortalPage.clickCloseWindow());
        assertTrue("unable to click training courses",helpPortalPage.clickTrainingCourses());
        assertTrue("unable to click first expansion arrow", helpPortalPage.clickArrow());
        assertTrue("unable to find view button",helpPortalPage.confirmViewButtonVisible());
        assertTrue("unable to click close window",helpPortalPage.clickCloseWindow());
    }
}
