package smoke_and_sanity_tests.leasing_center_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.dashboard_tab.leasing_center_subtab.LeadForm;
import page_objects.entrata_page_objects.dashboard_tab.leasing_center_subtab.OtherForm;
import page_objects.entrata_page_objects.dashboard_tab.leasing_center_subtab.ResidentForm;
import page_objects.entrata_page_objects.dashboard_tab.leasing_center_subtab.WorkOrderForm;

import static org.junit.Assert.assertTrue;

public class ModulesAndSubModulesOfLeasingCenterIT extends BaseBrowserTest {
    public ModulesAndSubModulesOfLeasingCenterIT() {
        super("village");
    }

@Test
    public void VerifyAllTheTabsAndSmokeScenariosOfLeasingCenterAndSubModules() {//Test Case ID: 2255504
    EntrataNavBar dashboardNav = new EntrataNavBar(driver);
    assertTrue("Failed to click on Leasing Center Tab",dashboardNav.clickLeasingCenterTab());
    LeadForm leadTab = new LeadForm(driver);
    assertTrue("Failed to find Lead Form",leadTab.findLeadForm());
    assertTrue("Failed to find Required Info Tab",leadTab.findRequiredInfoTab());
    assertTrue("Failed to find Floor Plans And Units Tab",leadTab.findFloorPlansAndUnitsTab());
    assertTrue("Failed to find Benefit Selling Tab",leadTab.findBenefitSellingTab());
    assertTrue("Failed to find Qualifications Tab",leadTab.findQualificationsTab());
    assertTrue("Failed to find Appointment Tab",leadTab.findAppointmentTab());
    assertTrue("Failed to find Additional Notes Tab",leadTab.findAdditionalNotesTab());
    assertTrue("Failed to find Reset Form Link",leadTab.findResetFormLink());
    assertTrue("Failed to find Property Selector Dropdown",leadTab.findPropertySelectorDropdown());
    assertTrue("Failed to click on Form Selector Dropdown",leadTab.clickFormSelectorDropdown());
    assertTrue("Failed to find Resident Tab Dropdown", leadTab.findResidentTab());
    assertTrue("Failed to find Other Tab Dropdown", leadTab.findOtherTab());
    ResidentForm residentTab = new ResidentForm(driver);
    assertTrue("Failed to click on Form Selector Dropdown",leadTab.clickFormSelectorDropdown());
    assertTrue("Failed to click on Resident Tab Dropdown", residentTab.clickResidentTabDropdown());
    assertTrue("Failed to find Resident Resident Info Tab", residentTab.findResidentResidentInfoTabThreeDotTwo());
    assertTrue("Failed to find Resident New Work Order Tab", residentTab.findResidentNewWorkOrderTabThreeDotTwo());
    assertTrue("Failed to find Resident New Resident Note Tab", residentTab.findResidentNewResidentNoteTabThreeDotTwo());
    OtherForm otherTab = new OtherForm(driver);
    assertTrue("Failed to click on Form Selector Dropdown",leadTab.clickFormSelectorDropdown());
    assertTrue("Failed to click on Other Tab Dropdown", otherTab.clickOtherTabDropdown());
    assertTrue("Failed to find Other Basic Info Tab", otherTab.findOtherBasicInfoTab());
    assertTrue("Failed to find Other Submit Message Tab", otherTab.findOtherSubmitMessage());
    assertTrue("Failed to click on Property Selector Dropdown Icon", otherTab.clickPropertySelectorDropdownIcon());
    assertTrue("Failed to insert text into Property Search Bar", otherTab.enterKeysIntoPropertySearchBar("The Village Cliffs"));
    assertTrue("Failed to submit enter key", otherTab.submitKeysIntoPropertySearchBar());
    assertTrue("Failed to find The Village Cliffs Property", otherTab.findTheVillageCliffsProperty());
    }
}
