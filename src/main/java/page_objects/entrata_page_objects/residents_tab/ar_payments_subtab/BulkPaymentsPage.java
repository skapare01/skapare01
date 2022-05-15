package page_objects.entrata_page_objects.residents_tab.ar_payments_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BulkPaymentsPage extends BasePage {
    public BulkPaymentsPage(WebDriver driver){
        super(driver);}
    private final By NUMBER_OF_PAYMENTS_FIELD = By.id("no_of_payment");
    private final By CANCEL_POPUP = By.id("js-payment-cancel");
    private final By CLOSE_BULK_PAYMENTS= By.cssSelector(".close-button");

    public boolean verifyNumberOfPaymentField(){return confirmElementIsVisible(NUMBER_OF_PAYMENTS_FIELD);}
    public boolean clickCancel(){return clickElement(CANCEL_POPUP);}
    public boolean clickClose(){return clickElement(CLOSE_BULK_PAYMENTS);}

}
