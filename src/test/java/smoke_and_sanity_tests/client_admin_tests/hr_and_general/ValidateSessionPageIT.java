package smoke_and_sanity_tests.client_admin_tests.hr_and_general;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.trainings_tab.TrainingsSubTabsNavigation;
import page_objects.client_admin_page_objects.trainings_tab.sessions_subtab.ViewSessionsPage;

import static base_tests.SitesEnum.CLIENTADMIN;
import static org.junit.Assert.assertTrue;

public class ValidateSessionPageIT extends BaseBrowserTest {

    public ValidateSessionPageIT() {
        super("clientadmin", CLIENTADMIN, "bparker", "Entrata123");
    }

    @Test //TC: 3201979
    public void shouldValidateSessionsPage_whenNavigatedToSessionsPage() {
        ClientAdminNavBar clientAdminNavBar = new ClientAdminNavBar(driver);
        TrainingsSubTabsNavigation trainingsSubTabsNavigation = new TrainingsSubTabsNavigation(driver);
        ViewSessionsPage viewSessionsPage = new ViewSessionsPage(driver);

        assertTrue("Failed to find Trainings tab", clientAdminNavBar.moveToTrainingTab());
        assertTrue("Failed to click Sessions sub tab.", trainingsSubTabsNavigation.clickSessionsSubTab());
        assertTrue("Failed to find Add Sessions button.", viewSessionsPage.addSessionButtonVisible());
        assertTrue("Failed to find Extended Search button.", viewSessionsPage.extendedSearchButtonVisible());
        assertTrue("Failed to find the View Sessions Form with sessions details.", viewSessionsPage.viewSessionsFormVisible());
        assertTrue("Failed to find Add Trainee button within a sessions row.", viewSessionsPage.addTraineeButtonVisible());
    }
}
