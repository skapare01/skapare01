package page_objects.entrata_page_objects.accounting_tab.vendors_subtab.view_vendor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class VendorsFinancial extends BasePage {

    public VendorsFinancial(WebDriver driver) {
        super(driver);
    }

    private final By FINANCIAL_TAB = By.cssSelector("a[onclick*='ap_payee_financial']");
    private final By PURCHASE_ORDER_TAB = By.id("view_purchase_orders");
    private final By INVOICES_TAB = By.id("view_ap_payee_invoices");
    private final By PURCHASE_ORDERS_INFO = By.id("financial_purchase_order_list_container");
    private final By INVOICES_INFO = By.id("view_transactions_list_container");

    public boolean financialTabClick() {
        return clickElement(FINANCIAL_TAB);
    }

    public boolean purchaseTabClick() {
        return clickElement(PURCHASE_ORDER_TAB);
    }

    public boolean invoicesTabClick() {
        return clickElement(INVOICES_TAB);
    }

    //Visibility

    public boolean financialTabVisible() {
        return confirmElementIsVisible(FINANCIAL_TAB);
    }

    public boolean purchaseTabVisible() {
        return confirmElementIsVisible(PURCHASE_ORDER_TAB);
    }

    public boolean invoicesTabVisible() {
        return confirmElementIsVisible(INVOICES_TAB);
    }

    public boolean purchaseInfoVisible() {
        return confirmElementIsVisible(PURCHASE_ORDERS_INFO);
    }

    public boolean invoicesInfoVisible() {
        return confirmElementIsVisible(INVOICES_INFO);
    }
}
