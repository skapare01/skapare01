package page_objects.client_admin_page_objects.trainings_tab.sessions_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ViewSessionsPage extends BasePage {

    public ViewSessionsPage(WebDriver driver) {
        super(driver);
    }

    private final By ADD_SESSION_BUTTON = By.cssSelector("a[onclick*='create_or_edit_training_session']");
    private final By EXTENDED_SEARCH_BUTTON = By.cssSelector("a[onclick*='Extended Search']");
    private final By VIEW_SESSIONS_FORM = By.id("frm_session");
    private final By ADD_TRAINEE_BUTTON = By.cssSelector("i[onclick*='ShowManageTrainees']");

    public boolean addSessionButtonVisible() {
        return confirmElementIsVisible(ADD_SESSION_BUTTON);
    }

    public boolean extendedSearchButtonVisible() {
        return confirmElementIsVisible(EXTENDED_SEARCH_BUTTON);
    }

    public boolean viewSessionsFormVisible() {
        return confirmElementIsVisible(VIEW_SESSIONS_FORM);
    }

    public boolean addTraineeButtonVisible() {
        return confirmElementIsVisible(ADD_TRAINEE_BUTTON);
    }
}
