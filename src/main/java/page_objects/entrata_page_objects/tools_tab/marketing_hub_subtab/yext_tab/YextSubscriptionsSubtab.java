package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.yext_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class YextSubscriptionsSubtab extends BasePage {

    //Overlay Locator
    private final By YEXT_SUBSCRIPTIONS_SUB_TAB_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    //Yext "Subscriptions" Sub-tab General Locators
    private final By YEXT_SUBSCRIPTIONS_SUB_TAB_LOCATOR = By.id("yext_property_subscriptionsxxx");
    private final By YEXT_LOGO_LOCATOR = By.cssSelector("img[src='/images/_common/yext_logo.png\']");
    //Yext "Publisher Management" tab Filter Locators
    private final By YEXT_SUBSCRIPTIONS_PROPERTY_SEARCH_BOX_FILTER = By.id("search-property");
    private final By YEXT_SUBSCRIPTIONS_ACTIVE_FILTER = By.cssSelector("li[data-filter='active']");
    private final By YEXT_SUBSCRIPTIONS_PENDING_FILTER = By.cssSelector("li[data-filter='pending']");
    private final By YEXT_SUBSCRIPTIONS_FAILED_FILTER = By.cssSelector("li[data-filter='failed']");
    private final By YEXT_SUBSCRIPTIONS_CANCELLED_FILTER = By.cssSelector("li[data-filter='cancelled']");
    private final By YEXT_SUBSCRIPTIONS_INACTIVE_FILTER = By.cssSelector("li[data-filter='inactive']");

    //Yext "Subscriptions" tab Column Header Locators
    private final By YEXT_SUBSCRIPTIONS_PROPERTY_COLUMN_HEADER = By.xpath("//th[text()='Property']");
    private final By YEXT_SUBSCRIPTIONS_TOTAL_UNITS_COLUMN_HEADER = By.xpath("//th[text()='Total Units']");
    private final By YEXT_SUBSCRIPTIONS_LOCATION_COLUMN_HEADER = By.xpath("//th[text()='Location']");
    private final By YEXT_SUBSCRIPTIONS_STATUS_COLUMN_HEADER = By.xpath("//th[text()='Status']");
    private final By YEXT_SUBSCRIPTIONS_TRANSMISSION_LOG_COLUMN_HEADER = By.xpath("//th[text()='Transmission Log']");
    private final By YEXT_SUBSCRIPTIONS_SUBSCRIPTION_LOG_COLUMN_HEADER = By.xpath("//th[text()='Subscription Log']");

    //Constructor
    public YextSubscriptionsSubtab(WebDriver driver) {
        super(driver);
    }


    //Methods
    public boolean selectSubscriptionsSubTabInYextSubscriptionsSubtab() {
        return clickElement(YEXT_SUBSCRIPTIONS_SUB_TAB_LOCATOR);
    }

    public boolean findYextLogoInYextSubscriptionsSubtabn() {
        return confirmElementIsVisible(YEXT_LOGO_LOCATOR);
    }

    //Yext 'Subscriptions' tab Filter Methods
    public boolean findPropertySearchBoxInYextSubscriptionsSubtab() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_PROPERTY_SEARCH_BOX_FILTER);
    }

    public boolean findActiveFilterInYextSubscriptionsSubtab() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_ACTIVE_FILTER);
    }

    public boolean findPendingFilterInYextSubscriptionsSubtab() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_PENDING_FILTER);
    }

    public boolean findFailedFilterInYextSubscriptionsSubtab() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_FAILED_FILTER);
    }

    public boolean findCancelledFilterInYextSubscriptionsSubtab() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_CANCELLED_FILTER);
    }

    public boolean findInactiveFilterInYextSubscriptionsSubtab() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_INACTIVE_FILTER);
    }

    //Yext "Subscriptions" tab Table Header Locators
    public boolean findPropertyColumnInYextSubscriptionsSubtab() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_PROPERTY_COLUMN_HEADER);
    }

    public boolean findTotalUnitsColumnInYextSubscriptionsSubtab() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_TOTAL_UNITS_COLUMN_HEADER);
    }

    public boolean findLocationColumnInYextSubscriptionsSubtab() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_LOCATION_COLUMN_HEADER);
    }

    public boolean findStatusColumnInYextSubscriptionsSubtab() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_STATUS_COLUMN_HEADER);
    }

    public boolean findTransmissionLogColumnInYextSubscriptionsSubtab() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_TRANSMISSION_LOG_COLUMN_HEADER);
    }

    public boolean findSubscriptionLogColumnInYextSubscriptionsSubtab() {
        return confirmElementIsVisible(YEXT_SUBSCRIPTIONS_SUBSCRIPTION_LOG_COLUMN_HEADER);
    }

}
