package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.apply_now_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class ApplyNowTab extends BasePage {
    public ApplyNowTab(WebDriver driver) {
        super(driver);
    }

    private final By PP_APPLY_NOW_HEADER = By.xpath("//*[text()='Apply Now Page']");
    private final By PP_APPLY_NOW_EDIT_BTN = By.id("apply-now-settings-content-button");
    private final By PP_APPLY_NOW_OVERWRITE_SEO_TITLE_TAG = By.xpath("//*[text()='Overwrite SEO Title Tag:']");
    private final By PP_APPLY_NOW_OVERWRITE_SEO_TITLE_TAG_TOOL_TIPS= By.id("APPLY_NOW_SEO_TITLE_WEBSITE_PREFERENCES_HELP");
    private final By PP_APPLY_NOW_SEO_KEYWORDS = By.xpath("//*[text()='SEO Keywords:']");
    private final By PP_APPLY_NOW_SEO_KEYWORDS_TOOL_TIPS = By.id("APPLY_NOW_SEO_KEYWORDS_WEBSITE_PREFERENCES_HELP");
    private final By PP_APPLY_NOW_OVERWRITE_SEO_META_DESCRIPTION = By.xpath("//*[text()='Overwrite SEO Meta Description:']");
    private final By PP_APPLY_NOW_OVERWRITE_SEO_META_DESCRIPTION_TOOL_TIPS = By.id("APPLY_NOW_SEO_DESCRIPTION_WEBSITE_PREFERENCES_HELP");

    public boolean ppApplyNowPageHeader() {
        return confirmElementIsVisible(PP_APPLY_NOW_HEADER);
    }
    public boolean ppApplyNowEditBtn() {
        return confirmElementIsVisible(PP_APPLY_NOW_EDIT_BTN);
    }
    public boolean ppApplyNowOverwriteSeoTitleTag() {
        return confirmElementIsVisible(PP_APPLY_NOW_OVERWRITE_SEO_TITLE_TAG);
    }
    public boolean ppApplyNowOverwriteSeoTitleTagToolTips() {
        return clickElement(PP_APPLY_NOW_OVERWRITE_SEO_TITLE_TAG_TOOL_TIPS);
    }
    public boolean ppApplyNowSeoKeyWords() {
        return confirmElementIsVisible(PP_APPLY_NOW_SEO_KEYWORDS);
    }
    public boolean ppApplyNowSeoKeyWordsToolTips() {
        return clickElement(PP_APPLY_NOW_SEO_KEYWORDS_TOOL_TIPS);
    }
    public boolean ppApplyNowOverwriteSeoMetaDescription() {
        return confirmElementIsVisible(PP_APPLY_NOW_OVERWRITE_SEO_META_DESCRIPTION);
    }
    public boolean ppApplyNowOverwriteSeoMetaDescriptionToolTips() {
        return clickElement(PP_APPLY_NOW_OVERWRITE_SEO_META_DESCRIPTION_TOOL_TIPS);
    }
}
