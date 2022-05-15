package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class NavPagesSubTabs extends BasePage {
    public NavPagesSubTabs(WebDriver driver) {
        super(driver);
    }

    private final By NAVIGATION_SUB_TAB = By.id("website_nav_pages_navigationxxx");
    private final By PROSPECT_PORTAL_SUB_TAB = By.id("website_nav_pages_prospectportalxxx");
    private final By RESIDENT_PORTAL_SUB_TAB = By.id("website_nav_pages_residentportalxxx");
    private final By CUSTOM_PAGES_SUB_TAB = By.id("website_nav_pages_custom_pagesxxx");
    private final By LANDING_PAGES_SUB_TAB = By.id("website_nav_pages_landing_pagesxxx");
    private final By ROOT_PAGES_SUB_TAB = By.id("website_nav_pages_root_pagesxxx");
    private final By SOCIAL_MEDIA_SUB_TAB = By.id("website_nav_pages_social_mediaxxx");

    public boolean navigationSubTab() {
        return clickElement(NAVIGATION_SUB_TAB);
    }
    public boolean prospectPortalSubTab() {
        return clickElement(PROSPECT_PORTAL_SUB_TAB);
    }
    public boolean residentPortalSubTab() {
        return clickElement(RESIDENT_PORTAL_SUB_TAB);
    }
    public boolean customPagesSubTab() {
        return clickElement(CUSTOM_PAGES_SUB_TAB);
    }
    public boolean landingPagesSubTab() {
        return clickElement(LANDING_PAGES_SUB_TAB);
    }
    public boolean rootPagesSubTab() {
        return clickElement(ROOT_PAGES_SUB_TAB);
    }
    public boolean socialMediaSubTab() {
        return clickElement(SOCIAL_MEDIA_SUB_TAB);
    }
}
