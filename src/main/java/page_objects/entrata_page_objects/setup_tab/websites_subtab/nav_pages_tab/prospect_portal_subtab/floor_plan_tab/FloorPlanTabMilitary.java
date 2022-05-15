package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.floor_plan_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FloorPlanTabMilitary extends BasePage {
    public FloorPlanTabMilitary(WebDriver driver) {
        super(driver);
    }

    private final By PP_MILITARY_FLOOR_PLAN_HEADER = By.xpath("//h3[text()='Military']");
    private final By PP_MILITARY_FLOOR_PLAN_EDIT_BTN = By.id("military-floor-plans-content-button");
    private final By MILITARY_DISCLAIMER_TEXT = By.xpath("//*[text()='Disclaimer Text:']");
    private final By MILITARY_DISCLAIMER_TEXT_TOOL_TIPS = By.id("MILITARY_DISCLAIMER_TEXT_WEBSITE_PREFERENCES_HELP");
    private final By MILITARY_DEPOSIT_DISCLAIMER_TEXT = By.xpath("//*[text()='Deposit Disclaimer Text:']");
    private final By MILITARY_DEPOSIT_DISCLAIMER_TEXT_TOOL_TIPS = By.id("MILITARY_WEBSITE_PROPERTY_DEPOSIT_DISCLAIMER_HELP");
    private final By MILITARY_FLOOR_PLAN_LAYOUT_TEXT = By.xpath("//*[text()='Floor Plan Layout:']");
    private final By MILITARY_FLOOR_PLAN_LAYOUT_TOOL_TIPS = By.id("MILITARY_FLOORPLAN_LAYOUT_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By MILITARY_FLOOR_PLAN_GROUPS_TEXT = By.xpath("//*[text()='Floor Plan Groups:']");
    private final By MILITARY_FLOOR_PLAN_GROUPS_TOOL_TIPS = By.id("MILITARY_FLOORPLAN_GROUP_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By MILITARY_RENAME_AVAILABILITY_ALERT_TEXT = By.xpath("//*[text()='Rename Availability Alert:']");
    private final By MILITARY_RENAME_AVAILABILITY_ALERT_TOOL_TIPS = By.id("MILITARY_RENAME_AVAILABILITY_ALERT_WEBSITE_PREFERENCES_HELP");
    private final By MILITARY_RENAME_ONLY_ONE_LEFT_CTA_TEXT = By.xpath("//*[text()='Rename \"Only One Left! CTA\":']");
    private final By MILITARY_RENAME_ONLY_ONE_LEFT_CTA_TOOL_TIPS = By.id("MILITARY_RENAME_ONLY_ONE_LEFT_CTA_WEBSITE_PREFERENCES_HELP");
    private final By MILITARY_RENAME_DEPOSIT_TEXT= By.xpath("//*[text()='Rename \"Deposit\":']");
    private final By MILITARY_RENAME_DEPOSIT_TOOL_TIPS = By.id("MILITARY_RENAME_DEPOSIT_WEBSITE_PREFERENCES_HELP");
    private final By MILITARY_RENAME_REQUEST_INFO_TEXT = By.xpath("//*[text()='Rename \"Request Info\":']");
    private final By MILITARY_RENAME_REQUEST_INFO_TOOL_TIPS = By.id("MILITARY_RENAME_REQUEST_INFO_WEBSITE_PREFERENCES_HELP");
    private final By MILITARY_RENAME_WAIT_LIST_TEXT= By.xpath("//*[text()='Rename \"WaitList\":']");
    private final By MILITARY_RENAME_WAIT_LIST_TOOL_TIPS = By.id("MILITARY_RENAME_WAITLIST_WEBSITE_PREFERENCES_HELP");
    private final By MILITARY_WAIT_LIST_REDIRECT_MESSAGE_TEXT = By.xpath("//*[text()='Waitlist Redirect Message:']");
    private final By MILITARY_WAIT_LIST_REDIRECT_MESSAGE_TOOL_TIPS = By.id("MILITARY_RENAME_WAITLIST_MESSAGE_WEBSITE_PREFERENCES_HELP");
    private final By MILITARY_REQUEST_INFO_EXTERNAL_URL_TEXT = By.xpath("//*[text()='Request Info External URL:']");
    private final By MILITARY_REQUEST_INFO_EXTERNAL_URL_TOOL_TIPS = By.id("MILITARY_REQUEST_INFO_EXTERNAL_URL_WEBSITE_PREFERENCES_HELP");
    private final By MILITARY_VIEWER_BACKGROUND_COLOR_TEXT = By.xpath("//*[text()='Viewer Background Color:']");
    private final By MILITARY_VIEWER_BACKGROUND_COLOR_TOOL_TIPS = By.id("MILITARY_FP_DETAILS_VIEWER_BACKGROUND_COLOR_WEBSITE_PREFERENCES_HELP");
    private final By MILITARY_ASSOCIATED_FLOOR_PLANS_NUMBER_TEXT= By.xpath("//*[text()='Associated Floor Plans Number:']");
    private final By MILITARY_ASSOCIATED_FLOOR_PLANS_NUMBER_TOOL_TIPS= By.id("MILITARY_HIDE_ASSOCIATED_FLOOR_PLAN_NUMBER_WEBSITE_PREFERENCES_HELP");

    public boolean ppMilitaryFloorPlanHeader() {
        return confirmElementIsVisible(PP_MILITARY_FLOOR_PLAN_HEADER);
    }
    public boolean ppMilitaryFloorPlanEditBtn() {
        return confirmElementIsVisible(PP_MILITARY_FLOOR_PLAN_EDIT_BTN);
    }
    public boolean ppMilitaryDisclaimerText() {
        return confirmElementIsVisible(MILITARY_DISCLAIMER_TEXT);
    }
    public boolean ppMilitaryDisclaimerTextToolTips() {
        return clickElement(MILITARY_DISCLAIMER_TEXT_TOOL_TIPS);
    }
    public boolean ppMilitaryDepositDisclaimer() {
        return confirmElementIsVisible(MILITARY_DEPOSIT_DISCLAIMER_TEXT);
    }
    public boolean ppMilitaryDepositDisclaimerToolTips() {
        return clickElement(MILITARY_DEPOSIT_DISCLAIMER_TEXT_TOOL_TIPS);
    }
    public boolean ppMilitaryFloorPlanLayout() {
        return confirmElementIsVisible(MILITARY_FLOOR_PLAN_LAYOUT_TEXT);
    }
    public boolean ppMilitaryFloorPlanLayoutToolTips() {
        return clickElement(MILITARY_FLOOR_PLAN_LAYOUT_TOOL_TIPS);
    }
    public boolean ppMilitaryFloorPlanGroups() {
        return confirmElementIsVisible(MILITARY_FLOOR_PLAN_GROUPS_TEXT);
    }
    public boolean ppMilitaryFloorPlanGroupsToolTips() {
        return clickElement(MILITARY_FLOOR_PLAN_GROUPS_TOOL_TIPS);
    }
    public boolean ppMilitaryRenameAvailabilityAlert() {
        return confirmElementIsVisible(MILITARY_RENAME_AVAILABILITY_ALERT_TEXT);
    }
    public boolean ppMilitaryRenameAvailabilityAlertToolTips() {
        return clickElement(MILITARY_RENAME_AVAILABILITY_ALERT_TOOL_TIPS);
    }
    public boolean ppMilitaryRenameOnlyOneLeftCTA() {
        return confirmElementIsVisible(MILITARY_RENAME_ONLY_ONE_LEFT_CTA_TEXT);
    }
    public boolean ppMilitaryRenameOnlyOneLeftCTAToolTips() {
        return clickElement(MILITARY_RENAME_ONLY_ONE_LEFT_CTA_TOOL_TIPS);
    }
    public boolean ppMilitaryRenameDeposit() {
        return confirmElementIsVisible(MILITARY_RENAME_DEPOSIT_TEXT);
    }
    public boolean ppMilitaryRenameDepositToolTips() {
        return clickElement(MILITARY_RENAME_DEPOSIT_TOOL_TIPS);
    }
    public boolean ppMilitaryRenameRequestInfo() {
        return confirmElementIsVisible(MILITARY_RENAME_REQUEST_INFO_TEXT);
    }
    public boolean ppMilitaryRenameRequestInfoToolTips() {
        return clickElement(MILITARY_RENAME_REQUEST_INFO_TOOL_TIPS);
    }
    public boolean ppMilitaryRenameWaitList() {
        return confirmElementIsVisible(MILITARY_RENAME_WAIT_LIST_TEXT);
    }
    public boolean ppMilitaryRenameWaitListToolTips() {
        return clickElement(MILITARY_RENAME_WAIT_LIST_TOOL_TIPS);
    }
    public boolean ppMilitaryWaitListRedirectMessage() {
        return confirmElementIsVisible(MILITARY_WAIT_LIST_REDIRECT_MESSAGE_TEXT);
    }
    public boolean ppMilitaryWaitListRedirectMessageToolTips() {
        return clickElement(MILITARY_WAIT_LIST_REDIRECT_MESSAGE_TOOL_TIPS);
    }
    public boolean ppMilitaryRequestInfoExternalURL() {
        return confirmElementIsVisible(MILITARY_REQUEST_INFO_EXTERNAL_URL_TEXT);
    }
    public boolean ppMilitaryRequestInfoExternalURLToolTips() {
        return clickElement(MILITARY_REQUEST_INFO_EXTERNAL_URL_TOOL_TIPS);
    }
    public boolean ppMilitaryViewerBackgroundColor() {
        return confirmElementIsVisible(MILITARY_VIEWER_BACKGROUND_COLOR_TEXT);
    }
    public boolean ppMilitaryViewerBackgroundColorToolTips() {
        return clickElement(MILITARY_VIEWER_BACKGROUND_COLOR_TOOL_TIPS);
    }
    public boolean ppMilitaryAssociatedFloorPlansNumber() {
        return confirmElementIsVisible(MILITARY_ASSOCIATED_FLOOR_PLANS_NUMBER_TEXT);
    }
    public boolean ppMilitaryAssociatedFloorPlansNumberToolTips() {
        return clickElement(MILITARY_ASSOCIATED_FLOOR_PLANS_NUMBER_TOOL_TIPS);
    }
}
