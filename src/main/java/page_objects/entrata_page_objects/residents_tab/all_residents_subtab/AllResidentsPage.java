package page_objects.entrata_page_objects.residents_tab.all_residents_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class AllResidentsPage extends BasePage {
    public AllResidentsPage(WebDriver driver){
        super(driver);
    }

    private final By TOOLS_ICON = By.cssSelector(".view-data-side-tabs li:nth-child(3)");
    private final By MOVE_IN_BOARD_ICON = By.cssSelector(".view-data-side-tabs li:nth-child(4) span:nth-child(1)");
    private final By BULK_PLACE_ON_NOTICE_LINK = By.linkText("Bulk Place On Notice");
    private final By BULK_MOVE_IN = By.linkText("Bulk Move-in");
    private final By BULK_MOVE_OUT = By.linkText("Bulk Move-out");
    private final By MOVE_IN_BOARD_LINK =By.linkText("Move-in Board");
    private final By MOVE_OUT_BOARD_LINK =By.linkText("Move-out Board");
    private final By FIRST_RESIDENT_ON_ALL_RESIDENT_LIST = By.cssSelector("#property-1 > tr:nth-child(2)");
    private final By OVERLAY_AFTER_CLICKING_FILTER = By.xpath("/html/body/div[4]/div/div[2]/div[1]");
    private final By ADD_RESIDENT_BUTTON = By.cssSelector("a[title='Add Resident']");
    private final By RESIDENT_LEASE_STATUS_TAB = By.cssSelector("th[sort_by='cl.lease_status_type']");
    //Click Searched Resident Selectors
    private final By SELECT_SINGLE_FILTERED_RESIDENT_BY_NAME_QUINTON_TUCKER = (By.xpath("//em[contains(text(),'Tucker, Quinton')]"));

    //Resident Filter
    private final By CLICK_RESIDENT_FILTER = By.className("dark-filter");

    public boolean moveToToolSIcon(){return moveToAnElementWithActions(TOOLS_ICON);}
    public boolean clickOnBulkPlaceOnNotice(){return clickElement(BULK_PLACE_ON_NOTICE_LINK);}
    public boolean clickBulkMoveIN(){return clickElement(BULK_MOVE_IN);}
    public boolean clickBulkMoveOut(){return clickElement(BULK_MOVE_OUT);}
    public boolean moveToMoveInBoardIcon(){return moveToAnElementWithActions(MOVE_IN_BOARD_ICON);}
    public boolean clickMoveInBoardLink(){return clickElement(MOVE_IN_BOARD_LINK);}
    public boolean clickMoveOutBoardLink(){return clickElement(MOVE_OUT_BOARD_LINK);}
    public boolean addResidentButtonClick() {
        return clickElement(ADD_RESIDENT_BUTTON);
    }
    public boolean residentLeaseStatusTabClick() {
        return clickElement(RESIDENT_LEASE_STATUS_TAB);
    }

    //Resident Filter Methods
    public boolean clickResidentFilter() {
        return clickElement(CLICK_RESIDENT_FILTER);
    }

    //Residents Table
    public boolean clickFirstResidentOnList() {
        waitForOverlay(OVERLAY_AFTER_CLICKING_FILTER);
        return clickElement(FIRST_RESIDENT_ON_ALL_RESIDENT_LIST);
    }
    //Click Searched Resident Methods
    public boolean selectSingleFilteredResidentTuckerQuinton() { return clickElement(SELECT_SINGLE_FILTERED_RESIDENT_BY_NAME_QUINTON_TUCKER); }

}
