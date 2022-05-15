package page_objects.client_admin_page_objects.dashboard_tab.training_sessions_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ViewSessionsPage extends BasePage {

    public ViewSessionsPage(WebDriver driver) {
        super(driver);
    }

    private final By ADD_TRAINING_SESSION_BUTTON = By.cssSelector("a[onclick*='create_or_edit_training_session']");

    public boolean addTrainingSessionButtonClick() {
        return clickElement(ADD_TRAINING_SESSION_BUTTON);
    }
}
