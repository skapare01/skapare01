package page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.residents_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class RecertificationNoticesSubtab extends BasePage {

    public RecertificationNoticesSubtab(WebDriver driver) {
        super(driver);
    }

    private final By PRIORITY_COLUMN = By.cssSelector("th[sort_by='priority']");
    private final By RESIDENT_COLUMN = By.cssSelector("th[sort_by='name_full']");
    private final By NOTICE_TYPE_COLUMN = By.cssSelector("th[sort_by='notice_type']");
    private final By RECERTIFICATION_DATE_COLUMN = By.cssSelector("th[sort_by='recertification_date']");
    private final By PROGRAM_TYPE_COLUMN = By.xpath("//th[text()='Program Type']");
    private final By UNIT_COLUMN = By.cssSelector("th[sort_by='unit_number']");
    private final By PROPERTY_COLUMN = By.cssSelector("th[sort_by='property_name']");
    private final By WHATS_NEXT_COLUMN = By.xpath("//*[@id=\"dashboard_residents_recertification_notices_table_data\"]/thead/tr/th[9]");

    //Recertification notices methods
    public String confirmPriorityColumn() {
        return getElementText(PRIORITY_COLUMN);
    }

    public String confirmResidentColumn() {
        return getElementText(RESIDENT_COLUMN);
    }

    public String confirmNoticeTypeColumn() {
        return getElementText(NOTICE_TYPE_COLUMN);
    }

    public String confirmRecertificationDateColumn() {
        return getElementText(RECERTIFICATION_DATE_COLUMN);
    }

    public String confirmProgramType() {
        return getElementText(PROGRAM_TYPE_COLUMN);
    }

    public String confirmUnitColumn() {
        return getElementText(UNIT_COLUMN);
    }

    public String confirmPropertyColumn() {
        return getElementText(PROPERTY_COLUMN);
    }

    public String confirmWhatsNextColumn() {
        return getElementText(WHATS_NEXT_COLUMN);
    }



}
