package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.root_pages_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class RootPagesSubTab extends BasePage {
    public RootPagesSubTab(WebDriver driver) {
        super(driver);
    }

    private final By ROOT_PAGES_HEADER = By.xpath("//*[text()='Root Pages']");
    private final By ADD_ROOT_PAGES_BTN = By.xpath("//*[@id=\"view-website-root-pages\"]/div[1]/a");
    private final By ROOT_PAGES_LIST_WINDOW = By.id("root-page-list");

    public boolean rootPagesHeader() {
        return confirmElementIsVisible(ROOT_PAGES_HEADER);
    }
    public boolean addRootPageBtn() {
        return confirmElementIsVisible(ADD_ROOT_PAGES_BTN);
    }
    public boolean rootPagesListWindow() {
        return confirmElementIsVisible(ROOT_PAGES_LIST_WINDOW);
    }
}
