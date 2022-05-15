package smoke_and_sanity_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.FinancialNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.payments_subtab.InstallmentPlansPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.payments_subtab.PaymentsNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.leasing_tab.PropertyLeasingNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.leasing_tab.applications.ApplicationsNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.leasing_tab.applications.RoommateInterests;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.PricingNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.preferences.Preferences_General;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.rent.RentNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.rent.Rent_Property;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.rent.Rent_UnitType;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units.FloorPlansTab;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units.FloorplanNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units.PropertySpaceOptionsTab;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.property_tab.floorplans_and_units.UnitsTab;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.moveout_subtab.ResidentsMoveOut;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.ResidentsNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.movein_subtab.MoveInNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.movein_subtab.MoveinPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.movein_subtab.MoveinSchedulerPage;

import static org.junit.Assert.*;


public class ShouldCheckBasicNavForStudentModulesForPropertySettingsWhenOccupancyIsStudentIT extends BaseBrowserTest {
    public ShouldCheckBasicNavForStudentModulesForPropertySettingsWhenOccupancyIsStudentIT() {
        super("dallasentratatest9");
    }


    @Test

    public void shouldCheckStudentModulesForPropertySectionOfSettings_whenOccupancyTypeIsStudent() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage plist = new PropertyListPage(driver);
        PropertyFirstLevelNavigation fnav = new PropertyFirstLevelNavigation(driver);
        FloorplanNav fpnav = new FloorplanNav(driver);
        FloorPlansTab floorPlansTab = new FloorPlansTab(driver);
        UnitsTab unitsTab = new UnitsTab(driver);
        PropertySpaceOptionsTab propertySpaceOptions = new PropertySpaceOptionsTab(driver);
        assertTrue("Unable to click setup tab.", nav.clickSetupButton());
        assertTrue("Unable to click on properties subtab.", nav.clickPropertiesButton());
        assertTrue("Unable to select Lofts at Lorien property from property list.", plist.clickLoftsAtLorien());
        assertTrue("Unable to click on property tab of property settings.", fnav.clickPropertyTab());
        assertTrue("Unable to click floorplan and units subtab", fpnav.clickFloorplansTab());
        assertTrue("Unable to click view lease term pricing button.", floorPlansTab.clickViewLeaseTermPricing());
        assertTrue("Lease term pricing window is not displaying after clicking view lease term pricing button.", floorPlansTab.verifyLeaseTermPricingWindow());
        assertTrue("Cannot close lease term pricing window.", floorPlansTab.clickCloseLeaseTermPricing());
        assertTrue("Cannot click units subtab.", fpnav.clickUnitsTab());
        assertTrue("Cannot enter value to search in unit search field.", unitsTab.searchForUnit());
        assertTrue("Cannot hit enter after typing unit in search field.", unitsTab.hitEnterOnSearch());
        assertTrue("Cannot click on unit 13-A, after searching for it.", unitsTab.clickSecondUnit());
        assertTrue("Cannot click on space configuration subtab.", unitsTab.clickSpaceConfiguration());
        assertTrue("Cannot click edit space configurations button.", unitsTab.clickEditSpaceConfiguration());
        assertTrue("Unable to find merge spaces button.", unitsTab.VerifyEditUnitSpacesIsVisible());
        assertTrue("Unable to close edit unit space configurations.", unitsTab.clickCloseEditUnitSpaces());
        assertTrue("Unable to close selected unit space.", unitsTab.clickCloseUnitSpace());
        assertTrue("Unable to click on space options tab.",fpnav.clickSpaceOptionsTab());
        assertTrue("Unable to locate edit space options button.", propertySpaceOptions.confirmVisibilityofEditSpaceOptions());
        //

    }

    @Test
    public void shouldCheckStudentModulesForPricingSectionOfSettings_whenOccupancyTypeIsStudent() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage plist = new PropertyListPage(driver);
        PropertyFirstLevelNavigation fnav = new PropertyFirstLevelNavigation(driver);
        RentNav rentNav = new RentNav(driver);
        Rent_Property property = new Rent_Property(driver);
        Rent_UnitType unitType = new Rent_UnitType(driver);
        PricingNav pricingNav = new PricingNav(driver);
        Preferences_General general = new Preferences_General(driver);
        assertTrue("Unable to click setup tab.", nav.clickSetupButton());
        assertTrue("Unable to click on properties tab.", nav.clickPropertiesButton());
        assertTrue("Unable to find Lofts at Lorien property from property list.", plist.clickLoftsAtLorien());
        assertTrue("Unable to click on pricing tab.", fnav.clickPricingTab());
        assertTrue("Unable to click property subtab.", rentNav.clickPropertySubtab());
        assertTrue("Unable to click bulk edit prospect rents button.", property.clickBulkEditProspectRents());
        assertTrue("Unable to find bulk adjust pricing button.", property.verifyVisibilityOfBulkAdjustPRicing());
        assertTrue("Unable to close bulk edit prospect rents.", property.clickCLoseButton());
        assertTrue("Unable to click unit type subtab.", rentNav.clickUnitTypeSubtab());
        assertTrue("Unable to find and click on rent matrix.", unitType.clickRentMatrix());
        assertTrue("Unable to find lease term selector.", unitType.verifyVisibilityOfLeaseTermSelector());
        assertTrue("Unable to click close rent matrix button.", unitType.clickCloseButton());
        assertTrue("Unable to click pricing preferences subtab.", pricingNav.clickPreferences());
        assertTrue("Unable to click edit pricing options button.", general.clickEditPricingOptions());
        assertTrue("Unable to click save edit pricing button.", general.clickSaveButton());
        assertTrue("Unable to click yes and confirm save edit pricing", general.clickConfirmSave());
    }

    @Test
    public void shouldCheckStudentModulesForLeasingSectionOfSettings_whenOccupancyTypeIsStudent() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage plist = new PropertyListPage(driver);
        PropertyFirstLevelNavigation fnav = new PropertyFirstLevelNavigation(driver);
        PropertyLeasingNav leasingNav = new PropertyLeasingNav(driver);
        ApplicationsNav applicationsNav = new ApplicationsNav(driver);
        RoommateInterests roommateInterests = new RoommateInterests(driver);
        assertTrue("Unable to click setup tab.", nav.clickSetupButton());
        assertTrue("Unable to click on properties subtab", nav.clickPropertiesButton());
        assertTrue("Unable to select Lofts at Lorien property from property list", plist.clickLoftsAtLorien());
        assertTrue("Unable to click leasing tab.", fnav.clickLeasingTab());
        assertTrue("Unable to click on applications subtab.", leasingNav.clickApplication());
        assertTrue("Unable to click on roommate interests tab.", applicationsNav.clickRoommateInterestsTab());
        assertTrue("Unable to click add questions button.", roommateInterests.clickAddQuestion());
        assertTrue("Unable to find roommate interest question dropdown.", roommateInterests.verifyVisibilityOfInterestQuestionDropdown());
        assertTrue("Unable to find close button to close add question popup", roommateInterests.clickCloseButton());
    }

    @Test
    public void shouldCheckThatMoveInMoveOutSettingsOpen_whenTabsAreClicked() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage plist = new PropertyListPage(driver);
        PropertyFirstLevelNavigation fnav = new PropertyFirstLevelNavigation(driver);
        ResidentsNav residentsNav = new ResidentsNav(driver);
        MoveinPage residentsMovein = new MoveinPage(driver);
        ResidentsMoveOut residentsMoveOut = new ResidentsMoveOut(driver);
        assertTrue("Unable to click setup tab.", nav.clickSetupButton());
        assertTrue("Unable to click on properties subtab.", nav.clickPropertiesButton());
        assertTrue("unable to select Lofts at Lorien property from property list.", plist.clickLoftsAtLorien());
        assertTrue("Unable to click on Residents Tab.", fnav.clickResidentsTab());
        assertTrue("Unable to click move-in subtab.", residentsNav.clickMoveInTab());
        assertTrue("Unable to click edit move-in button.", residentsMovein.clickEditMovein());
        assertTrue("Unable to click Save edit move-in button.", residentsMovein.clickSaveButton());
        assertTrue("Unable to find edit move-in button after saving edit move-in.", residentsMovein.verifyEditMoveinButtonVisible());
        assertTrue("Unable to click move-out tab.",residentsNav.clickMoveOutTab());
        assertTrue("Unable to locate edit move out settings button.",residentsMoveOut.verifyVisibilityOfEditMoveOutSettings());

    }

    @Test
    public void shouldCheckThatMoveInSchedulerPageOpens_WhenTabIsClicked(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        assertTrue("Unable to click setup tab.", nav.clickSetupButton());
        assertTrue("Unable to click on properties subtab.", nav.clickPropertiesButton());

        PropertyListPage plist = new PropertyListPage(driver);
        assertTrue("Unable to select Lofts at Lorien property from property list.", plist.clickLoftsAtLorien());

        PropertyFirstLevelNavigation fnav = new PropertyFirstLevelNavigation(driver);
        assertTrue("Unable to click on residents tab.", fnav.clickResidentsTab());

        MoveInNav moveInNav = new MoveInNav(driver);
        assertTrue("Unable to click move in scheduler subtab.",moveInNav.clickMoveInScheduler());

        MoveinSchedulerPage moveinSchedulerPage = new MoveinSchedulerPage(driver);
        assertTrue("Unable to find scheduler dropdown.",moveinSchedulerPage.confirmScheduleDropdownIsVisible());
        
    }

    @Test
    public void shouldCheckStudentModulesForFinancialSectionOfSettings_whenOccupancyTypeIsStudent() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage plist = new PropertyListPage(driver);
        PropertyFirstLevelNavigation fnav = new PropertyFirstLevelNavigation(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        PaymentsNav paymentsNav = new PaymentsNav(driver);
        InstallmentPlansPage installmentPlansTab = new InstallmentPlansPage(driver);
        assertTrue("Unable to click setup tab.", nav.clickSetupButton());
        assertTrue("Unable to click on properties subtab.", nav.clickPropertiesButton());
        assertTrue("Unable to select Lofts at Lorien property from property list.", plist.clickLoftsAtLorien());
        assertTrue("Unable to click on financial tab.", fnav.clickFinancialTab());
        assertTrue("Cannot click on payments subtab.", financialNav.clickPaymentsTab());
        assertTrue("Unable to click installment plans tab.", paymentsNav.clickInstallmentPlans());
        assertTrue("Unable to click add student plan button.", installmentPlansTab.clickAddStudentPlan());
        assertTrue("Installment plan title field is not visible in add student plan window.", installmentPlansTab.verifyVisibilityOfTitleField());


    }
}