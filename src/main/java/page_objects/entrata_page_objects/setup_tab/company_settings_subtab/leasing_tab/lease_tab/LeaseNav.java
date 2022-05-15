package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.lease_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LeaseNav extends BasePage {

    //Constructor
    public LeaseNav(WebDriver driver) {
        super(driver);
    }

    private final By LEASE_TERM_STRUCTURES_BUTTON = By.id("li_sub_nav_lease_term_structures_setup_actionxxx");
    private final By SPACE_OPTIONS_TAB = By.id("li_sub_nav_space_options_setupxxx");

    //Methods
    public boolean clickLeaseStructuresTab(){
        return clickElement(LEASE_TERM_STRUCTURES_BUTTON);}

    public boolean clickSpaceOptionsTab(){
        return clickElement(SPACE_OPTIONS_TAB);}

}
