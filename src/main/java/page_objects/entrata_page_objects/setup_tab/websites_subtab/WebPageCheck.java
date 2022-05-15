package page_objects.entrata_page_objects.setup_tab.websites_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WebPageCheck extends BasePage {
    public WebPageCheck(WebDriver driver) {
        super(driver);
    }

    private final By COOKIES_BAR = By.id("privacy_controls_banner");
    private final By ACCEPT_COOKIES_BTN = By.id("pc_banner_accept_all");
    private final By PM_PROSPECT_PORTAL_WEBPAGE_LANDING_PAGE = By.id("main-wrapper");
    private final By PROSPECT_PORTAL_WEBPAGE_HOME = By.xpath("//*[text()='Home']");
    private final By PROSPECT_PORTAL_WEBPAGE_FLOOR_PLANS = By.xpath("//*[text()='Floor Plans']");
    private final By PROSPECT_PORTAL_WEBPAGE_PHOTOS_AND_TOURS = By.xpath("//*[text()='Photos & Tour']");
    private final By PROSPECT_PORTAL_WEBPAGE_AMENITIES = By.xpath("//*[text()='Amenities']");
    private final By PROSPECT_PORTAL_WEBPAGE_DIRECTIONS = By.xpath("//*[text()='Directions']");
    private final By PROSPECT_PORTAL_WEBPAGE_RESIDENTS = By.xpath("//*[text()='Residents']");
    private final By PROSPECT_PORTAL_WEBPAGE_APPLY = By.xpath("//*[text()='Apply']");
    // Floor Plan Check //
    private final By FLOOR_PLANS_PPUXFLOOR_AVAILABILITY = By.xpath("//*[text()=' Available']");
    private final By AVAILABLE_UNITS_SELECTION = By.id("unit_space_5342262");
    private final By LEASE_LENGTH_SELECTION = By.xpath("//*[@id=\"lease-11\"]/a");
    private final By APPLY_ONLINE_BTN = By.id("apply_now");
    // Amenities Check //
    private final By AMENITIES_HEADER_TEXT = By.id("amenities-header");

    public boolean cookiesBar() {
        switchToRecentlyOpenedTab();
        return confirmElementIsVisible(COOKIES_BAR);
    }
    public boolean clickIAcceptAllCookiesButton() {
        return clickElement(ACCEPT_COOKIES_BTN);
    }
    public boolean pmProspectPortalWebpageLandingPage() {
        return confirmElementIsVisible(PM_PROSPECT_PORTAL_WEBPAGE_LANDING_PAGE);
    }
    public boolean prospectPortalHome(){
        return clickElement(PROSPECT_PORTAL_WEBPAGE_HOME);
    }
    public boolean prospectPortalFloorPlans() {
        return clickElement(PROSPECT_PORTAL_WEBPAGE_FLOOR_PLANS);
    }
    public boolean prospectPortalPhotosAndTours() {
        return clickElement(PROSPECT_PORTAL_WEBPAGE_PHOTOS_AND_TOURS);
    }
    public boolean prospectPortalAmenities() {
        return clickElement(PROSPECT_PORTAL_WEBPAGE_AMENITIES);
    }
    public boolean prospectPortalDirections() {
        return clickElement(PROSPECT_PORTAL_WEBPAGE_DIRECTIONS);
    }
    public boolean prospectPortalResidents() {
        return clickElement(PROSPECT_PORTAL_WEBPAGE_RESIDENTS);
    }
    public boolean prospectPortalApply() {
        return clickElement(PROSPECT_PORTAL_WEBPAGE_APPLY);
    }
    // Floor Plan Check //
    public boolean floorPlanAvailability() {
        return clickElement(FLOOR_PLANS_PPUXFLOOR_AVAILABILITY);
    }
    public boolean availableUnitsSelection() {
        return clickElement(AVAILABLE_UNITS_SELECTION);
    }
    public boolean leaseLengthSelection() {
        return clickElement(LEASE_LENGTH_SELECTION);
    }
    public boolean applyOnlineBtn() {
        return clickElement(APPLY_ONLINE_BTN);
    }
    // Amenities Check //
    public boolean amenitiesHeaderText() {
        return confirmElementIsVisible(AMENITIES_HEADER_TEXT);
    }
}
