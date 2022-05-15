package smoke_and_sanity_tests.client_admin_tests.lms_training_knowledge_base_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.quick_menu.help_portal.HelpPortalPage;

import static org.junit.Assert.assertTrue;

public class ValidateFunctionalityOfTrainingCoursesAndVideosIT extends BaseBrowserTest {

    public ValidateFunctionalityOfTrainingCoursesAndVideosIT() {
        super("clientadmin", SitesEnum.CLIENTADMIN, "rjensen", "Entrata123");
    }

    @Test
    public void shouldValidateTrainingCourses_whenAccessedThroughQuickMenu() {
        ClientAdminNavBar nav = new ClientAdminNavBar(driver);
        assertTrue("Could not find the quick menu dropdown menu", nav.moveToQuickMenu());
        assertTrue("Could not find the help portal menu item on the quick menu", nav.clickHelpPortal());

        HelpPortalPage hpPage = new HelpPortalPage(driver);
        assertTrue("Could not find the newly opened tab for the help portal dashboard", hpPage.switchToRecentlyOpenedTab());
        assertTrue("Could not find the AP Payments topic link", hpPage.clickAPPaymentsTopicLink());
        assertTrue("Could not find the Approving Invoices for Payment article link", hpPage.clickApprovingInvoicesForPaymentArticleLink());
        assertTrue("Could not find the Watch Video button on the Accounting AP user guide", hpPage.clickAccountingAPUserGuideWatchVideoButton());
        assertTrue("Could not find the close button on the Approving Invoices video", hpPage.clickApprovingInvoicesVideoCloseButton());
        assertTrue("Could not find the Training Course button on the Accounting AP user guide", hpPage.clickAccountingAPTrainingCourseButton());
        assertTrue("Could not find the close button for the Accounting AP training courses", hpPage.clickAccountingAPTrainingCoursesCloseButton());
    }
}
