package page_objects.entrata_page_objects.setup_tab.websites_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WebsiteListPage extends BasePage {
    public WebsiteListPage(WebDriver driver) {
        super(driver);
    }

    // KHansen
    private final By GAMBIT_WEBSITE = By.xpath("//div//em[text()='Gambit']");
    // 1automationRapid
    private final By AUTOMATION_PP_UX_WEBSITE = By.xpath("//*[text()='AutomationPPUX']");
    // Village
    private final By VILLAGE_BEND_EAST_WEBSITE = By.xpath("//div//em[text()='The Village Bend East']");
    private final By FIRST_LISTED_WEBSITE = By.cssSelector("tr[class='aRow']");

    public boolean gambitWebsite() {
        return clickElement(GAMBIT_WEBSITE);
    }
    public boolean automationPpUxWebsite() {
        return clickElement(AUTOMATION_PP_UX_WEBSITE);
    }
    public boolean villageBendEastWebsite() {
        return clickElement(VILLAGE_BEND_EAST_WEBSITE);
    }
    public boolean firstListedWebsiteClick() {
        return clickElement(FIRST_LISTED_WEBSITE);
    }
}


