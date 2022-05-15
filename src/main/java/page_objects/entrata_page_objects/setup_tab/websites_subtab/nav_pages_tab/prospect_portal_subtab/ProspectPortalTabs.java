package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ProspectPortalTabs extends BasePage {
    public ProspectPortalTabs(WebDriver driver) {
        super(driver);
    }

    private final By AMENITIES_TAB = By.id("website_nav_pages_prospectportal_amenitiesxxx");
    private final By APPLY_NOW_TAB = By.id("website_nav_pages_prospectportal_apply_nowxxx");
    private final By BLOG_TAB = By.id("website_nav_pages_prospectportal_blogxxx");
    private final By FLOOR_PLAN_TAB = By.id("website_nav_pages_prospectportal_floorplanxxx");
    private final By HIGH_RISE_TAB = By.id("website_nav_pages_prospectportal_highrisexxx");
    private final By HOME_TAB = By.id("website_nav_pages_prospectportal_homexxx");
    private final By NEIGHBORHOOD_TAB = By.id("website_nav_pages_prospectportal_neighborhoodxxx");
    private final By PHOTOS_AND_TOURS_TAB = By.id("website_nav_pages_prospectportal_photos_and_toursxxx");
    private final By PROPERTY_OVERVIEW_TAB = By.id("website_nav_pages_prospectportal_property_overviewxxx");
    private final By REVIEWS_TAB = By.id("website_nav_pages_prospectportal_reviewsxxx");
    private final By SIDEBAR_TAB = By.id("website_nav_pages_prospectportal_side_barxxx");

    public boolean amenitiesTab() {
        return clickElement(AMENITIES_TAB);
    }
    public boolean applyNowTab() {
        return clickElement(APPLY_NOW_TAB);
    }
    public boolean blogTab() {
        return clickElement(BLOG_TAB);
    }
    public boolean floorPlanTab() {
        return clickElement(FLOOR_PLAN_TAB);
    }
    public boolean highRiseTab() {
        return clickElement(HIGH_RISE_TAB);
    }
    public boolean homeTab() {
        return clickElement(HOME_TAB);
    }
    public boolean neighborhoodTab() {
        return clickElement(NEIGHBORHOOD_TAB);
    }
    public boolean photosAndToursTab() {
        return clickElement(PHOTOS_AND_TOURS_TAB);
    }
    public boolean propertyOverviewTab() {
        return clickElement(PROPERTY_OVERVIEW_TAB);
    }
    public boolean reviewsTab() {
        return clickElement(REVIEWS_TAB);
    }
    public boolean sidebarTab() {
        return clickElement(SIDEBAR_TAB);
    }
}
