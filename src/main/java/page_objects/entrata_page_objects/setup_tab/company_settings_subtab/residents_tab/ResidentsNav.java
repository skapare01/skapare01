package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.residents_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ResidentsNav extends BasePage {
    public ResidentsNav(WebDriver driver){
        super(driver);}

private final By CHECKLIST_SUBTAB = By.id("li_nav_residents_checklists_setupxxx");

    public boolean clickChecklistTab(){return clickElement(CHECKLIST_SUBTAB);}
}
