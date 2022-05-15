package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab.make_ready_curtain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MakeReadyHistoryTab extends BasePage {

    private final By HISTORY_TAB = By.id("maintenance_request_history_tab");
    private final By HISTORY_LOG_ENTRIES = By.id("tab-7b");

    public MakeReadyHistoryTab(WebDriver driver) {
        super(driver);
    }

    public boolean confirmHistoryTabExists() { return confirmElementIsVisible(HISTORY_TAB); }

    public boolean clickHistoryTab() { return clickElement(HISTORY_TAB); }

    public boolean confirmHistoryLogEntriesExist() { return confirmElementIsVisible(HISTORY_LOG_ENTRIES); }

}
