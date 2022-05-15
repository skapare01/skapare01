package smoke_and_sanity_tests.reports_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.reports_tab.SharedGeneralReportingFunctions;
import page_objects.entrata_page_objects.reports_tab.library_subtab.reports_list.accounting_reports.GLDetailsReport;
import page_objects.entrata_page_objects.EntrataNavBar;
import static org.junit.Assert.assertTrue;

public class GLDetailsTestsIT extends BaseBrowserTest {
    public GLDetailsTestsIT() {
        super("avantic");
    }

    @Test
    public void shouldVerifyGLDetailsReportGenerates_whenDefaultFiltersAreUsed() {
        EntrataNavBar navigateTo = new EntrataNavBar(driver);

        assertTrue("Cant Find Reporting Tab", navigateTo.moveToReportsTab());
        assertTrue("Reporting 3.0 cant find library from dropdown", navigateTo.moveToLibrary());
        assertTrue("Cant Click on library", navigateTo.librarySelect());

        GLDetailsReport glDetails = new GLDetailsReport(driver);
        SharedGeneralReportingFunctions generalReportingFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("cant find box score in Library", generalReportingFunctions.moveTo5BelowReport(47));
        assertTrue("Could not find GL Details Report to click on.", glDetails.clickOnGLDetailsReport());
        assertTrue("Could not click on Add Property button.", glDetails.clickOnAddProperty());
        assertTrue("Could not enter text for property name.", generalReportingFunctions.sendKeysOfPropertyNameToTextFieldOfPropertyGroupsFilter("60 Jane Lane"));
        assertTrue("Could not click on property name to add to filter.", generalReportingFunctions.pickFirstProperty());
        assertTrue("Could not select All GL Accounts.", glDetails.clickAllGLAccounts());
        assertTrue("Unable to click Generate.", generalReportingFunctions.clickGenerateReportButton());
        assertTrue("The report did not generate.", generalReportingFunctions.verifyGenerationOfReport());
    }

    @Test
    public void shouldVerifyGLDetailsReportDisplayOptions_whenReportIsOpened() {
        EntrataNavBar navigateTo = new EntrataNavBar(driver);

        assertTrue("Cant Find Reporting Tab", navigateTo.moveToReportsTab());
        assertTrue("Reporting 3.0 cant find library from dropdown", navigateTo.moveToLibrary());
        assertTrue("Cant Click on library", navigateTo.librarySelect());

        GLDetailsReport glDetails = new GLDetailsReport(driver);
        SharedGeneralReportingFunctions generalReportingFunctions = new SharedGeneralReportingFunctions(driver);
        assertTrue("cant find box score in Library", generalReportingFunctions.moveTo5BelowReport(47));
        assertTrue("Could not find GL Details Report to click on.", glDetails.clickOnGLDetailsReport());
        assertTrue("Could not click on Add Property button.", glDetails.clickOnAddProperty());
        assertTrue("Could not enter text for property name.", generalReportingFunctions.sendKeysOfPropertyNameToTextFieldOfPropertyGroupsFilter("60 Jane Lane"));
        assertTrue("Could not click on property name to add to filter.", generalReportingFunctions.pickFirstProperty());
        assertTrue("Could not select All GL Accounts.", glDetails.clickAllGLAccounts());
        assertTrue("Chart Of Accounts Or Mask filter is missing.", glDetails.checkChartOfAccountsOrMask());
        assertTrue("GL Accounts dropdown searchbar missing.", glDetails.checkSelectGLAccounts());
        assertTrue("GL Accounts All Options missing.", glDetails.checkGLAccountsAllOptions());
        assertTrue("Period dropdown is missing.", glDetails.checkPeriod());
        assertTrue("Use Alt Year End dropdown is missing.", glDetails.checkUseAltYearEnd());
        assertTrue("Gl Books filter is missing.", glDetails.checkGLBooks());
        assertTrue("Accounting Method filter is missing.", glDetails.checkAccountingMethod());
        assertTrue("Consolidate By filter is missing.", glDetails.checkConsolidateBy());
        assertTrue("Beginning Balances toggle is missing.", glDetails.checkBeginningBalancesToggle());
        assertTrue("Show GL Accounts filter is missing.", glDetails.checkShowGLAccounts());
        assertTrue("Transaction Types filter is missing.", glDetails.checkTransactionTypes());
        assertTrue("Summarize By GL Account filter is missing.", glDetails.checkSummarizeByGLAccount());
        assertTrue("Summarize Transactions Types filter is missing.", glDetails.checkSummarizeTransactionTypes());
        assertTrue("Include Paused JE's filter is missing.", glDetails.checkIncludePausedJournalEntries());
        assertTrue("Custom Tags filter is missing.", glDetails.checkCustomTags());
        assertTrue("The Reset blue link is missing in the report filters.", generalReportingFunctions.confirmResetBlueLinkIsPresentInReportFilters());
        assertTrue("Could not click on Display Options Tab.", generalReportingFunctions.clickDisplayOptionsTab());
        assertTrue("Primary Sort is missing from Display Options.", generalReportingFunctions.confirmPrimarySortDropDownMenuIsPresent());
        assertTrue("Primary Sort Asc is missing from Display Options.", generalReportingFunctions.confirmPrimarySortAscendingRadioButtonOptionIsPresent());
        assertTrue("Primary Sort Dsc is missing from Display Options.", generalReportingFunctions.confirmPrimarySortDescendingRadioButtonOptionIsPresent());
        assertTrue("Secondary Sort is missing from Display Options.", generalReportingFunctions.confirmSecondarySortDropDownMenuIsPresent());
        assertTrue("Secondary Sort Asc is missing from Display Options.", generalReportingFunctions.confirmSecondarySortAscendingRadioButtonOptionIsPresent());
        assertTrue("Secondary Sort Dsc is missing from Display Options.", generalReportingFunctions.confirmSecondarySortDescendingRadioButtonOptionIsPresent());
        assertTrue("Subtitle is missing from Display Options.", generalReportingFunctions.confirmSubtitlesDropDownMenuIsPresent());
    }
}
