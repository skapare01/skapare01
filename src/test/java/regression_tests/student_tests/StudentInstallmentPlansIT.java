package regression_tests.student_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.FinancialNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.payments_subtab.InstallmentPlansPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.payments_subtab.PaymentsNav;
import utils.RandomGenerator;

import static org.junit.Assert.*;

public class StudentInstallmentPlansIT extends BaseBrowserTest {

    public StudentInstallmentPlansIT(){
        super("campusapartments");}

    @Test
        public void shouldAddInstallmentPlan_whenStudentPropertyIsActive() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyFirstLevelNavigation propertyFirstLevelNavigation = new PropertyFirstLevelNavigation(driver);
        PropertyListPage propertyListPage = new PropertyListPage(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        PaymentsNav paymentsNav = new PaymentsNav(driver);
        InstallmentPlansPage installmentPlansPage = new InstallmentPlansPage(driver);
        assertTrue("Unable to click setup tab.",nav.clickSetupButton());
        assertTrue("Unable to click company subtab.", nav.clickPropertiesButton());
        assertTrue("Unable to select 114 Earle from property list.",propertyListPage.clickEarleProperty());
        assertTrue("Unable to click financial tab.", propertyFirstLevelNavigation.clickFinancialTab());
        assertTrue("Unable to click payments subtab.",financialNav.clickPaymentsTab());
        assertTrue("Unable to click installment plans tab.",paymentsNav.clickInstallmentPlans());
        assertTrue("Unable to click add student plan button.", installmentPlansPage.clickAddStudentPlan());
        String title = RandomGenerator.randomName();
        assertTrue("Unable to add installment title.", installmentPlansPage.enterInstallmentPlanTitle(title));
        String description = RandomGenerator.randomName();
        assertTrue("Unable to add installment description.", installmentPlansPage.enterInstallmentPlanDescription(description));
        assertTrue("Unable to click payment charge code dropdown.",installmentPlansPage.clickPaymentChargeCodeDropdown());
        assertTrue("Unable to choose payment charge code.",installmentPlansPage.clickPaymentChargeCode());
        assertTrue("Unable to click Save and Continue button.",installmentPlansPage.clickSaveContinue());
        assertTrue("Unable to enter percentage of lease charges.",installmentPlansPage.enterPercentageOfLeaseCharges());
        assertTrue("Unable to enter installment plan date.",installmentPlansPage.enterInstallmentDate());
        assertTrue("Unable to click save button.", installmentPlansPage.clickSaveButton());
        assertEquals("Success message text does not match after saving installment plan","Installment inserted/updated successfully. ",installmentPlansPage.checkSuccessMessage());
        assertTrue("Unable to find added plan.",installmentPlansPage.checkAddedPlan(title));
        assertTrue("Unable to click edit icon for last installment plan.",installmentPlansPage.clickLastEditIcon());
        assertTrue("Unable to click apply discount switch.",installmentPlansPage.clickApplyDiscountSwitch());
        assertTrue("Apply discount switch did not change to yes.",installmentPlansPage.waitForApplyDiscountToBeSetToYes());
        assertTrue("Unable to add installment description.", installmentPlansPage.enterInstallmentPlanDescription(description));
        assertTrue("Unable to click Save and Continue button.",installmentPlansPage.clickSaveContinue());
        assertTrue("Unable to click save button after editing installment plan.", installmentPlansPage.clickSaveButton());
        assertTrue("Unable to click pricing icon on last installment plan.", installmentPlansPage.clickLastMoneyIcon());
        assertTrue("Unable to enter discount amount", installmentPlansPage.enterDiscountAmount());
        assertTrue("Unable to click save discount button",installmentPlansPage.clickSaveDiscount());
        assertTrue("Discount amount does not match",installmentPlansPage.checkDiscount());
    }
}
