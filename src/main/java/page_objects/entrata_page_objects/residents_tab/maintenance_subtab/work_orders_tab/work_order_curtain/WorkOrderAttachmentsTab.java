package page_objects.entrata_page_objects.residents_tab.maintenance_subtab.work_orders_tab.work_order_curtain;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class WorkOrderAttachmentsTab extends BasePage {

    private final By ATTACHMENTS_SUBTAB = By.id("maintenance_request_attachment_tab");

    private final By ATTACHMENTS_OVERVIEW_BOX = By.id("maintenance_request_system_container");

    public WorkOrderAttachmentsTab(WebDriver driver){ super(driver); }

    public boolean clickAttachmentSubTab() { return clickElement(ATTACHMENTS_SUBTAB); }

    public boolean confirmAttachmentSubTabExists() { return confirmElementIsVisible(ATTACHMENTS_SUBTAB); }

    public boolean confirmAttachmentsOverviewBoxExists() { return confirmElementIsVisible(ATTACHMENTS_OVERVIEW_BOX); }
}
