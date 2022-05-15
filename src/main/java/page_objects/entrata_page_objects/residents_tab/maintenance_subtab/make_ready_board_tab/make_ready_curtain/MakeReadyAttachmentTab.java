package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.make_ready_board_tab.make_ready_curtain;

import net.bytebuddy.implementation.bind.annotation.AllArguments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class MakeReadyAttachmentTab extends BasePage {

    private final By ATTACHMENT_TAB = By.id("maintenance_request_attachment_tab");
    private final By ADD_ATTACHMENTS_OVERVIEW = By.id("maintenance_request_system_container");

    public MakeReadyAttachmentTab(WebDriver driver) {
        super(driver);
    }

    public boolean confirmAttachmentTabExists() { return confirmElementIsVisible(ATTACHMENT_TAB); }

    public boolean clickAttachmentTab() { return clickElement(ATTACHMENT_TAB); }

    public boolean confirmAddAttachmentsOverviewExists() { return confirmElementIsVisible(ADD_ATTACHMENTS_OVERVIEW); }


}
