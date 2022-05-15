package page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.entrata_page_objects.reports_tab.ReportsBasePage;

public class BoxScoreReport extends ReportsBasePage {

    private final By FIND_BOX_SCORE_LINK = By.cssSelector("li[data-report-title ='Box Score'] a");
    private final By OCCUPIED_SUMMARIZED_NUMBER = By.cssSelector("#availability > table > tbody > tr:nth-child(1) > td:nth-child(13) > a");
    private final By SUMMARIZED_DRILL_IN_COUNT = By.cssSelector("#dataset_1 > table > tbody > tr:nth-child(1) > td");

    public BoxScoreReport (WebDriver driver) {
        super(driver);
    }

    public boolean clickOnBoxscoreReport () {
        return clickElement(FIND_BOX_SCORE_LINK);
    }
    public String summarizedNoticeUnrented () {
        return locateNumberAndStoreAsString(OCCUPIED_SUMMARIZED_NUMBER);
    }
    public String clickOnSummarizedElement () {
        return doubleClickOnElementIfInnerTextNotEqualZero(OCCUPIED_SUMMARIZED_NUMBER);
    }
    public String locateDrillInNoticeUnrentedCount () {
        return removeLettersFromString(SUMMARIZED_DRILL_IN_COUNT, waitTimes.UNREASONABLE_WAIT);
    }
}