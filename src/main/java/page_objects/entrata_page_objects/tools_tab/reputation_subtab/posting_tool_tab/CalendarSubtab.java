package page_objects.entrata_page_objects.tools_tab.reputation_subtab.posting_tool_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CalendarSubtab extends BasePage {

    //Constructor
    public CalendarSubtab(WebDriver driver) {
        super(driver);
    }

    //Calendar Sub-tab Locator
    private final By CALENDAR_SUB_TAB_LOCATOR = By.id("social_calendar");

    //To-Do List Sub-tab General Elements and Filters
    private final By CALENDAR_PROPERTY_FILTER = By.cssSelector("div[class='selector social-media js-property-select border-right']");

    //Social Accounts Locators
    private final By CALENDAR_ALL_ACCOUNTS_BUTTON = By.cssSelector("div[data-src='all_social']");
    private final By CALENDAR_FACEBOOK_BUTTON = By.cssSelector("div[data-src='facebook_account']");
    private final By CALENDAR_TWITTER_BUTTON = By.cssSelector("div[data-src='twitter_account']");
    private final By CALENDAR_INSTAGRAM_BUTTON = By.cssSelector("div[data-src='instagram_account']");

    //METHODS
    public boolean selectCalendarSubtabInPostingToolTab() {
        return clickElement(CALENDAR_SUB_TAB_LOCATOR);
    }

    //METHODS
    public boolean findPropertyFilterInCalendarSubTab() {
        return confirmElementIsVisible(CALENDAR_PROPERTY_FILTER);
    }

    public boolean findAllAccountsButtonInCalendarSubTab() {
        return confirmElementIsVisible(CALENDAR_ALL_ACCOUNTS_BUTTON);
    }

    public boolean findFacebookButtonInCalendarSubTab() {
        return confirmElementIsVisible(CALENDAR_FACEBOOK_BUTTON);
    }

    public boolean findTwitterButtonInCalendarSubTab() {
        return confirmElementIsVisible(CALENDAR_TWITTER_BUTTON);
    }

    public boolean findInstagramButtonInCalendarSubTab() {
        return confirmElementIsVisible(CALENDAR_INSTAGRAM_BUTTON);
    }

}
