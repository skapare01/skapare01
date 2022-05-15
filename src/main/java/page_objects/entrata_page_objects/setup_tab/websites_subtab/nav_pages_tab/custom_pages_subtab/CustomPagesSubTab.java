package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.custom_pages_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CustomPagesSubTab extends BasePage {
    public CustomPagesSubTab(WebDriver driver) {
        super(driver);
    }

    private final By CUSTOM_PAGES_HEADER = By.xpath("//h3[text()='Custom Pages']");
    private final By CUSTOM_PAGES_ADD_PAGE_BTN = By.xpath("//*[text()=' Add Page ']");
    private final By CUSTOM_PAGES_ADDED_WINDOW = By.xpath("//*[text()='No Custom pages added for this website.']");

    public boolean customPagesHeader() {
        return confirmElementIsVisible(CUSTOM_PAGES_HEADER);
    }
    public boolean customPagesAddPageBtn() {
        return confirmElementIsVisible(CUSTOM_PAGES_ADD_PAGE_BTN);
    }
    public boolean customPagesAddedWindow() {
        return confirmElementIsVisible(CUSTOM_PAGES_ADDED_WINDOW);
    }
}
