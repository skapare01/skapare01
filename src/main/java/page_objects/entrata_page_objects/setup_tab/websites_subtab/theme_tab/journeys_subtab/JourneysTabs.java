package page_objects.entrata_page_objects.setup_tab.websites_subtab.theme_tab.journeys_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class JourneysTabs extends BasePage {
    public JourneysTabs(WebDriver driver) {
        super(driver);
    }

    private final By GENERAL_TAB = By.id("website_design_journeys_generalxxx");
    private final By CONVENTIONAL_TAB = By.id("website_design_journeys_conventionalxxx");
    private final By FLEXIBLE_TAB = By.id("website_design_journeys_flexiblexxx");
    private final By STUDENT_TAB =  By.id("website_design_journeys_studentxxx");
    private final By MILITARY_TAB = By.id("website_design_journeys_militaryxxx");

    public boolean generalTab() {
        return clickElement(GENERAL_TAB);
    }
    public boolean conventionalTab() {
        return clickElement(CONVENTIONAL_TAB);
    }
    public boolean flexibleTab() {
        return clickElement(FLEXIBLE_TAB);
    }
    public boolean studentTab() {
        return clickElement(STUDENT_TAB);
    }
    public boolean militaryTab() {
        return clickElement(MILITARY_TAB);
    }
}
