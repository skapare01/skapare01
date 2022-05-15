package smoke_and_sanity_tests.marketing_hub_tests.craigslist_tests;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.MarketingHubNav;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.craigslist_ads_tab.CorporateTemplatesSubtab;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.craigslist_ads_tab.EditCraigslistTemplateModal;
import page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.craigslist_ads_tab.NewTemplateModal;

import static org.junit.Assert.assertTrue;

public class VerifyCraigslistAdCreationAndDeletionIT extends BaseBrowserTest {

    public VerifyCraigslistAdCreationAndDeletionIT() {
        super("demoold");
    }

    //Manual TestCase 2257390

    @Test
    public void shouldVerifyCorporateCraigslistAdCreationAndDeletion_whenCraigslistIsEnabled() {
        EntrataNavBar entrataNavBar = new EntrataNavBar(driver);
        //Navigate to Marketing Hub
        assertTrue("Unable to find 'Tools' Tab.",
                entrataNavBar.moveToToolsTab());
        assertTrue("Unable to open Marketing Hub Subtab.",
                entrataNavBar.clickMarketingHubSubTab());

        MarketingHubNav marketingHubNav = new MarketingHubNav(driver);
        //Navigate to Craigslist Ad Creation of Marketing Hub
        assertTrue("Unable to navigate to 'Craigslist Ads' subtab of the Marketing Hub.",
                marketingHubNav.clickCraigslistTab());

        CorporateTemplatesSubtab craigslistCorporateTemplates = new CorporateTemplatesSubtab(driver);
        //Create a new Corporate Template
        assertTrue("Unable to click on the 'New Template' option of the Craigslist Corporate Templates subtab.",
                craigslistCorporateTemplates.clickCorporateNewTemplateButton());

        NewTemplateModal newCraigslistTemplate = new NewTemplateModal(driver);
        assertTrue("Unable to enter an ad title in the New template Modal for Craigslist ad creation.",
                newCraigslistTemplate.enterCorporateTemplateGenericTitle());
        assertTrue("Unable to click the continue button on the 'Ad Title' section of the new template modal for Craigslist ad creation.",
                newCraigslistTemplate.clickContinueButton());
        assertTrue("Unable to click the continue button on the 'Text Content' section of the New Template modal for Craigslist ad creation.",
                newCraigslistTemplate.clickContinueButton());
        assertTrue("Unable to click the continue button on the 'Ad Images' section of the New Template modal for the Craigslist ad creation.",
                newCraigslistTemplate.clickContinueButton());
        assertTrue("Unable to select the first property in the list on the 'Property Association' section of the New Template modal for the Craigslist ad creation.",
                newCraigslistTemplate.clickFirstPropertyInList());
        assertTrue("Unable to click the 'Save Template' button on the 'Property Association' section of the New Template modal for the Craigslist ad creation.",
                newCraigslistTemplate.clickSaveTemplate());

        //Confirm that the newly created template was saved properly.
        assertTrue("The Corporate Templates screen did not load properly after saving the new template.",
                craigslistCorporateTemplates.corporateTemplateTitleVisible());
        assertTrue("Unable to scroll to the bottom of the 'Corporate Templates' section of Craigslist ad creation.",
                craigslistCorporateTemplates.scrollDownToBottomOfPage());
        assertTrue("The new Template that was created did not get saved correctly.",
                craigslistCorporateTemplates.confirmNewTemplateForVerifyCraigslistAdCreationAndDeletionWasCreated("Corporate Ad Creation automation test name to be deleted"));

        //Confirm that the edit screen opens when selecting the edit option on the newly created template.
        EditCraigslistTemplateModal editCraigslistTemplateModal = new EditCraigslistTemplateModal(driver);
        assertTrue("Unable to click the edit button on the last Corporate Template of the 'Corporate Templates' section of Craigslist ad creation.",
                craigslistCorporateTemplates.clickEditOptionOfLastCorporateTemplate());
        assertTrue("The edit Craigslist Template did not load when selecting the edit option.",
                editCraigslistTemplateModal.confirmTheEditCraigslistTemplateOpenedProperly());
        assertTrue("Unable to click the close button on the Edit Craigslist Template modal.",
                editCraigslistTemplateModal.closeTheEditCraigslistTemplateModal());

        //Delete the recently created Corporate Craigslist Template.
        assertTrue("The Corporate Templates screen did not load properly after closing the edit template.",
                craigslistCorporateTemplates.corporateTemplateTitleVisible());
        assertTrue("Unable to scroll to the bottom of the 'Corporate Templates' section of Craigslist ad creation.",
                craigslistCorporateTemplates.scrollDownToBottomOfPage());
        assertTrue("Unable to move to the last ad of the 'Corporate Templates' section of Craigslist ad creation.",
                craigslistCorporateTemplates.moveToLastCorporateTemplate());
        assertTrue("Unable to click the delete button on the ad that was moved to on the 'Corporate Templates' section of Craigslist ad creation.",
                craigslistCorporateTemplates.clickLastDeleteButton());
        assertTrue("Unable to click the confirm delete button on the last ad within the 'Corporate Templates' section of Craigslist ad creation.",
                craigslistCorporateTemplates.clickConfirmDeleteButton());

    }

}