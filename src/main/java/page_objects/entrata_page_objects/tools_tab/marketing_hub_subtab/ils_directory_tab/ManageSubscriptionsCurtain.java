package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.ils_directory_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ManageSubscriptionsCurtain extends BasePage {

    //Constructor
    public ManageSubscriptionsCurtain(WebDriver driver) {
        super(driver); }

    //ILS Portal Overlays
    private final By ILS_PORTAL_TAB_OVERLAY = By.id("loader-gif-container");
    private final By LOADING_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    //ILS "Manage Subscriptions" Curtain elements
    private final By MANAGE_SUBS_CURTAIN_ILS_LOGO_LOCATOR = By.cssSelector("div[class='left width60']");
    //ILS "Manage Subscriptions" Filters
    private final By MANAGE_SUBS_CURTAIN_ACTIVE_FILTER_LOCATOR = By.cssSelector("li[data-filter='subscribed']");
    private final By MANAGE_SUBS_CURTAIN_DENIED_FILTER_LOCATOR = By.cssSelector("li[data-filter='denied']");
    private final By MANAGE_SUBS_CURTAIN_UNSUBSCRIBED_FILTER_LOCATOR = By.cssSelector("li[data-filter='pending']");
    private final By MANAGE_SUBS_CURTAIN_PENDING_FILTER_LOCATOR = By.cssSelector("li[data-filter='unsubscribed']");
    private final By MANAGE_SUBS_CURTAIN_FEED_INTERRUPTED_FILTER_LOCATOR = By.cssSelector("li[data-filter='interrupted']");
    private final By MANAGE_SUBS_CURTAIN_PROPERTY_SEARCH_LOCATOR = By.id("search_property");
    //Property List Details
    private final By MANAGE_SUBS_CURTAIN_OCCUPANT_TYPE_LOCATOR = By.xpath("//td[contains(text(),'Conventional')]");
    private final By MANAGE_SUBS_CURTAIN_TOTAL_UNITS_LOCATOR = By.xpath("//th[text()='Total Units']");
    private final By MANAGE_SUBS_CURTAIN_LOCATION_LOCATOR = By.xpath("//th[text()='Location']");
    private final By MANAGE_SUBS_CURTAIN_STATUS_LOCATOR = By.xpath("//th[text()='Status']");
    private final By MANAGE_SUBS_CURTAIN_MINIMAL_FEED_LOCATOR = By.xpath("//th[text()='Minimal Feed']");
    private final By MANAGE_SUBS_CURTAIN_REQUEST_LOG_LOCATOR = By.xpath("//th[text()='ILS REQUEST LOG']");
    private final By ILS_SUBSCRIPTION_LOG_BUTTON_CURTAIN_LOCATOR = By.xpath("//td[@class='valign-middle align-center']/following-sibling::td/a[@class='ils-sub-link']");
    private final By MANAGE_SUBS_CURTAIN_SUB_UNSUB_BUTTON_LOCATOR = By.cssSelector("a[class='button action js-toggle-subscribe subscriptions']");
    private final By MANAGE_SUBS_CURTAIN_CANCEL_SUB_LOCATOR = By.id("reset_property");

    private final By MANAGE_SUBS_CURTAIN_CLOSE_BUTTON_LOCATOR = By.cssSelector("i[class='close-button close']");

    //Methods
    public boolean selectSubscriptionLogLink_ManageSubsCurtain() {
        manageSubscriptionsWaitForOverlay();
        return clickElement(ILS_SUBSCRIPTION_LOG_BUTTON_CURTAIN_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean confirmILSLogoVisible_ManageSubsCurtain() {
        return confirmElementIsVisible(MANAGE_SUBS_CURTAIN_ILS_LOGO_LOCATOR);
    }

    public boolean confirmActiveFilter_ManageSubsCurtain() {
        return confirmElementIsVisible(MANAGE_SUBS_CURTAIN_ACTIVE_FILTER_LOCATOR);
    }

    public boolean confirmDeniedFilter_ManageSubsCurtain() {
        return confirmElementIsVisible(MANAGE_SUBS_CURTAIN_DENIED_FILTER_LOCATOR);
    }

    public boolean confirmUnsubscribeFilter_ManageSubsCurtain() {
        return confirmElementIsVisible(MANAGE_SUBS_CURTAIN_UNSUBSCRIBED_FILTER_LOCATOR);
    }

    public boolean confirmPendingFilter_ManageSubsCurtain() {
        return confirmElementIsVisible(MANAGE_SUBS_CURTAIN_PENDING_FILTER_LOCATOR);
    }

    public boolean confirmFeedInterruptedFilter_ManageSubsCurtain() {
        return confirmElementIsVisible(MANAGE_SUBS_CURTAIN_FEED_INTERRUPTED_FILTER_LOCATOR);
    }

    public boolean confirmPropertySearchFilter_ManageSubsCurtain() {
        return confirmElementIsVisible(MANAGE_SUBS_CURTAIN_PROPERTY_SEARCH_LOCATOR);
    }

    public boolean confirmOccupancyTypeVisible_ManageSubsCurtain() {
        return confirmElementIsVisible(MANAGE_SUBS_CURTAIN_OCCUPANT_TYPE_LOCATOR);
    }

    public boolean confirmTotalUnitsVisible_ManageSubsCurtain() {
        return confirmElementIsVisible(MANAGE_SUBS_CURTAIN_TOTAL_UNITS_LOCATOR);
    }

    public boolean confirmLocationVisible_ManageSubsCurtain() {
        return confirmElementIsVisible(MANAGE_SUBS_CURTAIN_LOCATION_LOCATOR);
    }

    public boolean confirmStatusVisible_ManageSubsCurtain() {
        return confirmElementIsVisible(MANAGE_SUBS_CURTAIN_STATUS_LOCATOR);
    }

    public boolean confirmMinimalFeedVisible_ManageSubsCurtain() {
        return confirmElementIsVisible(MANAGE_SUBS_CURTAIN_MINIMAL_FEED_LOCATOR);
    }

    public boolean confirmRequestLogVisible_ManageSubsCurtain() {
        return confirmElementIsVisible(MANAGE_SUBS_CURTAIN_REQUEST_LOG_LOCATOR);
    }

    public boolean confirmSubUnsubButtonVisible_ManageSubsCurtain() {
        return confirmElementIsVisible(MANAGE_SUBS_CURTAIN_SUB_UNSUB_BUTTON_LOCATOR);
    }

    public boolean confirmCancelSubVisible_ManageSubsCurtain() {
        return confirmElementIsVisible(MANAGE_SUBS_CURTAIN_CANCEL_SUB_LOCATOR);
    }

    public boolean selectCloseButton_ManageSubsCurtain() {
        return clickElement(MANAGE_SUBS_CURTAIN_CLOSE_BUTTON_LOCATOR);
    }

    //Overlay Methods
    public void manageSubscriptionsWaitForOverlay() {
        waitForOverlay(LOADING_OVERLAY);
    }


}
