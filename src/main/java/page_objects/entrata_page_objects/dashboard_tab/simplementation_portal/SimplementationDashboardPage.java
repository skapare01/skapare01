package page_objects.entrata_page_objects.dashboard_tab.simplementation_portal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class SimplementationDashboardPage extends BasePage {

    private final By ACTIVATE_SIMPLEMENTATION = By.id("activate_simplementation_property");

    //Activate Simplementation popup
    private final By SELECT_PROPERTY = By.id("search_simplementation_property");

    public SimplementationDashboardPage(WebDriver driver){
        super (driver);}

    public boolean clickActivateSimplementation(){return clickElement(ACTIVATE_SIMPLEMENTATION);}
    public boolean findSelectPropertyDropdown(){return confirmElementIsVisible(SELECT_PROPERTY);}

}
