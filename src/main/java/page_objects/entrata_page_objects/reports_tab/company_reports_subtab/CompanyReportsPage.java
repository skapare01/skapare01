package page_objects.entrata_page_objects.reports_tab.company_reports_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;
import utils.RandomGenerator;

public class CompanyReportsPage extends BasePage {
    RandomGenerator randomGenerator = new RandomGenerator();

    //Locators:
    private final By THREE_DOT_BUTTON_OPTION_LOCATOR = By.cssSelector("b[class='js-report-action-tips']");
    private final By ADD_TO_MY_REPORTS_LOCATOR = By.cssSelector("a[class='nohref js-view-add-to-my-reports binded-nohref-click']");
    private final By ADD_NEW_GROUP_LOCATOR = By.cssSelector("span[class='js-myreportGroupList nomargin']");
    private final By ASSIGN_TO_REPORT_GROUP_TEXT_FIELD_LOCATOR = By.cssSelector("input[class='form-field js-myreportGroupList hide']");
    private final String RANDOM_REPORT_GROUP_NAME = randomGenerator.randomName();
    private final By GREEN_ADD_TO_MY_REPORTS_BUTTON_LOCATOR = By.cssSelector("input[class='form-submit js-add-to-my-reports']");
    private final By SUCCESS_BANNER_LOCATOR = By.cssSelector("p[class='alert success slim']");

    //Constructor method:
    public CompanyReportsPage(WebDriver driver) {
        super(driver);
    }

    //Methods:
    public boolean clickThreeDotOptionNextToReport() {
        return clickElement(THREE_DOT_BUTTON_OPTION_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickAddToMyReportsOption() {
        return clickElement(ADD_TO_MY_REPORTS_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean clickAddNewGroupButton() {
        return clickElement(ADD_NEW_GROUP_LOCATOR, waitTimes.UNREASONABLE_WAIT);
    }

    public boolean enterNewReportGroupName() {
        return sendKeysToElement(ASSIGN_TO_REPORT_GROUP_TEXT_FIELD_LOCATOR, RANDOM_REPORT_GROUP_NAME, waitTimes.LONG_WAIT);
    }

    public boolean clickGreenAddToMYReportsButton() {
        return clickElement(GREEN_ADD_TO_MY_REPORTS_BUTTON_LOCATOR, waitTimes.LONG_WAIT);
    }

    public boolean confirmSuccessBannerAppeared() {
        return confirmElementIsVisible(SUCCESS_BANNER_LOCATOR, waitTimes.LONG_WAIT);
    }
}
