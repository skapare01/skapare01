package page_objects.entrata_page_objects.tools_tab.reputation_subtab.reviews_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ReviewsDashboardSubtab extends BasePage {

    //Constructor
    public ReviewsDashboardSubtab(WebDriver driver) {
        super(driver);
    }

    //Reviews Dashboard Sub-Tab Locators
    private final By REVIEWS_DASHBOARD_SUB_TAB_LOCATOR = By.id("reviews_dashboard");
    private final By REVIEWS_DASHBOARD_SUB_TAB_SELECTED_LOCATOR = By.cssSelector("li[class='js-sub-tab-link js-load-tab selected']");

    //Reviews Dashboard General Locators and Filters
    private final By REVIEWS_DASHBOARD_PROPERTY_FILTER = By.className("selector-body");
    //Property Filter Locators
    private final By REVIEWS_DASHBOARD_ADD_ALL_BUTTON_IN_PROPERTY_FILTER = By.cssSelector("a[class='small-btn add js-add-all']");
    private final By REVIEWS_DASHBOARD_FILTER_PROPERTIES_BUTTON = By.cssSelector("a[class='left small button green lineheight-24 font12 js-filter-props']");
    //Date Selector Locators
    private final By REVIEWS_DASHBOARD_FROM_DATE_SELECTOR = By.id("fromDate");
    private final By REVIEWS_DASHBOARD_TO_DATE_SELECTOR = By.id("toDate");
    //Compare Filters
    private final By REVIEWS_DASHBOARD_PORTFOLIO_FILTER = By.cssSelector("li[val='Portfolio']");
    private final By REVIEWS_DASHBOARD_YEAR_FILTER = By.cssSelector("li[val='Year']");
    private final By REVIEWS_DASHBOARD_PERIOD_FILTER = By.cssSelector("li[val='Period']");

    //Reviews Dashboard Total Numbers Locators
    private final By REVIEWS_DASHBOARD_TOTAL_REVIEWS_NUMBER = By.xpath("//b[contains(text(),'Total Reviews')]");
    private final By REVIEWS_DASHBOARD_UNRESPONDED_NUMBER = By.cssSelector("a[href*='unresponded']");
    private final By REVIEWS_DASHBOARD_UNPUBLISHED_NUMBER = By.cssSelector("a[href*='unpublished']");
    private final By REVIEWS_DASHBOARD_NO_ATTRIBUTES_NUMBER = By.cssSelector("a[href*='no_attributes']");

    //Methods
    public boolean findDashboardSubtabInReviewsTab() {
        return confirmElementIsVisible(REVIEWS_DASHBOARD_SUB_TAB_LOCATOR);
    }

    public boolean confirmDashboardTabSelectedByDefaultInReviewsTab() {
        return confirmElementIsVisible(REVIEWS_DASHBOARD_SUB_TAB_SELECTED_LOCATOR, waitTimes.LONG_WAIT);
    }

    //Property Filter Methods
    public boolean findPropertyFilterInReviewsDashboard() {
        return confirmElementIsVisible(REVIEWS_DASHBOARD_PROPERTY_FILTER);
    }

    public boolean clickPropertyFilterInReviewsDashboard() {
        return clickElement(REVIEWS_DASHBOARD_PROPERTY_FILTER, waitTimes.LONG_WAIT);
    }

    public boolean clickAddAllPropertiesInReviewsDashboard() {
        return clickElement(REVIEWS_DASHBOARD_ADD_ALL_BUTTON_IN_PROPERTY_FILTER);
    }

    public boolean clickFilterPropertiesButtonInReviewsDashboard() {
        return clickElement(REVIEWS_DASHBOARD_FILTER_PROPERTIES_BUTTON);
    }

    //Date Filter Methods
    public boolean findFromDateSelectorInReviewsDashboard() {
        return confirmElementIsVisible(REVIEWS_DASHBOARD_FROM_DATE_SELECTOR);
    }

    public boolean findToDateSelectorInReviewsDashboard() {
        return confirmElementIsVisible(REVIEWS_DASHBOARD_TO_DATE_SELECTOR);
    }

    //Compare Filter Methods
    public boolean findPortfolioFilterInReviewsDashboard() {
        return confirmElementIsVisible(REVIEWS_DASHBOARD_PORTFOLIO_FILTER);
    }

    public boolean findYearFilterInReviewsDashboard() {
        return confirmElementIsVisible(REVIEWS_DASHBOARD_YEAR_FILTER);
    }

    public boolean findPeriodFilterInReviewsDashboard() {
        return confirmElementIsVisible(REVIEWS_DASHBOARD_PERIOD_FILTER);
    }

    //Number Methods
    public boolean findTotalReviewsNumberInReviewsDashboard() {
        return confirmElementIsVisible(REVIEWS_DASHBOARD_TOTAL_REVIEWS_NUMBER);
    }

    public boolean findUnrespondedNumberInReviewsDashboard() {
        return confirmElementIsVisible(REVIEWS_DASHBOARD_UNRESPONDED_NUMBER);
    }

    public boolean findUnpublishedNumberInReviewsDashboard() {
        return confirmElementIsVisible(REVIEWS_DASHBOARD_UNPUBLISHED_NUMBER);
    }

    public boolean confirmNoAttributesNumberNotVisibleInReviewsDashboard() {
        return confirmElementIsInvisible(REVIEWS_DASHBOARD_NO_ATTRIBUTES_NUMBER);
    }

    public boolean findNoAttributesNumberInReviewsDashboard() {
        return confirmElementIsVisible(REVIEWS_DASHBOARD_NO_ATTRIBUTES_NUMBER);
    }

}
