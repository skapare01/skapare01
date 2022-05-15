package smoke_and_sanity_tests.affordable_tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.MyDashboardNav;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.residents_tab.RecertificationNoticesSubtab;

public class ValidateUIRecertificationNoticesTabIT extends BaseBrowserTest {

    public ValidateUIRecertificationNoticesTabIT() {
        super("arentrataandcommercials");
    }

    @Test //Test Case ID: #2961961
    public void shouldValidateUI_whenRecertificationNoticePageIsOpened() {
        //Click My Dashboard Residents and then Recertification Notices tabs
        MyDashboardNav nav = new MyDashboardNav(driver);
        assertTrue("Unable to click Residents Tab", nav.clickResidentsTab());

        MyDashboardNav myDashRes = new MyDashboardNav(driver);
        assertTrue("Unable to click Recertification Notices sub tab", myDashRes.clickRecertificationNotices());

        //Validate columns in the UI
        RecertificationNoticesSubtab valRecNot = new RecertificationNoticesSubtab(driver);
        assertEquals("PRIORITY", valRecNot.confirmPriorityColumn());
        assertEquals("RESIDENT", valRecNot.confirmResidentColumn());
        assertEquals("NOTICE TYPE", valRecNot.confirmNoticeTypeColumn());
        assertEquals("RECERTIFICATION DATE", valRecNot.confirmRecertificationDateColumn());
        assertEquals("PROGRAM TYPE", valRecNot.confirmProgramType());
        assertEquals("UNIT", valRecNot.confirmUnitColumn());
        assertEquals("PROPERTY", valRecNot.confirmPropertyColumn());
        assertEquals("WHAT'S NEXT", valRecNot.confirmWhatsNextColumn());

    }
}
