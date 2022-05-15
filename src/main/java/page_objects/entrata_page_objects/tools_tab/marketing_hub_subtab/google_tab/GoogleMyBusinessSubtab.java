package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.google_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GoogleMyBusinessSubtab extends BasePage {

    //Google My Business Tab
    private final By GOOGLE_MY_BUSINESS_SUB_TAB = By.id("google_my_businessxxx");

    //Google My Business General Locators
    private final By GOOGLE_MY_BUSINESS_LOGO_LOCATOR = By.cssSelector("img[width='185']");
    private final By GOOGLE_MY_BUSINESS_PROPERTY_SEARCH_FILTER = By.id("search-property");
    private final By GOOGLE_MY_BUSINESS_FREE_SERVICE_TITLE_LOCATOR = By.cssSelector("h4[class='margin5-bottom']");

    //Google My Business Filter Options
    private final By GOOGLE_MY_BUSINESS_ACTIVE_FILTER = By.cssSelector("li[data-filter='subscribed']");
    private final By GOOGLE_MY_BUSINESS_UNSUBSCRIBED_FILTER = By.cssSelector("li[data-filter='unsubscribed']");
    private final By GOOGLE_MY_BUSINESS_FEED_INTERRUPTION_FILTER = By.cssSelector("li[data-filter='interrupted']");

    //Google My Business Table Locators
    private final By GOOGLE_MY_BUSINESS_PROPERTY_COLUMN_HEADER = By.xpath("//th[text()='Property']");
    private final By GOOGLE_MY_BUSINESS_TOTAL_UNITS_COLUMN_HEADER = By.xpath("//th[text()='Total Units']");
    private final By GOOGLE_MY_BUSINESS_LOCATION_COLUMN_HEADER = By.xpath("//th[text()='Location']");
    private final By GOOGLE_MY_BUSINESS_STATUS_COLUMN_HEADER = By.xpath("//th[text()='Status']");
    private final By GOOGLE_MY_BUSINESS_TRANSMISSION_LOG_COLUMN_HEADER = By.xpath("//th[contains(text(),'Transmission')]");
    private final By GOOGLE_MY_BUSINESS_SUBSCRIPTION_LOG_COLUMN_HEADER = By.xpath("//th[contains(text(),'Subscription')]");
    private final By GOOGLE_MY_BUSINESS_UPDATE_IMAGES_COLUMN_HEADER = By.xpath("//th[contains(text(),'Update Images')]");

    //Constructor
    public GoogleMyBusinessSubtab(WebDriver driver) {
        super(driver);
    }

    //METHODS
    public boolean selectGoogleMyBusinessSubTab() {
        return clickElement(GOOGLE_MY_BUSINESS_SUB_TAB);
    }

    public boolean findMyBusinessPageLogoInGoogleMyBusiness() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_LOGO_LOCATOR);
    }

    public boolean findPropertySearchFilterInGoogleMyBusiness() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_PROPERTY_SEARCH_FILTER);
    }

    public boolean findFreeServiceTitleInGoogleMyBusiness() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_FREE_SERVICE_TITLE_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean findActiveFilterInGoogleMyBusiness() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_ACTIVE_FILTER);
    }

    public boolean findUnsubscribedFilterInGoogleMyBusiness() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_UNSUBSCRIBED_FILTER);
    }

    public boolean findFeedInterruptedFilterInGoogleMyBusiness() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_FEED_INTERRUPTION_FILTER);
    }

    //Google My Business Table List Methods
    public boolean findPropertyColumnHeaderInGoogleMyBusiness() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_PROPERTY_COLUMN_HEADER);
    }

    public boolean findTotalUnitsColumnHeaderInGoogleMyBusiness() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_TOTAL_UNITS_COLUMN_HEADER);
    }

    public boolean findLocationColumnHeaderInGoogleMyBusiness() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_LOCATION_COLUMN_HEADER);
    }

    public boolean findStatusColumnHeaderInGoogleMyBusiness() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_STATUS_COLUMN_HEADER);
    }

    public boolean findTransmissionLogColumnHeaderInGoogleMyBusiness() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_TRANSMISSION_LOG_COLUMN_HEADER);
    }

    public boolean findSubscriptionLogColumnHeaderInGoogleMyBusiness() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_SUBSCRIPTION_LOG_COLUMN_HEADER);
    }

    public boolean findUpdateImagesColumnHeaderInGoogleMyBusiness() {
        return confirmElementIsVisible(GOOGLE_MY_BUSINESS_UPDATE_IMAGES_COLUMN_HEADER);
    }

}
