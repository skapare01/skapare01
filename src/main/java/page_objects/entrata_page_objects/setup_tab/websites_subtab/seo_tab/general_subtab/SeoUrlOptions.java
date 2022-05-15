package page_objects.entrata_page_objects.setup_tab.websites_subtab.seo_tab.general_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SeoUrlOptions extends BasePage {
    public SeoUrlOptions(WebDriver driver) {
        super(driver);
    }

    private final By SEO_URL_OPTIONS_HEADER = By.xpath("//*[text()='SEO URL Options']");
    private final By SEO_URL_OPTIONS_EDIT_BTN = By.id("seo-options-btn");
    private final By SEO_URL_OPTIONS_CITY_EXTENSION = By.xpath("//*[text()='City Extension:']");
    private final By SEO_URL_OPTIONS_CITY_EXTENSION_TOOL_TIPS = By.id("CITY_SEO_FORMAT_EXTENSION_WEBSITE_PREFERENCES_HELP");
    private final By SEO_URL_OPTIONS_PROPERTY_EXTENSION = By.xpath("//*[text()='Property Extension:']");
    private final By SEO_URL_OPTIONS_PROPERTY_EXTENSION_TOOL_TIPS = By.id("SUB_SUB_AREA_SEO_FORMAT_PROPERTY_EXTENSION_WEBSITE_PREFERENCES_HELP");

    public boolean seoUrlOptionsHeader() {
        return confirmElementIsVisible(SEO_URL_OPTIONS_HEADER);
    }
    public boolean seoUrlOptionsEditBtn() {
        return confirmElementIsVisible(SEO_URL_OPTIONS_EDIT_BTN);
    }
    public boolean seoUrlOptionsCityExtension() {
        return confirmElementIsVisible(SEO_URL_OPTIONS_CITY_EXTENSION);
    }
    public boolean seoUrlOptionsCityExtensionToolTips() {
        return clickElement(SEO_URL_OPTIONS_CITY_EXTENSION_TOOL_TIPS);
    }
    public boolean seoUrlOptionsPropertyExtension() {
        return confirmElementIsVisible(SEO_URL_OPTIONS_PROPERTY_EXTENSION);
    }
    public boolean seoUrlOptionsPropertyExtensionToolTips() {
        return clickElement(SEO_URL_OPTIONS_PROPERTY_EXTENSION_TOOL_TIPS);
    }
}
