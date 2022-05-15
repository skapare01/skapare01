package page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.snippets_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SnippetsSubTab extends BasePage {
    public SnippetsSubTab(WebDriver driver) {
        super(driver);
    }

    private final By SNIPPET_GENERATOR = By.id("b_website_global");
    private final By SNIPPET_TYPE = By.id("js-snippet-type");
    private final By SNIPPET_ADVANCED_SETTINGS = By.xpath("//*[text()=' Advanced Settings']");
    private final By SNIPPET_GENERATE_CODE_WINDOW = By.id("generated-code");
    private final By SNIPPET_COPY_TO_CLIPBOARD_BTN = By.id("copy_to_clipboard");
    private final By GENERATE_SNIPPET_BTN = By.id("generate_snippet_code");

    public boolean snippetGenerator() {
        return confirmElementIsVisible(SNIPPET_GENERATOR);
    }
    public boolean snippetType() {
        return clickElement(SNIPPET_TYPE);
    }
    public boolean snippetAdvancedSettings() {
        return clickElement(SNIPPET_ADVANCED_SETTINGS);
    }
    public boolean snippetGeneratedCodeWindow() {
        return confirmElementIsVisible(SNIPPET_GENERATE_CODE_WINDOW);
    }
    public boolean snippetCopyToClipboardBtn() {
        return confirmElementIsVisible(SNIPPET_COPY_TO_CLIPBOARD_BTN);
    }
    public boolean generateSnippetBtn() {
        return confirmElementIsVisible(GENERATE_SNIPPET_BTN);
    }
}
