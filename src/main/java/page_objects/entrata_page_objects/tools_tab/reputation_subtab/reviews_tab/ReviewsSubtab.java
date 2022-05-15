package page_objects.entrata_page_objects.tools_tab.reputation_subtab.reviews_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ReviewsSubtab extends BasePage {

    //Constructor
    public ReviewsSubtab(WebDriver driver) {
        super(driver);
    }

    //Reviews Tab Locator
    private final By REVIEWS_SUB_TAB_LOCATOR = By.id("reviews_reviews");
    private final By REVIEWS_SUB_TAB_OVERLAY_LOCATOR = By.cssSelector("div[class='loading-overlay bg-img-medium']");

    //Reviews Tab General Filter Locators
    private final By REVIEWS_PROPERTY_FILTER = By.className("selector-body");
    //Reviews Property Filter Locators
    private final By REVIEWS_ADD_ALL_BUTTON_IN_PROPERTY_FILTER = By.cssSelector("a[class='small-btn add js-add-all']");
    private final By REVIEWS_FILTER_PROPERTIES_BUTTON = By.cssSelector("a[class='left small button green lineheight-24 font12 js-filter-props']");
    //Reviews Date Selector Locators
    private final By REVIEWS_FROM_DATE_SELECTOR = By.id("fromDate");
    private final By REVIEWS_TO_DATE_SELECTOR = By.id("toDate");
    //Reviews Sources Filter
    private final By REVIEWS_SOURCES_FILTER = By.id("review_type_multiselect");
    //Reviews Ratings and Status Filters Locators
    private final By REVIEWS_REVIEW_SEARCH_FIELD_FILTER = By.id("review_search_text");
    private final By REVIEWS_RATINGS_SCORE_FILTER = By.cssSelector("ul[class='form-picker js-rank-bank']");
    //Reviews Recommended Filter Locators
    private final By REVIEWS_RECOMMENDED_THUMBS_UP_FILTER = By.cssSelector("li[data-recommendations='1']");
    private final By REVIEWS_RECOMMENDED_THUMBS_DOWN_FILTER = By.cssSelector("li[data-recommendations='2']");
    //Reviews Status Filter Locators
    private final By REVIEWS_UNRESPONDED_STATUS_FILTER = By.cssSelector("li[data-type='unresponded']");
    private final By REVIEWS_UNPUBLISHED_STATUS_FILTER = By.cssSelector("li[data-type='unpublished']");
    private final By REVIEWS_NO_ATTRIBUTES_STATUS_FILTER = By.cssSelector("li[data-type='no_attributes']");

    //Total Review Count
    private final By REVIEWS_TOTAL_REVIEW_COUNT = By.cssSelector("h4[class='vert-title pad5-top']");

    //Reputation Advisor "Reviews" Column Header Locators
    private final By REVIEWS_RATING_COLUMN_HEADER = By.xpath("//th[text()='Rating']");
    private final By REVIEWS_REFER_COLUMN_HEADER = By.xpath("//th[text()='Refer']");
    private final By REVIEWS_REVIEW_COLUMN_HEADER = By.xpath("//th[text()='Review']");
    private final By REVIEWS_DATE_COLUMN_HEADER = By.xpath("//th[text()='Date']");
    private final By REVIEWS_AUTHOR_COLUMN_HEADER = By.xpath("//th[text()='Author']");
    private final By REVIEWS_SOURCE_COLUMN_HEADER = By.xpath("//th[text()='Source']");
    private final By REVIEWS_PROPERTY_COLUMN_HEADER = By.xpath("//th[text()='Property']");
    private final By REVIEWS_RESPONDED_COLUMN_HEADER = By.xpath("//th[text()='Responded']");
    private final By REVIEWS_ATTRIBUTES_COLUMN_HEADER = By.xpath("//th[text()='Attributes']");
    private final By REVIEWS_PUBLISHED_COLUMN_HEADER = By.xpath("//th[text()='Published']");

    //Methods
    public boolean selectReviewsSubtabInReviewsTab() {
        return clickElement(REVIEWS_SUB_TAB_LOCATOR);
    }

    //Property Filter Methods
    public boolean findPropertyFilterInReviewsSubTab() {
        waitForReviewsSubTabOverlay();
        return confirmElementIsVisible(REVIEWS_PROPERTY_FILTER);
    }

    public boolean clickPropertyFilterInReviewsSubTab() {
        waitForReviewsSubTabOverlay();
        return clickElement(REVIEWS_PROPERTY_FILTER, waitTimes.LONG_WAIT);
    }

    public boolean clickAddAllPropertiesInReviewsSubTab() {
        return clickElement(REVIEWS_ADD_ALL_BUTTON_IN_PROPERTY_FILTER);
    }

    public boolean clickFilterPropertiesButtonInReviewsSubTab() {
        return clickElement(REVIEWS_FILTER_PROPERTIES_BUTTON);
    }

    //Date Filter Methods
    public boolean findFromDateSelectorInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_FROM_DATE_SELECTOR, waitTimes.LONG_WAIT);
    }

    public boolean findToDateSelectorInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_TO_DATE_SELECTOR);
    }

    public boolean findSourcesFilterInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_SOURCES_FILTER, waitTimes.LONG_WAIT);
    }

    public boolean confirmSourcesFilterNotVisibleInReviewsSubTab() {
        return confirmElementIsInvisible(REVIEWS_SOURCES_FILTER);
    }

    //Additional Filter Methods
    public boolean findReviewSearchFieldFilterInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_REVIEW_SEARCH_FIELD_FILTER);
    }

    public boolean findReviewsRatingsFilterInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_RATINGS_SCORE_FILTER);
    }

    public boolean findRecommendedThumbsUpFilterInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_RECOMMENDED_THUMBS_UP_FILTER);
    }

    public boolean findRecommendedThumbsDownFilterInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_RECOMMENDED_THUMBS_DOWN_FILTER);
    }

    public boolean findUnrespondedStatusFilterInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_UNRESPONDED_STATUS_FILTER);
    }

    public boolean findUnpublishedStatusFilterInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_UNPUBLISHED_STATUS_FILTER);
    }

    public boolean findNoAttributesStatusFilterInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_NO_ATTRIBUTES_STATUS_FILTER);
    }

    public boolean confirmNoAttributesStatusFilterNotVisibleInReviewsSubTab() {
        return confirmElementIsInvisible(REVIEWS_NO_ATTRIBUTES_STATUS_FILTER);
    }

    //Total Reviews Count Methods
    public boolean findTotalReviewsCountInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_TOTAL_REVIEW_COUNT);
    }

    //Reputation Advisor "Reviews" tab Table Header Locators
    public boolean findRatingColumnInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_RATING_COLUMN_HEADER);
    }

    public boolean findReferColumnInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_REFER_COLUMN_HEADER);
    }

    public boolean findReviewColumnInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_REVIEW_COLUMN_HEADER);
    }

    public boolean findDateColumnInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_DATE_COLUMN_HEADER);
    }

    public boolean findAuthorColumnInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_AUTHOR_COLUMN_HEADER);
    }

    public boolean findSourceColumnInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_SOURCE_COLUMN_HEADER);
    }

    public boolean findPropertyColumnInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_PROPERTY_COLUMN_HEADER);
    }

    public boolean findRespondedColumnInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_RESPONDED_COLUMN_HEADER);
    }

    public boolean findAttributesColumnInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_ATTRIBUTES_COLUMN_HEADER);
    }

    public boolean confirmAttributesColumnNotVisibleInReviewsSubTab() {
        return confirmElementIsInvisible(REVIEWS_ATTRIBUTES_COLUMN_HEADER);
    }

    public boolean findPublishedColumnInReviewsSubTab() {
        return confirmElementIsVisible(REVIEWS_PUBLISHED_COLUMN_HEADER);
    }

    //Overlay Methods
    private void waitForReviewsSubTabOverlay() {
        waitForOverlay(REVIEWS_SUB_TAB_OVERLAY_LOCATOR);
    }

}
