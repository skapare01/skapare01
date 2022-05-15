package smoke_and_sanity_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.client_admin_page_objects.dashboard_tab.MyDashboardNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.CompanyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.application_tab.RoommateInterestsPage;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.CompanyLeasingNav;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.lease_tab.LeaseNav;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.residents_tab.ChecklistsPage;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.lease_tab.CompanySpaceOptionsPage;
import page_objects.entrata_page_objects.setup_tab.company_settings_subtab.leasing_tab.lease_tab.LeaseTermStructuresPage;

import static org.junit.Assert.*;

public class ShouldVerifyCompanyStudentModulesWhenClientHasActiveStudentPropertiesIT extends BaseBrowserTest {
    public ShouldVerifyCompanyStudentModulesWhenClientHasActiveStudentPropertiesIT() {
        super("dallasentratatest9");}

    @Test
    public void verifiesStudentModulesArePresentInCompanySettings(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation comp = new CompanyFirstLevelNavigation(driver);
        CompanyLeasingNav lNav = new CompanyLeasingNav(driver);
        LeaseNav leaseNav = new LeaseNav(driver);
        LeaseTermStructuresPage term = new LeaseTermStructuresPage(driver);
        CompanySpaceOptionsPage spaceOption = new CompanySpaceOptionsPage(driver);
        RoommateInterestsPage roommateInterests = new RoommateInterestsPage(driver);
        MyDashboardNav myDashboardNav = new MyDashboardNav(driver);
        assertTrue("Unable to click setup tab.", nav.clickSetupButton());
        assertTrue("Unable to click company subtab.",nav.clickCompanyButton());
        assertTrue("Unable to click on leasing tab.", comp.clickLeasingTab());
        assertTrue("Unable to click on lease subtab.", lNav.clickLeaseSubTab());
        assertTrue("Unable to click lease Term structures tab.",leaseNav.clickLeaseStructuresTab());
        assertTrue("Unable to click add term structure button.",term.clickAddTermStructure());
        assertTrue("Structure name field is not visible on add lease term structure popup.", term.confirmStructureNameFieldVisible());
        assertTrue("Unable to click cancel button on add lease term structure popup.", term.clickCancelButton());
        assertTrue("Unable to click first edit lease term structure icon.",term.clickEditLeaseTermStructure());
        assertTrue("Unable to click cancel button on edit lease term structure screen.", term.clickCancelButton());
        assertTrue("Unable to click space options tab.",leaseNav.clickSpaceOptionsTab());
        assertTrue("Unable to click add space option button.",spaceOption.clickAddSpaceOption());
        assertTrue("Unable to edit space option title field on add space option screen.",spaceOption.enterSpaceOptionTitle("Best Space Option"));
        assertTrue("Unable to click cancel on add space option screen.",term.clickCancelButton());
        assertTrue("Unable to click application subtab.",lNav.clickApplicationTab());
        assertTrue("Unable to click add question button.", roommateInterests.clickAddQuestion());
        assertTrue("Unable to find question type dropdown on add question screen/", roommateInterests.confirmVisibilityOfQuestionTypeDropdown());


    }

    @Test
    public void verifiesBasicNavigationOfStudentCompanyChecklistPage_WhenStudentPropertiesAreActive(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        CompanyFirstLevelNavigation comp = new CompanyFirstLevelNavigation(driver);
        ChecklistsPage checklist = new ChecklistsPage(driver);
        assertTrue("Unable to click setup tab.", nav.clickSetupButton());
        assertTrue("Unable to click company subtab.",nav.clickCompanyButton());
        assertTrue("Unable to click resident tab in company settings.",comp.clickResidentsTab());
        assertTrue("Unable to click checklists tab in resident company settings.",checklist.clickChecklistTab());
        assertTrue("Unable to click add checklist button.",checklist.clickAddChecklist());
        assertTrue("Unable to find checklist name field on add checklist screen.",checklist.verifyNameFieldIsVisible());



    }
}
