package page_objects.client_admin_page_objects.dashboard_tab.training_sessions_subtab;

import org.bouncycastle.jcajce.provider.symmetric.DES;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AddSessionPage extends BasePage {

    public AddSessionPage(WebDriver driver) {
        super(driver);
    }

    private final By SESSION_NAME = By.name("training_session[name]");
    private final By SESSION_DESCRIPTION = By.name("training_session[description]");
    private final By SELECT_TRAINING = By.id("Training");
    private final By SESSION_COUNTRY = By.id("country");
    private final By SELECT_TRAINER_TYPE = By.id("trainer_type");
    private final By SELECT_TRAINER = By.name("training_session[training_trainer_association_id]");
    private final By SCHEDULED_DATE = By.id("datepicker");
    private final By SCHEDULED_DATE_TODAY_BUTTON = By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/button[1]");
    private final By SCHEDULED_STARTING_HOUR = By.id("starting_hours");
    private final By SCHEDULED_STARTING_MINUTES = By.name("training_session[starting_minuts]");
    private final By SCHEDULED_ENDING_HOURS = By.name("training_session[ending_hours]");
    private final By SCHEDULED_ENDING_MINUTES = By.name("training_session[ending_minuts]");
    private final By TRAINING_LOCATION = By.id("selected_training_location_name");
    private final By TRAINING_LOCATION_OPTION = By.xpath("//*[@id=\"training_training_location\"]/li[3]");
    private final By AVAILABLE_SEATS = By.id("available_seats");
    private final By IS_FEEDBACK_CHECKBOX = By.id("is_feedback");
    private final By FEEDBACK_SURVEY = By.id("feedback_surveys");
    private final By IS_PRIVATE_CHECKBOX = By.id("is_private");
    private final By SUBMIT_TRAINING_SESSION_BUTTON = By.cssSelector("input[onclick*='TrainingModule.confirmSubmit']");
    private final By ADD_SESSION_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    public boolean sessionNameInput(String name) {
        return sendKeysToElement(SESSION_NAME, name);
    }

    public boolean sessionDescriptionInput(String description) {
        return sendKeysToElement(SESSION_DESCRIPTION, description);
    }

    public boolean selectTrainingType(String value) {
        return selectElementByValue(SELECT_TRAINING, value);
    }

    public boolean selectTrainingCountry(String value) {
        return selectElementByValue(SESSION_COUNTRY, value);
    }

    public boolean selectTrainerType(String value) {
        return selectElementByValue(SELECT_TRAINER_TYPE, value);
    }

    public boolean selectTrainer(int index) {
        addSessionOverlayWait();
        return selectElementByIndex(SELECT_TRAINER, index);
    }

    public boolean scheduledDateClick() {
        return clickElement(SCHEDULED_DATE);
    }

    public boolean scheduledDateTodayButtonClick() {
        return clickElement(SCHEDULED_DATE_TODAY_BUTTON);
    }

    public boolean selectScheduledStartingHour(String value) {
        return selectElementByValue(SCHEDULED_STARTING_HOUR, value);
    }

    public boolean selectScheduledStartingMinute(String value) {
        return selectElementByValue(SCHEDULED_STARTING_MINUTES, value);
    }

    public boolean selectScheduledEndingHour(String value) {
        return selectElementByValue(SCHEDULED_ENDING_HOURS, value);
    }

    public boolean selectScheduledEndingMinutes(String value) {
        return selectElementByValue(SCHEDULED_ENDING_MINUTES, value);
    }

    public boolean moveToTrainingLocation() {
        return moveToAnElementWithActions(SUBMIT_TRAINING_SESSION_BUTTON);
    }

    public boolean selectTrainingLocation() {
        return clickElement(TRAINING_LOCATION);
    }

    public boolean selectTrainingLocationOption() {
        return clickElement(TRAINING_LOCATION_OPTION);
    }

    public boolean availableSeatsInput(String input) {
        return sendKeysToElement(AVAILABLE_SEATS, input);
    }

    public boolean isFeedbackCheckboxClick() {
        return clickElement(IS_FEEDBACK_CHECKBOX);
    }

    public boolean selectFeedbackSurveyType(String value) {
        return selectElementByValue(FEEDBACK_SURVEY, value);
    }

    public boolean isPrivateCheckboxClick() {
        return clickElement(IS_PRIVATE_CHECKBOX);
    }

    public boolean submitTrainingSessionButtonClick() {
        return clickElement(SUBMIT_TRAINING_SESSION_BUTTON);
    }

    public void addSessionOverlayWait() {
        waitForOverlay(ADD_SESSION_OVERLAY, waitTimes.LONG_WAIT);
    }
}
