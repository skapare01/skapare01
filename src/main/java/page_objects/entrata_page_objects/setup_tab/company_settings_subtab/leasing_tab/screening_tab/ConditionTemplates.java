package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.screening_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ConditionTemplates extends BasePage{

    public ConditionTemplates(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By CONDITIONTEMPLATESTABLE = By.cssSelector("#condition_templates_list");

    //Methods
    public boolean verifyConditiontemplatesVisible() {
        return confirmElementIsVisible(CONDITIONTEMPLATESTABLE);
    }

}
