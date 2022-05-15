package page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.encryption_subtab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class EncryptionSubTab extends BasePage {
    public EncryptionSubTab(WebDriver driver) {
        super(driver);
    }

    private final By STRING_ENCRYPTOR_HEADER = By.id("STRING_TO_ENCRYPT");
    private final By STRING_ENCRYPTOR_TOOL_TIPS = By.id("ENCRYPT_STRING_HELP");
    private final By CONTENT_TO_ENCRYPT_BOX = By.id("STRING_TO_ENCRYPT");
    private final By ENCRYPTED_CONTENT_BOX = By.id("GET_ENCRYPTED_STRING");
    private final By ENCRYPT_COPY_TO_CLIPBOARD_BTN = By.id("copy_to_clipboard");
    private final By ENCRYPT_IT_BTN = By.id("btn_website_encryption");

    public boolean stringEncryptorHeader() {
        return confirmElementIsVisible(STRING_ENCRYPTOR_HEADER);
    }
    public boolean stringEncryptorToolTips() {
        return clickElement(STRING_ENCRYPTOR_TOOL_TIPS);
    }
    public boolean contentToEncryptBox() {
        return confirmElementIsVisible(CONTENT_TO_ENCRYPT_BOX);
    }
    public boolean encryptedContentBox() {
        return confirmElementIsVisible(ENCRYPTED_CONTENT_BOX);
    }
    public boolean copyToClipboardEncryptBtn() {
        return confirmElementIsVisible(ENCRYPT_COPY_TO_CLIPBOARD_BTN);
    }
    public boolean encryptItBtn() {
        return confirmElementIsVisible(ENCRYPT_IT_BTN);
    }
}
