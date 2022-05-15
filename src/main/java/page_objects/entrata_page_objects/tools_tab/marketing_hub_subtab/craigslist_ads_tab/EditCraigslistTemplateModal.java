package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.craigslist_ads_tab;

import org.checkerframework.checker.index.qual.PolyUpperBound;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class EditCraigslistTemplateModal extends BasePage {

    public EditCraigslistTemplateModal(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By EDIT_CRAIGSLIST_TEMPLATE_TITLE_LOCATOR = By.cssSelector("div[class='title']");
    private final String EDIT_CRAIGSLIST_TEMPLATE_TITLE_STRING = "Edit Craigslist Template";
    private final By CLOSE_BUTTON = By.cssSelector("i[class='close-button close']");

    //Methods
    public boolean confirmTheEditCraigslistTemplateOpenedProperly() {
        return confirmElementContainsText(EDIT_CRAIGSLIST_TEMPLATE_TITLE_LOCATOR, EDIT_CRAIGSLIST_TEMPLATE_TITLE_STRING);
    }

    public boolean closeTheEditCraigslistTemplateModal() {
        return clickElement(CLOSE_BUTTON);
    }

}
