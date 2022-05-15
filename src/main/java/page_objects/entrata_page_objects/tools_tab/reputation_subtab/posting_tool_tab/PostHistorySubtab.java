package page_objects.entrata_page_objects.tools_tab.reputation_subtab.posting_tool_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PostHistorySubtab extends BasePage {

    //Constructor
    public PostHistorySubtab(WebDriver driver) {
        super(driver);
    }

    //Post History Sub-tab Locator
    private final By POST_HISTORY_SUB_TAB_LOCATOR = By.id("social_post_history");

    //To-Do List Sub-tab General Elements and Filters
    private final By POST_HISTORY_PROPERTY_FILTER = By.cssSelector("div[class='selector social-media js-property-select border-right']");

    //Social Accounts Locators
    private final By POST_HISTORY_ALL_ACCOUNTS_BUTTON = By.cssSelector("div[data-src='all_social']");
    private final By POST_HISTORY_FACEBOOK_BUTTON = By.cssSelector("div[data-src='facebook_account']");
    private final By POST_HISTORY_TWITTER_BUTTON = By.cssSelector("div[data-src='twitter_account']");
    private final By POST_HISTORY_INSTAGRAM_BUTTON = By.cssSelector("div[data-src='instagram_account']");

    //Date Range Selector Filter Locators
    private final By POST_HISTORY_FROM_DATE_SELECTOR = By.id("fromDate");
    private final By POST_HISTORY_TO_DATE_SELECTOR = By.id("toDate");
    //Reset Filters Link & Button Locators
    private final By POST_HISTORY_RESET_FILTERS_LINK = By.id("reset_filter");
    private final By POST_HISTORY_FILTER_BUTTON = By.id("apply_filter");

    //METHODS
    public boolean selectPostHistorySubtabInPostingToolTab() {
        return clickElement(POST_HISTORY_SUB_TAB_LOCATOR);
    }

    public boolean findPropertyFilterInPostHistorySubTab() {
        return confirmElementIsVisible(POST_HISTORY_PROPERTY_FILTER);
    }

    public boolean findAllAccountsButtonInPostHistorySubTab() {
        return confirmElementIsVisible(POST_HISTORY_ALL_ACCOUNTS_BUTTON);
    }

    public boolean findFacebookButtonInPostHistorySubTab() {
        return confirmElementIsVisible(POST_HISTORY_FACEBOOK_BUTTON);
    }

    public boolean findTwitterButtonInPostHistorySubTab() {
        return confirmElementIsVisible(POST_HISTORY_TWITTER_BUTTON);
    }

    public boolean findInstagramButtonInPostHistorySubTab() {
        return confirmElementIsVisible(POST_HISTORY_INSTAGRAM_BUTTON);
    }

    public boolean findFromDateSelectorInPostHistorySubTab() {
        return confirmElementIsVisible(POST_HISTORY_FROM_DATE_SELECTOR, waitTimes.LONG_WAIT);
    }

    public boolean findToDateSelectorInPostHistorySubTab() {
        return confirmElementIsVisible(POST_HISTORY_TO_DATE_SELECTOR);
    }

    public boolean findResetFiltersLinkInPostHistorySubTab() {
        return confirmElementIsVisible(POST_HISTORY_RESET_FILTERS_LINK);
    }

    public boolean findFilterButtonInPostHistorySubTab() {
        return confirmElementIsVisible(POST_HISTORY_FILTER_BUTTON);
    }

}
