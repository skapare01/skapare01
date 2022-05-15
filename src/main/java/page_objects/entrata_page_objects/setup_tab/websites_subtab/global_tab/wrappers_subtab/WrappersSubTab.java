package page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.wrappers_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WrappersSubTab extends BasePage {
    public WrappersSubTab(WebDriver driver) {
        super(driver);
    }

    private final By ADD_WRAPPERS_BTN = By.className("add");
    private final By WRAPPERS_HEADER = By.xpath("//*[text()='Wrappers']");
    private final By WRAPPERS_RECACHE_TEXT = By.xpath("//*[text()='Re-Cache']");
    private final By WRAPPERS_TEXT = By.xpath("//*[text()='Wrapper']");
    private final By WRAPPER_TEXT_TYPE = By.xpath("//*[text()='Wrapper Type']");
    private final By WRAPPER_URL_TEXT = By.xpath("//*[text()='Wrapper URL']");
    private final By WRAPPER_KEY_TEXT = By.xpath("//*[text()='Wrapper Key']");
    private final By WRAPPERS_CUSTOM_CSS_TEXT = By.xpath("//*[text()='Custom CSS']");
    private final By WRAPPERS_ACTION_TEXT = By.xpath("//*[text()='Actions']");

    public boolean addWrapperBtn() {
        return confirmElementIsVisible(ADD_WRAPPERS_BTN);
    }
    public boolean wrappersHeader() {
        return confirmElementIsVisible(WRAPPERS_HEADER);
    }
    public boolean wrappersReCacheText() {
        return confirmElementIsVisible(WRAPPERS_RECACHE_TEXT);
    }
    public boolean wrappersText() {
        return confirmElementIsVisible(WRAPPERS_TEXT);
    }
    public boolean wrapperTypeText() {
        return confirmElementIsVisible(WRAPPER_TEXT_TYPE);
    }
    public boolean wrapperURLText() {
        return confirmElementIsVisible(WRAPPER_URL_TEXT);
    }
    public boolean wrapperKeyText() {
        return confirmElementIsVisible(WRAPPER_KEY_TEXT);
    }
    public boolean wrapperCustomCSSText() {
        return confirmElementIsVisible(WRAPPERS_CUSTOM_CSS_TEXT);
    }
    public boolean wrapperActionText() {
        return confirmElementIsVisible(WRAPPERS_ACTION_TEXT);
    }
}
