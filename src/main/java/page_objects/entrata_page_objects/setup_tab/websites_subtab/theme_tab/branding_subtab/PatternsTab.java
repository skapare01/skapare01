package page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.branding_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PatternsTab extends BasePage {
    public PatternsTab(WebDriver driver) {
        super(driver);
    }

    private final By BRANDING_PATTERNS_AVAILABLE_PATTERNS_WINDOW = By.id("settings_content");

    public boolean brandingPatternsAvailablePatternsWindow() {
        return confirmElementIsVisible(BRANDING_PATTERNS_AVAILABLE_PATTERNS_WINDOW);
    }
}
