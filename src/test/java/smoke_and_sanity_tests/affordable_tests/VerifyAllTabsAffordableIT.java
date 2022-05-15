package smoke_and_sanity_tests.affordable_tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.affordable_subtab.AffordableElectronicReportingList;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentFilterPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.ResidentProfileCurtainPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.household_tab.*;
import page_objects.entrata_page_objects.residents_tab.gross_rent_change_subtab.GrossRentChangePage;
import page_objects.entrata_page_objects.residents_tab.hap_requests_subtab.HapRequestsPage;
import page_objects.entrata_page_objects.residents_tab.special_claims_subtab.SpecialClaimsPage;
import page_objects.entrata_page_objects.residents_tab.tracs_transmissions_subtab.TracsTransmissionsPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.PropertyNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.affordable.*;

public class VerifyAllTabsAffordableIT extends BaseBrowserTest {

    public VerifyAllTabsAffordableIT() {
        super("1automationrapid");
    }

    @Test //These three @Tests will cover Test Case ID: #2254674
    public void shouldVerifyAllAffordablePropertyTabsAndSections_whenNavigatingThroughAffordablePropertySettings() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to locate Setup tab", nav.clickSetupButton());
        assertTrue("Unable to locate Properties sub tab", nav.clickPropertiesButton());

        //search for property
        PropertyListPage searchAffProp = new PropertyListPage(driver);
        assertTrue("Unable to find Property input field", searchAffProp.clickPropertyInput());
        assertTrue("Unable to enter property name", searchAffProp.searchPropertyName("Affordable_Automation"));
        assertTrue("Could not submit search for property name", searchAffProp.pressEnterInPropertySearch());
        assertTrue("Could not find property to click", searchAffProp.selectFirstPropertyFromList());

        PropertyNavigation propNav = new PropertyNavigation(driver);
        assertTrue("Unable to locate Affordable main tab", propNav.clickPropertyAffordableMainTab());

        //Verify Affordable tabs in property settings
        AffordableNavTabs propSet = new AffordableNavTabs(driver);
        assertEquals("HUD", propSet.confirmHudTab());
        assertEquals("TAX CREDITS", propSet.confirmTaxCreditTab());
        assertEquals("HOME", propSet.confirmHomeTab());
        assertEquals("INCOME LIMITS", propSet.confirmIncomeLimitsTab());

        //Verify HUD sections
        AffordableNavTabs hud = new AffordableNavTabs(driver);
        assertTrue("Unable to locate HUD property settings tab", hud.clickPropertyHudTab());

        HudPage hudTab = new HudPage(driver);
        assertEquals("HUD Property Information", hudTab.confirmHudPropertyInfoSection());
        assertEquals("Certifications", hudTab.confirmHudCertificationSection());
        assertEquals("HUD Contracts", hudTab.confirmHudContractsSection());

        //Verify Tax Credit Sections
        AffordableNavTabs tax = new AffordableNavTabs(driver);
        assertTrue("Unable to locate Tax Credit property settings tab", tax.clickPropertyTaxCreditTab());

        TaxCreditsPage tcSection = new TaxCreditsPage(driver);
        assertEquals("Tax Credit Property Information", tcSection.confirmTaxCreditPropertyInfoSection());
        assertEquals("Programs", tcSection.confirmTaxCreditProgramsSection());
        assertEquals("Certification", tcSection.confirmTaxCreditCertificationSection());
        assertEquals("Household Composition", tcSection.confirmTaxCreditHouseholdCompositionSection());

        //Verify Home Sections
        AffordableNavTabs home = new AffordableNavTabs(driver);
        assertTrue("Unable to locate Home property settings tab", home.clickPropertyHomeTab());

        HomePage homeSection = new HomePage(driver);
        assertEquals("HOME Property Information", homeSection.confirmHomePropertyInfoSection());
        assertEquals("Recertifications", homeSection.confirmHomeRecertificationsSection());
        assertEquals("Rent Limits", homeSection.confirmHomeRentLimitsSection());
        assertEquals("HOME Program Rents", homeSection.confirmHomeProgramRentsSections());

        //Verify Income Limits Sections
        AffordableNavTabs incLim = new AffordableNavTabs(driver);
        assertTrue("Unable to locate Income Limits property settings tab", incLim.clickPropertyIncomeLimitsTab());

        IncomeLimitsPage inc = new IncomeLimitsPage(driver);
        assertEquals("Metro Area", inc.confirmIncomeLimitsMetro());
        assertEquals("HUD Income Limits", inc.confirmIncomeLimitsHud());
        assertEquals("HOME Income Limits", inc.confirmIncomeLimitsHome());
        assertEquals("Federal Tax Credits Income Limits", inc.confirmIncomeLimitsFederal());
        assertEquals("Custom Tax Credit Income Limits", inc.confirmIncomeLimitsCustom());
    }

    @Test
    public void shouldVerifyAllAffordableResidentProfileTabsAndSections_whenNavigatingThroughAResidentProfile() {
        //Search for resident to begin resident profile tab/section verification
        EntrataNavBar nv = new EntrataNavBar(driver);
        assertTrue("Unable to locate Resident tab on the dashboard", nv.clickResidentsTab());

        //Search for Resident
        AllResidentsPage resSearch = new AllResidentsPage(driver);
        assertTrue("Could not find filter button", resSearch.clickResidentFilter());

        AllResidentFilterPage resFilter = new AllResidentFilterPage(driver);
        assertTrue("Unable to enter Lease ID", resFilter.enterLeaseId("15578408"));
        assertTrue("Unable to submit Lease ID", resFilter.submitLeaseSearch());
        assertTrue("Lease ID not found", resFilter.clickResidentSearchResult());

        //Start verifying Resident Profile affordable tabs/sections
        ResidentProfileCurtainPage respro = new ResidentProfileCurtainPage(driver);
        assertTrue("Unable to locate Household tab on Resident Profile", respro.clickResidentProfileHouseholdTab());

        HouseholdTabPage res = new HouseholdTabPage(driver);
        assertEquals("Details", res.confirmResidentProfileDetailsTab());
        assertEquals("Certifications", res.confirmResidentProfileCertificationsTab());
        assertEquals("People", res.confirmResidentProfilePeopleTab());
        assertEquals("Income", res.confirmResidentProfileIncomeTab());
        assertEquals("Assets", res.confirmResidentProfileAssetsTab());
        assertEquals("Expenses", res.confirmResidentProfileExpensesTab());
        assertTrue("Unable to click Details Tab on the Resident Profile", res.clickResidentProfileDetailsTab());

        //Household >> Details Tab (section verification)
        DetailsTabPage details = new DetailsTabPage(driver);
        assertEquals("Household Information", details.confirmHouseholdDetailsSection());

        //Verify Certifications tab/section in resident profile
        HouseholdTabPage cert = new HouseholdTabPage(driver);
        assertTrue("Unable to locate Certifications tab in Resident Profile", cert.clickResidentProfileCertificationsTab());

        //Verify Household >> Certifications sections
        CertificationsTabPage verCert = new CertificationsTabPage(driver);
        assertEquals("Certification Info", verCert.confirmCertificationInfo());
        assertTrue("Unable to locate Certifications section under Certifications tab", verCert.confirmCertificationsSection());

        //Verify People tab/sections in resident profile
        HouseholdTabPage people = new HouseholdTabPage(driver);
        assertTrue("Unable to locate People tab in Resident Profile", people.clickResidentProfilePeopleTab());

        PeopleTabPage pSec = new PeopleTabPage(driver);
        assertTrue("Unable to locate Anticipated Family Additions section under People tab", pSec.confirmPeopleAnticipatedFamilyAdditionsSection());
        assertEquals("Current Occupants", pSec.confirmPeopleCurrentOccupantsSection());

        //Verify Income tab/sections in resident profile
        HouseholdTabPage income = new HouseholdTabPage(driver);
        assertTrue("Unable to locate Income tab in Resident Profile", income.clickResidentProfileIncomeTab());

        IncomeTabPage incSec = new IncomeTabPage(driver);
        assertTrue("Unable to locate Current Income side tab", incSec.confirmIncomeCurrentSideTab());
        assertTrue("Unable to locate Future Income side tab", incSec.confirmIncomeFutureSideTab());
        assertTrue("Unable to locate Past Income side tab", incSec.confirmIncomePastSideTab());
        assertTrue("Unable to locate Add Current Income button", incSec.confirmAddCurrentIncomeButton());
        assertTrue("Column Type does not exist in Income tab", incSec.confirmIncomeColumnType());
        assertTrue("Column Effective does not exist in Income tab", incSec.confirmIncomeColumn_Effective());
        assertTrue("Column Description does not exist in Income tab", incSec.confirmIncomeColumn_Description());
        assertTrue("Column Employer/Source does not exist in Income tab", incSec.confirmIncomeColumn_EmployerSource());
        assertTrue("Column Income does not exist in Income tab", incSec.confirmIncomeColumn_Income());
        assertTrue("Column Member does not exist in Income tab", incSec.confirmIncomeColumn_Member());
        assertTrue("Column Actions does not exist in Income tab", incSec.confirmIncomeColumn_Actions());

        //Verify Asset tab/sections in resident profile
        HouseholdTabPage asset = new HouseholdTabPage(driver);
        assertTrue("Unable to locate Asset tab in Resident Profile", asset.clickResidentProfileAssetsTab());

        AssetsTabPage aSec = new AssetsTabPage(driver);
        assertTrue("Unable to locate Current Asset side tab", aSec.confirmAssetsCurrentSideTab());
        assertTrue("Unable to locate Future Asset side tab", aSec.confirmAssetsFutureSideTab());
        assertTrue("Unable to locate Past Asset side tab", aSec.confirmAssetsPastSideTab());
        assertTrue("Unable to locate Add Current Asset button", aSec.confirmAddCurrentAssetButton());
        assertTrue("Column Type does not exist in Assets tab", aSec.confirmAssetColumn_Type());
        assertTrue("Column Effective does not exist in Assets tab", aSec.confirmAssetColumn_Effective());
        assertTrue("Column Description does not exist in Assets tab", aSec.confirmAssetColumn_Description());
        assertTrue("Column Disposed does not exist in Assets tab", aSec.confirmAssetColumn_Disposed());
        assertTrue("Column Cash Value does not exist in Assets tab", aSec.confirmAssetColumn_CashValue());
        assertTrue("Column Annual Income does not exist in Assets tab", aSec.confirmAssetColumn_AnnualIncome());
        assertTrue("Column Member does not exist in Assets tab", aSec.confirmAssetColumn_Member());
        assertTrue("Column Actions does not exist in Assets tab", aSec.confirmAssetColumn_Actions());

        //Verify Expenses tab in Resident profile
        HouseholdTabPage exp = new HouseholdTabPage(driver);
        assertTrue("Unable to locate Expenses tab in Resident Profile", exp.clickResidentProfileExpensesTab());

        ExpensesTabPage eSec = new ExpensesTabPage(driver);
        assertTrue("Unable to locate Current Income side tab", eSec.confirmExpensesCurrentSideTab());
        assertTrue("Unable to locate Future Income side tab", eSec.confirmExpensesFutureSideTab());
        assertTrue("Unable to locate Past Income side tab", eSec.confirmExpensesPastSideTab());
        assertTrue("Unable to locate Add Current Expenses button", eSec.confirmAddCurrentExpenseButton());
        assertTrue("Column Type does not exist in Expenses tab", eSec.confirmExpenseColumn_Type());
        assertTrue("Column Effective does not exist in Expenses tab", eSec.confirmExpenseColumn_Effective());
        assertTrue("Column Description does not exist in Expenses tab", eSec.confirmExpenseColumn_Description());
        assertTrue("Column Annual Expense does not exist in Expenses tab", eSec.confirmExpenseColumn_Annual_Expense());
        assertTrue("Column Member does not exist in Expenses tab", eSec.confirmExpenseColumn_Member());
        assertTrue("Column Actions does not exist in Expenses tab", eSec.confirmExpenseColumn_Actions());
    }

    @Test
    public void shouldVerifyAllAffordableResidentDashboardSubTabsAndSections_whenNavigatingThroughAResidentDashboard() {
        //Affordable Dashboard Testing
        EntrataNavBar affNav = new EntrataNavBar(driver);
        assertTrue("Unable to click Residents main tab", affNav.clickResidentsTab());
        assertTrue("Unable to click Affordable sub-tab", affNav.clickAffordableSubTab());

        AffordableElectronicReportingList affordable = new AffordableElectronicReportingList(driver);
        assertTrue("Unable to verify Affordable Electronic Reporting page", affordable.confirmAffordableElectronicReporting());
        assertTrue("Column Property does not exist in Affordable Electronic Reporting", affordable.confirmAffordableColumn_Property());
        assertTrue("Column Report Type does not exist in Affordable Electronic Reporting", affordable.confirmAffordableColumn_ReportType());
        assertTrue("Column Data Range does not exist in Affordable Electronic Reporting", affordable.confirmAffordableColumn_DataRange());
        assertTrue("Column Created does not exist in Affordable Electronic Reporting", affordable.confirmAffordableColumn_Created());

        //Hap Requests
        EntrataNavBar hapRequests = new EntrataNavBar(driver);
        assertTrue("Unable to click on HAP Requests sub-tab under Residents tab on the Dashboard", hapRequests.clickHapRequestsSubTab());

        HapRequestsPage hr = new HapRequestsPage(driver);
        assertTrue("Column Month does not exist in HAP Requests sub-tab", hr.confirmHapRequestsColumn_Month());
        assertTrue("Column Status does not exist in HAP Requests sub-tab", hr.confirmHapRequestsColumn_Status());
        assertTrue("Column Property does not exist in HAP Requests sub-tab", hr.confirmHapRequestsColumn_Property());
        assertTrue("Column Contract does not exist in HAP Requests sub-tab", hr.confirmHapRequestsColumn_Contract());
        assertTrue("Column Assistance Payments does not exist in HAP Requests sub-tab", hr.confirmHapRequestsColumn_AssistancePayments());
        assertTrue("Column Adjustments does not exist in HAP Requests sub-tab", hr.confirmHapRequestsColumn_Adjustments());
        assertTrue("Column Misc Requests does not exist in HAP Requests sub-tab", hr.confirmHapRequestsColumn_MiscRequests());
        assertTrue("Column Repayment Agmts does not exist in HAP Requests sub-tab", hr.confirmHapRequestsColumn_RepaymentAgmts());
        assertTrue("Column Special Claims does not exist in HAP Requests sub-tab", hr.confirmHapRequestsColumn_SpecialClaims());
        assertTrue("Column Total Subsidy does not exist in HAP Requests sub-tab", hr.confirmHapRequestsColumn_TotalSubsidy());

        //TRACS
        EntrataNavBar tracs = new EntrataNavBar(driver);
        assertTrue("Unable to click on TRACS sub-tab under Residents tab on the Dashboard", tracs.clickTracsTransmissionsSubTab());

        TracsTransmissionsPage tr = new TracsTransmissionsPage(driver);
        assertTrue("Column Transaction ID does not exist in TRACS sub-tab", tr.confirmTracsColumn_TransactionId());
        assertTrue("Column Type does not exist in TRACS sub-tab", tr.confirmTracsColumn_Type());
        assertTrue("Column Property does not exist in TRACS sub-tab", tr.confirmTracsColumn_Property());
        assertTrue("Column Recipient does not exist in TRACS sub-tab", tr.confirmTracsColumn_Recipient());
        assertTrue("Column Subject does not exist in TRACS sub-tab", tr.confirmTracsColumn_Subject());
        assertTrue("Column Items does not exist in TRACS sub-tab", tr.confirmTracsColumn_Items());
        assertTrue("Column Transmission Date does not exist in TRACS sub-tab", tr.confirmTracsColumn_TransmissionDate());
        assertTrue("Column Response Date / ID does not exist in TRACS sub-tab", tr.confirmTracsColumn_ResponseDateId());

        //Special Claims
        EntrataNavBar sClaims = new EntrataNavBar(driver);
        assertTrue("Unable to click on Special Claims sub-tab under Residents tab on the Dashboard", sClaims.clickSpecialClaimsSubTab());

        SpecialClaimsPage spec = new SpecialClaimsPage(driver);
        assertTrue("Column Type does not exist in Special Claims sub-tab", spec.confirmSpecialClaimsColumn_Type());
        assertTrue("Column Property does not exist in Special Claims sub-tab", spec.confirmSpecialClaimsColumn_Property());
        assertTrue("Column Unit does not exist in Special Claims sub-tab", spec.confirmSpecialClaimsColumn_Unit());
        assertTrue("Column Vacant Tenant Name does not exist in Special Claims sub-tab", spec.confirmSpecialClaimsColumn_VacantTenantName());
        assertTrue("Column Move-out does not exist in Special Claims sub-tab", spec.confirmSpecialClaimsColumn_MoveOut());
        assertTrue("Column Available On does not exist in Special Claims sub-tab", spec.confirmSpecialClaimsColumn_AvailableOn());
        assertTrue("Column Status does not exist in Special Claims sub-tab", spec.confirmSpecialClaimsColumn_Status());
        assertTrue("Column Created does not exist in Special Claims sub-tab", spec.confirmSpecialClaimsColumn_Created());
        assertTrue("Column ID does not exist in Special Claims sub-tab", spec.confirmSpecialClaimsColumn_ID());
        assertTrue("Column Amount Submitted does not exist in Special Claims sub-tab", spec.confirmSpecialClaimsColumn_AmountSubmitted());
        assertTrue("Column Amount Approved does not exist in Special Claims sub-tab", spec.confirmSpecialClaimsColumn_AmountApproved());

        //Gross Rent Change
        EntrataNavBar grc = new EntrataNavBar(driver);
        assertTrue("Unable to click on Gross Rent Change sub-tab under Residents tab on the Dashboard", grc.clickGrossRentChangeSubTab());

        GrossRentChangePage grChange = new GrossRentChangePage(driver);
        assertTrue("Column Property does not exist in Gross Rent Change sub-tab", grChange.confirmGrossRentChangeColumn_Property());
        assertTrue("Column Contract does not exist in Gross Rent Change sub-tab", grChange.confirmGrossRentChangeColumn_Contract());
        assertTrue("Column Effective Date does not exist in Gross Rent Change sub-tab", grChange.confirmGrossRentChangeColumn_EffectiveDate());
    }

}
