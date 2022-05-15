package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.general_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GeneralNav extends BasePage {

    public GeneralNav(WebDriver driver) {
        super(driver);}

    private final By LOCATION_TAB = By.id("property_details_general_locationxxx");



    public boolean clickLocationTab(){ return clickElement(LOCATION_TAB);}
}
