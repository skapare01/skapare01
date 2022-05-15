package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.more_actions_dropdown.schedule_transfer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ScheduleTransferPage extends BasePage {
    private final By TRANSFER_INFORMATION_HEADER_TEXT = By.xpath("//div/h6[text()='Transfer Information']");
    private final By TRANSFER_MOVE_OUT_DATE_SECTION = By.id("schedule_transfers_move_out_date_section");
    private final By TRANSFER_MOVE_IN_DATE_SECTION = By.id("schedule_transfers_move_in_date_section");
    private final By TRANSFER_LEASE_START_DATE_SECTION = By.id("schedule_transfers_lease_start_date_section");
    private final By TRANSFER_LEASE_LENGTH_TEXT = By.xpath("//label[text()='Lease Length:']");
    private final By TRANSFER_LEASE_LENGTH_DROPDOWN = By.id("create_schedule_transfer_lease_term_id");
    private final By TRANSFER_REASON_FOR_TRANSFER_TEXT = By.xpath("//label[text()='Reason for Transfer:']");
    private final By TRANSFER_REASON_FOR_TRANSFER_DROPDOWN = By.id("schedule_transfer_reason");
    private final By TRANSFER_EDIT_OCCUPANTS_SECTION = By.id("edit_occupant_div");
    private final By TRANSFER_SEARCH_FOR_UNIT_BUTTON = By.id("searchable");
    private final By PREVIEW_TRANSFER_BUTTON = By.cssSelector("input[value='Preview Transfer']");
    private final By CREATE_TRANSFER_BUTTON = By.cssSelector("input[value='Create Transfer']");

    public ScheduleTransferPage(WebDriver driver) {
        super(driver);
    }

    public boolean transferInfoHeaderTextVis() {
        return confirmElementIsVisible(TRANSFER_INFORMATION_HEADER_TEXT);
    }
    public boolean moveOutDateSectionVisible() {
        return confirmElementIsVisible(TRANSFER_MOVE_OUT_DATE_SECTION);
    }
    public boolean moveInDateSectionVisible() {
        return confirmElementIsVisible(TRANSFER_MOVE_IN_DATE_SECTION);
    }
    public boolean leaseStartDateSectionVisible() {
        return confirmElementIsVisible(TRANSFER_LEASE_START_DATE_SECTION);
    }
    public boolean leaseLengthTextVisible() {
        return confirmElementIsVisible(TRANSFER_LEASE_LENGTH_TEXT);
    }
    public boolean leaseLengthDropdownVisible() {
        return confirmElementIsVisible(TRANSFER_LEASE_LENGTH_DROPDOWN);
    }
    public boolean reasonForTransferTextVisible() {
        return confirmElementIsVisible(TRANSFER_REASON_FOR_TRANSFER_TEXT);
    }
    public boolean reasonForTransferDropdownVisible() {
        return confirmElementIsVisible(TRANSFER_REASON_FOR_TRANSFER_DROPDOWN);
    }
    public boolean editOccupantsSectionVisible() {
        return confirmElementIsVisible(TRANSFER_EDIT_OCCUPANTS_SECTION);
    }
    public boolean searchForUnitButtonVisible() {
        return confirmElementIsVisible(TRANSFER_SEARCH_FOR_UNIT_BUTTON);
    }
    public boolean previewTransferButtonVisible() {
        return confirmElementIsVisible(PREVIEW_TRANSFER_BUTTON);
    }
    public boolean createTransferButtonVisible() {
        return confirmElementIsVisible(CREATE_TRANSFER_BUTTON);
    }

}
