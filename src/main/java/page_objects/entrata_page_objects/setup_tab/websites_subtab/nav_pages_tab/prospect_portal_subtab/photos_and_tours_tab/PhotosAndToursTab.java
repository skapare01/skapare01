package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.photos_and_tours_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PhotosAndToursTab extends BasePage {
    public PhotosAndToursTab(WebDriver driver) {
        super(driver);
    }

    private final By PP_PHOTOS_AND_TOURS_PAGE_HEADER = By.xpath("//h3[text()='Photos & Tours Page']");
    private final By PP_PHOTOS_AND_TOURS_EDIT_BTN = By.id("photos-tours-content-button");
    private final By PP_PHOTOS_AND_TOURS_PAGE_TYPE = By.xpath("//*[text()='Page Type:']");
    private final By PP_PHOTOS_AND_TOURS_PAGE_TYPE_TOOL_TIPS = By.id("PHOTOS_AND_TOURS_PAGE_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By PP_PHOTOS_AND_TOURS_PHOTOS_LAYOUT = By.xpath("//*[text()='Photos Layout:']");
    private final By PP_PHOTOS_AND_TOURS_PHOTOS_LAYOUT_TOOL_TIPS = By.id("PHOTOS_AND_TOURS_PHOTO_LAYOUT_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By PP_PHOTOS_AND_TOURS_VIDEOS_LAYOUT = By.xpath("//*[text()='Videos Layout:']");
    private final By PP_PHOTOS_AND_TOURS_VIDEOS_LAYOUT_TOOL_TIPS = By.id("PHOTOS_AND_TOURS_VIDEO_LAYOUT_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By PP_PHOTOS_AND_TOURS_PHOTO_DESCRIPTIONS = By.xpath("//*[text()='Photo Descriptions:']");
    private final By PP_PHOTOS_AND_TOURS_PHOTO_DESCRIPTIONS_TOOL_TIPS = By.id("PHOTOS_AND_TOURS_VIDEO_LAYOUT_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By PP_PHOTOS_AND_TOURS_VIEWER_BACKGROUND_COLOR = By.xpath("//*[text()='Viewer Background Color:']");
    private final By PP_PHOTOS_AND_TOURS_VIEWER_BACKGROUND_COLOR_TOOL_TIPS = By.id("PHOTOS_AND_TOURS_VIEWER_BACKGROUND_COLOR_WEBSITE_PREFERENCES_HELP");

    public boolean ppPhotosAndToursPageHeader() {
        return confirmElementIsVisible(PP_PHOTOS_AND_TOURS_PAGE_HEADER);
    }
    public boolean ppPhotosAndToursEditBtn() {
        return confirmElementIsVisible(PP_PHOTOS_AND_TOURS_EDIT_BTN);
    }
    public boolean ppPhotosAndToursPageType() {
        return confirmElementIsVisible(PP_PHOTOS_AND_TOURS_PAGE_TYPE);
    }
    public boolean ppPhotosAndToursPageTypeToolTips() {
        return clickElement(PP_PHOTOS_AND_TOURS_PAGE_TYPE_TOOL_TIPS);
    }
    public boolean ppPhotosAndToursPhotosLayout() {
        return confirmElementIsVisible(PP_PHOTOS_AND_TOURS_PHOTOS_LAYOUT);
    }
    public boolean ppPhotosAndToursPhotosLayoutToolTips() {
        return clickElement(PP_PHOTOS_AND_TOURS_PHOTOS_LAYOUT_TOOL_TIPS);
    }
    public boolean ppPhotosAndToursVideosLayout() {
        return confirmElementIsVisible(PP_PHOTOS_AND_TOURS_VIDEOS_LAYOUT);
    }
    public boolean ppPhotosAndToursVideosLayoutToolTips() {
        return clickElement(PP_PHOTOS_AND_TOURS_VIDEOS_LAYOUT_TOOL_TIPS);
    }
    public boolean ppPhotosAndToursPhotoDescriptions() {
        return confirmElementIsVisible(PP_PHOTOS_AND_TOURS_PHOTO_DESCRIPTIONS);
    }
    public boolean ppPhotosAndToursPhotoDescriptionsToolTips() {
        return clickElement(PP_PHOTOS_AND_TOURS_PHOTO_DESCRIPTIONS_TOOL_TIPS);
    }
    public boolean ppPhotosAndToursViewerBackgroundColor() {
        return confirmElementIsVisible(PP_PHOTOS_AND_TOURS_VIEWER_BACKGROUND_COLOR);
    }
    public boolean ppPhotosAndToursViewerBackgroundColorToolTips() {
        return clickElement(PP_PHOTOS_AND_TOURS_VIEWER_BACKGROUND_COLOR_TOOL_TIPS);
    }
}
