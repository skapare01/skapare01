package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.craigslist_ads_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ArchivedAdsSubtab extends BasePage {

    //Constructor
    public ArchivedAdsSubtab(WebDriver driver) {
        super(driver); }

    //Craigslist Module Sub-Tabs
    private final By ARCHIVED_ADS_TAB_LOCATOR = By.xpath("//li[text()='Archived Ads']");
    private final By ARCHIVED_ADS_TAB_OVERLAY = By.id("loader-gif-container");

    //Craigslist "Archived Ads" Module Action Buttons
    private final By PROPERTY_FILTER_LOCATOR = By.cssSelector("i[class='down-arrow']");
    private final By DEFAULT_PROPERTY_FILTER_SELECTION_LOCATOR = By.xpath("//span[@class='title']");
    private final By FIRST_PROPERTY_IN_PROPERTY_FILTER_LOCATOR = By.cssSelector("li[class='sl-item js-property']:first-of-type");
    private final By CRAIGSLIST_HELP_LINK_LOCATOR = By.xpath("//a[text()='Craigslist Help']");
    private final By SORT_BY_CREATION_DATE_FILTER_LOCATOR = By.cssSelector("select[class='form-select js-sort-boxes']");

    //"Archived Ads" Ad Specific Buttons
    private final By SINGLE_ARCHIVED_AD_LOCATOR = By.cssSelector("div[class='ad-template-box js-ad-box']");
    private final By AD_PREVIEW_BUTTON_LOCATOR = By.cssSelector("a[title='Ad preview']");
    private final By CREATED_DATETIME_LOCATOR = By.xpath("//span[contains(text(),'Created:')]");
    private final By WEBSITE_VIEWS_COUNT_LOCATOR = By.xpath("//span[contains(text(),'Website Views:')]");
    private final By FLOOR_PLAN_NAME_LOCATOR = By.className("fp-name");

    //Filter Options
    private final String OPTION1_CREATION_DATE_NEWEST_OLDEST_LOCATOR = "date:date-desc";
    private final String OPTION2_CREATION_DATE_OLDEST_NEWEST_LOCATOR = "date:date-asc";
    private final String OPTION3_VIEWS_MOST_LEAST_LOCATOR = "views:numeric-desc";
    private final String OPTION4_VIEWS_LEAST_MOST_LOCATOR = "views:numeric-asc";

    ////Craigslist Ads Tab Overlay
    private final By OVERLAY_AFTER_CLICKING_CRAIGSLIST_ADS_TAB = By.className("loading-overlay");

    //Methods
    public boolean navigateToArchivedAdsTab() {
        waitForCraigslistAdsTabOverlay();
        return clickElement(ARCHIVED_ADS_TAB_LOCATOR);
    }

    //Property Filter Verification
    public boolean findPropertyFilter_ArchivedAds() {
        return confirmElementIsVisible(PROPERTY_FILTER_LOCATOR);
    }

    public String findDefaultPropertyInFilter_ArchivedAds() {
        return getElementText(DEFAULT_PROPERTY_FILTER_SELECTION_LOCATOR, waitTimes.LONG_WAIT);
    }

    public String findFirstPropertyInFilterDropDown_ArchivedAds() {
        clickElement(PROPERTY_FILTER_LOCATOR);
        return getElementText(FIRST_PROPERTY_IN_PROPERTY_FILTER_LOCATOR,waitTimes.LONG_WAIT);
    }

    //Header Verification
    public boolean findCraigslistHelpLink_ArchivedAds() {
        return confirmElementIsVisible(CRAIGSLIST_HELP_LINK_LOCATOR, waitTimes.SHORT_WAIT);
    }

    //Sort By Filter Verification Methods
    public boolean findSortByFilter_CreationDate() {
        return confirmElementIsVisible(SORT_BY_CREATION_DATE_FILTER_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean selectSortByFilterOption1_NewestOldest() {
        return selectElementByValue(SORT_BY_CREATION_DATE_FILTER_LOCATOR,
                OPTION1_CREATION_DATE_NEWEST_OLDEST_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean selectSortByFilterOption2_OldestNewest() {
        return selectElementByValue(SORT_BY_CREATION_DATE_FILTER_LOCATOR,
                OPTION2_CREATION_DATE_OLDEST_NEWEST_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean selectSortByFilterOption3_Views_MostLeast() {
        return selectElementByValue(SORT_BY_CREATION_DATE_FILTER_LOCATOR,
                OPTION3_VIEWS_MOST_LEAST_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean selectSortByFilterOption4_Views_LeastMost() {
        return selectElementByValue(SORT_BY_CREATION_DATE_FILTER_LOCATOR,
                OPTION4_VIEWS_LEAST_MOST_LOCATOR, waitTimes.LONG_WAIT);
    }

    //"Active Ads" Methods
    public boolean selectFirstArchivedAdInList() {
        return clickElement(SINGLE_ARCHIVED_AD_LOCATOR);
    }

    public boolean findCreatedDateTime_ArchivedAds() {
        return confirmElementIsVisible(CREATED_DATETIME_LOCATOR);
    }

    public boolean findWebsiteViewCount_ArchivedAd() {
        return confirmElementIsVisible(WEBSITE_VIEWS_COUNT_LOCATOR);
    }

    public boolean findFloorPlanName_ArchivedAds() {
        return confirmElementIsVisible(FLOOR_PLAN_NAME_LOCATOR);
    }

    public boolean findAdPreviewButton_ArchivedAds() {
        return confirmElementIsVisible(AD_PREVIEW_BUTTON_LOCATOR);
    }

    //Overlay Methods
    private void waitForArchivedAdsTabOverlay() {
        waitForOverlay(ARCHIVED_ADS_TAB_OVERLAY);
    }

    private void waitForCraigslistAdsTabOverlay() {
        waitForOverlay(OVERLAY_AFTER_CLICKING_CRAIGSLIST_ADS_TAB);
    }

}