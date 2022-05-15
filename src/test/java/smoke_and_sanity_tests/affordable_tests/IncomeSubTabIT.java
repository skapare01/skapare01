package smoke_and_sanity_tests.affordable_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentFilterPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.ResidentProfileCurtainPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab.HouseholdTabPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab.IncomeTabPage;

import static org.junit.Assert.assertTrue;

public class IncomeSubTabIT extends BaseBrowserTest {
    public IncomeSubTabIT() {
        super("1automationrapid");
    }

    @Test //Test Case ID: #2248069
    public void shouldValidateEditAndSavingFunctionality_whenAddingCurrentIncomeToIncomeTabInResidentProfile() {
        //Click on Dashboard >> Residents tab
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to locate Resident tab on the dashboard", nav.clickResidentsTab());

        //Click on Filter on All Residents Page
        AllResidentsPage resSearch = new AllResidentsPage(driver);
        assertTrue("Could not find filter button", resSearch.clickResidentFilter());

        //Search for Resident (Lease ID)
        AllResidentFilterPage resFilter = new AllResidentFilterPage(driver);
        assertTrue("Unable to enter Lease ID", resFilter.enterLeaseId("15927345"));
        assertTrue("Unable to submit Lease ID", resFilter.submitLeaseSearch());
        assertTrue("Lease ID not found", resFilter.clickResidentSearchResult());

        //Click Household tab on Resident Profile
        ResidentProfileCurtainPage household = new ResidentProfileCurtainPage(driver);
        assertTrue("Unable to locate Household tab on Resident Profile", household.clickResidentProfileHouseholdTab());

        //Click People tab Resident Profile
        HouseholdTabPage incomeTab = new HouseholdTabPage(driver);
        assertTrue("Failed to click Income tab", incomeTab.clickResidentProfileIncomeTab());

        //Start validation of adding current income
        IncomeTabPage addCurrentIncome = new IncomeTabPage(driver);
        assertTrue("Failed to click Add Current Income button", addCurrentIncome.clickAddCurrentIncomeButton());
        assertTrue("Failed to click Effective date on the Calendar", addCurrentIncome.clickEffectiveDateCalendar());
        assertTrue("Failed to select first day of current month (Effective Date)", addCurrentIncome.selectFirstDayOfMonth());
        assertTrue("Failed to locate End date calendar", addCurrentIncome.clickEndDateCalendar());
        assertTrue("Failed to click 'Today' on End date in the Calendar", addCurrentIncome.clickTodayEndDateCalendar());
        assertTrue("Failed to select Household Member", addCurrentIncome.selectHouseholdMemberByIndex(1));
        assertTrue("Failed to select Income Type by value", addCurrentIncome.selectIncomeTypeByValue("14"));
        assertTrue("Failed to clear text in Annual Salary text box", addCurrentIncome.clearTextAnnualSalaryAmount());
        assertTrue("Failed to enter amount in Annual Salary text box", addCurrentIncome.enterAnnualSalaryAmount("30"));
        assertTrue("Failed to clear text in Employer text box", addCurrentIncome.clearTextEmployer());
        assertTrue("Failed to enter Employer name", addCurrentIncome.enterEmployerName("Apple"));
        assertTrue("Failed to click Save button after adding current income", addCurrentIncome.clickSaveButtonAfterAddingNewIncome());
        assertTrue("Failed to locate success message after adding current income", addCurrentIncome.confirmSuccessMessage());
    }
}
