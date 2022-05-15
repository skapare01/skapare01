package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.navigation_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class NavigationSubTab extends BasePage {
    public NavigationSubTab(WebDriver driver) {
        super(driver);
    }

    private final By NAV_PROSPECT_PORTAL_MAIN_NAVIGATION_HEADER =  By.xpath("//*[text()='ProspectPortal Main Navigation']");
    private final By NAVIGATION_EDIT_BTN = By.id("pp-nav-content-button");
    private final By NAV_NAME = By.xpath("//*[text()='Nav Name']");
    private final By NAV_RENAMED = By.xpath("//*[text()='Renamed']");
    private final By NAV_STATUS = By.xpath("//*[text()='Status']");
    private final By NAV_MAIN_NAVIGATION = By.xpath("//*[text()='Main Navigation']");
    private final By NAV_AMENITIES = By.xpath("//div//span[text()='Amenities']");
    private final By NAV_APPLY_NOW = By.xpath("//div//span[text()='Apply Now']");
    private final By NAV_BLOG = By.xpath("//div//span[text()='Blog']");
    private final By NAV_CAREERS = By.xpath("//div//span[text()='Careers']");
    private final By NAV_CONTACT = By.xpath("//div//span[text()='Contact']");
    private final By NAV_CORPORATE_CONTACT = By.xpath("//div//span[text()='Corporate Contact']");
    private final By NAV_DIRECTIONS = By.xpath("//div//span[text()='Directions']");
    private final By NAV_FLOOR_PLANS =  By.xpath("//div//span[text()='Floor Plans']");
    private final By NAV_HOME = By.xpath("//div//span[text()='Home']");
    private final By NAV_PHOTOS = By.xpath("//div//span[text()='Photos']");
    private final By NAV_APARTMENT_SEARCH = By.xpath("//div//span[text()='Apartment Search']");
    private final By NAV_RESIDENTS = By.xpath("//div//span[text()='Residents']");
    private final By NAV_PAY_RENT = By.xpath("//div//span[text()='Pay Rent']");
    private final By NAV_FAQS = By.xpath("//div//span[text()='FAQs']");
    private final By NAV_EDIT_APPLY_NOW_SHOW_BUTTON = By.cssSelector("#pp-nav-content-edit > ul > li:nth-child(3) > span.right > ul > li:nth-child(1)");
    private final By NAV_EDIT_APPLY_NOW_HIDE_BUTTON = By.cssSelector("#pp-nav-content-edit > ul > li:nth-child(3) > span.right > ul > li:nth-child(2)");
    private final By NAV_EDIT_SAVE_BUTTON = By.cssSelector("input[class='form-submit js-save-changes']");

    public boolean navProspectPortalMainNavigationHeader() {
        return confirmElementIsVisible(NAV_PROSPECT_PORTAL_MAIN_NAVIGATION_HEADER);
    }
    public boolean navigationEditBtn() {
        return confirmElementIsVisible(NAVIGATION_EDIT_BTN);
    }
    public boolean navigationEditButtonClick() {
        return clickElement(NAVIGATION_EDIT_BTN);
    }
    public boolean navigationName() {
        return confirmElementIsVisible(NAV_NAME);
    }
    public boolean navigationRenamed() {
        return confirmElementIsVisible(NAV_RENAMED);
    }
    public boolean navigationStatus() {
        return confirmElementIsVisible(NAV_STATUS);
    }
    public boolean navMainNavigationText() {
        return confirmElementIsVisible(NAV_MAIN_NAVIGATION);
    }
    public boolean navigationAmenitiesText() {
        return confirmElementIsVisible(NAV_AMENITIES);
    }
    public boolean navigationApplyNowText() {
        return confirmElementIsVisible(NAV_APPLY_NOW);
    }
    public boolean navigationApplyNowShowButtonClick() {
        return clickElement(NAV_EDIT_APPLY_NOW_SHOW_BUTTON);
    }
    public boolean navigationApplyNowHideButtonClick() {
        return clickElement(NAV_EDIT_APPLY_NOW_HIDE_BUTTON);
    }
    public boolean navigationBlogText() {
        return confirmElementIsVisible(NAV_BLOG);
    }
    public boolean navigationCareersText() {
        return confirmElementIsVisible(NAV_CAREERS);
    }
    public boolean navigationContactText() {
        return confirmElementIsVisible(NAV_CONTACT);
    }
    public boolean navigationCorporateContactText() {
        return confirmElementIsVisible(NAV_CORPORATE_CONTACT);
    }
    public boolean navigationDirectionsText() {
        return confirmElementIsVisible(NAV_DIRECTIONS);
    }
    public boolean navigationFloorPlansText() {
        return confirmElementIsVisible(NAV_FLOOR_PLANS);
    }
    public boolean navigationHomeText() {
        return confirmElementIsVisible(NAV_HOME);
    }
    public boolean navigationPhotosText() {
        return confirmElementIsVisible(NAV_PHOTOS);
    }
    public boolean navigationApartmentSearchText() {
        return confirmElementIsVisible(NAV_APARTMENT_SEARCH);
    }
    public boolean navigationResidentsText() {
        return confirmElementIsVisible(NAV_RESIDENTS);
    }
    public boolean navigationPayRentText() {
        return confirmElementIsVisible(NAV_PAY_RENT);
    }
    public boolean navigationFaqsText() {
        return confirmElementIsVisible(NAV_FAQS);
    }
    public boolean navigationEditMainNavSaveButton() {
        return clickElement(NAV_EDIT_SAVE_BUTTON);
    }
}
