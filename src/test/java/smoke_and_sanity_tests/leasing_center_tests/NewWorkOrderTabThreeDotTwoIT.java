package smoke_and_sanity_tests.leasing_center_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.dashboard_tab.leasing_center_subtab.LeadForm;
import page_objects.entrata_page_objects.dashboard_tab.leasing_center_subtab.ResidentForm;

import static org.junit.Assert.assertTrue;

public class NewWorkOrderTabThreeDotTwoIT extends BaseBrowserTest {

    public NewWorkOrderTabThreeDotTwoIT() { super("village"); }

    @Test
    public void verifyTheFunctionalityOfNewWorkOrderTab() { //Test Case ID: 3089166
        EntrataNavBar dashboardNav = new EntrataNavBar(driver);
        assertTrue("Failed to click on Leasing Center Tab",dashboardNav.clickLeasingCenterTab());
        LeadForm leadTab = new LeadForm(driver);
        assertTrue("Failed to find Lead Form", leadTab.findLeadForm());
        assertTrue("Failed to click on Form Selector Dropdown", leadTab.clickFormSelectorDropdown());
        ResidentForm residentTab = new ResidentForm(driver);
        assertTrue("Failed to click on Resident Form Dropdown", residentTab.clickResidentTabDropdown());
        assertTrue("Failed to find Resident Info Tab", residentTab.findResidentResidentInfoTabThreeDotTwo());
        assertTrue("Failed to find New Work Order Tab", residentTab.findResidentNewWorkOrderTabThreeDotTwo());
        assertTrue("Failed to find New Resident Note Tab", residentTab.findResidentNewResidentNoteTabThreeDotTwo());
        assertTrue("Failed to click on New Work Order Tab", residentTab.clickResidentNewWorkOrderTabThreeDotTwo());
        assertTrue("Failed to find Work Order For:", residentTab.findWorkOrderForThreeDotTwo());
        assertTrue("Failed to find Unit Option", residentTab.findUnitThreeDotTwo());
        assertTrue("Failed to find Property Option", residentTab.findPropertyThreeDotTwo());
        assertTrue("Failed to find Problem Location:", residentTab.findProblemLocationThreeDotTwo());
        assertTrue("Failed to find Priority:", residentTab.findPriorityThreeDotTwo());
        assertTrue("Failed to find Description of Problem:", residentTab.findDescriptionOfProblemThreeDotTwo());
        assertTrue("Failed to find Obtained permission to Enter:", residentTab.findObtainedPermissionToEnterThreeDotTwo());
        assertTrue("Failed to find Entry Notes:", residentTab.findEntryNotesThreeDotTwo());
        assertTrue("Failed to find Outgoing Calls Made:", residentTab.findOutgoingCallsMadeThreeDotTwo());
        assertTrue("Failed to find Call Notes", residentTab.findCallNotesThreeDotTwo());
        assertTrue("Failed to find Request Call Back From Property", residentTab.findRequestCallBackFromPropertyThreeDotTwo());
        assertTrue("Failed to find Add Problem to Work Order", residentTab.findAddProblemToWorkOrderThreeDotTwo());
        assertTrue("Failed to find Send Info Via Email Button", residentTab.findSendInfoViaEmailButtonThreeDotTwo());
        assertTrue("Failed to find Submit to Property", residentTab.findSubmitToPropertyButtonThreeDotTwo());
        assertTrue("Failed to click Resident Info Tab", residentTab.clickResidentInfoTabThreeDotTwo());
        assertTrue("Failed to insert First Name In Resident Info", residentTab.insertFirstNameInResidentInfoThreeDotTwo("Craig"));
        assertTrue("Failed to insert Last Name in Resident Info", residentTab.insertLastNameInResidentInfoThreeDotTwo("Wardle"));
        assertTrue("Failed to insert Unit in Resident Info", residentTab.insertUnitInResidentInfoThreeDotTwo("54"));
        assertTrue("Failed to click Building Dropdown in Resident Info", residentTab.clickBuildingDropdownInResidentInfoThreeDotTwo());
        assertTrue("Failed to click first Building in Dropdown in Resident Info", residentTab.selectFirstBuildingInDropdown());
        assertTrue("Failed to insert Phone Number in Resident Info", residentTab.insertPhoneNumberInResidentInfoThreeDotTwo("8044402222"));
        assertTrue("Failed to insert Call ID Number in Resident Info", residentTab.insertCallIDNumberThreeDotTwo("55555"));
        assertTrue("Failed to click on New Work Order Tab", residentTab.clickResidentNewWorkOrderTabThreeDotTwo());
        assertTrue("Failed to click on Unit Option", residentTab.clickUnitThreeDotTwo());
        assertTrue("Failed to click on Problem Location Menu", residentTab.clickProblemLocationThreeDotTwo());
        assertTrue("Failed to click on Kitchen Location", residentTab.clickProblemLocationKitchenThreeDotTwo());
        assertTrue("Failed to find Category", residentTab.findCategoryThreeDotTwo());
        assertTrue("Failed to click Category Menu", residentTab.clickCategoryThreeDotTwo());
        assertTrue("Failed to click Appliance Category", residentTab.clickApplianceCategoryThreeDotTwo());
        assertTrue("Failed to click Problem Menu", residentTab.clickProblemThreeDotTwo());
        assertTrue("Failed to click Dishwasher Problem", residentTab.clickDishwasherProblemThreeDotTwo());
        assertTrue("Failed to click in the Description of Problem Text Box", residentTab.clickDescriptionOfProblemTextBox());
        assertTrue("Failed to insert text into Description of Problem Text Box", residentTab.insertDescriptionOfProblemInTextBox("Leaking"));
        assertTrue("Failed to click Yes on Obtained Permission to Enter", residentTab.clickYesOnObtainedPermissionToEnter());
        assertTrue("Failed to click Submit to Property Button", residentTab.clickSubmitToPropertyButton());
        assertTrue("Failed to find Work Order Submitted Successfully Alert", residentTab.findWorkOrderSubmittedSuccessfullyAlert());
    }
}
