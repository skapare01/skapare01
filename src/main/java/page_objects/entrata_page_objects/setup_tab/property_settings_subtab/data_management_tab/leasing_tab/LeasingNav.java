package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.data_management_tab.leasing_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LeasingNav extends BasePage {

    public LeasingNav(WebDriver driver) {
        super(driver);
    }

    //Leasing Tab Names
    private final By SCREENINGTAB = By.id("property_data_management_leasing_screeningxxx");

    //Leasing Tab Methods
    public boolean clickScreeningTab() {
        return  clickElement(SCREENINGTAB);
    }

}
