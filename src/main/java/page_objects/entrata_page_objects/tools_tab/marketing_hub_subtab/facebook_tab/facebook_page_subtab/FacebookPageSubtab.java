package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.facebook_tab.facebook_page_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FacebookPageSubtab extends BasePage {

    //Facebook Page General Locators
    private final By FACEBOOK_PAGE_SUB_TAB_LOCATOR = By.id("facebook_pagexxx");
    private final By FACEBOOK_PAGE_OVERLAY_LOCATOR = By.cssSelector("div[class='loading-overlay bg-img-medium']");
    private final By FACEBOOK_PAGE_LOGO_LOCATOR = By.cssSelector("img[width='200']");
    private final By FACEBOOK_PAGE_PROPERTY_SEARCH_BOX = By.id("search-property");

    //Facebook Page Filter Locators
    private final By FACEBOOK_PAGE_ACTIVE_FILTER = By.cssSelector("li[data-filter='subscribed']");
    private final By FACEBOOK_PAGE_UNSUBSCRIBED_FILTER = By.cssSelector("li[data-filter='unsubscribed']");
    private final By FACEBOOK_PAGE_FEED_INTERRUPTED_FILTER = By.cssSelector("li[data-filter='interrupted']");

    //Facebook Page Column Header Locators
    private final By FACEBOOK_PAGE_PROPERTY_COLUMN_HEADER = By.xpath("//th[text()='Property']");
    private final By FACEBOOK_PAGE_TOTAL_UNITS_COLUMN_HEADER = By.xpath("//th[text()='Total Units']");
    private final By FACEBOOK_PAGE_LOCATION_COLUMN_HEADER = By.xpath("//th[text()='Location']");
    private final By FACEBOOK_PAGE_STATUS_COLUMN_HEADER = By.xpath("//th[text()='Status']");
    private final By FACEBOOK_PAGE_TRANSMISSION_LOG_COLUMN_HEADER = By.xpath("//th[contains(text(),'Transmission')]");
    private final By FACEBOOK_PAGE_SUBSCRIPTION_LOG_COLUMN_HEADER = By.xpath("//th[contains(text(),'Subscription')]");

    //Facebook Page Table Locators
    private final By FACEBOOK_PAGE_TRANSMISSION_VIEW_BUTTON = By.cssSelector("span[title='Transmission Log']");
    private final By FACEBOOK_PAGE_SUBSCRIPTION_VIEW_BUTTON = By.cssSelector("span[class='link pointer'][onclick*='Subscription Event Log']");

    //Constructor
    public FacebookPageSubtab(WebDriver driver) {
        super(driver);
    }

    //METHODS
    public boolean selectFaceBookPageSubTab() {
        return clickElement(FACEBOOK_PAGE_SUB_TAB_LOCATOR);
    }

    public boolean findFacebookPageLogoInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_LOGO_LOCATOR);
    }

    public boolean findPropertySearchFilterInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_PROPERTY_SEARCH_BOX);
    }

    //Facebook Page Filter Methods
    public boolean findActiveFilterInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_ACTIVE_FILTER);
    }

    public boolean findUnsubscribedFilterInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_UNSUBSCRIBED_FILTER);
    }

    public boolean findFeedInterruptedFilterInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_FEED_INTERRUPTED_FILTER);
    }


    //FaceBook Page Table Methods
    public boolean findPropertyColumnHeaderInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_PROPERTY_COLUMN_HEADER);
    }

    public boolean findTotalUnitsColumnHeaderInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_TOTAL_UNITS_COLUMN_HEADER);
    }

    public boolean findLocationColumnHeaderInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_LOCATION_COLUMN_HEADER);
    }

    public boolean findStatusColumnHeaderInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_STATUS_COLUMN_HEADER);
    }

    public boolean findTransmissionLogColumnHeaderInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_TRANSMISSION_LOG_COLUMN_HEADER);
    }

    public boolean findSubscriptionLogColumnHeaderInFacebookPage() {
        return confirmElementIsVisible(FACEBOOK_PAGE_SUBSCRIPTION_LOG_COLUMN_HEADER);
    }

    public boolean clickTransmissionViewButtonInFacebookPage() {
        return clickElement(FACEBOOK_PAGE_TRANSMISSION_VIEW_BUTTON);
    }

    public boolean clickSubscriptionViewButtonInFacebookPage() {
        waitForLoadOverlayInFacebookPage();
        return clickElement(FACEBOOK_PAGE_SUBSCRIPTION_VIEW_BUTTON);
    }

    //Overlay Methods
    private void waitForLoadOverlayInFacebookPage() {
        waitForOverlay(FACEBOOK_PAGE_OVERLAY_LOCATOR);
    }

}
