package page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.branding_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BrandingTabs extends BasePage {
    public BrandingTabs(WebDriver driver) {
        super(driver);
    }

    private final By COLORS_THEME_SUB_TAB =By.id("website_design_branding_colorsxxx");
    private final By FONTS_SUB_TAB = By.id("website_design_branding_fontsxxx");
    private final By PATTERNS_SUB_TAB = By.id("website_design_branding_patternsxxx");
    private final By DESIGN_SETTINGS_SUB_TAB = By.id("website_design_branding_template_settingsxxx");

    public boolean colorsThemeSubTab() {
        return clickElement(COLORS_THEME_SUB_TAB);
    }
    public boolean fontsSubTab() {
        return clickElement(FONTS_SUB_TAB);
    }
    public boolean patternsSubTab() {
        return confirmElementIsVisible(PATTERNS_SUB_TAB);
    }
    public boolean designSettingsSubTab() {
        return clickElement(DESIGN_SETTINGS_SUB_TAB);
    }
}
