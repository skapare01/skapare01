package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.home_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class HomeTab extends BasePage {
    public HomeTab(WebDriver driver) {
        super(driver);
    }

    private final By PP_HOME_PAGE_HEADER = By.xpath("//h3[text()='Home Page']");
    private final By PP_HOME_PAGE_EDIT_BTN = By.id("home-content-button");
    private final By PP_HOME_APARTMENT_SEARCH_TEXT = By.xpath("//*[text()='Apartment Search:']");
    private final By PP_HOME_APARTMENT_SEARCH_TOOL_TIPS = By.id("LANDING_DONT_SHOW_DRILL_DOWN_HELP");
    private final By PP_HOME_OVERWRITE_SEO_META_DESCRIPTION_TEXT = By.xpath("//*[text()='Overwrite SEO Meta Description:']");
    private final By PP_HOME_LANDING_PAGE_HEADING_TEXT = By.xpath("//*[text()='Landing Page Heading:']");
    private final By PP_HOME_SEO_KEYWORDS_TEXT = By.xpath("//*[text()='SEO Keywords:']");
    private final By PP_HOME_LANDING_PAGE = By.xpath("//*[text()='Landing Page:']");
    private final By PP_HOME_LANDING_PAGE_TOOL_TIPS = By.id("LANDING_PAGE_WEBSITE_PREFERENCES_HELP");
    private final By PP_HOME_LANDING_PAGE_TEXT = By.xpath("//*[text()='Landing Page Text:']");
    private final By PP_HOME_OVERWRITE_SEO_TITLE_TAG_TEXT = By.xpath("//*[text()='Overwrite SEO Title Tag:']");
    private final By PP_HOME_LOGO_TEXT = By.xpath("//*[text()='Logo Text:']");

    public boolean ppHomePageHeader() {
        return confirmElementIsVisible(PP_HOME_PAGE_HEADER);
    }
    public boolean ppHomePageEditBtn() {
        return confirmElementIsVisible(PP_HOME_PAGE_EDIT_BTN);
    }
    public boolean ppHomeApartmentSearch() {
        return confirmElementIsVisible(PP_HOME_APARTMENT_SEARCH_TEXT);
    }
    public boolean ppHomeApartmentSearchToolTips() {
        return clickElement(PP_HOME_APARTMENT_SEARCH_TOOL_TIPS);
    }
    public boolean ppHomeOverwriteSEOMetaDescription() {
        return confirmElementIsVisible(PP_HOME_OVERWRITE_SEO_META_DESCRIPTION_TEXT);
    }
    public boolean ppHomeLandingPageHeading() {
        return confirmElementIsVisible(PP_HOME_LANDING_PAGE_HEADING_TEXT);
    }
    public boolean ppHomeSEOKeywords() {
        return confirmElementIsVisible(PP_HOME_SEO_KEYWORDS_TEXT);
    }
    public boolean ppHomeLandingPage() {
        return confirmElementIsVisible(PP_HOME_LANDING_PAGE);
    }
    public boolean ppHomeLandingPageToolTips() {
        return clickElement(PP_HOME_LANDING_PAGE_TOOL_TIPS);
    }
    public boolean ppHomeLandingPageText() {
        return confirmElementIsVisible(PP_HOME_LANDING_PAGE_TEXT);
    }
    public boolean ppHomeOverwriteSEOTitleTag() {
        return confirmElementIsVisible(PP_HOME_OVERWRITE_SEO_TITLE_TAG_TEXT);
    }
    public boolean ppHomeLogoText() {
        return confirmElementIsVisible(PP_HOME_LOGO_TEXT);
    }
}
