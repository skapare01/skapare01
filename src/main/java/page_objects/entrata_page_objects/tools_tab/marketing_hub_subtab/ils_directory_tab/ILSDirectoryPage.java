package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.ils_directory_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ILSDirectoryPage extends BasePage {

    //Constructor
    public ILSDirectoryPage(WebDriver driver) {
        super(driver); }

    //ILS Portal Module Tabs
    private final By ILS_PORTAL_TAB_OVERLAY = By.id("loader-gif-container");

    //ILS Portal Header Filter Options
    private final By PROPERTY_FILTER_LOCATOR = By.cssSelector("div[class='selector js-property-select scroll-visible']");
    private final By PROPERTY_FILTER_DEFAULT_LOCATOR = By.id("filter_title");
    private final By OCCUPANT_TYPE_FILTER_LOCATOR = By.className("val");
    private final By SUBSCRIBED_FILTER_LOCATOR = By.cssSelector("li[data-filter='subscribed']");
    private final By ALL_FILTER_LOCATOR = By.cssSelector("li[data-filter='All']");
    private final By UNSUBSCRIBED_FILTER_LOCATOR = By.cssSelector("li[data-filter='unsubscribed']");
    private final By SEARCH_ILS_BOX_LOCATOR = By.id("search_ils");

    //Specific ILS Details in ILS Table
    private final By ILS_TABLE_LOGO_LOCATOR = By.cssSelector("img[class='pad10-right pointer']");
    private final By ILS_TABLE_OCCUPANT_TYPE_LOCATOR = By.xpath("//td[contains(text(),'Conventional')]");
    private final By ILS_TABLE_APARTMENT_FINDER_SERVICE_RESTRICTIONS_LOCATOR = By.cssSelector("a[onclick*= 'service[id]=92']");
    private final By ILS_TABLE_SUBSCRIBED_PROPERTIES_NUMBER_LOCATOR = By.xpath("//th[text()='SUBSCRIBED']");
    private final By ILS_TABLE_REQUEST_LOG_LOCATOR = By.className("ils-sub-link");
    private final By ILS_TABLE_MANAGE_SUBSCRIPTIONS_BUTTON = By.xpath("//a[text()='Manage Subscriptions']");

    //Specific ILS Details in ILS Table (Single Property View)
    private final By ILS_FILTER_REMOVE_ALL_PROPERTIES_LOCATOR = By.cssSelector("label[class='small-btn remove js-remove-all pointer']");
    private final By FIRST_PROPERTY_IN_FILTER_LIST_LOCATOR = By.cssSelector("li[data-groupname='All Properties']:first-of-type > label");
    private final By FILTER_PROPERTIES_BUTTON_LOCATOR = By.cssSelector("a[class='right small button green lineheight-24 font12 js-filter-props']");
    private final By ILS_TABLE_SUBSCRIPTION_LOG_LOCATOR = By.cssSelector("a[alt='Subscription Event Log']");
    private final By ILS_TABLE_SUBSCRIBE_BUTTON_LOCATOR = By.cssSelector("a[class='button action wide js-toggle-subscribe subscriptions sub-all-ils']");
    private final By ILS_TABLE_SUBS_LOG_VIEW_BUTTON = By.cssSelector("a[title='Subscription Event Log']");
    private final By ILS_TABLE_REQUEST_LOG_VIEW_BUTTON = By.cssSelector("a[title='View']");

    //Filter Options
    private final By OPTION1_ALL_OCCUPANT_TYPE_LOCATOR = By.cssSelector("input[data-filter='All']");
    private final By OPTION2_CONVENTIONAL_AFFORDABLE_LOCATOR = By.cssSelector("input[data-filter='conventional']");
    private final By OPTION3_STUDENT = By.cssSelector("input[data-filter='student']");

//Methods

    //ILS Portal Filter Methods
    public boolean locatePropertyFilter_ILS_Portal() {
        return confirmElementIsVisible(PROPERTY_FILTER_LOCATOR);
    }

    public String locateDefaultPropertyFilterSelection_ILS() {
        return getElementText(PROPERTY_FILTER_DEFAULT_LOCATOR, waitTimes.DEFAULT_WAIT);
    }

    public boolean locateOccupantTypesFilter() {
        iLSPortalTabWaitForOverly();
        return clickElement(OCCUPANT_TYPE_FILTER_LOCATOR);
    }

    public boolean selectOccupantFilterOption1_AllTypes() {
        return confirmElementIsVisible(OPTION1_ALL_OCCUPANT_TYPE_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean selectOccupantFilterOption2_ConvAfford() {
        return confirmElementIsVisible(OPTION2_CONVENTIONAL_AFFORDABLE_LOCATOR);
    }

    public boolean selectOccupantFilterOption3_Student() {
        return confirmElementIsVisible(OPTION3_STUDENT);
    }

    public boolean findSubscribedFilter() {
        return confirmElementIsVisible(SUBSCRIBED_FILTER_LOCATOR);
    }

    public boolean findAllFilter() {
        iLSPortal_FilterWaitForOverlay();
        return confirmElementIsVisible(ALL_FILTER_LOCATOR);
    }

    public boolean findUnsubscribedFilter() {
        return confirmElementIsVisible(UNSUBSCRIBED_FILTER_LOCATOR);
    }

    public boolean findSearchILSBox() {
        return confirmElementIsVisible(SEARCH_ILS_BOX_LOCATOR);
    }

    //ILS Table Methods
    public boolean findILSLogoInTable() {
        return confirmElementIsVisible(ILS_TABLE_LOGO_LOCATOR);
    }

    public boolean findILSOccupantTypeInTable() {
        return confirmElementIsVisible(ILS_TABLE_OCCUPANT_TYPE_LOCATOR);
    }

    public boolean findILsServiceRestrictionsInTable() {
        return confirmElementIsVisible(ILS_TABLE_APARTMENT_FINDER_SERVICE_RESTRICTIONS_LOCATOR);
    }

    public boolean findILsSubscribedPropertiesNumberInTable() {
        return confirmElementIsVisible(ILS_TABLE_SUBSCRIBED_PROPERTIES_NUMBER_LOCATOR);
    }

    public boolean findILSRequestLogInTable() {
        return confirmElementIsVisible(ILS_TABLE_REQUEST_LOG_LOCATOR);
    }

    public boolean findILSManageSubscriptionsButtonInTable() {
        return confirmElementIsVisible(ILS_TABLE_MANAGE_SUBSCRIPTIONS_BUTTON);
    }

    public boolean confirmILSManageSubscriptionsButtonNotVisible_SingleProperty() {
        return confirmElementIsInvisible(ILS_TABLE_MANAGE_SUBSCRIPTIONS_BUTTON);
    }

    public boolean confirmSubscriptionLogNotPresent_MultiPropertyView() {
        return confirmElementIsInvisible(ILS_TABLE_SUBSCRIPTION_LOG_LOCATOR);
    }

    //ILS table (Single Property View)
    public boolean selectPropertyFilter_ILSPortal() {
        return clickElement(PROPERTY_FILTER_LOCATOR);
    }

    public boolean selectRemoveAllPropertiesInPropertyFilter() {
        return clickElement(ILS_FILTER_REMOVE_ALL_PROPERTIES_LOCATOR);
    }

    public boolean selectFirstPropertyInPropertyFilter() {
        return clickElement(FIRST_PROPERTY_IN_FILTER_LIST_LOCATOR);
    }

    public boolean selectFilterPropertiesButton_ILSPortal() {
        return clickElement(FILTER_PROPERTIES_BUTTON_LOCATOR);
    }

    public boolean findILsSubscriptionLogInTable() {
        return confirmElementIsVisible(ILS_TABLE_SUBSCRIPTION_LOG_LOCATOR);
    }

    public boolean findSubscribeButtonInTable() {
        return confirmElementIsVisible(ILS_TABLE_SUBSCRIBE_BUTTON_LOCATOR);
    }

    public boolean confirmNumberOfPropertiesSubscribedNotPresent_SingleProperty() {
        return confirmElementIsInvisible(ILS_TABLE_SUBSCRIBED_PROPERTIES_NUMBER_LOCATOR);
    }

    //Modal and Curtain Navigations
    public boolean selectServiceRestrictionsLinkInILSPortal() {
        return clickElement(ILS_TABLE_APARTMENT_FINDER_SERVICE_RESTRICTIONS_LOCATOR);
    }

    public boolean selectViewButton_RequestLog_ILSPortal() {
        return clickElement(ILS_TABLE_REQUEST_LOG_VIEW_BUTTON);
    }

    public boolean selectViewButton_SubsLogs_ILSPortal() {
        return clickElement(ILS_TABLE_SUBS_LOG_VIEW_BUTTON);
    }

    public boolean selectManageSubscriptionsButtonInILSPortal() {
        return clickElement(ILS_TABLE_MANAGE_SUBSCRIPTIONS_BUTTON, waitTimes.LONG_WAIT);
    }

    //Overlay Methods
    private void iLSPortalTabWaitForOverly() {
        waitForOverlay(ILS_PORTAL_TAB_OVERLAY);
    }

    private void iLSPortal_FilterWaitForOverlay() {
        waitForOverlay(ILS_PORTAL_TAB_OVERLAY);
    }

}
