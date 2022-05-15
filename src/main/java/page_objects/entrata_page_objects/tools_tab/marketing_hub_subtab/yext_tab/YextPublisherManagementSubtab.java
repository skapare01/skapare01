package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.yext_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class YextPublisherManagementSubtab extends BasePage {

    //Overlay Locator
    private final By YEXT_PUBLISHER_MANAGEMENT_SUB_TAB_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    //Yext "Publisher Management" Sub-tab general elements and filter Locators
    private final By YEXT_PUBLISHER_MANAGEMENT_SUB_TAB_LOCATOR = By.id("yext_publisher_managementxxx");
    private final By YEXT_LOGO_LOCATOR = By.cssSelector("img[src='/images/_common/yext_logo.png\']");
    //Yext "Publisher Management" Sub Tab Filter Locators
    private final By YEXT_PUBLISHER_MANAGEMENT_PROPERTY_SEARCH_FILTER = By.cssSelector("div[class='selector js-property-select width30']");
    private final By YEXT_PUBLISHER_MANAGEMENT_NEEDS_ATTENTION_FILTER = By.cssSelector("li[data-filter='needs_attention']");
    private final By YEXT_PUBLISHER_MANAGEMENT_OFF_FILTER = By.cssSelector("li[data-filter='off']");
    private final By YEXT_PUBLISHER_MANAGEMENT_ON_FILTER = By.cssSelector("li[data-filter='on']");
    private final By YEXT_PUBLISHER_MANAGEMENT_SEARCH_PUBLISHER_FILTER = By.id("search-property");

    //Yext "Publisher Management" Column Header Locators
    private final By YEXT_PUBLISHER_MANAGEMENT_PUBLISHER_COLUMN_HEADER = By.xpath("//th[text()='Publisher']");
    private final By YEXT_PUBLISHER_MANAGEMENT_STATUS_COLUMN_HEADER = By.xpath("//th[text()='Status']");
    private final By YEXT_PUBLISHER_MANAGEMENT_POTENTIAL_ISSUES_COLUMN_HEADER = By.xpath("//th[text()='Potential Issues']");
    private final By YEXT_PUBLISHER_MANAGEMENT_ACTIVITY_LOG_COLUMN_HEADER = By.xpath("//th[text()='Activity Log']");
    private final By YEXT_PUBLISHER_MANAGEMENT_PUBLISHER_ON_OFF_COLUMN_HEADER = By.xpath("//th[text()='Publisher On/Off']");

    //Constructor
    public YextPublisherManagementSubtab(WebDriver driver) {
        super(driver);
    }

    //METHODS
    public boolean selectPublisherManagementSubTabInYext() {
        return clickElement(YEXT_PUBLISHER_MANAGEMENT_SUB_TAB_LOCATOR);
    }

    public boolean findYextLogoInYextPublisherManagement() {
        return confirmElementIsVisible(YEXT_LOGO_LOCATOR);
    }

    //Yext 'Publisher Management' Filter Methods
    public boolean findPropertyFilterInYextPublisherManagement() {
        return confirmElementIsVisible(YEXT_PUBLISHER_MANAGEMENT_PROPERTY_SEARCH_FILTER);
    }

    public boolean findNeedsAttentionFilterInYextPublisherManagement() {
        return confirmElementIsVisible(YEXT_PUBLISHER_MANAGEMENT_NEEDS_ATTENTION_FILTER);
    }

    public boolean findOffFilterInYextPublisherManagement() {
        return confirmElementIsVisible(YEXT_PUBLISHER_MANAGEMENT_OFF_FILTER);
    }

    public boolean findOnFilterInYextPublisherManagement() {
        return confirmElementIsVisible(YEXT_PUBLISHER_MANAGEMENT_ON_FILTER);
    }

    public boolean findSearchPublisherFilterInYextPublisherManagement() {
        return confirmElementIsVisible(YEXT_PUBLISHER_MANAGEMENT_SEARCH_PUBLISHER_FILTER);
    }

    //Yext "Publisher Management" tab Table Header Locators
    public boolean findPublisherColumnInYextPublisherManagement() {
        return confirmElementIsVisible(YEXT_PUBLISHER_MANAGEMENT_PUBLISHER_COLUMN_HEADER);
    }

    public boolean findStatusColumnInYextPublisherManagement() {
        return confirmElementIsVisible(YEXT_PUBLISHER_MANAGEMENT_STATUS_COLUMN_HEADER);
    }

    public boolean findPotentialIssuesColumnInYextPublisherManagement() {
        return confirmElementIsVisible(YEXT_PUBLISHER_MANAGEMENT_POTENTIAL_ISSUES_COLUMN_HEADER);
    }

    public boolean findActivityLogColumnInYextPublisherManagement() {
        return confirmElementIsVisible(YEXT_PUBLISHER_MANAGEMENT_ACTIVITY_LOG_COLUMN_HEADER);
    }

    public boolean findPublisherOnOffColumnInYextPublisherManagement() {
        return confirmElementIsVisible(YEXT_PUBLISHER_MANAGEMENT_PUBLISHER_ON_OFF_COLUMN_HEADER);
    }

}
