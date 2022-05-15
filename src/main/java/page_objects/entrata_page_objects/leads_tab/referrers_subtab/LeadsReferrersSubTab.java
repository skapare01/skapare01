package page_objects.entrata_page_objects.leads_tab.referrers_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class LeadsReferrersSubTab extends BasePage {
    // Header Selectors
    private final By TOTAL_REFERRALS_HEADER = By.xpath("//div[text()='Total Referrals']");
    private final By APPROVED_APPLICATIONS_HEADER = By.xpath("//div[text()='Approved Applications']");
    private final By MOVE_INS_HEADER = By.xpath("//div[text()='Move-Ins']");
    private final By PERCENT_MOVED_IN_HEADER = By.xpath("//div[text()='% Moved In']");
    // Subheaders Selectors
    private final By REFERRER_HEADER = By.cssSelector("[sort_by='company_name']");
    private final By REFERRER_TYPE_HEADER = By.cssSelector("[sort_by='name']");
    private final By STATUS_HEADER = By.cssSelector("[sort_by='deleted_by']");
    private final By CONTACT_HEADER = By.cssSelector("[sort_by='name_full']");
    private final By EMAIL_HEADER = By.xpath("//th[text()='Email']");
    private final By PHONE_HEADER = By.xpath("//th[text()='Phone']");
    private final By PROPERTIES_HEADER = By.cssSelector("[sort_by='properties_count']");
    private final By LEADS_REFERRED_HEADER = By.cssSelector("[sort_by='leads_referred']");
    private final By MOVE_IN_CONVERSIONS_HEADER = By.xpath("//th[text()='Move In Conversion']");

    //Add a Referrer Selector
    private final By ADD_REFERRER_BUTTON = By.cssSelector("i[class='flat-add transition']");

    //Close Add New Referrer Screen
    private final By CLOSE_BUTTON_FROM_ADD_NEW_REFERRER = By.cssSelector("button[class='ui-button ui-widget ui-state-default ui-corner-all ui-button-icon-only ui-dialog-titlebar-close']");
    //Click Filter Selector
    private final By FILTER_BUTTON = By.id("open-referrer-filter-by-default");


    //Constructor
    public LeadsReferrersSubTab(WebDriver driver) { super(driver); }

    // Header location Methods
    public boolean locateTotalReferralsHeader() {return confirmElementIsVisible(TOTAL_REFERRALS_HEADER);}
    public boolean locateApprovedApplicationsHeader() {return confirmElementIsVisible(APPROVED_APPLICATIONS_HEADER);}
    public boolean locateMoveInsHeader() {return confirmElementIsVisible(MOVE_INS_HEADER);}
    public boolean locatePercentMovedInHeader() {return confirmElementIsVisible(PERCENT_MOVED_IN_HEADER);}

    // Locate Subheaders Methods
    public boolean locateReferrerHeader (){return confirmElementIsVisible(REFERRER_HEADER);}
    public boolean locateReferrerTypeHeader(){return confirmElementIsVisible(REFERRER_TYPE_HEADER);}
    public boolean locateStatusHeader(){return confirmElementIsVisible(STATUS_HEADER);}
    public boolean locateContactHeader(){return confirmElementIsVisible(CONTACT_HEADER);}
    public boolean locateEmailHeader(){return confirmElementIsVisible(EMAIL_HEADER);}
    public boolean locatePhoneHeader(){return confirmElementIsVisible(PHONE_HEADER);}
    public boolean locatePropertiesHeader(){return confirmElementIsVisible(PROPERTIES_HEADER);}
    public boolean locateLeadsReferredHeader(){return confirmElementIsVisible(LEADS_REFERRED_HEADER);}
    public boolean locateMoveInConversionsHeader(){return confirmElementIsVisible(MOVE_IN_CONVERSIONS_HEADER);}


    //Add a Referrer Method
    public boolean clickAddReferrerButton() {return clickElement(ADD_REFERRER_BUTTON);}
    //Close Add New Referrer Screen
    public boolean clickCloseFromAddReferrerScreenButton() {return clickElement(CLOSE_BUTTON_FROM_ADD_NEW_REFERRER);}

    //Click Filter Method
    public boolean clickReferrerFilterButton() {return clickElement(FILTER_BUTTON);}

}
