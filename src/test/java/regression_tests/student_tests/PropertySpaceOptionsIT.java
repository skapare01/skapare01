package regression_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.PropertyNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units.FloorplanNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units.PropertySpaceOptionsTab;

import static org.junit.Assert.*;

public class PropertySpaceOptionsIT extends BaseBrowserTest {
    public PropertySpaceOptionsIT() {
        super("campusapartments");
    }


    @Test
    public void shouldAddAndDeletePropertySpaceOptions_whenPropertyIsStudentAndCompanySpaceOptionsAreSetUp(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to click setup tab.",nav.clickSetupButton());
        assertTrue("Unable to click properties subtab.",nav.clickPropertiesButton());
        PropertyListPage propertyListPage = new PropertyListPage(driver);
        assertTrue("Unable to select 114 Earle from property list.",propertyListPage.clickEarleProperty());
        PropertyFirstLevelNavigation propertyFirstLevelNavigation = new PropertyFirstLevelNavigation(driver);
        assertTrue("Unable to click properties tab.", propertyFirstLevelNavigation.clickPropertyTab());
        PropertyNavigation propertyNavigation = new PropertyNavigation(driver);
        assertTrue("Unable to locate Floor Plans & Units subtab.",propertyNavigation.clickFloorplansTab());
        FloorplanNav floorplanNav = new FloorplanNav(driver);
        assertTrue("Unable to locate space options tab.", floorplanNav.clickSpaceOptionsTab());
        PropertySpaceOptionsTab propertySpaceOptions = new PropertySpaceOptionsTab(driver);
        assertTrue("Unable to click edit space options button.", propertySpaceOptions.clickEditSpaceOption());
        assertTrue("Unable to click add space option.", propertySpaceOptions.clickAddSpaceOption());
        assertTrue("Unable to double click space option dropdown",propertySpaceOptions.doubleClickSpaceOptionDropdown());
        assertTrue("Unable to select space option.", propertySpaceOptions.clickSpaceOption());
        assertTrue("Unable to click save space option button.", propertySpaceOptions.saveSpaceOption());
        assertTrue("Unable to confirm rates after saving space option.", propertySpaceOptions.clickConfirmRates());
        assertEquals("Success message text does not match expected text after saving space option","Space options updated successfully. ", propertySpaceOptions.checkSuccessMessage());
        assertTrue("Standard shared space option is not displaying.",propertySpaceOptions.confirmStandardSharedOption());
        assertTrue("Unable to click edit space options button.", propertySpaceOptions.clickEditSpaceOption());
        assertTrue("Unable to delete space option button.",propertySpaceOptions.clickDeleteSpaceOption());
        assertTrue("Unable to confirm Delete space option",propertySpaceOptions.clickConfirmDelete());
        assertTrue("Unable to click Save Button after deleting space option.", propertySpaceOptions.saveSpaceOption());
        assertTrue("Unable to confirm rates after deleting space option.", propertySpaceOptions.clickConfirmRates());
        assertEquals("Rates restored successfully.  Space options updated successfully. ", propertySpaceOptions.checkSuccessMessage());
    }
}
