package page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class HouseholdTabPage extends BasePage {

    private final By RESIDENT_PROFILE_DETAILS_TAB = By.id("view_details");
    private final By RESIDENT_PROFILE_CERTIFICATIONS_TAB = By.id("view_certifications");
    private final By RESIDENT_PROFILE_PEOPLE_TAB = By.id("view_people");
    private final By RESIDENT_PROFILE_INCOME_TAB = By.id("view_income");
    private final By RESIDENT_PROFILE_ASSETS_TAB = By.id("view_assets");
    private final By RESIDENT_PROFILE_EXPENSES_TAB = By.id("view_expenses");
    private final By LOADING_OVERLAY = By.className("loading-overlay");

    public HouseholdTabPage(WebDriver driver) {
        super(driver);
    }

    //Details tab methods
    public boolean clickResidentProfileDetailsTab() {
        waitForOverlayAfterClickingHouseholdTab();
        return clickElement(RESIDENT_PROFILE_DETAILS_TAB);
    }

    public String confirmResidentProfileDetailsTab() {
        return getElementText(RESIDENT_PROFILE_DETAILS_TAB);
    }

    //Certifications tab methods
    public boolean clickResidentProfileCertificationsTab() {
        waitForOverlayAfterClickingHouseholdTab();
        return clickElement(RESIDENT_PROFILE_CERTIFICATIONS_TAB);
    }

    public String confirmResidentProfileCertificationsTab() {
        return getElementText(RESIDENT_PROFILE_CERTIFICATIONS_TAB);
    }

    //People tab methods
    public boolean clickResidentProfilePeopleTab() {
        waitForOverlayAfterClickingHouseholdTab();
        return clickElement(RESIDENT_PROFILE_PEOPLE_TAB);
    }

    public String confirmResidentProfilePeopleTab() {
        return getElementText(RESIDENT_PROFILE_PEOPLE_TAB);
    }

    //Income tab methods
    public boolean clickResidentProfileIncomeTab() {
        waitForOverlayAfterClickingHouseholdTab();
        return clickElement(RESIDENT_PROFILE_INCOME_TAB);
    }

    public String confirmResidentProfileIncomeTab() {
        return getElementText(RESIDENT_PROFILE_INCOME_TAB);
    }

    //Assets tab methods
    public boolean clickResidentProfileAssetsTab() {
        waitForOverlayAfterClickingHouseholdTab();
        return clickElement(RESIDENT_PROFILE_ASSETS_TAB);
    }

    public String confirmResidentProfileAssetsTab() {
        return getElementText(RESIDENT_PROFILE_ASSETS_TAB);
    }

    //Expenses tab methods
    public boolean clickResidentProfileExpensesTab() {
        waitForOverlayAfterClickingHouseholdTab();
        return clickElement(RESIDENT_PROFILE_EXPENSES_TAB);
    }

    public String confirmResidentProfileExpensesTab() {
        return getElementText(RESIDENT_PROFILE_EXPENSES_TAB);
    }

    private void waitForOverlayAfterClickingHouseholdTab() {
        waitForOverlay(LOADING_OVERLAY);
    }
}
