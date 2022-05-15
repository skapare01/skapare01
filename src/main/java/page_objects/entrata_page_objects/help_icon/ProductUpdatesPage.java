package page_objects.entrata_page_objects.help_icon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ProductUpdatesPage extends BasePage {
    private final By CALENDAR = By.linkText("Calendar");
    private final By COMING_SOON = By.id("coming_soon");
    private final By PAST_UPDATES = By.id("past_updates");
    private final By CONTACT_SUPPORT = By.linkText("Contact Support");

    // coming soon tab
    private final By UPCOMING_RELEASE_DROPDOWN = By.id("load_upcoming_release_notes");

    //Past Updates
    private final By ALL_UPDATES_TAB = By.cssSelector("a[title = 'All Updates']");
    private final By RELEASE_NOTES_SEARCH = By.id("release_notes_quick_search_past_updates");

    public ProductUpdatesPage(WebDriver driver){
        super(driver);
    }

    public boolean clickCalendar(){return clickElement(CALENDAR);}
    public boolean clickComingSoon(){return clickElement(COMING_SOON);}
    public boolean clickPastUpdates(){return clickElement(PAST_UPDATES);}
    public boolean clickContactSupport(){return clickElement(CONTACT_SUPPORT);}

    //coming soon tab
    public boolean findUpcomingReleaseDropdown(){return confirmElementIsVisible(UPCOMING_RELEASE_DROPDOWN);}

    //past updates
    public boolean findAllUpdatesTab(){return confirmElementIsVisible(ALL_UPDATES_TAB);}
    public boolean findReleaseNotesSearch(){return confirmElementIsVisible(RELEASE_NOTES_SEARCH);}



}
