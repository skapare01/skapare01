package page_objects.entrata_page_objects.tools_tab.documents_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class DocumentSearchSubtab extends BasePage {

    private final By CATEGORY = By.id("document_search_entity");
    private final By ADD_PROPERTIES = By.id("addbutton");
    private final By DOCUMENT_TYPES = By.cssSelector("span[for='select-all-options']");
    private final By ADD_SEARCH_OPTIONS = By.cssSelector("div.add-search-options.js-add-search-options");
    private final By SEARCH_BUTTON = By.id("submit_search_form");

    public DocumentSearchSubtab(WebDriver driver) {
        super(driver);
    }

    public boolean findCategoryDropdown() { return confirmElementIsVisible(CATEGORY); }
    public boolean findAddProperties() { return confirmElementIsVisible(ADD_PROPERTIES); }
    public boolean findDocumentTypesAllOptions() { return confirmElementIsVisible(DOCUMENT_TYPES); }
    public boolean findAddSearchOptions() { return confirmElementIsVisible(ADD_SEARCH_OPTIONS); }
    public boolean findSearchButton() { return confirmElementIsVisible(SEARCH_BUTTON); }

}
