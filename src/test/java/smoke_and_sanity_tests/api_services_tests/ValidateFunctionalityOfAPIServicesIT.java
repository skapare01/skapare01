package smoke_and_sanity_tests.api_services_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.AccountingNav;
import page_objects.entrata_page_objects.accounting_tab.ap_export_batches_subtab.APExportBatchesPage;
import page_objects.entrata_page_objects.accounting_tab.gl_export_batches_subtab.GLExportBatchesPage;
import page_objects.entrata_page_objects.accounting_tab.vendors_subtab.VendorsPage;
import page_objects.entrata_page_objects.apps_tab._1099_misc_e_file_subtab._1099_MISC_E_FilePage;
import page_objects.entrata_page_objects.apps_tab.app_store_subtab.AppStorePage;
import page_objects.entrata_page_objects.apps_tab.billing_accounts_subtab.BillingAccountsPage;
import page_objects.entrata_page_objects.apps_tab.billing_requests_subtab.BillingRequestsPage;
import page_objects.entrata_page_objects.apps_tab.contracts_subtab.ContractsPage;
import page_objects.entrata_page_objects.apps_tab.order_forms_subtab.OrderFormsPage;

import static org.junit.Assert.assertTrue;

public class ValidateFunctionalityOfAPIServicesIT extends BaseBrowserTest {

    public ValidateFunctionalityOfAPIServicesIT() {super("karenbertelli");}

    @Test
    public void shouldDisplayGLExportBatchesListingScreen_whenTabIsClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        VendorsPage v = new VendorsPage(driver);
        AccountingNav aNav = new AccountingNav(driver);
        GLExportBatchesPage gleb = new GLExportBatchesPage(driver);

        assertTrue("Error clicking on Accounting Tab", navBar.clickAccountingTab());
        assertTrue("Error clicking Close Vendor filter button", v.closeVendorFilter());
        assertTrue("Error confirming visibility of GL Export Batches tab", aNav.ConfirmVisibilityOfGLExportBatchesTab());
        assertTrue("Error clicking GL Export Batches Tab", aNav.ClickGLExportBatchesTab());
        assertTrue("Error confirming visibility of GL Export Batches Tab", gleb.ConfirmVisibilityOfGLExportBatchesListingContainer());
    }

    @Test
    public void shouldDisplayAPExportBatchesListingContainer_whenTabIsClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        VendorsPage v = new VendorsPage(driver);
        AccountingNav aNav = new AccountingNav(driver);
        APExportBatchesPage aebp = new APExportBatchesPage(driver);

        assertTrue("Error clicking on Accounting Tab", navBar.clickAccountingTab());
        assertTrue("Error clicking Close Vendor filter button", v.closeVendorFilter());
        assertTrue("Error confirming visibility of AP export Batches", aNav.confirmVisibilityOfAPExportBatchesTab());
        assertTrue("Error clicking on AP Export Batches Tab", aNav.clickAPExportsBatchesTab());
        assertTrue("Error confirming visibility of AP Export Batches listing container", aebp.confirmVisibilityOfListingContainer());
    }

    @Test
    public void shouldDisplayMyProductsListingScreen_whenAppStoreTabIsClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        AppStorePage aStore = new AppStorePage(driver);

        assertTrue("Error clicking Apps Tab", navBar.clickAppsTab());
        assertTrue("Error clicking App Store tab", navBar.clickAppStoreTab());
        assertTrue("Error confirming visibility of My products tab", aStore.confirmVisibilityOfMyProductsTab());
    }

    @Test
    public void shouldDisplayContractsDiv_whenContractsTabIsClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        ContractsPage cPage = new ContractsPage(driver);

        assertTrue("Error clicking Apps Tab", navBar.clickAppsTab());
        assertTrue("Error clicking Contracts tab", navBar.clickContractsTab());
        assertTrue("Error Confirming visibility of Contracts div", cPage.confirmVisibilityOfContractsDiv());
    }

    @Test
    public void shouldDisplayBillingAccountsListingContainer_whenBillingAccountsSubtabIsClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        BillingAccountsPage bAPage = new BillingAccountsPage(driver);

        assertTrue("Error clicking Apps Tab", navBar.clickAppsTab());
        assertTrue("Error clicking Billing Accounts tab", navBar.clickBillingAccountsSubtab());
        assertTrue("Error Confirming Visibility of Billing Accounts listing container", bAPage.confirmVisibilityOfListingContainer());
    }

    @Test
    public void shouldDisplayBillingRequestsListingScreen_whenBillingRequestsTabIsClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        BillingRequestsPage bRPage = new BillingRequestsPage(driver);

        assertTrue("Error clicking Apps Tab", navBar.clickAppsTab());
        assertTrue("Error clicking Billing Accounts tab", navBar.clickBillingRequestsTab());
        assertTrue("Error confirming visibility of Billing Requests listing screen", bRPage.confirmVisibilityOfBillingRequestsListingScreen());
    }

    @Test
    public void shouldDisplayOrderFormsListingContainer_whenOrderFormsTabIsClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        OrderFormsPage oRPage = new OrderFormsPage(driver);

        assertTrue("Error clicking Apps Tab", navBar.clickAppsTab());
        assertTrue("Error clicking Order Forms tab", navBar.clickOrderFormsTab());
        assertTrue("Error confirming visibility of Order forms Listing Container", oRPage.confirmVisibilityOfOrderFormsListingContainer());
    }

    @Test
    public void shouldNavigateTo1099MiscEFilePage_when1099MiscEFileIsClicked() {

        EntrataNavBar navBar = new EntrataNavBar(driver);
        _1099_MISC_E_FilePage taxPage = new _1099_MISC_E_FilePage(driver);

        assertTrue("Error clicking Apps Tab", navBar.clickAppsTab());
        assertTrue("Error clicking 1099 MISC E File tab", navBar.click1099MISCEFileTab());
    }
}
