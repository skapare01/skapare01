package page_objects.entrata_page_objects.setup_tab.websites_subtab.multi_property_tab.apartment_search_tabs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ApartmentSearchTabs extends BasePage {
    public ApartmentSearchTabs(WebDriver driver) {
        super(driver);
    }

    private final By GENERAL_TAB = By.id("website_multi_property_apartment_search_generalxxx");
    private final By CONVENTIONAL_TAB = By.id("website_multi_property_apartment_search_conventionalxxx");
    private final By STUDENT_TAB = By.id("website_multi_property_apartment_search_studentxxx");

    public boolean generalTab() {
        return clickElement(GENERAL_TAB);
    }
    public boolean conventionalTab() {
        return clickElement(CONVENTIONAL_TAB);
    }
    public boolean studentTab() {
        return clickElement(STUDENT_TAB);
    }
}
