package page_objects.entrata_page_objects.setup_tab.websites_subtab.seo_tab.canonical_urls_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CanonicalUrls extends BasePage {
    public CanonicalUrls(WebDriver driver) {
        super(driver);
    }

    private String SEND_KEYS = "test.com";
    private final By CANONICAL_URLS_HEADER = By.xpath("//h3[text()='Canonical URLs']");
    private final By CANONICAL_URLS_SEARCH_BAR = By.id("canonical_url_search");
    private final By CANONICAL_URLS_IMPORT_FROM_CSV_BTN = By.xpath("//*[text()=' Import from CSV']");
    private final By CANONICAL_URLS_ADD_URL_BTN = By.xpath("//*[text()=' Add URL']");
    private final By CANONICAL_URLS_LINK_TEXT = By.xpath("//*[text()='Link']");
    private final By CANONICAL_URLS_URL_TEXT = By.xpath("//*[text()='URL']");
    private final By CANONICAL_URLS_CREATED_TEXT = By.xpath("//*[text()='Created']");
    private final By CANONICAL_URLS_LAST_UPDATE_TEXT = By.xpath("//*[text()='Last Update']");
    private final By CANONICAL_URLS_ACTIONS_TEXT = By.xpath("//*[text()='Actions']");

    public boolean canonicalUrlsHeader() {
        return confirmElementIsVisible(CANONICAL_URLS_HEADER);
    }
    public boolean canonicalUrlSearchBar() {
        return confirmElementIsVisible(CANONICAL_URLS_SEARCH_BAR);
    }
    public boolean canonicalUrlSearchBarAddText() {
        return sendKeysToElement(CANONICAL_URLS_SEARCH_BAR,SEND_KEYS);
    }
    public boolean canonicalUrlsImportFromCsvBtn() {
        return confirmElementIsVisible(CANONICAL_URLS_IMPORT_FROM_CSV_BTN);
    }
    public boolean canonicalUrlsAddUrlBtn() {
        return confirmElementIsVisible(CANONICAL_URLS_ADD_URL_BTN);
    }
    public boolean canonicalUrlsLinkText() {
        return confirmElementIsVisible(CANONICAL_URLS_LINK_TEXT);
    }
    public boolean canonicalUrlsUrlText() {
        return confirmElementIsVisible(CANONICAL_URLS_URL_TEXT);
    }
    public boolean canonicalUrlsCreatedText() {
        return confirmElementIsVisible(CANONICAL_URLS_CREATED_TEXT);
    }
    public boolean canonicalUrlsLastUpdateText() {
        return confirmElementIsVisible(CANONICAL_URLS_LAST_UPDATE_TEXT);
    }
    public boolean canonicalUrlsActionText() {
        return confirmElementIsVisible(CANONICAL_URLS_ACTIONS_TEXT);
    }
}
