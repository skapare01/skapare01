package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.screening_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ScreeningNav extends BasePage {

    public ScreeningNav(WebDriver driver) {
        super(driver);
    }

    //Screening Tab Names
    private final By PACKAGES = By.id("li_sub_nav_screening_packages_newxxx");
    private final By CONDITIONTEMPLATES = By.id("li_sub_nav_screening_package_newconditionsxxx");
    private final By CRITERIATEMPLATES = By.id("li_sub_nav_screening_package_newcriteriasxxx");

    //Screening Tab Navigation Methods
    public boolean clickPackagesTab() {
        return clickElement(PACKAGES);
    }

    public boolean clickConditionTemplatesTab() {
        return clickElement(CONDITIONTEMPLATES);
    }

    public boolean clickCriteriaTemplatesTab() {
        return clickElement(CRITERIATEMPLATES);
    }

}
