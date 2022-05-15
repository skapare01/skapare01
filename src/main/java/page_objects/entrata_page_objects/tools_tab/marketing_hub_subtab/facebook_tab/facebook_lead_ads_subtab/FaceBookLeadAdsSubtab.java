package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.facebook_tab.facebook_lead_ads_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FaceBookLeadAdsSubtab extends BasePage {

    //Facebook Lead Ads General Locators
    private final By LEAD_ADS_SUB_TAB_LOCATOR = By.id("facebook_lead_adsxxx");
    private final By LEAD_ADS_OVERLAY_LOCATOR = By.cssSelector("div[class='loading-overlay bg-img-medium']");
    private final By LEAD_ADS_LOGO_LOCATOR = By.cssSelector("img[src='/images/_common/fb_leadads_logo.png']");
    private final By LEAD_ADS_PROPERTY_SEARCH_BOX = By.id("fla-search-property");

    //Facebook Lead Ads Filter Locators
    private final By LEAD_ADS_ACTIVE_FILTER = By.cssSelector("li[data-filter='active']");
    private final By LEAD_ADS_ALL_FILTER = By.cssSelector("li[data-filter='all']");
    private final By LEAD_ADS_DISABLED_FILTER = By.cssSelector("li[data-filter='disabled']");
    private final By LEAD_ADS_ALL_DEFAULT_SELECTED_LOCATOR = By.xpath("//li[contains(text(),'All') and @class='js-filter-status js-filter-ils selected binded']");

    //Facebook Lead Ads Column Header Locators
    private final By LEAD_ADS_PROPERTY_COLUMN_HEADER = By.xpath("//th[text()='Property']");
    private final By LEAD_ADS_LOCATION_COLUMN_HEADER = By.xpath("//th[text()='Location']");
    private final By LEAD_ADS_STATUS_COLUMN_HEADER = By.xpath("//th[text()='Status']");
    private final By LEAD_ADS_SUBSCRIPTION_LOGS_COLUMN_HEADER = By.xpath("//th[text()='Subscription Logs']");

    //Constructor
    public FaceBookLeadAdsSubtab(WebDriver driver) {
        super(driver);
    }

    //Methods
    public boolean selectLeadAdsSubTabInFacebookLeadAds() {
        return clickElement(LEAD_ADS_SUB_TAB_LOCATOR);
    }

    public boolean findLeadAdsLogoInFacebookLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_LOGO_LOCATOR);
    }

    public boolean findPropertySearchFilterInFacebookLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_PROPERTY_SEARCH_BOX);
    }

    //FBLA Filter Methods
    public boolean findActiveFilterInFacebookLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_ACTIVE_FILTER);
    }

    public boolean findAllFilterInFacebookLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_ALL_FILTER);
    }

    public boolean findDisabledFilterInFacebookLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_DISABLED_FILTER);
    }

    public String getTextOfDefaultFilterSelectedInFacebookLeadAds() {
        waitForOverlayInFacebookLeadAdsTab();
        return getElementText(LEAD_ADS_ALL_DEFAULT_SELECTED_LOCATOR, waitTimes.LONG_WAIT);
    }

    //FBLA Table Methods
    public boolean findPropertyColumnHeaderInFacebookLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_PROPERTY_COLUMN_HEADER);
    }

    public boolean findLocationColumnHeaderInFacebookLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_LOCATION_COLUMN_HEADER);
    }

    public boolean findStatusColumnHeaderInFacebookLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_STATUS_COLUMN_HEADER);
    }

    public boolean findSubscriptionLogsColumnHeaderInFacebookLeadAds() {
        return confirmElementIsVisible(LEAD_ADS_SUBSCRIPTION_LOGS_COLUMN_HEADER);
    }

    //Overlay Methods
    private void waitForOverlayInFacebookLeadAdsTab() {
        waitForOverlay(LEAD_ADS_OVERLAY_LOCATOR);
    }

}
