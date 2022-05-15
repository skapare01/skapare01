package page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.domains_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DomainsSubTab extends BasePage {
    public DomainsSubTab(WebDriver driver) {
        super(driver);
    }

    private final By SUB_DOMAIN = By.id("display-sub-domain");
    private final By ADD_DOMAIN = By.xpath("//*[text()=' Add Domain']");

    public boolean subDomain() {
        return confirmElementIsVisible(SUB_DOMAIN);
    }
    public boolean addDomain() {
        return confirmElementIsVisible(ADD_DOMAIN);
    }
}
