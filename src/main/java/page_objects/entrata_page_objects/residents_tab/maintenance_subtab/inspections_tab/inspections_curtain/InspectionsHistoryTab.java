package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab.inspections_curtain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class InspectionsHistoryTab extends BasePage {

    private final By HISTORY_SUBTAB = By.cssSelector("li[class='js-tab-activity']");

    private final By HISTORY_LOG =  By.id("tab-history");

    public InspectionsHistoryTab(WebDriver driver) { super(driver); }

    public boolean confirmHistorySubtabExists() { return confirmElementIsVisible(HISTORY_SUBTAB); }

    public boolean clickHistorySubtab() { return clickElement(HISTORY_SUBTAB); }

    public boolean confirmHistoryLogExists() { return confirmElementIsVisible(HISTORY_LOG); }

}
