package page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.screening_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class Packages extends BasePage{

    public Packages(WebDriver driver){
        super(driver);
    }

    //Variables
    private final By PACKAGESTABLE = By.cssSelector("#priority-view > table");

    //Methods
    public boolean verifyPackagesVisible() {
        return confirmElementIsVisible(PACKAGESTABLE);
    }


}
