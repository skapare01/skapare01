package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.floor_plan_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FloorPlanTabConventional extends BasePage {
    public FloorPlanTabConventional(WebDriver driver) {
        super(driver);
    }

    private final By PP_CONVENTIONAL_FLOOR_PLAN_HEADER = By.xpath("//*[@id=\"conventional_floor_plans_settings\"]/div/h3");
    private final By PP_CONVENTIONAL_FLOOR_PLAN_EDIT_BTN = By.id("conventional-floor-plans-content-button");
    private final By CONVENTIONAL_USER_FLOW_TEXT = By.xpath("//*[text()='User Flow:']");
    private final By CONVENTIONAL_USER_FLOW_TOOL_TIPS = By.id("FLOOR_PLAN_DISPLAY_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By CONVENTIONAL_DISCLAIMER_TEXT = By.xpath("//*[text()='Disclaimer Text:']");
    private final By CONVENTIONAL_DISCLAIMER_TEXT_TOOL_TIPS = By.id("DISCLAIMER_TEXT_WEBSITE_PREFERENCES_HELP");
    private final By CONVENTIONAL_DEPOSIT_DISCLAIMER_TEXT = By.xpath("//*[text()='Deposit Disclaimer Text:']");
    private final By CONVENTIONAL_DEPOSIT_DISCLAIMER_TEXT_TOOL_TIPS = By.id("WEBSITE_PROPERTY_DEPOSIT_DISCLAIMER_HELP");
    private final By CONVENTIONAL_FLOOR_PLAN_LAYOUT_TEXT = By.xpath("//*[text()='Floor Plan Layout:']");
    private final By CONVENTIONAL_FLOOR_PLAN_LAYOUT_TOOL_TIPS = By.id("FLOORPLAN_LAYOUT_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By CONVENTIONAL_FLOOR_PLAN_GROUPS_TEXT = By.xpath("//*[text()='Floor Plan Groups:']");
    private final By CONVENTIONAL_FLOOR_PLAN_GROUPS_TOOL_TIPS = By.id("FLOORPLAN_GROUP_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By CONVENTIONAL_RENAME_AVAILABILITY_ALERT_TEXT = By.xpath("//*[text()='Rename Availability Alert:']");
    private final By CONVENTIONAL_RENAME_AVAILABILITY_ALERT_TOOL_TIPS = By.id("RENAME_AVAILABILITY_ALERT_WEBSITE_PREFERENCES_HELP");
    private final By CONVENTIONAL_RENAME_ONLY_ONE_LEFT_CTA_TEXT = By.xpath("//*[@id=\"conventional-floor-plans-content-view\"]/div[7]/label");
    private final By CONVENTIONAL_RENAME_ONLY_ONE_LEFT_CTA_TOOL_TIPS = By.id("RENAME_ONLY_ONE_LEFT_CTA_WEBSITE_PREFERENCES_HELP");
    private final By CONVENTIONAL_RENAME_DEPOSIT_TEXT = By.xpath("//*[@id=\"conventional-floor-plans-content-view\"]/div[8]/label");
    private final By CONVENTIONAL_RENAME_DEPOSIT_TOOL_TIPS= By.id("RENAME_DEPOSIT_WEBSITE_PREFERENCES_HELP");
    private final By CONVENTIONAL_RENAME_REQUEST_INFO_TEXT = By.xpath("//*[@id=\"conventional-floor-plans-content-view\"]/div[9]/label");
    private final By CONVENTIONAL_RENAME_REQUEST_INFO_TOOL_TIPS = By.id("RENAME_REQUEST_INFO_WEBSITE_PREFERENCES_HELP");
    private final By CONVENTIONAL_REQUEST_INFO_EXTERNAL_URL_TEXT = By.xpath("//*[text()='Request Info External URL:']");
    private final By CONVENTIONAL_REQUEST_INFO_EXTERNAL_URL_TOOL_TIPS = By.id("REQUEST_INFO_EXTERNAL_URL_WEBSITE_PREFERENCES_HELP");
    private final By CONVENTIONAL_VIEWER_BACKGROUND_COLOR_TEXT = By.xpath("//*[text()='Viewer Background Color:']");
    private final By CONVENTIONAL_VIEWER_BACKGROUND_COLOR_TOOL_TIPS = By.id("FP_DETAILS_VIEWER_BACKGROUND_COLOR_WEBSITE_PREFERENCES_HELP");
    private final By CONVENTIONAL_ASSOCIATED_FLOOR_PLANS_NUMBER_TEXT = By.xpath("//*[text()='Associated Floor Plans Number:']");
    private final By CONVENTIONAL_ASSOCIATED_FLOOR_PLANS_NUMBER_TOOL_TIPS = By.id("HIDE_ASSOCIATED_FLOOR_PLAN_NUMBER_WEBSITE_PREFERENCES_HELP");

    public boolean ppConventionalFloorPlanHeader() {
        return confirmElementIsVisible(PP_CONVENTIONAL_FLOOR_PLAN_HEADER);
    }
    public boolean ppConventionalFloorPlanEditBtn() {
        return confirmElementIsVisible(PP_CONVENTIONAL_FLOOR_PLAN_EDIT_BTN);
    }
    public boolean ppConventionalUserFlowText() {
        return confirmElementIsVisible(CONVENTIONAL_USER_FLOW_TEXT);
    }
    public boolean ppConventionalUserFlowToolTips() {
        return clickElement(CONVENTIONAL_USER_FLOW_TOOL_TIPS);
    }
    public boolean ppConventionalDisclaimerText() {
        return confirmElementIsVisible(CONVENTIONAL_DISCLAIMER_TEXT);
    }
    public boolean ppConventionalDisclaimerToolTips() {
        return clickElement(CONVENTIONAL_DISCLAIMER_TEXT_TOOL_TIPS);
    }
    public boolean ppConventionalDepositDisclaimerText() {
        return confirmElementIsVisible(CONVENTIONAL_DEPOSIT_DISCLAIMER_TEXT);
    }
    public boolean ppConventionalDepositDisclaimerToolTips() {
        return clickElement(CONVENTIONAL_DEPOSIT_DISCLAIMER_TEXT_TOOL_TIPS);
    }
    public boolean ppConventionalFloorPlanLayout() {
        return confirmElementIsVisible(CONVENTIONAL_FLOOR_PLAN_LAYOUT_TEXT);
    }
    public boolean ppConventionalFloorPlanLayoutToolTips() {
        return clickElement(CONVENTIONAL_FLOOR_PLAN_LAYOUT_TOOL_TIPS);
    }
    public boolean ppConventionalFloorPlanGroups() {
        return confirmElementIsVisible(CONVENTIONAL_FLOOR_PLAN_GROUPS_TEXT);
    }
    public boolean ppConventionalFloorPlanGroupsToolTips() {
        return clickElement(CONVENTIONAL_FLOOR_PLAN_GROUPS_TOOL_TIPS);
    }
    public boolean ppConventionalRenameAvailabilityAlert() {
        return confirmElementIsVisible(CONVENTIONAL_RENAME_AVAILABILITY_ALERT_TEXT);
    }
    public boolean ppConventionalRenameAvailabilityAlertToolTips() {
        return clickElement(CONVENTIONAL_RENAME_AVAILABILITY_ALERT_TOOL_TIPS);
    }
    public boolean ppConventionalRenameOnlyOneLeftCta() {
        return confirmElementIsVisible(CONVENTIONAL_RENAME_ONLY_ONE_LEFT_CTA_TEXT);
    }
    public boolean ppConventionalRenameOnlyOneLeftCtaToolTips() {
        return clickElement(CONVENTIONAL_RENAME_ONLY_ONE_LEFT_CTA_TOOL_TIPS);
    }
    public boolean ppConventionalRenameDeposit() {
        return confirmElementIsVisible(CONVENTIONAL_RENAME_DEPOSIT_TEXT);
    }
    public boolean ppConventionalRenameDepositToolTips() {
        return clickElement(CONVENTIONAL_RENAME_DEPOSIT_TOOL_TIPS);
    }
    public boolean ppConventionalRenameRequestInfo() {
        return confirmElementIsVisible(CONVENTIONAL_RENAME_REQUEST_INFO_TEXT);
    }
    public boolean ppConventionalRenameRequestInfoToolTips() {
        return clickElement(CONVENTIONAL_RENAME_REQUEST_INFO_TOOL_TIPS);
    }
    public boolean ppConventionalRequestInfoExternalUrl() {
        return confirmElementIsVisible(CONVENTIONAL_REQUEST_INFO_EXTERNAL_URL_TEXT);
    }
    public boolean ppConventionalRequestInfoExternalUrlToolTips() {
        return clickElement(CONVENTIONAL_REQUEST_INFO_EXTERNAL_URL_TOOL_TIPS);
    }
    public boolean ppConventionalViewerBackgroundColor() {
        return confirmElementIsVisible(CONVENTIONAL_VIEWER_BACKGROUND_COLOR_TEXT);
    }
    public boolean ppConventionalViewerBackgroundColorToolTips() {
        return clickElement(CONVENTIONAL_VIEWER_BACKGROUND_COLOR_TOOL_TIPS);
    }
    public boolean ppConventionalAssociatedFloorPlansNumber() {
        return confirmElementIsVisible(CONVENTIONAL_ASSOCIATED_FLOOR_PLANS_NUMBER_TEXT);
    }
    public boolean ppConventionalAssociatedFloorPlansNumberToolTips() {
        return clickElement(CONVENTIONAL_ASSOCIATED_FLOOR_PLANS_NUMBER_TOOL_TIPS);
    }
}
