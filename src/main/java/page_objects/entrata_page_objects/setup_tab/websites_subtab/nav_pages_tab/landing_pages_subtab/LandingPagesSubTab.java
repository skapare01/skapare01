package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.landing_pages_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LandingPagesSubTab extends BasePage {
    public LandingPagesSubTab(WebDriver driver) {
        super(driver);
    }

    private final By LANDING_PAGES_CONTACT_FORM_LANDING_PAGE_HEADER = By.xpath("//*[text()='Contact Form Landing Page']");
    private final By LANDING_PAGES_EDIT_BTN = By.id("landing-pages-settings-button");
    private final By LANDING_PAGES_USE_CONTACT_LANDING_FORM = By.xpath("//*[text()='Use Contact Landing Form:']");
    private final By LANDING_PAGES_USE_CONTACT_LANDING_FORM_TOOL_TIPS = By.id("SHOW_LANDING_PAGE_GUEST_CARD_FORM_HELP");
    private final By LANDING_PAGES_LANDING_PAGE_HEADING = By.xpath("//*[text()='Landing Page Heading:']");
    private final By LANDING_PAGES_LANDING_PAGE_HEADING_TOOL_TIPS = By.id("LANDING_PAGE_GUEST_CARD_HEADING_HELP");
    private final By LANDING_PAGES_TITLE = By.xpath("//*[text()='Title:']");
    private final By LANDING_PAGES_TITLE_TOOL_TIPS = By.id("LANDING_PAGE_GUEST_CARD_TITLE_HELP");
    private final By LANDING_PAGES_DESCRIPTION = By.xpath("//*[text()='Description:']");
    private final By LANDING_PAGES_DESCRIPTION_TOOL_TIPS = By.id("LANDING_PAGE_GUEST_CARD_DESCRIPTION_HELP");
    private final By LANDING_PAGES_CUSTOM_URL = By.xpath("//*[text()='Custom URL:']");
    private final By LANDING_PAGES_CUSTOM_URL_TOOL_TIPS = By.id("LANDING_PAGE_GUEST_CARD_URL_WEBSITE_PREFERENCES_HELP");
    private final By LANDING_PAGES_LEAD_SOURCE = By.xpath("//*[text()='Lead Source:']");
    private final By LANDING_PAGES_LEAD_SOURCE_TOOL_TIPS = By.id("LANDING_PAGE_GUEST_CARD_DEFAULT_LEAD_SOURCE_WEBSITE_PREFERENCES_HELP");
    private final By LANDING_PAGES_CONFIRMATION_PAGE_CONTENT = By.xpath("//*[text()='Confirmation Page Content:']");
    private final By LANDING_PAGES_CONFIRMATION_PAGE_CONTENT_TOOL_TIPS = By.id("LANDING_PAGE_GUEST_CARD_CONFIRMATION_MESSAGE_HELP");

    public boolean landingPageContactFormLandingPageHeader() {
        return confirmElementIsVisible(LANDING_PAGES_CONTACT_FORM_LANDING_PAGE_HEADER);
    }
    public boolean landingPagesContactFormLandingPageEditBtn() {
        return confirmElementIsVisible(LANDING_PAGES_EDIT_BTN);
    }
    public boolean landingPageUseContactLandingForm() {
        return confirmElementIsVisible(LANDING_PAGES_USE_CONTACT_LANDING_FORM);
    }
    public boolean landingPageUseContactLandingFormToolTips() {
        return clickElement(LANDING_PAGES_USE_CONTACT_LANDING_FORM_TOOL_TIPS);
    }
    public boolean landingPagesLandingPageHeading() {
        return confirmElementIsVisible(LANDING_PAGES_LANDING_PAGE_HEADING);
    }
    public boolean landingPagesLandingPageHeadingToolTips() {
        return clickElement(LANDING_PAGES_LANDING_PAGE_HEADING_TOOL_TIPS);
    }
    public boolean landingPagesTitle() {
        return confirmElementIsVisible(LANDING_PAGES_TITLE);
    }
    public boolean landingPagesTitleToolTips() {
        return clickElement(LANDING_PAGES_TITLE_TOOL_TIPS);
    }
    public boolean landingPagesDescription() {
        return confirmElementIsVisible(LANDING_PAGES_DESCRIPTION);
    }
    public boolean landingPagesDescriptionToolTips() {
        return clickElement(LANDING_PAGES_DESCRIPTION_TOOL_TIPS);
    }
    public boolean landingPagesCustomUrl() {
        return confirmElementIsVisible(LANDING_PAGES_CUSTOM_URL);
    }
    public boolean landingPagesCustomUrlToolTips() {
        return clickElement(LANDING_PAGES_CUSTOM_URL_TOOL_TIPS);
    }
    public boolean landingPagesLeadSource() {
        return confirmElementIsVisible(LANDING_PAGES_LEAD_SOURCE);
    }
    public boolean landingPagesLeadSourceToolTips() {
        return clickElement(LANDING_PAGES_LEAD_SOURCE_TOOL_TIPS);
    }
    public boolean landingPagesConfirmationPageContent() {
        return confirmElementIsVisible(LANDING_PAGES_CONFIRMATION_PAGE_CONTENT);
    }
    public boolean landingPagesConfirmationPageContentToolTips() {
        return clickElement(LANDING_PAGES_CONFIRMATION_PAGE_CONTENT_TOOL_TIPS);
    }
}
