package smoke_and_sanity_tests.affordable_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentFilterPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.ResidentProfileCurtainPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab.ExpensesTabPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab.HouseholdTabPage;

import static org.junit.Assert.assertTrue;

public class ExpenseSubTabIT extends BaseBrowserTest {
    public ExpenseSubTabIT() {
        super("1automationrapid");
    }

    @Test //Test Case ID: #2248110
    public void shouldValidateEditAndSavingFunctionality_whenAddingCurrentExpenseToExpensesSubTabInResidentProfile() {
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

        HouseholdTabPage householdTab = new HouseholdTabPage(driver);
        assertTrue("Failed to click Expenses sub-tab", householdTab.clickResidentProfileExpensesTab());

        ExpensesTabPage addCurrentExpense = new ExpensesTabPage(driver);
        assertTrue("Failed to click Add Current Expense button", addCurrentExpense.clickAddCurrentExpenseButton());
        assertTrue("Failed to click Effective Date calendar", addCurrentExpense.clickEffectiveDateCalendar());
        assertTrue("Failed to click 'Today' button - Effective Date", addCurrentExpense.clickTodayEffectiveDate());
        assertTrue("Failed to click End date calendar", addCurrentExpense.clickEndDateCalendar());
        assertTrue("Failed to click 'Today button - End Date", addCurrentExpense.clickTodayEndDateCalendar());
        assertTrue("Failed to select Disability from Expense Type dropdown", addCurrentExpense.selectExpenseTypeByIndex(3));
        assertTrue("Failed to check the 'Disability expense allows the following Member(s) to work' checkbox",
                addCurrentExpense.checkDisabilityExpenseMemberAllowToWorkCheckbox());
        assertTrue("Failed to select Household Member by Index", addCurrentExpense.selectHouseholdMemberByIndex(1));
        assertTrue("Failed to select 'Annually' from the Frequency of Expense dropdown", addCurrentExpense.selectFrequencyOfExpenseByValue("6"));
        assertTrue("Failed to enter Annual Expense Amount", addCurrentExpense.enterAnnualExpenseAmount("100"));
        assertTrue("Failed to enter a Description", addCurrentExpense.enterDescription("TEST"));
        assertTrue("Unable to locate the 'Total Annual Expense Amount' field", addCurrentExpense.confirmTotalAnnualExpenseAmountField());
        assertTrue("Unable to confirm Doctor/Pharmacy name", addCurrentExpense.confirmDoctorPharmacyNameField());
        assertTrue("Unable to confirm Contact Person field", addCurrentExpense.confirmContactPersonField());
        assertTrue("Unable to confirm Phone field", addCurrentExpense.confirmPhoneField());
        assertTrue("Unable to confirm Fax field", addCurrentExpense.confirmFaxField());
        assertTrue("Unable to confirm Email field", addCurrentExpense.confirmEmailField());
        assertTrue("Unable to confirm Country dropdown", addCurrentExpense.confirmCountryDropdown());
        assertTrue("Unable to confirm Address Line 1 field", addCurrentExpense.confirmAddressLineOne());
        assertTrue("Unable to confirm Address Line 2 field", addCurrentExpense.confirmAddressLineTwo());
        assertTrue("Unable to confirm Address Line 3 field", addCurrentExpense.confirmAddressLineThree());
        assertTrue("Unable to confirm City field", addCurrentExpense.confirmCityField());
        assertTrue("Unable to confirm State dropdown", addCurrentExpense.confirmStateDropdown());
        assertTrue("Unable to confirm Zip field", addCurrentExpense.confirmZipCodeField());
        assertTrue("Failed to click Save button - Add Current Expense", addCurrentExpense.clickSaveButtonAddCurrentExpense());
        assertTrue("Unable to confirm Success Message - Add Current Expense", addCurrentExpense.confirmSuccessMessageAddCurrentExpense());


    }
}
