package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.floor_plan_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class FloorPlanTabStudent extends BasePage {
    public FloorPlanTabStudent(WebDriver driver) {
        super(driver);
    }

    private final By PP_STUDENT_FLOOR_PLAN_HEADER = By.xpath("//h3[text()='Student']");
    private final By PP_STUDENT_FLOOR_PLAN_EDIT_BTN = By.id("student-floor-plans-content-button");
    private final By STUDENT_USER_FLOW_TEXT = By.xpath("//*[text()='User Flow:']");
    private final By STUDENT_USER_FLOW_TOOL_TIPS = By.id("STUDENT_FLOORPLAN_PAGE_STRUCTURE_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By STUDENT_LAYOUT_TEXT = By.xpath("//*[text()='Layout:']");
    private final By STUDENT_LAYOUT_TOOL_TIPS = By.id("STUDENT_FLOORPLAN_LAYOUT_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By STUDENT_FLOOR_PLAN_GROUPS_TEXT = By.xpath("//*[text()='Floor Plan Groups:']");
    private final By STUDENT_FLOOR_PLAN_GROUPS_TOOL_TIPS = By.id("STUDENT_FLOORPLAN_GROUP_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By STUDENT_RENAME_DEPOSIT_TEXT = By.xpath("//*[text()='Rename \"Deposit\":']");
    private final By STUDENT_RENAME_DEPOSIT_TOOL_TIPS = By.id("STUDENT_RENAME_DEPOSIT_WEBSITE_PREFERENCES_HELP");
    private final By STUDENT_RENAME_REQUEST_INFO_TEXT = By.xpath("//*[text()='Rename \"Request Info\":']");
    private final By STUDENT_RENAME_REQUEST_INFO_TOOL_TIPS = By.id("STUDENT_RENAME_REQUEST_INFO_WEBSITE_PREFERENCES_HELP");
    private final By STUDENT_REQUEST_INFO_EXTERNAL_URL_TEXT= By.xpath("//*[text()='Request Info External URL:']");
    private final By STUDENT_REQUEST_INFO_EXTERNAL_URL_TOOL_TIPS = By.id("STUDENT_REQUEST_INFO_EXTERNAL_URL_WEBSITE_PREFERENCES_HELP");
    private final By STUDENT_VIEWER_BACKGROUND_COLOR_TEXT = By.xpath("//*[text()='Viewer Background Color:']");
    private final By STUDENT_VIEWER_BACKGROUND_COLOR_TOOL_TIPS = By.id("STUDENT_FP_DETAILS_VIEWER_BACKGROUND_COLOR_WEBSITE_PREFERENCES_HELP");
    private final By STUDENT_DISCLAIMER_TEXT = By.xpath("//*[text()='Disclaimer Text:']");
    private final By STUDENT_DISCLAIMER_TEXT_TOOL_TIPS = By.id("STUDENT_DISCLAIMER_TEXT_WEBSITE_PREFERENCES_HELP");
    private final By STUDENT_DEPOSIT_DISCLAIMER_TEXT = By.xpath("//*[text()='Deposit Disclaimer Text:']");
    private final By STUDENT_DEPOSIT_DISCLAIMER_TEXT_TOOL_TIPS = By.id("STUDENT_WEBSITE_PROPERTY_DEPOSIT_DISCLAIMER_HELP");

    public boolean ppStudentFloorPlanHeader() {
        return confirmElementIsVisible(PP_STUDENT_FLOOR_PLAN_HEADER);
    }
    public boolean ppStudentFloorPlanEditBtn() {
        return confirmElementIsVisible(PP_STUDENT_FLOOR_PLAN_EDIT_BTN);
    }
    public boolean ppStudentUserFlowText() {
        return confirmElementIsVisible(STUDENT_USER_FLOW_TEXT);
    }
    public boolean ppStudentUserFlowToolTips() {
        return clickElement(STUDENT_USER_FLOW_TOOL_TIPS);
    }
    public boolean ppStudentLayoutText() {
        return confirmElementIsVisible(STUDENT_LAYOUT_TEXT);
    }
    public boolean ppStudentLayoutToolTips() {
        return clickElement(STUDENT_LAYOUT_TOOL_TIPS);
    }
    public boolean ppStudentFloorPlanGroups() {
        return confirmElementIsVisible(STUDENT_FLOOR_PLAN_GROUPS_TEXT);
    }
    public boolean ppStudentFloorPlanGroupsToolTips() {
        return clickElement(STUDENT_FLOOR_PLAN_GROUPS_TOOL_TIPS);
    }
    public boolean ppStudentRenameDeposit() {
        return confirmElementIsVisible(STUDENT_RENAME_DEPOSIT_TEXT);
    }
    public boolean ppStudentRenameDepositToolTips() {
        return clickElement(STUDENT_RENAME_DEPOSIT_TOOL_TIPS);
    }
    public boolean ppStudentRenameRequestInfo() {
        return confirmElementIsVisible(STUDENT_RENAME_REQUEST_INFO_TEXT);
    }
    public boolean ppStudentRenameRequestInfoToolTips() {
        return clickElement(STUDENT_RENAME_REQUEST_INFO_TOOL_TIPS);
    }
    public boolean ppStudentRequestInfoExternalUrl() {
        return confirmElementIsVisible(STUDENT_REQUEST_INFO_EXTERNAL_URL_TEXT);
    }
    public boolean ppStudentRequestInfoExternalUrlToolTips() {
        return clickElement(STUDENT_REQUEST_INFO_EXTERNAL_URL_TOOL_TIPS);
    }
    public boolean ppStudentViewerBackgroundColor() {
        return confirmElementIsVisible(STUDENT_VIEWER_BACKGROUND_COLOR_TEXT);
    }
    public boolean ppStudentViewerBackgroundColorToolTips() {
        return clickElement(STUDENT_VIEWER_BACKGROUND_COLOR_TOOL_TIPS);
    }
    public boolean ppStudentDisclaimerText() {
        return confirmElementIsVisible(STUDENT_DISCLAIMER_TEXT);
    }
    public boolean ppStudentDisclaimerTextToolTips() {
        return clickElement(STUDENT_DISCLAIMER_TEXT_TOOL_TIPS);
    }
    public boolean ppStudentDepositDisclaimer() {
        return confirmElementIsVisible(STUDENT_DEPOSIT_DISCLAIMER_TEXT);
    }
    public boolean ppStudentDepositDisclaimerToolTips() {
        return clickElement(STUDENT_DEPOSIT_DISCLAIMER_TEXT_TOOL_TIPS);
    }
}
