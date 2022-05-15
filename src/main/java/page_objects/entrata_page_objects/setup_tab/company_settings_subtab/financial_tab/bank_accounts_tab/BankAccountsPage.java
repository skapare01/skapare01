package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.financial_tab.bank_accounts_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BankAccountsPage extends BasePage {

    public BankAccountsPage(WebDriver driver) {super(driver);}

    private final By BANK_ACCOUNTS_CONTAINER = By.id("bank_listing");

    public boolean confirmVisibilityOfBankAccountsContainer() {return confirmElementIsVisible(BANK_ACCOUNTS_CONTAINER);}
}
