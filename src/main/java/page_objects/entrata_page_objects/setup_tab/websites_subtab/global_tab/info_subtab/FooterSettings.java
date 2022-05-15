package page_objects.entrata_page_objects.setup_tab.websites_subtab.global_tab.info_subtab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FooterSettings extends BasePage {
    public FooterSettings(WebDriver driver) {
        super(driver);
    }

    private final By FOOTER_SETTINGS = By.xpath("//*[text()='Footer Settings']");
    private final By FOOTER_SETTINGS_EDIT_BTN = By.id("footer-content-button");
    private final By EMPLOYEE_PORTAL = By.xpath("//*[text()='Employee Portal:']");
    private final By EMPLOYEE_PORTAL_TOOL_TIPS = By.id("SHOW_EMPLOYEE_PORTAL_LINK_HELP");
    private final By OWNER_PORTAL = By.xpath("//*[text()='Owner Portal:']");
    private final By OWNER_PORTAL_TOOL_TIPS = By.id("SHOW_OWNER_PORTAL_LINK_HELP");
    private final By RENAME_OWNER_PORTAL = By.xpath("//*[text()='Rename Owner Portal:']");
    private final By RENAME_OWNER_PORTAL_TOOL_TIPS = By.id("RENAME_OWNER_PORTAL_WEBSITE_PREFERENCES_HELP");
    private final By CUSTOM_FOOTER_TEXT = By.xpath("//*[text()='Custom Footer Text:']");
    private final By CUSTOM_FOOTER_TEXT_TOOL_TIPS = By.id("CUSTOM_FOOTER_TEXT_WEBSITE_PREFERENCES_HELP");

    public boolean footerSettings() {
        return confirmElementIsVisible(FOOTER_SETTINGS);
    }
    public boolean footerSettingsEditBtn() {
        return confirmElementIsVisible(FOOTER_SETTINGS_EDIT_BTN);
    }
    public boolean employeePortal() {
        return confirmElementIsVisible(EMPLOYEE_PORTAL);
    }
    public boolean employeePortalToolTips() {
        return clickElement(EMPLOYEE_PORTAL_TOOL_TIPS);
    }
    public boolean ownerPortal() {
        return confirmElementIsVisible(OWNER_PORTAL);
    }
    public boolean ownerPortalToolTips() {
        return clickElement(OWNER_PORTAL_TOOL_TIPS);
    }
    public boolean renameOwnerPortal() {
        return confirmElementIsVisible(RENAME_OWNER_PORTAL);
    }
    public boolean renameOwnerPortalToolTips() {
        return clickElement(RENAME_OWNER_PORTAL_TOOL_TIPS);
    }
    public boolean customFooterText() {
        return confirmElementIsVisible(CUSTOM_FOOTER_TEXT);
    }
    public boolean customFooterTextToolTips() {
        return clickElement(CUSTOM_FOOTER_TEXT_TOOL_TIPS);
    }

}
