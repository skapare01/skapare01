package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.marketing_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MarketingNav extends BasePage {

    public MarketingNav(WebDriver driver) {
        super(driver);}

    private final By LEAD_SOURCES_TAB = By.id("property_marketing_lead_sourcesxxx");



    public boolean clickLeadSourcesTab(){return clickElement(LEAD_SOURCES_TAB);}
}
