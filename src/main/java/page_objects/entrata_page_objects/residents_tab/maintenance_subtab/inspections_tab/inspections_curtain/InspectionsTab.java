package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.inspections_curtain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class InspectionsTab extends BasePage {

    private final By INSPECTIONS_SUBTAB = By.cssSelector("li[class='selected js-tab-inspection']");

    public InspectionsTab(WebDriver driver) { super(driver); }

    public boolean confirmInspectionsSubtabExists() { return confirmElementIsVisible(INSPECTIONS_SUBTAB, waitTimes.LONG_WAIT); }

}
