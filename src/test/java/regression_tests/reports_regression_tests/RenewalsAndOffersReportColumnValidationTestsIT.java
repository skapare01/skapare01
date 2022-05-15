package regression_tests.reports_regression_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.reports_tab.SharedGeneralReportingFunctions;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.operations_reports.RenewalsAndOffersReport;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.general_subtab.details_tab.GeneralPropertyInformation;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RenewalsAndOffersReportColumnValidationTestsIT extends BaseBrowserTest {
    public RenewalsAndOffersReportColumnValidationTestsIT() {
        super("avantic");
    }

    @Test
    //Test for EntrataTest ID #2250942
    public void shouldConfirmPropertyLookUpCodeColumn_whenEnabledThroughDisplayOptions() {
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        assertTrue("Can't Find Reporting Tab", entrataNavBar.moveToReportsTab());
        assertTrue("Reporting 3.0 cant find library from dropdown", entrataNavBar.moveToLibrary());
        assertTrue("Can't Click on library", entrataNavBar.librarySelect());
        SharedGeneralReportingFunctions sharedGeneralReportingFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("Could not scroll to Rent Variance report.", sharedGeneralReportingFunctions.moveTo5BelowReport(83));
        RenewalsAndOffersReport renewalsAndOffersReport = new RenewalsAndOffersReport(driver);
        assertTrue("Could not click on Renewals and Offers report link.", renewalsAndOffersReport.clickRenewalsAndOffersReportLink());
        assertTrue("Add Button is not present in Property Groups Filter", sharedGeneralReportingFunctions.clickAddPropertiesButton());
        assertTrue("Could not enter 'Woodland Commons' name into search text field in Property Groups filter.", sharedGeneralReportingFunctions.sendKeysOfPropertyNameToTextFieldOfPropertyGroupsFilter("Woodland Commons"));
        assertTrue("Property is not selectable in the Property Groups Filter", sharedGeneralReportingFunctions.pickFirstProperty());
        assertTrue("Generate report button cannot be clicked.", sharedGeneralReportingFunctions.clickGenerateReportButton());
        assertTrue("Renewals and Offers report did not generate.", sharedGeneralReportingFunctions.verifyGenerationOfReport());
        assertTrue("Property Look-up Code column is present, when it should not be!", renewalsAndOffersReport.confirmPropertyLookUpCodeColumnIsNotPresent());
        assertTrue("Could not click on overlay.", sharedGeneralReportingFunctions.doubleClickOverlay());
        assertTrue("Could not click on Filters tab on left-side of open report.", sharedGeneralReportingFunctions.clickFiltersTabOnLeftSideOfOpenReport());
        assertTrue("Could not click on Display Options tab.", sharedGeneralReportingFunctions.clickDisplayOptionsTab());
        assertTrue("Could not check the box next to the Property Look-up Code column for Summary dataset.", renewalsAndOffersReport.clickPropertyLookUpCodeCheckboxForSummaryDataset());
        assertTrue("Could not click the Datasets drop down menu in the Display Options.", renewalsAndOffersReport.clickDatasetDropDownMenuInDisplayOptions());
        assertTrue("Could not select the Details dataset in the Datasets drop down menu.", renewalsAndOffersReport.clickDetailDatasetOptionInDatasetDropDownMenu());
        assertTrue("Could not check the box next to the Property Look-up Code column for Details dataset.", renewalsAndOffersReport.clickPropertyLookUpCodeCheckboxForDetailsDataset());
        assertTrue("Could not click the Filters tab.", sharedGeneralReportingFunctions.clickFiltersTab());
        assertTrue("Could not click on the green Generate report button.", sharedGeneralReportingFunctions.clickGenerateReportButton());
        assertTrue("The Renewals and Offers report did not generate the second time.", sharedGeneralReportingFunctions.verifyGenerationOfReport());
        assertTrue("Could not confirm that the Property Look-up Code column is present!", renewalsAndOffersReport.confirmPropertyLookUpCodeColumnIsPresent());
        assertTrue("Could not click the Close X button in the top right corner.", sharedGeneralReportingFunctions.clickCloseXButtonInTopRightCorner());
        assertTrue("Could not scroll to 1099 Review report.", sharedGeneralReportingFunctions.moveTo5BelowReport(1));
        assertTrue("Could not click the Setup tab.", entrataNavBar.clickSetupButton());
        assertTrue("Could not click the Properties subtab.", entrataNavBar.clickPropertiesButton());
        PropertyListPage propertyListPage = new PropertyListPage(driver);
        assertTrue("Could not click into the Property Name search field.", propertyListPage.clickPropertyInput());
        assertTrue("Could not send Property name keys into Property Search text field.", propertyListPage.searchPropertyName("Woodland Commons"));
        assertTrue("Could not hit enter in Property Name search field.", propertyListPage.pressEnterInPropertySearch());
        assertTrue("Could not click on the first property listed in the search result.", propertyListPage.selectFirstPropertyFromList());
        GeneralPropertyInformation generalPropertyInformation = new GeneralPropertyInformation(driver);
        assertTrue("Could not confirm that the Property Look Up Code text field is present.", generalPropertyInformation.confirmPropertyLookUpCodeIsPresentInPropertySettings());
        assertEquals("Property Lookup Code value in Renewals and Offers report does not match value in Property Settings.", generalPropertyInformation.PROPERTY_LOOK_UP_CODE_VALUE_IN_PROPERTY_SETTINGS, renewalsAndOffersReport.PROPERTY_LOOK_UP_CODE_NUMBER_IN_REPORT);
    }
}
