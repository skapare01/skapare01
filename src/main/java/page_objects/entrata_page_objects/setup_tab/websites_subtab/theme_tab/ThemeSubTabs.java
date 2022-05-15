package page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ThemeSubTabs extends BasePage {
    public ThemeSubTabs(WebDriver driver) {
        super(driver);
    }

    private final By DESIGN_SUB_TAB = By.id("website_design_templatexxx");
    private final By BRANDING_SUB_TAB = By.id("website_design_brandingxxx");
    private final By JOURNEY_SUB_TAB = By.id("website_design_journeysxxx");
    private final By MEDIA_SUB_TAB = By.id("website_design_mediaxxx");
    private final By WIDGETS_SUB_TAB = By.id("website_design_widgetsxxx");

    public boolean designSubTab() {
        return clickElement(DESIGN_SUB_TAB);
    }
    public boolean brandingSubTab() {
        return clickElement(BRANDING_SUB_TAB);
    }
    public boolean journeysSubTab() {
        return clickElement(JOURNEY_SUB_TAB);
    }
    public boolean mediaSubTab() {
        return clickElement(MEDIA_SUB_TAB);
    }
    public boolean widgetsSubTab() {
        return clickElement(WIDGETS_SUB_TAB);
    }
}
