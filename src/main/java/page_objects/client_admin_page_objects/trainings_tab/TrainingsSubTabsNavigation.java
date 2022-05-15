package page_objects.client_admin_page_objects.trainings_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class TrainingsSubTabsNavigation extends BasePage {
    public TrainingsSubTabsNavigation(WebDriver driver) {
        super(driver);
    }

    private final By SESSIONS_SUB_TAB = By.linkText("Sessions");

    public boolean clickSessionsSubTab() {
        return clickElement(SESSIONS_SUB_TAB);
    }
}
