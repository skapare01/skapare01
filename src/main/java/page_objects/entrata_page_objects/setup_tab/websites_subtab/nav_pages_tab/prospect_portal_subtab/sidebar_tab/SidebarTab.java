package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.sidebar_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SidebarTab extends BasePage {
    public SidebarTab(WebDriver driver) {
        super(driver);
    }

    private final By PP_SIDEBAR_WIDGETS_HEADER = By.xpath("//h3[text()='Side Bar Widgets']");
    private final By PP_SIDEBAR_WIDGETS_EDIT_BTN = By.id("widgets-content-button");
    private final By PP_SIDEBAR_WIDGETS_TEXT = By.xpath("//li//span[1][text()='Widgets']");
    private final By PP_SIDEBAR_WIDGETS_STATUS_TEXT = By.xpath("//li//span[2][text()='Status']");
    private final By PP_SIDEBAR_WIDGETS_PROPERTY_VIDEO = By.xpath("//*[text()='Property Video']");
    private final By PP_SIDEBAR_WIDGETS_PROPERTY_BROCHURE = By.xpath("//*[text()='Property Brochure']");
    private final By PP_SIDEBAR_WIDGETS_CONTACT = By.xpath("//*[text()='Contact']");
    private final By PP_SIDEBAR_WIDGETS_PET_POLICY = By.xpath("//*[text()='Pet Policy']");
    private final By PP_SIDEBAR_WIDGETS_LOCATION = By.xpath("//*[text()='Location']");
    private final By PP_SIDEBAR_WIDGETS_IMPORTANT_LINKS = By.xpath("//*[text()='Important Links']");
    private final By PP_SIDEBAR_WIDGETS_OFFICE_HOURS = By.xpath("//*[text()='Office Hours']");
    private final By PP_SIDEBAR_WIDGETS_RATINGS_AND_REVIEWS = By.xpath("//*[text()='Ratings and Reviews']");
    private final By PP_SIDEBAR_SETTINGS_HEADER = By.xpath("//h3[text()='Side Bar Settings']");
    private final By PP_SIDEBAR_SETTINGS_EDIT_BTN = By.id("sidebar-settings-content-button");
    private final By PP_SIDEBAR_SETTINGS_CONTACT_US_RENAME = By.xpath("//*[text()='Contact Us Rename:']");
    private final By PP_SIDEBAR_SETTINGS_CONTACT_US_RENAME_TOOL_TIPS = By.id("RENAME_SEND_US_AN_EMAIL_WEBSITE_PREFERENCES_HELP");
    private final By PP_SIDEBAR_SETTINGS_IMPORTANT_LINKS_RENAME = By.xpath("//*[text()='Important Links Rename:']");
    private final By PP_SIDEBAR_SETTINGS_IMPORTANT_LINKS_RENAME_TOOL_TIPS = By.id("RENAME_IMPORTANT_LINKS_WEBSITE_PREFERENCES_HELP");
    private final By PP_SIDEBAR_SETTINGS_SIDEBAR = By.xpath("//*[text()='Side Bar:']");
    private final By PP_SIDEBAR_SETTINGS_SIDEBAR_TOOL_TIPS = By.id("RESPONSIVE_HIDE_SIDEBAR_WEBSITE_PREFERENCES_HELP");
    private final By PP_SIDEBAR_SETTINGS_SIDEBAR_LOCATION = By.xpath("//*[text()='Side Bar Location:']");
    private final By PP_SIDEBAR_SETTINGS_SIDEBAR_LOCATION_TOOL_TIPS = By.id("RESPONSIVE_SIDEBAR_POSITION_WEBSITE_PREFERENCES_HELP");

    public boolean ppSidebarWidgetsHeader() {
        return confirmElementIsVisible(PP_SIDEBAR_WIDGETS_HEADER);
    }
    public boolean ppSidebarWidgetsEditBtn() {
        return confirmElementIsVisible(PP_SIDEBAR_WIDGETS_EDIT_BTN);
    }
    public boolean ppSidebarWidgetsText() {
        return confirmElementIsVisible(PP_SIDEBAR_WIDGETS_TEXT);
    }
    public boolean ppSidebarWidgetsStatusText() {
        return confirmElementIsVisible(PP_SIDEBAR_WIDGETS_STATUS_TEXT);
    }
    public boolean ppSidebarWidgetsPropertyVideo() {
        return confirmElementIsVisible(PP_SIDEBAR_WIDGETS_PROPERTY_VIDEO);
    }
    public boolean ppSidebarWidgetsPropertyBrochure() {
        return confirmElementIsVisible(PP_SIDEBAR_WIDGETS_PROPERTY_BROCHURE);
    }
    public boolean ppSidebarWidgetsContact() {
        return confirmElementIsVisible(PP_SIDEBAR_WIDGETS_CONTACT);
    }
    public boolean ppSidebarWidgetsPetPolicy() {
        return confirmElementIsVisible(PP_SIDEBAR_WIDGETS_PET_POLICY);
    }
    public boolean ppSidebarWidgetsLocation() {
        return confirmElementIsVisible(PP_SIDEBAR_WIDGETS_LOCATION);
    }
    public boolean ppSidebarWidgetsImportantLinks() {
        return confirmElementIsVisible(PP_SIDEBAR_WIDGETS_IMPORTANT_LINKS);
    }
    public boolean ppSidebarWidgetsOfficeHours() {
        return confirmElementIsVisible(PP_SIDEBAR_WIDGETS_OFFICE_HOURS);
    }
    public boolean ppSidebarWidgetsRatingsAndReviews() {
        return confirmElementIsVisible(PP_SIDEBAR_WIDGETS_RATINGS_AND_REVIEWS);
    }
    public boolean ppSidebarSettingsHeader() {
        return confirmElementIsVisible(PP_SIDEBAR_SETTINGS_HEADER);
    }
    public boolean ppSidebarSettingsEditBtn() {
        return confirmElementIsVisible(PP_SIDEBAR_SETTINGS_EDIT_BTN);
    }
    public boolean ppSidebarSettingsContactUsRename() {
        return confirmElementIsVisible(PP_SIDEBAR_SETTINGS_CONTACT_US_RENAME);
    }
    public boolean ppSidebarSettingsContactUsRenameToolTips() {
        return clickElement(PP_SIDEBAR_SETTINGS_CONTACT_US_RENAME_TOOL_TIPS);
    }
    public boolean ppSidebarSettingsImportantLinksRename() {
        return confirmElementIsVisible(PP_SIDEBAR_SETTINGS_IMPORTANT_LINKS_RENAME);
    }
    public boolean ppSidebarSettingsImportantLinksRenameToolTips() {
        return clickElement(PP_SIDEBAR_SETTINGS_IMPORTANT_LINKS_RENAME_TOOL_TIPS);
    }
    public boolean ppSidebarSettingsSidebar() {
        return confirmElementIsVisible(PP_SIDEBAR_SETTINGS_SIDEBAR);
    }
    public boolean ppSidebarSettingsSidebarToolTips() {
        return clickElement(PP_SIDEBAR_SETTINGS_SIDEBAR_TOOL_TIPS);
    }
    public boolean ppSidebarSettingsSidebarLocation() {
        return confirmElementIsVisible(PP_SIDEBAR_SETTINGS_SIDEBAR_LOCATION);
    }
    public boolean ppSidebarSettingsSidebarLocationToolTips() {
        return clickElement(PP_SIDEBAR_SETTINGS_SIDEBAR_LOCATION_TOOL_TIPS);
    }
}
