package smoke_and_sanity_tests.facilities_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.MyDashboardNav;
import page_objects.entrata_page_objects.dashboard_tab.my_dashboard_subtab.maintenance_tab.InspectionsSubtab;

import static org.junit.Assert.assertTrue;

public class ValidateAbilityToStartInspectionThroughMaintenanceDashboardIT extends BaseBrowserTest {

    public ValidateAbilityToStartInspectionThroughMaintenanceDashboardIT() { super("dallasentratatest9"); }

    @Test
    public void shouldValidateAbilityToStartInspectionWhenGoingThroughEntrataMyDashboardIT() {

        MyDashboardNav objMyDashboardNav = new MyDashboardNav(driver);
        InspectionsSubtab objInspectionsSubtab = new InspectionsSubtab(driver);

        assertTrue("Unable to click the Maintenance Header on the Entrata Dashboard.", objMyDashboardNav.clickMaintenanceTab());
        assertTrue("Unable to click the Inspections subtab on the Entrata Dashboard.", objMyDashboardNav.clickInspectionsSubTab());
        assertTrue("Unable to click Start Inspection button in Inspections Subtab.", objInspectionsSubtab.clickStartInspectionButton());
        assertTrue("Unable to verify that the modal head shows an Inspection started.", objInspectionsSubtab.confirmInspectionStarted());
        assertTrue("Unable to click the Close button.", objInspectionsSubtab.clickCloseButton());


    }
}
