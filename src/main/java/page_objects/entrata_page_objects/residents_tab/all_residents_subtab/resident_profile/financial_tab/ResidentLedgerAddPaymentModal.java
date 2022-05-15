package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.financial_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentLedgerAddPaymentModal extends BasePage {
    //Add payment modal locators
    private final By AMOUNT_FIELD = By.id("transaction_amount");
    private final By CANCEL_BUTTON = By.linkText("Cancel");

    public ResidentLedgerAddPaymentModal(WebDriver driver) {
        super(driver);
    }

    //Add payment modal methods
    public boolean amountFieldIsVisible(){return confirmElementIsVisible(AMOUNT_FIELD);}
    public boolean clickCancel(){return clickElement(CANCEL_BUTTON);}
}
