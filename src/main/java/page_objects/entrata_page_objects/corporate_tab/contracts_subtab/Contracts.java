package page_objects.entrata_page_objects.corporate_tab.contracts_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Contracts extends BasePage {

    public Contracts(WebDriver driver) {
        super(driver);
    }

    private final By FIRST_LISTED_CONTRACT = By.cssSelector("tr[onclick*='load_contract_details']");
    private final By CONTRACT_DETAILS = By.id("ap_contract_system");
    private final By ADD_CONTRACT_BUTTON = By.cssSelector("a[title='Add Contract']");
    private final By ADD_CONTRACT_FORM = By.id("add_contract_frm");

    //Contract Tabs

    private final By JOB_TAB = By.id("ap_contract_jobxxx");
    private final By FINANCIAL_TAB = By.id("ap_contract_financialxxx");
    private final By CONTRACT_INFO = By.id("view_change_orders");

    //**Financial Tab**

    private final By PURCHASE_ORDER_TAB = By.id("tab_2928");
    private final By INVOICES_TAB = By.id("tab_2929");
    private final By PURCHASE_ORDERS_INFO = By.id("ap_contract_container_div");
    private final By INVOICE_INFO = By.id("ap_contract_container_div");


    public boolean addContractButtonClick() {
        return clickElement(ADD_CONTRACT_BUTTON);
    }

    public boolean firstListedContractClick() {
        return clickElement(FIRST_LISTED_CONTRACT);
    }

    public boolean financialTabClick() {
        return clickElement(FINANCIAL_TAB);
    }

    public boolean invoiceTabClick() {
        return clickElement(INVOICES_TAB);
    }

    //Visibility of Element

    public boolean addContractFormVisible() {
        return confirmElementIsVisible(ADD_CONTRACT_FORM);
    }

    public boolean purchaseOrderTabVisible() {
        return confirmElementIsVisible(PURCHASE_ORDER_TAB);
    }

    public boolean invoiceTabVisible() {
        return confirmElementIsVisible(INVOICES_TAB);
    }

    public boolean jobTabVisible() {
        return confirmElementIsVisible(JOB_TAB);
    }

    public boolean financialTabVisible() {
        return confirmElementIsVisible(FINANCIAL_TAB);
    }

    public boolean contractInfoVisible() {
        return confirmElementIsVisible(CONTRACT_INFO);
    }

    public boolean purchaseOrdersInfoVisible() {
        return confirmElementIsVisible(PURCHASE_ORDERS_INFO);
    }

    public boolean invoicesInfoVisible() {
        return confirmElementIsVisible(INVOICE_INFO);
    }

    public boolean contractDetailsVisible() {
        return confirmElementIsVisible(CONTRACT_DETAILS);
    }
}
