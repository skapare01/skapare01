package page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.maintenance_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class InspectionsSubtab extends BasePage {

    private final By FIRST_START_INSPECTION_BUTTON = By.xpath("//*[@id='inspections_dashboard_table_data']/tbody/tr[1]/td[7]/a");
    private final By ENTRATA_INSPECTION_HEADER = By.cssSelector("div[class='modal-head']");
    private final By CLOSE_BUTTON = By.cssSelector("div[class='action-icon']");

    public InspectionsSubtab(WebDriver driver) { super(driver); }

    public boolean clickStartInspectionButton() { return clickElement(FIRST_START_INSPECTION_BUTTON); }

    public boolean confirmInspectionStarted() { return confirmElementContainsText(ENTRATA_INSPECTION_HEADER, "Inspection"); }

    public boolean clickCloseButton() { return clickElement(CLOSE_BUTTON); }

}
