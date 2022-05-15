package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MakeReadyBoardPage extends BasePage {

    private final By MAKE_READY_BOARD_MAIN_TAB = By.id("mrb_main_tab");
    private final By FIRST_CLICKABLE_MAKE_READY = By.cssSelector("a[onclick*='loadMakeReadyMaintenanceRequest']");
    private final By MAKE_READY_BOARD_TABLE = By.id("mrb_report_tbl");

    public MakeReadyBoardPage(WebDriver driver) {
        super(driver);
    }

    public boolean clickMakeReadyBoardTab() { return clickElement(MAKE_READY_BOARD_MAIN_TAB, waitTimes.LUDICROUS_WAIT); }

    public boolean clickFirstMakeReadyOnTable() { return clickElement(FIRST_CLICKABLE_MAKE_READY, waitTimes.LONG_WAIT); }

    public boolean verifyMakeReadyBoardTableExists() { return confirmElementIsVisible(MAKE_READY_BOARD_TABLE); }

}
