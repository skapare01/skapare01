package smoke_and_sanity_tests.client_admin_tests.training_and_knowledge_base;

import base_tests.BaseBrowserTest;
import base_tests.SitesEnum;
import org.junit.Test;
import page_objects.client_admin_page_objects.ClientAdminNavBar;
import page_objects.client_admin_page_objects.support_tab.knowledge_base_subtab.AddNewContentPopup;
import page_objects.client_admin_page_objects.support_tab.knowledge_base_subtab.KnowledgeBasePage;
import page_objects.client_admin_page_objects.support_tab.knowledge_base_subtab.ViewContentPage;

import static org.junit.Assert.*;

public class KnowledgeBaseIT extends BaseBrowserTest {
    public KnowledgeBaseIT(){
        super("clientadmin", SitesEnum.CLIENTADMIN,"ctimpson","Entrata123");
    }

    @Test
    public void shouldAddContentToKnowledgeBase_whenPermissionedUserLoggedIn(){
        ClientAdminNavBar clientAdminNavBar = new ClientAdminNavBar(driver);
        assertTrue("Unable to hover over support tab.", clientAdminNavBar.clickSupportTab());
        assertTrue("Unable to click knowledge base subtab.",clientAdminNavBar.clickKnowledgeBaseListItem());
        KnowledgeBasePage knowledgeBasePage = new KnowledgeBasePage(driver);
        AddNewContentPopup addNewContentPopup = new AddNewContentPopup(driver);
        assertTrue("Unable to click add new content button.", knowledgeBasePage.clickAddNewContentButton());
        assertTrue("Unable to select focused course option from content type dropdown",addNewContentPopup.clickFocusedCourseContentTypeDropdownSelection());
        assertTrue("Unable to enter random title name in add new content title field.", addNewContentPopup.enterRandomTitle());
        assertTrue("Unable to enter random description in add new content description field.",addNewContentPopup.enterRandomDescription());
        assertTrue("Unable to select admins from visible to dropdown",addNewContentPopup.selectAdminsVisibleToValue());
        assertTrue("Unable to select first checkbox for relevant topics section",addNewContentPopup.clickRelevantLocationsFirstCheckBox());
        assertTrue("Unable to enter relevant keyword",addNewContentPopup.enterRelevantKeywords());
        assertTrue("Unable to click Advanced Budgeting Product as relevant product",addNewContentPopup.clickAdvancedBudgeting());
        assertTrue("Unable to click add new content save button.",addNewContentPopup.clickNewContentSaveButton());
        ViewContentPage viewContentPage = new ViewContentPage(driver);
        assertTrue("Unable to find success message", viewContentPage.confirmSuccessMessageVisible());
        assertTrue("Success message still showing", viewContentPage.waitForSuccessMessageToDisappear());
        assertTrue("Unable to enter HTML content in HTML editor.",viewContentPage.enterHTML("Hello"));
        assertTrue("Unable to click preview HTML button.", viewContentPage.clickPreviewHTML());
        assertEquals("Preview HTML text does not match expected result.","Hello",viewContentPage.getPreviewHtmlText());
        assertTrue("Unable to click view content save button.", viewContentPage.clickSaveViewContentButton());
        assertTrue("Unable to find success message.",viewContentPage.confirmSuccessMessageVisible());
        assertTrue("Unable to click other actions dropdown.", viewContentPage.clickOtherActions());
        assertTrue("Unable to click download PDF",viewContentPage.clickDownloadPDFBUTTON());
        assertTrue("Unable to click other actions dropdown.", viewContentPage.clickOtherActions());
        assertTrue("Unable to click publish button.", viewContentPage.clickPublishButton());

    }
}
