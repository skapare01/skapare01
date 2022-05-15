package smoke_and_sanity_tests.accounting_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.accounting_tab.management_fees_subtab.GenerateManagementFeesPage;

import static org.junit.Assert.assertTrue;

public class ValidateFunctionalityOfGenerateManagementFeesIT extends BaseBrowserTest {

    public ValidateFunctionalityOfGenerateManagementFeesIT() {
        super("Avantic");
    }

    @Test
    public void shouldGenerateManagementFees_whenGenerateManagementFeesContainerCompleted() {
        EntrataNavBar nav = new EntrataNavBar(driver);
        GenerateManagementFeesPage mfPage = new GenerateManagementFeesPage(driver);

        assertTrue("Could not find the accounting tab", nav.hoverAccountingTab());
        assertTrue("Could not find the management fees button in the accounting dropdown", nav.clickManagementFeesInDropdown());
        assertTrue("Count not find the management fees table", mfPage.verifyManagementFeesTableIsVisible());
        assertTrue("Could not hover over Generate Fees button.", mfPage.hoverGenerateManagementFeesButton());
        assertTrue("Could not find the generate management fees button", mfPage.clickGenerateManagementFeesButton());
        assertTrue("Could not find the generate management fees popup window", mfPage.verifyGenerateManagementFeesPopup());
        assertTrue("Could not find the continue button on the generate management fees popup", mfPage.clickContinueGeneratingManagementFees());
        assertTrue("Could not find the management fees container", mfPage.verifyManagementFeesContainer());
        assertTrue("Could not find the select all properties button on the management fees container", mfPage.clickSelectAllPropertiesCheckBox());
        assertTrue("Could not find the generate all management fees button on the management fees container", mfPage.clickGenerateAllManagementFeesButton());
    }
}
