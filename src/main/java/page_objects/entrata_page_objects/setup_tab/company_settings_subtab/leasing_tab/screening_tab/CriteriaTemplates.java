package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.screening_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class CriteriaTemplates extends BasePage{

    public CriteriaTemplates(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By CRITERIATEMPLATESTABLE = By.cssSelector("#company_setup_sub_container > b > b");

    //Methods
    public boolean verifyCriteriaTempalateVisible() {
        return confirmElementIsVisible(CRITERIATEMPLATESTABLE);
    }

}
