package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CompanyLeasingNav extends BasePage {

    public CompanyLeasingNav(WebDriver driver) {
        super(driver);
    }

    //Leasing Tab Names
    private final By LEASE_TAB = By.id("li_nav_leasing_leasexxx");
    private final By SCREENING_TAB = By.id("li_nav_screening_setupxxx");
    private final By APPLICATION_TAB = By.id("li_nav_leasing_applicationxxx");

    //Leasing Tab Navigation Methods
    public boolean clickLeaseSubTab() {
        return clickElement(LEASE_TAB);
    }

    public boolean clickScreeningTab(){
        return clickElement(SCREENING_TAB);
    }

    public boolean clickApplicationTab(){return clickElement(APPLICATION_TAB);}

}