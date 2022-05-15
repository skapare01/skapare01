package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.accounts_payable_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class TransactionsPage extends BasePage {

    public TransactionsPage(WebDriver driver) {super(driver);}

    private final By GENERAL_INVOICE_SETTING_CONTAINER = By.id("genral_invoice_setting_container");

    public boolean confirmVisibilityAccountsPayableSettingsContainer() {return confirmElementIsVisible(GENERAL_INVOICE_SETTING_CONTAINER);}
}
