package smoke_and_sanity_tests.affordable_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentFilterPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.ResidentProfileCurtainPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab.AssetsTabPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab.HouseholdTabPage;

import static org.junit.Assert.assertTrue;

public class AssetSubTabIT extends BaseBrowserTest {
    public AssetSubTabIT() {
        super("1automationrapid");
    }

    @Test //Test Case ID: #2248103
    public void shouldValidateEditAndSavingFunctionality_whenAddingCurrentAssetToAssetsSubTabInResidentProfile() {
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
        assertTrue("Failed to click Asset sub-tab", householdTab.clickResidentProfileAssetsTab());

        AssetsTabPage addCurrentAsset = new AssetsTabPage(driver);
        assertTrue("Failed to click Add Current Asset button", addCurrentAsset.clickAddCurrentAssetButton());
        assertTrue("Failed to click Effective Date Calendar", addCurrentAsset.clickEffectiveDateCalendar());
        assertTrue("Unable to confirm Cost to Sell or Liquidate field", addCurrentAsset.confirmCostToSellOrLiquidateField());
        assertTrue("Unable to confirm Cash Value field", addCurrentAsset.confirmCashValueField());
        assertTrue("Unable to confirm Interest Rate field", addCurrentAsset.confirmInterestRateField());
        assertTrue("Unable to confirm Annual Income field", addCurrentAsset.confirmAnnualIncomeField());
        assertTrue("Failed to select Today button - Effective Date", addCurrentAsset.clickTodayButtonEffectiveDate());
        assertTrue("Failed to select Household member by value in Household Member dropdown", addCurrentAsset.selectHouseholdMemberDropdownByValue("31782452"));
        assertTrue("Failed to click End Date Calendar", addCurrentAsset.clickEndDateCalendar());
        assertTrue("Failed to click Today button - End Date", addCurrentAsset.clickTodayEndDateCalendar());
        assertTrue("Failed to select Asset type by value", addCurrentAsset.selectAssetTypeDropdownByValue("3"));
        assertTrue("Unable to confirm Disposed toggle", addCurrentAsset.confirmDisposedToggle());
        assertTrue("Failed to enter amount in Market Value field", addCurrentAsset.enterMarketValueAmount("5"));
        assertTrue("Failed to enter a value in Description text box", addCurrentAsset.enterDescription("Test"));
        assertTrue("Failed to enter a name in the Bank/Institution name field", addCurrentAsset.enterBankInstitutionName("Generic Bank Name"));
        assertTrue("Unable to confirm Contact Person field", addCurrentAsset.confirmContactPersonField());
        assertTrue("Unable to confirm Phone number field", addCurrentAsset.confirmPhoneField());
        assertTrue("Unable to confirm Fax number field", addCurrentAsset.confirmFaxField());
        assertTrue("Unable to confirm Email field", addCurrentAsset.confirmEmailField());
        assertTrue("Unable to confirm Country dropdown", addCurrentAsset.confirmCountryDropDown());
        assertTrue("Unable to confirm Address Line 1 field", addCurrentAsset.confirmAddressLineOne());
        assertTrue("Unable to confirm Address Line 2 field", addCurrentAsset.confirmAddressLineTwo());
        assertTrue("Unable to confirm Address Line 3 field", addCurrentAsset.confirmAddressLineThree());
        assertTrue("Unable to confirm City field", addCurrentAsset.confirmCityField());
        assertTrue("Unable to confirm State dropdown", addCurrentAsset.confirmStateDropdown());
        assertTrue("Unable to confirm Zip field", addCurrentAsset.confirmZipField());
        assertTrue("Failed to click Save button after adding current asset ", addCurrentAsset.clickSaveButtonAddCurrentAsset());
        assertTrue("Unable to confirm Success Message after adding current asset", addCurrentAsset.confirmSuccessMessageAfterAddingCurrentAsset());
    }

}
