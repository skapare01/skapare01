package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FinancialMoveOutPage extends BasePage {

    private final By MOVE_OUT_REASON_DROPDOWN = By.id("move_out_reason_list_item_id");
    private final By LOADING_OVERLAY = By.className("loading-overlay");

    public FinancialMoveOutPage(WebDriver driver) {
        super(driver);
    }

    public boolean confirmMoveOutReasonDropdown() {
        waitForOverlayAfterClickingPerformFinancialMoveOut();
        return confirmElementIsVisible(MOVE_OUT_REASON_DROPDOWN, waitTimes.LONG_WAIT);
    }

    public boolean scrollToMoveOutReasonDropdown() {
        return moveToAnElementWithActions(MOVE_OUT_REASON_DROPDOWN, waitTimes.SHORT_WAIT);
    }

    private void waitForOverlayAfterClickingPerformFinancialMoveOut() {
        waitForOverlay(LOADING_OVERLAY, waitTimes.LONG_WAIT);
    }
}
