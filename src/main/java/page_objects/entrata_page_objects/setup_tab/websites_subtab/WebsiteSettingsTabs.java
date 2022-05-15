package page_objects.entrata_page_objects.setup_tab.websites_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WebsiteSettingsTabs extends BasePage{
    public WebsiteSettingsTabs(WebDriver driver) {
        super(driver);
    }

    private final By THEME_TAB = By.id("website_designxxx");
    private final By GLOBAL_TAB = By.id("website_globalxxx");
    private final By NAV_PAGES_TAB = By.id("website_nav_pagesxxx");
    private final By PROPERTIES_TAB = By.id("website_propertiesxxx");
    private final By SEO_TAB= By.id("website_seoxxx");
    private final By MULTI_PROPERTY_TAB = By.id("website_multi_propertyxxx");
    private final By WEBSITE_ADS_TAB = By.id("website_adsxxx");
    private final By VIEW_WEBSITE_BTN = By.xpath("//*[text()=' View Website']");

    public boolean themeTab() {
        return clickElement(THEME_TAB);
    }
    public boolean globalTab() {
        return clickElement(GLOBAL_TAB);
    }
    public boolean navPagesTab() {
        return clickElement(NAV_PAGES_TAB);
    }
    public boolean propertiesTab() {
        return clickElement(PROPERTIES_TAB);
    }
    public boolean seoTab() {
        return clickElement(SEO_TAB);
    }
    public boolean multiPropertyTab() {
        return clickElement(MULTI_PROPERTY_TAB);
    }
    public boolean websiteAdsTab() {
        return clickElement(WEBSITE_ADS_TAB);
    }
    public boolean viewWebsiteBtn() {
        return clickElement(VIEW_WEBSITE_BTN);
    }
}
