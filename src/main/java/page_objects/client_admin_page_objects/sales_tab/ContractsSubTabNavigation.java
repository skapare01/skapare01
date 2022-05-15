package page_objects.client_admin_page_objects.sales_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ContractsSubTabNavigation extends BasePage {
    public ContractsSubTabNavigation(WebDriver driver) {
        super(driver);
    }

    private final By CONTRACTS_PAGE_HEADER_TEXT = By.xpath("//h1[text()='Contracts']");

    public boolean contractsPageHeaderText() {
        return confirmElementIsVisible(CONTRACTS_PAGE_HEADER_TEXT);
    }
}
