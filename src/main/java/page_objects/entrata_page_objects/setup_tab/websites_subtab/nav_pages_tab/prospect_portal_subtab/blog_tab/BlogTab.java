package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.blog_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class BlogTab extends BasePage {
    public BlogTab(WebDriver driver) {
        super(driver);
    }

    private final By PP_BLOG_SETTINGS_HEADER = By.xpath("//*[text()='Blog Settings']");
    private final By PP_BLOG_SETTINGS_EDIT_BTN = By.id("blog-settings-content-button");
    private final By PP_BLOG_DESCRIPTION = By.xpath("//*[text()='Description:']");
    private final By PP_BLOG_DESCRIPTION_TOOL_TIPS = By.id("BLOG_DESCRIPTION_WEBSITE_PREFERENCES_HELP");
    private final By PP_BLOG_PAGE_HEADING = By.xpath("//*[text()='Blog Page Heading:']");
    private final By PP_BLOG_PAGE_HEADING_TOOL_TIPS = By.id("BLOG_HEADER_TAG_WEBSITE_PREFERENCES_HELP");
    private final By PP_KEYWORDS_COMMA_SEPARATED = By.xpath("//*[text()='Keywords (comma separated):']");
    private final By PP_KEYWORDS_COMMA_SEPARATED_TOOL_TIPS = By.id("BLOG_KEYWORDS_WEBSITE_PREFERENCES_HELP");
    private final By PP_SIDE_BAR_LOCATION = By.xpath("//*[text()='Side Bar Location:']");
    private final By PP_SIDEBAR_LOCATION_TOOL_TIPS = By.id("BLOG_LANDING_PAGE_WEBSITE_PREFERENCES_HELP");
    private final By PP_TITLE = By.xpath("//*[text()='Title:']");
    private final By PP_TITLE_TOOL_TIPS = By.id("BLOG_TITLE_WEBSITE_PREFERENCES_HELP");
    private final By PP_BLOG_IMPORT_WORDPRESS_CSV_HEADER = By.xpath("//*[text()='Import Wordpress CSV']");
    private final By PP_BLOG_DOWNLOAD_SAMPLE_CSV_BTN = By.xpath("//*[@id=\"blog-migraion-settings\"]/div/div/a");
    private final By PP_BLOG_IMPORT_WORDPRESS_CSV_CHOOSE_FILE_BTN = By.id("csvUpload");
    private final By PP_BLOG_IMPORT_BTN = By.xpath("//*[@id=\"migrate-wordpress-csv\"]/div/div/input");

    public boolean ppBlogSettingsHeader() {
        return confirmElementIsVisible(PP_BLOG_SETTINGS_HEADER);
    }
    public boolean ppBlogSettingsEditBtn() {
        return confirmElementIsVisible(PP_BLOG_SETTINGS_EDIT_BTN);
    }
    public boolean ppBlogDescription() {
        return confirmElementIsVisible(PP_BLOG_DESCRIPTION);
    }
    public boolean ppBlogDescriptionToolTips() {
        return clickElement(PP_BLOG_DESCRIPTION_TOOL_TIPS);
    }
    public boolean ppBlogPageHeading() {
        return confirmElementIsVisible(PP_BLOG_PAGE_HEADING);
    }
    public boolean ppBlogPageHeadingToolTips() {
        return clickElement(PP_BLOG_PAGE_HEADING_TOOL_TIPS);
    }
    public boolean ppBlogKeywordCommaSeparated() {
        return confirmElementIsVisible(PP_KEYWORDS_COMMA_SEPARATED);
    }
    public boolean ppBlogKeywordCommaSeparatedToolTips() {
        return clickElement(PP_KEYWORDS_COMMA_SEPARATED_TOOL_TIPS);
    }
    public boolean ppBlogSidebarLocation() {
        return confirmElementIsVisible(PP_SIDE_BAR_LOCATION);
    }
    public boolean ppBlogSidebarLocationToolTips() {
        return clickElement(PP_SIDEBAR_LOCATION_TOOL_TIPS);
    }
    public boolean ppBlogTitle() {
        return confirmElementIsVisible(PP_TITLE);
    }
    public boolean ppBlogTitleToolTips() {
        return clickElement(PP_TITLE_TOOL_TIPS);
    }
    public boolean ppBlogImportWordpressCsvHeader() {
        return confirmElementIsVisible(PP_BLOG_IMPORT_WORDPRESS_CSV_HEADER);
    }
    public boolean ppBlogDownloadSampleCsvBtn() {
        return confirmElementIsVisible(PP_BLOG_DOWNLOAD_SAMPLE_CSV_BTN);
    }
    public boolean ppBlogImportWordpressCsvChooseFileBtn() {
        return confirmElementIsVisible(PP_BLOG_IMPORT_WORDPRESS_CSV_CHOOSE_FILE_BTN);
    }
    public boolean ppBlogWordpressCsvImportBtn() {
        return confirmElementIsVisible(PP_BLOG_IMPORT_BTN);
    }
}
