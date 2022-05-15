package smoke_and_sanity_tests.client_admin_tests.lms_training_knowledge_base_tests;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.support_tab.knowledge_base_subtab.AddNewContentPopup;
import page_objects.client_admin_page_objects.support_tab.knowledge_base_subtab.KnowledgeBasePage;
import static org.junit.Assert.assertTrue;

public class AddNewContentAsVideoIT extends BaseBrowserTest {

    public AddNewContentAsVideoIT() {
        super("clientadmin", SitesEnum.CLIENTADMIN, "salurkar", "Xento123");
    }

    @Test
    public void shouldAddContentAsVideo_whenAddContentWorkflowIsCompleted() {
        ClientAdminNavBar nav = new ClientAdminNavBar(driver);
        KnowledgeBasePage knowledgePage = new KnowledgeBasePage(driver);
        AddNewContentPopup addNewContentPopup = new AddNewContentPopup(driver);

        assertTrue("Could not find the support tab", nav.moveToSupportMenu());
        assertTrue("Could not find the Knowledge Base list item", nav.clickKnowledgeBaseListItem());
        assertTrue("Could not find the add new content button", knowledgePage.clickAddNewContentButton());
        assertTrue("Could not find the content type dropdown", addNewContentPopup.clickContentTypeDropdown());
        assertTrue("Could not find the content type dropdown selection", addNewContentPopup.clickVideoOptionContentTypeDropdownSelection());
        assertTrue("Could not find the new content title text field", addNewContentPopup.enterRandomTitle());
        assertTrue("Could not find the new content description text field", addNewContentPopup.enterNewContentDescription());
        assertTrue("Could not find the new content video URL text field", addNewContentPopup.enterNewContentVideoURL());
        assertTrue("Could not find the relevant keywords text field", addNewContentPopup.enterRelevantKeywords());
        assertTrue("Could not find the save button on the new content popup", addNewContentPopup.clickNewContentSaveButton());
        assertTrue("Could not find the content added success message", knowledgePage.verifyContentAddedSuccessMessage());
        assertTrue("Could not find the publish content button", knowledgePage.clickPublishContentButton());
        assertTrue("Could not find the content published success message", knowledgePage.verifyContentPublishedSuccessMessage());
    }
}
