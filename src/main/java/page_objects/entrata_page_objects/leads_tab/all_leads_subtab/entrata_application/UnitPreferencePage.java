package page_objects.entrata_page_objects.leads_tab.all_leads_subtab.entrata_application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class UnitPreferencePage extends BasePage {

    private final By SELECT_FIRST_FLOORPLAN = By.linkText("Select");
    private final By FIRST_UNIT_ON_LIST = By.cssSelector("input[name = 'application[unit_space_id]']");
    private final By FIRST_LEASING_OPTION = By.cssSelector("input[name = 'application[term_month]']");
    private final By LOADING_OVERLAY = By.className("loading-overlay");
    private final By ADDITIONAL_INFO_TAB = By.xpath("//*[@id=\"next-prev-step\"]/a[2]");

    public UnitPreferencePage(WebDriver driver){
        super(driver);
    }

    private void waitForLoadingOverlay(){waitForOverlay(LOADING_OVERLAY);}
    public boolean clickFirstSelectButton(){waitForLoadingOverlay(); return clickElement(SELECT_FIRST_FLOORPLAN);}
    public boolean clickFirstUnitOnList(){return clickElement(FIRST_UNIT_ON_LIST,waitTimes.LONG_WAIT);}
    public boolean clickFirstLeasingOption(){return clickElement(FIRST_LEASING_OPTION);}
    public boolean clickAdditionalInfoTab(){return clickElement(ADDITIONAL_INFO_TAB);}
}
