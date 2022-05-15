package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.inspections_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class InspectionsListPage extends BasePage {
    public InspectionsListPage(WebDriver driver) {
        super(driver);
    }

    //Filter options
    private final String INSPECTIONS_ASSIGNED_OR_UPDATED_TEXT = " inspection(s) assigned/updated ";
    private final int INDEX_1 = 1;

    private final By INSPECTIONS_TAB = By.cssSelector("a[href*='/?module=inspections']");
    private final By INSPECTIONS_LISTINGS = By.id("inspection_listing");
    private final By INSPECTIONS_TAB_OVERLAY = By.xpath("//*[@id=\"body\"]/div[1]");
    private final By ASSIGN_BTN = By.id("assign_inspection_button");
    private final By ASSIGN_INSPECTION_DROP_DOWN_LIST = By.id("assign_bulk_inspected_by");
    private final By SAVE_BUTTON_ASSIGN_INSPECTION = By.xpath("//*[@id=\"assign_inspection_form\"]/fieldset/div[2]/div/input");
    private final By INSPECTIONS_MODAL = By.id("div-view-listing");
    private final By FIRST_INSPECTIONS_LISTING = By.xpath("//*[@id=\"property-1\"]/tr[1]");
    private final By VIEW_ALL_INSPECTIONS = By.id("view_inspections");

    //Overlay Selector
    private final By OVERLAY_SELECTOR = By.cssSelector("div[class='loading-overlay bg-img-medium']");
    //Overlay Method
    private void overlayInspectionsPage() { waitForOverlay(OVERLAY_SELECTOR); }

    public boolean confirmViewAllInspectionsExists() { return confirmElementIsVisible(VIEW_ALL_INSPECTIONS); }

    public boolean clickFirstInspection() {overlayInspectionsPage(); return clickElement(FIRST_INSPECTIONS_LISTING, waitTimes.LUDICROUS_WAIT); }

    public boolean confirmSuccessMessage() { return confirmElementContainsText(INSPECTIONS_MODAL, INSPECTIONS_ASSIGNED_OR_UPDATED_TEXT); }

    public boolean clickSaveButtonFromAssignInspection() { return clickElement(SAVE_BUTTON_ASSIGN_INSPECTION); }

    public boolean selectGaneshD1FromAssignableDropDown() { return selectElementByIndex(ASSIGN_INSPECTION_DROP_DOWN_LIST, INDEX_1); }

    public boolean clickAssignBtn() { return clickElement(ASSIGN_BTN, waitTimes.LONG_WAIT); }

    public boolean clickInspectionsTab() { return clickElement(INSPECTIONS_TAB); }

    public boolean waitForInspectionsOverlay() {
        waitForOverlay(INSPECTIONS_TAB_OVERLAY);
        return confirmElementIsVisible(INSPECTIONS_LISTINGS);}

}