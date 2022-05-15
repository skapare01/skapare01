package smoke_and_sanity_tests.doc_management;

import base_tests.BaseBrowserTest;
import org.junit.Test;
import page_objects.entrata_page_objects.EntrataNavBar;
import page_objects.entrata_page_objects.tools_tab.documents_subtab.DocumentSearchSubtab;

import static org.junit.Assert.assertTrue;

public class ShouldLoadDocumentSearchPageWhenNavigatingToDocumentsIT extends BaseBrowserTest {

    public ShouldLoadDocumentSearchPageWhenNavigatingToDocumentsIT(){
        super("derapid");
    }

    @Test
    public void shouldLoadDocumentSearchPage_whenNavigatingToDocuments() {

        EntrataNavBar entrataNavigation = new EntrataNavBar(driver);
        assertTrue("Unable to click 'Tools' tab",entrataNavigation.clickToolsTab());
        assertTrue("Unable to click 'Documents' tab", entrataNavigation.clickDocumentsTab());
        DocumentSearchSubtab documentSearch = new DocumentSearchSubtab(driver);
        assertTrue("Unable to find 'Category' dropdown on Document Search page", documentSearch.findCategoryDropdown());
        assertTrue("Unable to find 'Add' properties button on Document Search page", documentSearch.findAddProperties());
        assertTrue("Unable to find 'Document Types - All Options' checkbox on Document Search page", documentSearch.findDocumentTypesAllOptions());
        assertTrue("Unable to find 'Add Search Options' button on Document Search page", documentSearch.findAddSearchOptions());
        assertTrue("Unable to find 'Search' button on Document Search page", documentSearch.findSearchButton());

    }

}
