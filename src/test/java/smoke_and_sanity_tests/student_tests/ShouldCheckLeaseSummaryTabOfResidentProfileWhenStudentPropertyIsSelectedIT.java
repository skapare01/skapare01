package smoke_and_sanity_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentFilterPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.AllResidentsPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.ResidentProfileCurtainPage;
import page_objects.entrata_page_objects.residents_tab.all_residents_subtab.resident_profile.lease_tab.SummaryPage;

import static org.junit.Assert.*;

public class ShouldCheckLeaseSummaryTabOfResidentProfileWhenStudentPropertyIsSelectedIT extends BaseBrowserTest {
    public ShouldCheckLeaseSummaryTabOfResidentProfileWhenStudentPropertyIsSelectedIT(){
        super("dallasentratatest9");}

    @Test
    public void shouldCheckThatEditSpaceOptionPageAndEditMoveInDatePageOpen_whenEditLinksAreClickedInLeaseSummary(){
        EntrataNavBar navBar = new EntrataNavBar(driver);
        AllResidentsPage allResidentsPage = new AllResidentsPage(driver);
        AllResidentFilterPage allResidentFilterPage = new AllResidentFilterPage(driver);
        ResidentProfileCurtainPage residentProfileCurtainPage = new ResidentProfileCurtainPage(driver);
        SummaryPage summaryPage = new SummaryPage(driver);
        assertTrue("Unable to click residents tab.", navBar.clickResidentsTab());
        assertTrue("Unable to click resident filter.",allResidentsPage.clickResidentFilter());
        assertTrue("Unable to click clear all properties from property filter.",allResidentFilterPage.clickClearAll());
        assertTrue("Unable to click add property button.",allResidentFilterPage.clickAddPropertyButton());
        assertTrue("Unable to enter property in property filter search field.",allResidentFilterPage.clickOnSpecificFilteredProperty("Lofts at Lorien"));
        assertTrue("Unable to click advanced filters button.",allResidentFilterPage.clickAdvancedFilters());
        assertTrue("Unable to type 'Current' in status field.", allResidentFilterPage.filterByCurrentStatus());
        assertTrue("Unable to click current status from status filter.",allResidentFilterPage.clickCurrentStatus());
        assertTrue("Unable to click filter residents button.",allResidentFilterPage.clickFilterResidents());
        assertTrue("Unable to click on first resident on all residents page.",allResidentFilterPage.clickResidentSearchResult());
        assertTrue("Unable to click lease tab in resident profile.",residentProfileCurtainPage.clickResidentProfileLeaseTab());
        assertTrue("Unable to click edit lease info button.",summaryPage.clickEditLeaseInfo());
        assertTrue("Unable to click edit move in button.",summaryPage.clickEditMoveinDate());
        assertTrue("Unable to find revise move in date field after clicking edit move in button.",summaryPage.confirmReviseMoveinDateOpens());
        assertTrue("Unable to click close button to close revise move in popup.",summaryPage.clickCloseReviseMoveIN());
        assertTrue("Unable to click edit space options button.",summaryPage.clickEditSpaceOption());
        assertTrue("Unable to find space option dropdown in edit space options popup.",summaryPage.confirmUpdateSpaceOptionOpens());

    }
}
