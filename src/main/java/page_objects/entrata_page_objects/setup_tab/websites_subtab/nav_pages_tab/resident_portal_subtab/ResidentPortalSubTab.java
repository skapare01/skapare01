package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.resident_portal_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentPortalSubTab extends BasePage {
    public ResidentPortalSubTab(WebDriver driver) {
        super(driver);
    }

    private final By RESIDENT_PORTAL_HEADER = By.xpath("//*[text()='Resident Portal']");
    private final By RESIDENT_PORTAL_EDIT_BTN = By.id("resident-portal-renames-button");
    private final By RESIDENT_PORTAL_RESIDENT_LOGIN_BOX_TITLE = By.xpath("//*[text()='Resident Login Box Title:']");
    private final By RESIDENT_PORTAL_RESIDENT_LOGIN_BOX_TITLE_TOOL_TIPS = By.id("RESIDENT_PORTAL_AUTHENTICATION_PAGE_WEBSITE_PREFERENCES_HELP");
    private final By RESIDENT_PORTAL_LOGIN_FROM_ENTRATA = By.xpath("//*[text()='Login from Entrata:']");
    private final By RESIDENT_PORTAL_LOGIN_FROM_ENTRATA_TOOL_TIPS = By.id("DISALLOW_RESIDENT_LOGIN_FROM_RESIDENT_WORKS_WEBSITE_PREFERENCES_HELP");
    private final By RESIDENT_PORTAL_PAGE_CUSTOM_TEXT = By.xpath("//*[text()='Page Custom Text:']");
    private final By RESIDENT_PORTAL_PAGE_CUSTOM_TEXT_TOOL_TIPS = By.id("ENROLLMENT_INFO_STEP_WEBSITE_PREFERENCES_HELP");
    private final By RESIDENT_PORTAL_FOUR= By.xpath("//*[text()='Resident Portal 4.0:']");
    private final By RESIDENT_PORTAL_FOUR_TOOL_TIPS = By.id("USE_RESIDENT_PORTAL_SERVICE_WEBSITE_PREFERENCES_HELP");
    private final By RESIDENT_PORTAL_ACCOUNT_CREATION_SECTION = By.xpath("//*[text()='Account Creation Section:']");
    private final By RESIDENT_PORTAL_ACCOUNT_CREATION_SECTION_TOOL_TIPS = By.id("HIDE_CREATE_ACCOUNT_SECTION_WEBSITE_PREFERENCES_HELP");
    private final By RESIDENT_PORTAL_BRAND_AS = By.xpath("//*[text()='Brand As:']");
    private final By RESIDENT_PORTAL_BRAND_AS_TOOL_TIPS = By.id("BRAND_AS_WEBSITE_PREFERENCES_HELP");

    public boolean residentPortalHeader() {
        return confirmElementIsVisible(RESIDENT_PORTAL_HEADER);
    }
    public boolean residentPortalEditBtn() {
        return confirmElementIsVisible(RESIDENT_PORTAL_EDIT_BTN);
    }
    public boolean residentPortalResidentLoginBoxTitle() {
        return confirmElementIsVisible(RESIDENT_PORTAL_RESIDENT_LOGIN_BOX_TITLE);
    }
    public boolean residentPortalResidentLoginBoxTitleToolTips() {
        return clickElement(RESIDENT_PORTAL_RESIDENT_LOGIN_BOX_TITLE_TOOL_TIPS);
    }
    public boolean residentPortalLoginFromEntrata() {
        return confirmElementIsVisible(RESIDENT_PORTAL_LOGIN_FROM_ENTRATA);
    }
    public boolean residentPortalLoginFromEntrataToolTips() {
        return clickElement(RESIDENT_PORTAL_LOGIN_FROM_ENTRATA_TOOL_TIPS);
    }
    public boolean residentPortalPageCustomText() {
        return confirmElementIsVisible(RESIDENT_PORTAL_PAGE_CUSTOM_TEXT);
    }
    public boolean residentPortalPageCustomTextToolTips() {
        return clickElement(RESIDENT_PORTAL_PAGE_CUSTOM_TEXT_TOOL_TIPS);
    }
    public boolean residentPortalFour() {
        return confirmElementIsVisible(RESIDENT_PORTAL_FOUR);
    }
    public boolean residentPortalFourToolTips() {
        return clickElement(RESIDENT_PORTAL_FOUR_TOOL_TIPS);
    }
    public boolean residentPortalAccountCreationSection() {
        return confirmElementIsVisible(RESIDENT_PORTAL_ACCOUNT_CREATION_SECTION);
    }
    public boolean residentPortalAccountCreationSectionToolTips() {
        return clickElement(RESIDENT_PORTAL_ACCOUNT_CREATION_SECTION_TOOL_TIPS);
    }
    public boolean residentPortalBrandAs() {
        return confirmElementIsVisible(RESIDENT_PORTAL_BRAND_AS);
    }
    public boolean residentPortalBrandAsToolTips() {
        return clickElement(RESIDENT_PORTAL_BRAND_AS_TOOL_TIPS);
    }
}
