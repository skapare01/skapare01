package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.delinquency_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DelinquencyPage extends BasePage {
    public DelinquencyPage(WebDriver driver){
        super(driver);}

    private final By EDIT_LATE_FEE_POSTING = By.id("late_fee_posting-button");

    public boolean verifyEditLateFeePostingButton(){return confirmElementIsVisible(EDIT_LATE_FEE_POSTING);}
}
