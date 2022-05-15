package page_objects.entrata_page_objects.residents_tab.charges_subtab.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GenerateCustomerInvoices extends BasePage {

    public GenerateCustomerInvoices(WebDriver driver) {
        super(driver);
    }

    private final By GENERATE_CUSTOMER_INVOICES_PAGE = By.id("generate_customer_invoices");

    public boolean generateCustomerInvoicesPageVisible() {
        return confirmElementIsVisible(GENERATE_CUSTOMER_INVOICES_PAGE);
    }
}
