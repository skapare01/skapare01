package page_objects.entrata_page_objects.tools_tab.marketing_hub_subtab.google_tab.google_posts_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class GooglePostsModal extends BasePage {

    public GooglePostsModal(WebDriver driver) {
        super(driver);
    }

    //Variables
    private final By ADD_PHOTO_BUTTON = By.cssSelector("a[class='action button js-add-photo js-view-media-library']");
    private final By WRITE_YOUR_POST = By.id("post_message");
    private String POST_MESSAGE_FOR_TEST = "Automation Test post to be deleted.";
    private final By SAVE_POST_BUTTON = By.cssSelector("input[class='form-submit js-save-post']");
    private final By SAVE_PHOTO_OVERLAY = By.cssSelector("div[class='loading-overlay bg-img-medium']");
    private final By DELETE_POST_BUTTON = By.cssSelector("a[class='add-tip tip-top button action js-delete-post binded']");
    private final By CONFIRM_DELETE_POST_BUTTON = By.cssSelector("a[class='button small actions-btn']");

    //Media Library Variables
    private final By F35_IMAGE = By.id("132558");
    private final By USE_SELECTED_BUTTON = By.cssSelector("a[class='button small green js-use-files use-selected-btn margin10-bottom selected-panel-content']");

    //Methods
    public boolean clickAddPhotoOption() {
        return clickElement(ADD_PHOTO_BUTTON);
    }

    public boolean enterGenericMessageText() {
        savePhotoOverlay();
        return sendKeysToElement(WRITE_YOUR_POST, POST_MESSAGE_FOR_TEST);
    }

    public boolean clickPostButton() {
        return clickElement(SAVE_POST_BUTTON);
    }

    public boolean clickDeletePostButton() {
        return clickElement(DELETE_POST_BUTTON);
    }

    public boolean clickConfirmDeleteButton() {
        return clickElement(CONFIRM_DELETE_POST_BUTTON);
    }

    //Media Library Methods
    public boolean clickF35Photo() {
        return clickElement(F35_IMAGE);
    }

    public boolean clickUseSelectedButton() {
        return clickElement(USE_SELECTED_BUTTON);
    }

    public void savePhotoOverlay() {
        waitForOverlay(SAVE_PHOTO_OVERLAY);
    }

}