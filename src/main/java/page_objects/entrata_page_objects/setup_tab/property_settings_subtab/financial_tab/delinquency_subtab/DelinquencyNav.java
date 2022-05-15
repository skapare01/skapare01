package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.delinquency_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DelinquencyNav extends BasePage {
    public DelinquencyNav(WebDriver driver){
        super(driver);}
    private final By DELINQUENCY_TAB = By.id("property_financial_delinquency_delinquencyxxx");
    private final By PRECOLLECTIONS_TAB = By.id("property_financial_delinquency_collectionsxxx");

    public boolean clickDelinquencyTab(){return clickElement(DELINQUENCY_TAB);}
    public boolean clickPreCollectionsTab(){return clickElement(PRECOLLECTIONS_TAB);}
}
