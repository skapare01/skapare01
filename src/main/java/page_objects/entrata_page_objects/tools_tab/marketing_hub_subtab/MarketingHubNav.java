package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MarketingHubNav extends BasePage {

    //Constructor
    public MarketingHubNav(WebDriver driver) {
        super(driver);
    }

    //Marketing Hub Tab Navigation
    private final By MARKETING_HUB_DASHBOARD_TAB_LOCATOR = By.id("marketing_hub_dashboardxxx");
    private final By CRAIGSLIST_ADS_TAB_LOCATOR = By.id("craigslistxxx");
    private final By FACEBOOK_TAB_LOCATOR = By.id("facebookxxx");
    private final By GOOGLE_TAB_LOCATOR = By.id("googlexxx");
    private final By ILS_PORTAL_TAB_LOCATOR = By.id("ils_directory_newxxx");
    private final By YEXT_TAB_LOCATOR = By.id("yextxxx");

    //Marketing Hub Navigation Methods
    public boolean clickMarketingHubDashboardTab() {
        return clickElement(MARKETING_HUB_DASHBOARD_TAB_LOCATOR);
    }

    public boolean clickCraigslistTab() {
        return clickElement(CRAIGSLIST_ADS_TAB_LOCATOR);
    }

    public boolean clickFacebookTab() {
        return clickElement(FACEBOOK_TAB_LOCATOR);
    }

    public boolean clickGoogleTab() {
        return clickElement(GOOGLE_TAB_LOCATOR);
    }

    public boolean clickILSPortalTab() {
        return clickElement(ILS_PORTAL_TAB_LOCATOR);
    }

    public boolean clickYextTab() {
        return clickElement(YEXT_TAB_LOCATOR);
    }

}
