package page_objects.entrata_page_objects.dashboard_tab.entrata_sidebar_calendar_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class EntrataSideBarCalendar extends BasePage {
    public EntrataSideBarCalendar(WebDriver driver) {
        super(driver);
    }

    private final By FULL_CALENDAR_VIEW = By.id("full-calendar");

    public boolean calendarLandingPage() {
        return confirmElementIsVisible(FULL_CALENDAR_VIEW);
    }
}
