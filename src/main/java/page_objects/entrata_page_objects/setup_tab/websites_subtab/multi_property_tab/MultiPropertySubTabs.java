package page_objects.entrata_page_objects.setup_tab.websites_subtab.multi_property_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MultiPropertySubTabs extends BasePage {
    public MultiPropertySubTabs(WebDriver driver) {
        super(driver);
    }

    private final By APARTMENT_SEARCH_SUB_TAB = By.id("website_multi_property_apartment_searchxxx");
    private final By GENERAL_SETTINGS_SUB_TAB = By.id("website_multi_property_general_settingsxxx");

    public boolean apartmentSearchSubTab() {
        return clickElement(APARTMENT_SEARCH_SUB_TAB);
    }
    public boolean generalSettingsSubTab() {
        return clickElement(GENERAL_SETTINGS_SUB_TAB);
    }
}
