package page_objects.entrata_page_objects.setup_tab.websites_subtab.seo_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SeoSubTabs extends BasePage {
    public SeoSubTabs(WebDriver driver) {
        super(driver);
    }

    private final By GENERAL_SUB_TAB = By.id("website_seo_generalxxx");
    private final By CANONICAL_URLS_SUB_TAB = By.id("website_seo_canonicalurlsxxx");

    public boolean generalSubTab() {
        return clickElement(GENERAL_SUB_TAB);
    }
    public boolean canonicalUrlsSubTab() {
        return clickElement(CANONICAL_URLS_SUB_TAB);
    }
}
