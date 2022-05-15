package page_objects.entrata_page_objects.tools_tab.reputation_subtab.posting_tool_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SocialAccountsSubtab extends BasePage {

    //Constructor
    public SocialAccountsSubtab(WebDriver driver) {
        super(driver);
    }

    //Social Accounts Sub-tab Locator
    private final By SOCIAL_ACCOUNTS_SUB_TAB_LOCATOR = By.id("social_accounts");

    //To-Do List Sub-tab General Elements and Filters
    private final By SOCIAL_ACCOUNTS_PROPERTY_FILTER = By.cssSelector("div[class='selector social-media js-property-select border-right']");

    //Social Accounts Locators
    private final By SOCIAL_ACCOUNTS_ALL_ACCOUNTS_BUTTON = By.cssSelector("div[data-src='all_social']");
    private final By SOCIAL_ACCOUNTS_FACEBOOK_BUTTON = By.cssSelector("div[data-src='facebook_account']");
    private final By SOCIAL_ACCOUNTS_TWITTER_BUTTON = By.cssSelector("div[data-src='twitter_account']");
    private final By SOCIAL_ACCOUNTS_INSTAGRAM_BUTTON = By.cssSelector("div[data-src='instagram_account']");

    //METHODS
    public boolean selectSocialAccountsSubtabInPostingToolTab() {
        return clickElement(SOCIAL_ACCOUNTS_SUB_TAB_LOCATOR);
    }

    public boolean findPropertyFilterInSocialAccountsSubTab() {
        return confirmElementIsVisible(SOCIAL_ACCOUNTS_PROPERTY_FILTER);
    }

    public boolean findAllAccountsButtonInSocialAccountsSubTab() {
        return confirmElementIsVisible(SOCIAL_ACCOUNTS_ALL_ACCOUNTS_BUTTON);
    }

    public boolean findFacebookButtonInSocialAccountsSubTab() {
        return confirmElementIsVisible(SOCIAL_ACCOUNTS_FACEBOOK_BUTTON);
    }

    public boolean findTwitterButtonInSocialAccountsSubTab() {
        return confirmElementIsVisible(SOCIAL_ACCOUNTS_TWITTER_BUTTON);
    }

    public boolean findInstagramButtonInSocialAccountsSubTab() {
        return confirmElementIsVisible(SOCIAL_ACCOUNTS_INSTAGRAM_BUTTON);
    }

}
