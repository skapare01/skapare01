package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.property_overview_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PropertyOverviewTab extends BasePage {
    public PropertyOverviewTab(WebDriver driver) {
        super(driver);
    }

    private final By PP_PROPERTY_OVERVIEW_PAGE_HEADER = By.xpath("//h3[text()='Property Overview Page']");
    private final By PP_PROPERTY_OVERVIEW_EDIT_BTN = By.id("property-overview-content-button");
    private final By PP_PROPERTY_OVERVIEW_ALLOW_PROSPECT_GENERATED_QUOTES = By.xpath("//*[text()='Allow Prospect Generated Quotes:']");
    private final By PP_PROPERTY_OVERVIEW_ALLOW_PROSPECT_GENERATED_QUOTES_TOOL_TIPS = By.id("SHOW_QUOTE_WEBSITE_PREFERENCES_HELP");
    private final By PP_PROPERTY_OVERVIEW_PHOTO_MEDIA_OVERLAY = By.xpath("//*[text()='Photo Media Overlay:']");
    private final By PP_PROPERTY_OVERVIEW_PHOTO_MEDIA_OVERLAY_TOOL_TIPS = By.id("HIDE_PHOTO_MEDIA_OVERLAY_WEBSITE_PREFERENCES_HELP");

    public boolean ppPropertyOverviewPageHeader() {
        return confirmElementIsVisible(PP_PROPERTY_OVERVIEW_PAGE_HEADER);
    }
    public boolean ppPropertyOverviewEditBtn() {
        return confirmElementIsVisible(PP_PROPERTY_OVERVIEW_EDIT_BTN);
    }
    public boolean ppPropertyOverviewAllowProspectGeneratedQuotes() {
        return confirmElementIsVisible(PP_PROPERTY_OVERVIEW_ALLOW_PROSPECT_GENERATED_QUOTES);
    }
    public boolean ppPropertyOverviewAllowProspectGeneratedQuotesToolTips() {
        return clickElement(PP_PROPERTY_OVERVIEW_ALLOW_PROSPECT_GENERATED_QUOTES_TOOL_TIPS);
    }
    public boolean ppPropertyOverviewPhotoMediaOverlay() {
        return confirmElementIsVisible(PP_PROPERTY_OVERVIEW_PHOTO_MEDIA_OVERLAY);
    }
    public boolean ppPropertyOverviewPhotoMediaOverlayToolTips() {
        return clickElement(PP_PROPERTY_OVERVIEW_PHOTO_MEDIA_OVERLAY_TOOL_TIPS);
    }
}
