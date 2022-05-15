package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.payments_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PaymentsNav extends BasePage {

    public PaymentsNav(WebDriver driver) {
        super(driver);}

    private final By INSTALLMENT_PLANS = By.id("property_financial_payments_installment_plansxxx");

    public boolean clickInstallmentPlans(){return clickElement(INSTALLMENT_PLANS);}
}
