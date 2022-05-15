package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.amenities_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AmenitiesTab extends BasePage {
    public AmenitiesTab(WebDriver driver) {
        super(driver);
    }

    private final By PP_AMENITIES_PAGE_HEADER = By.xpath("//*[text()=' Amenities Page  ']");
    private final By PP_AMENITIES_EDIT_BTN = By.id("amenities-content-button");
    private final By PP_AMENITIES_DISCLAIMER_TEXT =  By.xpath("//*[text()='Disclaimer Text:']");
    private final By PP_AMENITIES_DISCLAIMER_TOOL_TIPS = By.id("AMENITIES_DISCLAIMER_TEXT_WEBSITE_PREFERENCES_HELP");
    private final By PP_AMENITIES_TYPE = By.xpath("//*[text()='Amenities Type:']");
    private final By PP_AMENITIES_TYPE_TOOL_TIPS = By.xpath("//*[@id=\"amenities-content-view\"]/div[1]/div[2]/span/i");
    private final By PP_AMENITIES_PAGE_LAYOUT = By.xpath("//*[text()='Page Layout:']");
    private final By PP_AMENITIES_PAGE_LAYOUT_TOOL_TIPS = By.id("AMENITIES_LAYOUT_TYPE_WEBSITE_PREFERENCES_HELP");

    public boolean ppAmenitiesPageHeader() {
        return confirmElementIsVisible(PP_AMENITIES_PAGE_HEADER);
    }
    public boolean ppAmenitiesEditBtn() {
        return confirmElementIsVisible(PP_AMENITIES_EDIT_BTN);
    }
    public boolean ppamenitiesDisclaimerText() {
        return confirmElementIsVisible(PP_AMENITIES_DISCLAIMER_TEXT);
    }
    public boolean ppamenitiesDisclaimerToolTips() {
        return clickElement(PP_AMENITIES_DISCLAIMER_TOOL_TIPS);
    }
    public boolean ppamenitiesTypeText() {
        return confirmElementIsVisible(PP_AMENITIES_TYPE);
    }
    public boolean ppamenitiesTypeToolTips() {
        return clickElement(PP_AMENITIES_TYPE_TOOL_TIPS);
    }
    public boolean ppamenitiesPageLayoutText() {
        return confirmElementIsVisible(PP_AMENITIES_PAGE_LAYOUT);
    }
    public boolean ppamenitiesPageLayoutToolTips() {
        return clickElement(PP_AMENITIES_PAGE_LAYOUT_TOOL_TIPS);
    }
}
