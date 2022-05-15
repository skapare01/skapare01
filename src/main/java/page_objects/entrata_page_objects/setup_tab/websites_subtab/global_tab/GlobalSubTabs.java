package page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GlobalSubTabs extends BasePage {
    public GlobalSubTabs(WebDriver driver) {
        super(driver);
    }

    private final By INFO_TAB = By.id("website_global_infoxxx");
    private final By DOMAINS_TAB = By.id("website_global_domainsxxx");
    private final By SNIPPETS_TAB = By.id("website_global_snippetsxxx");
    private final By WRAPPERS_TAB = By.id("website_global_wrappersxxx");
    private final By ENCRYPTION_TAB = By.id("website_global_encryptionxxx");
    private final By COOKIE_SETTINGS_TAB = By.id("website_global_cookiexxx");

    public boolean infoSubTab() {
        return clickElement(INFO_TAB);
    }
    public boolean domainsTab() {
        return clickElement(DOMAINS_TAB);
    }
    public boolean snippetsTab() {
        return clickElement(SNIPPETS_TAB);
    }
    public boolean wrappersTab() {
        return clickElement(WRAPPERS_TAB);
    }
    public boolean encryptionTab() {
        return clickElement(ENCRYPTION_TAB);
    }
    public boolean cookieSettingsTab() {
        return clickElement(COOKIE_SETTINGS_TAB);
    }
}
