package smoke_and_sanity_tests.client_admin_tests.hr_and_general;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.dashboard_tab.training_sessions_subtab.AddSessionPage;
import page_objects.client_admin_page_objects.dashboard_tab.training_sessions_subtab.ViewSessionsPage;

import static org.junit.Assert.assertTrue;

public class AddTrainingSessionIT extends BaseBrowserTest {

    public AddTrainingSessionIT() {
        super("clientadmin", SitesEnum.CLIENTADMIN, "salurkar", "Xento123");
    }

    @Test
    public void shouldAddTrainingSession_whenAllFieldsAreCompleted() {
        ClientAdminNavBar clientAdminNavBar = new ClientAdminNavBar(driver);
        ViewSessionsPage viewSessionsPage = new ViewSessionsPage(driver);
        AddSessionPage addSessionPage = new AddSessionPage(driver);

        assertTrue("Could not click Training Sessions subtab.", clientAdminNavBar.trainingSessionsSubtabClick());
        assertTrue("Could not click Add Session button.", viewSessionsPage.addTrainingSessionButtonClick());
        assertTrue("Could not input Session Name.", addSessionPage.sessionNameInput("Test Session"));
        assertTrue("Could not input Description.", addSessionPage.sessionDescriptionInput("This is a test description."));
        assertTrue("Could not select Training Type.", addSessionPage.selectTrainingType("42"));
        assertTrue("Could not select Country.", addSessionPage.selectTrainingCountry("IN"));
        assertTrue("Could not select Trainer Type.", addSessionPage.selectTrainerType("new"));
        assertTrue("Could not select a Trainer.", addSessionPage.selectTrainer(1));
        assertTrue("Could not click Scheduled Date box.", addSessionPage.scheduledDateClick());
        assertTrue("Could not click the Today tab in the date box.", addSessionPage.scheduledDateTodayButtonClick());
        assertTrue("Could not select Scheduled Start Time Hour.", addSessionPage.selectScheduledStartingHour("2"));
        assertTrue("Could not select Scheduled Start Time Minute.", addSessionPage.selectScheduledStartingMinute("30"));
        assertTrue("Could not select Scheduled End Time Hour.", addSessionPage.selectScheduledEndingHour("5"));
        assertTrue("Could not select Scheduled End Time Minute.", addSessionPage.selectScheduledEndingMinutes("20"));
        assertTrue("Could not move to Training Location dropdown.", addSessionPage.moveToTrainingLocation());
        assertTrue("Could not select Training Location dropdown.", addSessionPage.selectTrainingLocation());
        assertTrue("Could not select Training Location option.", addSessionPage.selectTrainingLocationOption());
        assertTrue("Could not input Available Seats.", addSessionPage.availableSeatsInput("42"));
        assertTrue("Could not click Is Feedback checkbox.", addSessionPage.isFeedbackCheckboxClick());
        assertTrue("Could not select Survey Type.", addSessionPage.selectFeedbackSurveyType("42"));
        assertTrue("Could not click Is Private checkbox.", addSessionPage.isPrivateCheckboxClick());
        assertTrue("Could not click Submit button.", addSessionPage.submitTrainingSessionButtonClick());
    }
}
