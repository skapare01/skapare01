package smoke_and_sanity_tests.marketing_hub_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.dashboard_tab.MarketingHubDashboardTab;

import static org.junit.Assert.assertTrue;

public class MarketingHubDashboardCardsAndFiltersVerificationIT extends BaseBrowserTest {

    public MarketingHubDashboardCardsAndFiltersVerificationIT() {
        super("dittmarcompany");
    }

    //Manual Test ID 2695557

    @Test
    public void shouldVerifyRangeFilterFunctionality_whenSelectingEachOption() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        //Navigate to Marketing Hub Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());

        MarketingHubDashboardTab mshDash = new MarketingHubDashboardTab(driver);
        //Verification of MSH Dashboard Range Filter (Previous Week)
        assertTrue("Failed to locate and select 'Range' Filter's 1st option 'Previous Week' in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectRangeFilterOption1PreviousWeek());
        assertTrue("Failed to locate and select 'Filter' button in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.clickFilterButtonInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Acquired' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsAcquiredCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Funnel' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsFunnelCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Conversions & Estimated Revenue' card in Marketing Strategy Hub after filter.",
                mshDash.findConversionAndEstimatedRevenueCardInMarketingHubDashboard());
        //Verification of MSH Dashboard Range Filter (Previous Month)
        assertTrue("Failed to locate and select 'Range' Filter's 2nd option 'Previous Month' in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectRangeFilterOption2PreviousMonth());
        assertTrue("Failed to locate and select 'Filter' button in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.clickFilterButtonInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Acquired' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsAcquiredCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Funnel' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsFunnelCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Conversions & Estimated Revenue' card in Marketing Strategy Hub after filter.",
                mshDash.findConversionAndEstimatedRevenueCardInMarketingHubDashboard());
        //Verification of MSH Dashboard Range Filter (Previous Quarter)
        assertTrue("Failed to locate and select 'Range' Filter's 3rd option 'Previous Quarter' in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectRangeFilterOption3PreviousQuarter());
        assertTrue("Failed to locate and select 'Filter' button in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.clickFilterButtonInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Acquired' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsAcquiredCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Funnel' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsFunnelCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Conversions & Estimated Revenue' card in Marketing Strategy Hub after filter.",
                mshDash.findConversionAndEstimatedRevenueCardInMarketingHubDashboard());
        //Verification of MSH Dashboard Range Filter (Previous Year)
        assertTrue("Failed to locate and select 'Range' Filter's 4th option 'Previous Year' in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectRangeFilterOption4PreviousYear());
        assertTrue("Failed to locate and select 'Filter' button in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.clickFilterButtonInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Acquired' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsAcquiredCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Funnel' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsFunnelCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Conversions & Estimated Revenue' card in Marketing Strategy Hub after filter.",
                mshDash.findConversionAndEstimatedRevenueCardInMarketingHubDashboard());
        //Verification of MSH Dashboard Range Filter (Custom Date)
        assertTrue("Failed to locate and select 'Range' Filter's 5th option 'Custom Date' in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectRangeFilterOption5CustomDate());
        assertTrue("Failed to locate and select 'From Date' Calendar Button in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectFromDateCalendarFilter());
        assertTrue("Failed to locate and select 'Previous Month' Date under Calendar Filter in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectPreviousMonthDate());
        assertTrue("Failed to locate and select 'To Date' Calendar Button in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectToDateCalendarFilter());
        assertTrue("Failed to locate and select 'Today' button under Calendar Filter in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectTodayButtonInCalendarFilter());
        assertTrue("Failed to locate and select 'Filter' button in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.clickFilterButtonInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Acquired' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsAcquiredCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Funnel' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsFunnelCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Conversions & Estimated Revenue' card in Marketing Strategy Hub after filter.",
                mshDash.findConversionAndEstimatedRevenueCardInMarketingHubDashboard());
    }

    @Test
    public void shouldVerifyLeadSourceFilterFunctionality_whenSelectingEachOption() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        //Navigate to Marketing Hub Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());

        MarketingHubDashboardTab mshDash = new MarketingHubDashboardTab(driver);
        //Verification of MSH Dashboard Lead Source Filter (All Options) and (4th Option)
        assertTrue("Failed to locate and select 'Lead Source' Filter in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.clickLeadSourceFilterInMarketingHubDashboard());
        assertTrue("Failed to locate and deselect 'Lead Source' Filter option 1 'All Options' in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectLeadSourceFilterOption1AllOptions());
        assertTrue("Failed to locate and select 'Lead Source' Filter  option 2 in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectLeadSourceFilterOption2());
        assertTrue("Failed to locate and select 'Filter' button in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.clickFilterButtonInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Acquired' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsAcquiredCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Funnel' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsFunnelCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Conversions & Estimated Revenue' card in Marketing Strategy Hub after filter.",
                mshDash.findConversionAndEstimatedRevenueCardInMarketingHubDashboard());
    }

    @Test
    public void shouldVerifyConversionAndRevenueGoalFilterFunctionality_whenSelectingEachOption() {
        EntrataNavBar toolsTab = new EntrataNavBar(driver);
        //Navigate to Marketing Hub Sub-tab
        assertTrue("Failed to Navigate to 'Tools' Tab.",
                toolsTab.clickToolsTab());
        assertTrue("Failed to Navigate to 'Marketing Strategy Hub' Tab.",
                toolsTab.clickMarketingHubSubTab());

        MarketingHubDashboardTab mshDash = new MarketingHubDashboardTab(driver);
        //Verification of MSH Dashboard 'Conversion & Revenue Goal' Filter (Application Started)
        assertTrue("Failed to locate and select 'Conversion & Revenue Goal' Filter's 1st option 'Application Started' in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectConversionRevenueFilterOption1ApplicationStarted());
        assertTrue("Failed to locate and select 'Filter' button in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.clickFilterButtonInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Acquired' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsAcquiredCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Funnel' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsFunnelCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Conversions & Estimated Revenue' card in Marketing Strategy Hub after filter.",
                mshDash.findConversionAndEstimatedRevenueCardInMarketingHubDashboard());
        //Verification of MSH Dashboard 'Conversion & Revenue Goal' Filter (Application Completed)
        assertTrue("Failed to locate and select 'Conversion & Revenue Goal' Filter's 2nd option 'Application Completed' in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectConversionRevenueFilterOption2ApplicationCompleted());
        assertTrue("Failed to locate and select 'Filter' button in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.clickFilterButtonInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Acquired' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsAcquiredCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Funnel' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsFunnelCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Conversions & Estimated Revenue' card in Marketing Strategy Hub after filter.",
                mshDash.findConversionAndEstimatedRevenueCardInMarketingHubDashboard());
        //Verification of MSH Dashboard 'Conversion & Revenue Goal' Filter (Application Approved)
        assertTrue("Failed to locate and select 'Conversion & Revenue Goal' Filter's 3rd option 'Application Approved' in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectConversionRevenueFilterOption3ApplicationApproved());
        assertTrue("Failed to locate and select 'Filter' button in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.clickFilterButtonInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Acquired' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsAcquiredCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Funnel' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsFunnelCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Conversions & Estimated Revenue' card in Marketing Strategy Hub after filter.",
                mshDash.findConversionAndEstimatedRevenueCardInMarketingHubDashboard());
        //Verification of MSH Dashboard 'Conversion & Revenue Goal' Filter (Lease started)
        assertTrue("Failed to locate and select 'Conversion & Revenue Goal' Filter's 4th option 'Lease Started' in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectConversionRevenueFilterOption4LeaseStarted());
        assertTrue("Failed to locate and select 'Filter' button in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.clickFilterButtonInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Acquired' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsAcquiredCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Funnel' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsFunnelCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Conversions & Estimated Revenue' card in Marketing Strategy Hub after filter.",
                mshDash.findConversionAndEstimatedRevenueCardInMarketingHubDashboard());
        //Verification of MSH Dashboard 'Conversion & Revenue Goal' Filter (Lease Completed)
        assertTrue("Failed to locate and select 'Conversion & Revenue Goal' Filter's 5th option 'Lease Completed' in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectConversionRevenueFilterOption5LeaseCompleted());
        assertTrue("Failed to locate and select 'Filter' button in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.clickFilterButtonInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Acquired' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsAcquiredCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Funnel' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsFunnelCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Conversions & Estimated Revenue' card in Marketing Strategy Hub after filter.",
                mshDash.findConversionAndEstimatedRevenueCardInMarketingHubDashboard());
        //Verification of MSH Dashboard 'Conversion & Revenue Goal' Filter (Lease Approved)
        assertTrue("Failed to locate and select 'Conversion & Revenue Goal' Filter's 6th option 'Lease Approved' in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectConversionRevenueFilterOption6LeaseApproved());
        assertTrue("Failed to locate and select 'Filter' button in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.clickFilterButtonInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Acquired' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsAcquiredCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Funnel' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsFunnelCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Conversions & Estimated Revenue' card in Marketing Strategy Hub after filter.",
                mshDash.findConversionAndEstimatedRevenueCardInMarketingHubDashboard());
        //Verification of MSH Dashboard 'Conversion & Revenue Goal' Filter (Moved In)
        assertTrue("Failed to locate and select 'Conversion & Revenue Goal' Filter's 7th option 'Moved In' in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.selectConversionRevenueFilterOption7MovedIn());
        assertTrue("Failed to locate and select 'Filter' button in Marketing Strategy Hub's 'Dashboard' tab.",
                mshDash.clickFilterButtonInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Acquired' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsAcquiredCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Leads Funnel' card in Marketing Strategy Hub after filter.",
                mshDash.findLeadsFunnelCardInMarketingHubDashboard());
        assertTrue("Failed to locate 'Conversions & Estimated Revenue' card in Marketing Strategy Hub after filter.",
                mshDash.findConversionAndEstimatedRevenueCardInMarketingHubDashboard());
    }

}
