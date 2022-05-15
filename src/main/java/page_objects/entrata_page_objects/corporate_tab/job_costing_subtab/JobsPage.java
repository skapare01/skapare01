package page_objects.entrata_page_objects.corporate_tab.job_costing_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class JobsPage extends BasePage {

    public JobsPage(WebDriver driver) {
        super(driver);
    }


    private final By CLOSE_MENU = By.cssSelector("i[class='close-button close']");
    private final By OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");
    private final By JOB_DETAILS = By.id("job_system_div");
    private final By ADD_JOB_BUTTON = By.cssSelector("a[onclick*='Add Job']");
    private final By ADD_JOB_FORM = By.id("add_job_frm");

    //Job Tabs

    private final By JOB_OVERVIEW = By.id("job_overviewxxx");
    private final By FINANCIAL = By.id("job_financialxxx");
    private final By CONTRACTS = By.id("job_contractsxxx");

    //**Job Overview Tab**

    private final By FIRST_LISTED_JOB = By.cssSelector("tr[class='job_row aRow']");
    private final By FIRST_LISTED_PHASE = By.cssSelector("td[class='bold valign-middle text-blue link job_phase ']");
    private final By JOB_PHASE_DETAILS = By.id("div_view_job_phase_detail");

    //**Financial Tab**

    private final By DRAW_REQUESTS_TAB = By.id("tab_2909");
    private final By DRAW_REQUESTS_INFO = By.id("div_fin");
    private final By PURCHASE_ORDERS_TAB = By.id("tab_2910");
    private final By PURCHASE_ORDERS_INFO = By.id("job_container_div");
    private final By INVOICES_TAB = By.id("tab_2914");
    private final By INVOICES_INFO = By.id("invoices_list_container");

    public boolean addJobButtonClick() {
        return clickElement(ADD_JOB_BUTTON);
    }

    //**Job Overview Tab**

    public boolean firstListedJobClick() {
        return clickElement(FIRST_LISTED_JOB);
    }

    public boolean firstListedPhaseClick() {
        return clickElement(FIRST_LISTED_PHASE);
    }

    public boolean closeMenu() {
        return clickElement(CLOSE_MENU);
    }


    //**Financial Tab**

    public boolean financialTabClick() {
        waitForOverlay(OVERLAY);
        return clickElement(FINANCIAL);
    }

    public boolean purchaseOrdersTabClick() {
        return clickElement(PURCHASE_ORDERS_TAB);
    }

    public boolean invoicesTabClick() {
        return clickElement(INVOICES_TAB);
    }


    //Visibility of Elements

    public boolean addJobFormVisible() {
        return confirmElementIsVisible(ADD_JOB_FORM);
    }

    public boolean drawRequestsTabVisible() {
        return confirmElementIsVisible(DRAW_REQUESTS_TAB);
    }

    public boolean purchaseOrdersTabVisible() {
        return confirmElementIsVisible(PURCHASE_ORDERS_TAB);
    }

    public boolean invoicesTabVisible() {
        return confirmElementIsVisible(INVOICES_TAB);
    }

    public boolean jobOverviewVisible() {
        return confirmElementIsVisible(JOB_OVERVIEW);
    }

    public boolean financialVisible() {
        return confirmElementIsVisible(FINANCIAL);
    }

    public boolean contractsVisible() {
        return confirmElementIsVisible(CONTRACTS);
    }

    public boolean jobPhaseDetailsVisible() {
        return confirmElementIsVisible(JOB_PHASE_DETAILS);
    }

    public boolean drawRequestsInfoVisible() {
        return confirmElementIsVisible(DRAW_REQUESTS_INFO);
    }

    public boolean purchaseOrdersInfoVisible() {
        return confirmElementIsVisible(PURCHASE_ORDERS_INFO);
    }

    public boolean invoicesInfoVisible() {
        return confirmElementIsVisible(INVOICES_INFO, waitTimes.LONG_WAIT);
    }

    public boolean jobDetailsVisible() {
        return confirmElementIsVisible(JOB_DETAILS);
    }
}
