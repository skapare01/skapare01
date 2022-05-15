package smoke_and_sanity_tests.client_admin_tests.accounting_and_billing_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.apps_tab.billing_accounts_subtab.BillingAccountsPage;

import static org.junit.Assert.assertTrue;

public class ValidateMakePaymentFunctionalityFromEntrataIT extends BaseBrowserTest {
    public ValidateMakePaymentFunctionalityFromEntrataIT() {
        super("avantic");
    }

    @Test
    //EntrataTest ID #2236661
    public void shouldClickMakePaymentButton_whenLocatedUnderAppsBillingAccountsInEntrata() {
        EntrataNavBar entrataNavigation = new EntrataNavBar(driver);
        assertTrue("Could not hover over Apps tab.", entrataNavigation.clickAppsTab());
        assertTrue("Could not click on Billing Accounts subtab.", entrataNavigation.clickBillingAccountsSubtab());

        BillingAccountsPage billingAccounts = new BillingAccountsPage(driver);
        assertTrue("Could not click on Make Payments button.", billingAccounts.clickMakePaymentButton());
        assertTrue("Could not confirm that cancel link is present in Make Payments curtain page.", billingAccounts.confirmCancelLinksIsVisibleForMakePaymentCurtainPage());
    }
}
