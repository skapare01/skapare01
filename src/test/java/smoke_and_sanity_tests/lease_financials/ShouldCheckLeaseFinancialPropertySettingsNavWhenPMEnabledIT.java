package smoke_and_sanity_tests.lease_financials;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyFirstLevelNavigation;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.PropertyListPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.FinancialClosingsPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.FinancialNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.charges_subtab.*;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.delinquency_subtab.DelinquencyNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.delinquency_subtab.DelinquencyPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.delinquency_subtab.PreCollectionsPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.general_ledger.DetailsPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.general_ledger.GeneralLedgerNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.financial_tab.general_ledger.GrossPotentialRentPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.PricingNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.deposits.DepositsNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.deposits.PropertyDepositsPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.deposits.UnitSpaceDepositsPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.deposits.UnitTypeDepositsPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.other_fees.OtherFeesNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.other_fees.PropertyOtherFeesPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.other_fees.UnitSpaceOtherFeesPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.other_fees.UnitTypeOtherFeesPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.pricing_tab.rent.*;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.moveout_subtab.FMOPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.moveout_subtab.MoveOutNav;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.moveout_subtab.MoveOutReasonsPage;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.moveout_subtab.ResidentsMoveOut;
import page_objects.entrata_page_objects.setup_tab.property_settings_subtab.residents_tab.ResidentsNav;

import static org.junit.Assert.*;

public class ShouldCheckLeaseFinancialPropertySettingsNavWhenPMEnabledIT extends BaseBrowserTest {
    public ShouldCheckLeaseFinancialPropertySettingsNavWhenPMEnabledIT(){
        super("dallasentratatest9");}

    @Test
    public void shouldCheckPricingRentSubtabsNav_whenPMIsEnabled(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage propertyListPage = new PropertyListPage(driver);
        PropertyFirstLevelNavigation propertyFirstLevelNavigation = new PropertyFirstLevelNavigation(driver);
        PricingNav pricingNav = new PricingNav(driver);
        RentNav rentNav = new RentNav(driver);
        Rent_Property property = new Rent_Property(driver);
        Rent_UnitType unitType = new Rent_UnitType(driver);
        Rent_UnitSpace unitSpace = new Rent_UnitSpace(driver);
        HistoricalRent historicalRent = new HistoricalRent(driver);
        BudgetedRent budgetedRent = new BudgetedRent(driver);

        assertTrue("unable to click setup tab",nav.clickSetupButton());
        assertTrue("unable to click properties subtab",nav.clickPropertiesButton());
        assertTrue("unable to find property 114 Earle",propertyListPage.clickLoftsAtLorien());
        assertTrue("unable to click pricing tab", propertyFirstLevelNavigation.clickPricingTab());
        assertTrue("unable to click rent tab",pricingNav.clickRentTab());
        assertTrue("unable to click property subtab",rentNav.clickPropertySubtab());
        assertTrue("unable to find bulk edit prospect rents",property.verifyVisibilityBulkEditProspectRents());
        assertTrue("unable to click unit type",rentNav.clickUnitTypeSubtab());
        assertTrue("unable to find bulk edit prospect rents",unitType.verifyVisibilityBulkEditProspectRents());
        assertTrue("unable to click unit space subtab",rentNav.clickUnitSpaceSubtab());
        assertTrue("unable to find bulk edit renewal rents", unitSpace.verifyBulkEditRenewalRents());
        assertTrue("unable to click historical rents subtab",rentNav.clickHistoricalRentsSubtab());
        assertTrue("unable to find bulk update selected units button", historicalRent.verifyBulkUpdateSelectedUnits());
        assertTrue("unable to click budgeted rent subtab",rentNav.clickBudgetedRent());
        assertTrue("unable to find bulk add budgeted rent",budgetedRent.verifyBulkAddBudgetedRent());
    }
    @Test
    public void shouldCheckDepositSettingsNav_whenPMEnabled(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage propertyListPage = new PropertyListPage(driver);
        PropertyFirstLevelNavigation propertyFirstLevelNavigation = new PropertyFirstLevelNavigation(driver);
        PricingNav pricingNav = new PricingNav(driver);
        DepositsNav depositsNav = new DepositsNav(driver);
        PropertyDepositsPage propertyDepositsPage = new PropertyDepositsPage(driver);
        UnitSpaceDepositsPage unitSpaceDepositsPage = new UnitSpaceDepositsPage(driver);
        UnitTypeDepositsPage unitTypeDepositsPage = new UnitTypeDepositsPage(driver);
        assertTrue("unable to click setup tab",nav.clickSetupButton());
        assertTrue("unable to click properties subtab",nav.clickPropertiesButton());
        assertTrue("unable to find property 114 Earle",propertyListPage.clickLoftsAtLorien());
        assertTrue("unable to click pricing tab", propertyFirstLevelNavigation.clickPricingTab());
        assertTrue("unable to click deposits tab",pricingNav.clickDepositsTab());
        assertTrue("unable to click property tab",depositsNav.clickPropertyTab());
        assertTrue("unable to find bulk edit pricing button",propertyDepositsPage.confirmEditPricingVisible());
        assertTrue("unable to click unit type tab",depositsNav.clickUnitTypeTab());
        assertTrue("unable to find bulk edit pricing button",unitTypeDepositsPage.confirmEditPricingVisible());
        assertTrue("unable to click unit space tab",depositsNav.clickUnitSpaceTab());
        assertTrue("unable to find bulk edit pricing button", unitSpaceDepositsPage.confirmEditPricingVisible());

    }
    @Test
    public void shouldCheckOtherFeesSettings_whenPmEnabled(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage propertyListPage = new PropertyListPage(driver);
        PropertyFirstLevelNavigation propertyFirstLevelNavigation = new PropertyFirstLevelNavigation(driver);
        PricingNav pricingNav = new PricingNav(driver);
        OtherFeesNav otherFeesNav = new OtherFeesNav(driver);
        PropertyOtherFeesPage propertyOtherFeesPage = new PropertyOtherFeesPage(driver);
        UnitSpaceOtherFeesPage unitSpaceOtherFeesPage = new UnitSpaceOtherFeesPage(driver);
        UnitTypeOtherFeesPage unitTypeOtherFeesPage = new UnitTypeOtherFeesPage(driver);
        assertTrue("unable to click setup tab",nav.clickSetupButton());
        assertTrue("unable to click properties subtab",nav.clickPropertiesButton());
        assertTrue("unable to find property 114 Earle",propertyListPage.clickLoftsAtLorien());
        assertTrue("unable to click pricing tab", propertyFirstLevelNavigation.clickPricingTab());
        assertTrue("unable to click other fees tab",pricingNav.clickOtherFeesTab());
        assertTrue("unable to click property tab",otherFeesNav.clickPropertyTab());
        assertTrue("unable to find bulk edit pricing", propertyOtherFeesPage.confirmEditPricingVisible());
        assertTrue("unable to click unit type tab",otherFeesNav.clickUnitTypeTab());
        assertTrue("unable to find bulk edit pricing", unitTypeOtherFeesPage.confirmEditPricingVisible());
        assertTrue("unable to click unit space tab", otherFeesNav.clickUnitSpaceTab());
        assertTrue("unable to find bulk edit pricing",unitSpaceOtherFeesPage.confirmEditPricingVisible());

    }
    @Test
    public void shouldCheckMoveOutPropertySettingsTabs_whenPMEnabled(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage propertyListPage = new PropertyListPage(driver);
        PropertyFirstLevelNavigation propertyFirstLevelNavigation = new PropertyFirstLevelNavigation(driver);
        ResidentsNav residentsNav = new ResidentsNav(driver);
        ResidentsMoveOut residentsMoveOut = new ResidentsMoveOut(driver);
        MoveOutNav moveOutNav = new MoveOutNav(driver);
        FMOPage fmoPage = new FMOPage(driver);
        MoveOutReasonsPage moveOutReasonsPage = new MoveOutReasonsPage(driver);
        assertTrue("unable to click setup tab",nav.clickSetupButton());
        assertTrue("unable to click properties subtab",nav.clickPropertiesButton());
        assertTrue("unable to find property 114 Earle",propertyListPage.clickLoftsAtLorien());
        assertTrue("unable to click residents tab", propertyFirstLevelNavigation.clickResidentsTab());
        assertTrue("unable to click move-out tab",residentsNav.clickMoveOutTab());
        assertTrue("unable to find edit move-out button",residentsMoveOut.verifyVisibilityOfEditMoveOutSettings());
        assertTrue("unable to click FMO Tab",moveOutNav.clickFMOTab());
        assertTrue("unable to find edit FMO setting button",fmoPage.confirmVisibilityOfEditFMOButton());
        assertTrue("unable to click move out reasons tab",moveOutNav.clickMoveOutReasonsTab());
        assertTrue("unable to click edit move out reasons", moveOutReasonsPage.confirmVisibilityOfEditMoveOutReasons());
    }
@Test
    public void shouldCheckGeneralLedgerPropertySettingsNav_whenPmEnabled(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage propertyListPage = new PropertyListPage(driver);
        PropertyFirstLevelNavigation propertyFirstLevelNavigation = new PropertyFirstLevelNavigation(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        GeneralLedgerNav generalLedgerNav = new GeneralLedgerNav(driver);
        DetailsPage detailsPage = new DetailsPage(driver);
    GrossPotentialRentPage grossPotentialRentPage = new GrossPotentialRentPage(driver);
        assertTrue("unable to click setup tab",nav.clickSetupButton());
        assertTrue("unable to click properties subtab",nav.clickPropertiesButton());
        assertTrue("unable to find property 114 Earle",propertyListPage.clickLoftsAtLorien());
        assertTrue("unable to click financial tab", propertyFirstLevelNavigation.clickFinancialTab());
        assertTrue("unable to click general ledger tab", financialNav.clickGeneralLedgerTab());
        assertTrue("unable to click details subtab",generalLedgerNav.clickDetailsTab());
        assertTrue("unable to find General Settings",detailsPage.checkGeneralSettings());
        assertTrue("unable to click gross potential rent tab",generalLedgerNav.clickGrossPotentialRentTab());
        assertTrue("unable to find edit GPR settings",grossPotentialRentPage.confirmEditGPRAvailable());


    }
    @Test
    public void shouldCheckFinancialChargesSettings_whenPmEnabled(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage propertyListPage = new PropertyListPage(driver);
        PropertyFirstLevelNavigation propertyFirstLevelNavigation = new PropertyFirstLevelNavigation(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        ChargesNav chargesNav = new ChargesNav(driver);
        GeneralChargesPage generalChargesPage = new GeneralChargesPage(driver);
        LedgersPage ledgersPage = new LedgersPage(driver);
        ChargeCodesPage chargeCodesPage = new ChargeCodesPage(driver);
        DepositInterestsPage depositInterestsPage = new DepositInterestsPage(driver);
        assertTrue("unable to click setup tab",nav.clickSetupButton());
        assertTrue("unable to click properties subtab",nav.clickPropertiesButton());
        assertTrue("unable to find property 114 Earle",propertyListPage.clickLoftsAtLorien());
        assertTrue("unable to click financial tab", propertyFirstLevelNavigation.clickFinancialTab());
        assertTrue("unable to click charges tab",financialNav.clickChargesTab());
        assertTrue("unable to find edit property charge setting",generalChargesPage.verifyEditPropertyChargeSetting());
        assertTrue("unable to click ledgers tab",chargesNav.clickLedgersTab());
        assertTrue("unable to find associate ledgers button",ledgersPage.verifyAssociateLedgers());
        assertTrue("unable to click charges codes tab",chargesNav.clickChargesCodeTab());
        assertTrue("unable to find customize charge codes button",chargeCodesPage.verifyCustomizeChargeCodes());
        assertTrue("unable to click deposit interests tab",chargesNav.clickDepositInterestsTab());
        assertTrue("unable to find edit settings button", depositInterestsPage.verifyEditSettingsButton());

    }
    @Test
    public void shouldCheckFinancialClosingAndDelinquencyTabs_whenPmEnabled(){
        EntrataNavBar nav = new EntrataNavBar(driver);
        PropertyListPage propertyListPage = new PropertyListPage(driver);
        PropertyFirstLevelNavigation propertyFirstLevelNavigation = new PropertyFirstLevelNavigation(driver);
        FinancialNav financialNav = new FinancialNav(driver);
        FinancialClosingsPage closingsPage = new FinancialClosingsPage(driver);
        DelinquencyPage delinquencyPage = new DelinquencyPage(driver);
        DelinquencyNav delinquencyNav = new DelinquencyNav(driver);
        PreCollectionsPage preCollectionsPage = new PreCollectionsPage(driver);
        assertTrue("unable to click setup tab",nav.clickSetupButton());
        assertTrue("unable to click properties subtab",nav.clickPropertiesButton());
        assertTrue("unable to find property 114 Earle",propertyListPage.clickLoftsAtLorien());
        assertTrue("unable to click financial tab", propertyFirstLevelNavigation.clickFinancialTab());
        assertTrue("unable to click closings subtab",financialNav.clickClosingsTab());
        assertTrue("unable to find edit advanced settings",closingsPage.verifyEditAdvancedSettingsButton());
        assertTrue("unable to click delinquency subtab",financialNav.clickDelinquencyTab());
        assertTrue("unable to find edit late fee posting button",delinquencyPage.verifyEditLateFeePostingButton());
        assertTrue("unable to click on pre-collections subtab",delinquencyNav.clickPreCollectionsTab());
        assertTrue("unable to find edit collection button",preCollectionsPage.verifyEditCollectionButton());

    }
}
