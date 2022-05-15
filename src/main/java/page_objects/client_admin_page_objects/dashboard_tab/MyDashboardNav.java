package page_objects.client_admin_page_objects.dashboard_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MyDashboardNav extends BasePage {

    public MyDashboardNav(WebDriver driver) {
        super(driver);
    }

    //My Dashboard top menu
    private final By UTILITIES_IMPLEMENTATION = By.id("ru_implementation");
    private final By DATA_ENTRY = By.id("data_entry");
    private final By UTILITY_BILLING_DASHBOARD = By.id("utility_billing_dashboard");
    private final By UEM_DASHBOARD = By.id("uem_ip_dashboard");
    private final By IP_DASHBOARD = By.id("ip_dashboard_tab");
    private final By COA_DASHBOARD = By.id("coa_dashboard_tab");
    private final By MY_XENTO_TAB = By.id("my_xento");
    private final By MY_TEAM_TAB = By.id("my_team");

    //My Dashboard Phone Login Sidebar Menu
    private final By EXPAND_PHONE_LOGIN = By.cssSelector("#expandButton > a");
    private final By PHONE_EXTENSION_FIELD = By.id("physical-phone-extension-id");
    private final String GENERIC_PHONE_EXTENSION_NUMBER = "111";
    private final By LOGIN_TO_FREESWITCH = By.cssSelector("#login_call_agent > a");
    private final By LOGOUT_OF_FREESWITCH = By.cssSelector("#login_call_agent > a.button.small-blue.bold.lineheight-24.font12.logged-in");

    //Methods

    //My Dashboard Top Menu Methods
    public boolean openUtilitiesImplementationTab() {
        return clickElement(UTILITIES_IMPLEMENTATION, waitTimes.LONG_WAIT);
    }

    public boolean openDataEntryTab() {
        return clickElement(DATA_ENTRY);
    }

    public boolean openUtilityBillingDashboardTab() {
        return clickElement(UTILITY_BILLING_DASHBOARD);
    }

    public boolean openUemDashboardTab() {
        return clickElement(UEM_DASHBOARD);
    }

    public boolean openIpDashboardTab() {
        return clickElement(IP_DASHBOARD);
    }

    public boolean openCoaDashboardTab() {
        return clickElement(COA_DASHBOARD);
    }

    public boolean clickMyXentoTab(){return clickElement(MY_XENTO_TAB);}

    public boolean clickMyTeamTab(){return clickElement(MY_TEAM_TAB);}

    //My Dashboard ClockIn
    public boolean openPhoneLogin() {
        return clickElement(EXPAND_PHONE_LOGIN);
    }

    public boolean enterGenericPhoneExtensionToClockIn() {
        return sendKeysToElement(PHONE_EXTENSION_FIELD, GENERIC_PHONE_EXTENSION_NUMBER);
    }

    public boolean loginToFreeswitch() {
        return clickElement(LOGIN_TO_FREESWITCH);
    }

    public boolean logoutOfFreeswitch() {
        return clickElement(LOGOUT_OF_FREESWITCH);
    }

}