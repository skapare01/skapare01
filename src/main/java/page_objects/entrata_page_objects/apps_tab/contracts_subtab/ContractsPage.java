package page_objects.entrata_page_objects.apps_tab.contracts_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ContractsPage extends BasePage {

    public ContractsPage(WebDriver driver) {super(driver);}

    private final By CONTRACTS_DIV = By.id("contract_contents_div");

    public boolean confirmVisibilityOfContractsDiv() {return confirmElementIsVisible(CONTRACTS_DIV);}
}
