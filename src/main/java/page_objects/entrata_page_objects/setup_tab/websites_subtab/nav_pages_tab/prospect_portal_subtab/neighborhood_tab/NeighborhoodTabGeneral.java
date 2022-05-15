package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.neighborhood_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class NeighborhoodTabGeneral extends BasePage {
    public NeighborhoodTabGeneral(WebDriver driver) {
        super(driver);
    }

    private final By PP_NEIGHBORHOOD_GENERAL_HEADER = By.xpath("//*[@id=\"b_neighborhood_general\"]/h3");
    private final By PP_NEIGHBORHOOD_GENERAL_EDIT_BTN = By.id("neighborhood-content-general-button");
    private final By PP_NEIGHBORHOOD_GENERAL_MARKER_TYPE = By.xpath("//*[text()='Marker Type:']");
    private final By PP_NEIGHBORHOOD_GENERAL_MARKER_TYPE_TOOL_TIPS= By.id("NEIGHBORHOOD_APARTMENT_MARKER_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By PP_NEIGHBORHOOD_GENERAL_PIN_COLOR = By.xpath("//*[text()='Pin Color:']");
    private final By PP_NEIGHBORHOOD_GENERAL_PIN_COLOR_TOOL_TIPS = By.id("NEIGHBORHOOD_APARTMENT_MARKER_COLOR_WEBSITE_PREFERENCES_HELP");
    private final By PP_NEIGHBORHOOD_GENERAL_PLACES_MARKER_TYPE = By.xpath("//*[text()='Places Marker Type:']");
    private final By PP_NEIGHBORHOOD_GENERAL_PLACES_MARKER_TYPE_TOOL_TIPS = By.id("NEIGHBORHOOD_PLACES_MARKER_TYPE_WEBSITE_PREFERENCES_HELP");
    private final By PP_NEIGHBORHOOD_GENERAL_STARTING_MAP_ZOOM = By.xpath("//*[text()='Starting Map Zoom:']");
    private final By PP_NEIGHBORHOOD_GENERAL_STARTING_MAP_ZOOM_TOOL_TIPS = By.id("MAP_ZOOM_LEVEL_WEBSITE_PREFERENCES_HELP");
    private final By PP_NEIGHBORHOOD_GENERAL_SEO_CONTENT_LAYOUT = By.xpath("//*[text()='SEO Content Layout:']");
    private final By PP_NEIGHBORHOOD_GENERAL_SEO_CONTENT_LAYOUT_TOOL_TIPS = By.id("NEIGHBORHOOD_SEO_CONTENT_LAYOUT_WEBSITE_PREFERENCES_HELP");
    private final By PP_NEIGHBORHOOD_GENERAL_SEO_CONTENT_POSITION = By.xpath("//*[text()='SEO Content Position:']");
    private final By PP_NEIGHBORHOOD_GENERAL_SEO_CONTENT_POSITION_TOOL_TIPS = By.id("NEIGHBORHOOD_SEO_CONTENT_POSITION_WEBSITE_PREFERENCES_HELP");
    private final By PP_NEIGHBORHOOD_GENERAL_SORT_PLACE_RESULTS_BY_DISTANCE_FROM_PROPERTY = By.xpath("//*[text()='Sort Place Results By Distance From Property:']");
    private final By PP_NEIGHBORHOOD_GENERAL_SORT_PLACE_RESULTS_BY_DISTANCE_FROM_PROPERTY_TOOL_TIPS = By.id("NEIGHBORHOOD_SORT_PLACE_RESULTS_BY_PROXIMITY_WEBSITE_PREFERENCES_HELP");
    private final By PP_NEIGHBORHOOD_GENERAL_SKINS= By.xpath("//*[text()='Skins:']");
    private final By PP_NEIGHBORHOOD_GENERAL_SKINS_TOOL_TIPS = By.id("NEIGHBORHOOD_MAP_SKINS_WEBSITE_PREFERENCES_HELP");

    public boolean ppNeighborhoodGeneralHeader() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GENERAL_HEADER );
    }
    public boolean ppNeighborhoodGeneralEditBtn() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GENERAL_EDIT_BTN);
    }
    public boolean ppNeighborhoodGeneralMarkerType() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GENERAL_MARKER_TYPE);
    }
    public boolean ppNeighborhoodGeneralMarkerTypeToolTips() {
        return clickElement(PP_NEIGHBORHOOD_GENERAL_MARKER_TYPE_TOOL_TIPS);
    }
    public boolean ppNeighborhoodGeneralPinColor() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GENERAL_PIN_COLOR);
    }
    public boolean ppNeighborhoodGeneralPinColorToolTips() {
        return clickElement(PP_NEIGHBORHOOD_GENERAL_PIN_COLOR_TOOL_TIPS);
    }
    public boolean ppNeighborhoodGeneralPlacesMarkerType() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GENERAL_PLACES_MARKER_TYPE);
    }
    public boolean ppNeighborhoodGeneralPlacesMarkerTypeToolTips() {
        return clickElement(PP_NEIGHBORHOOD_GENERAL_PLACES_MARKER_TYPE_TOOL_TIPS);
    }
    public boolean ppNeighborhoodGeneralStartingMapZoom() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GENERAL_STARTING_MAP_ZOOM);
    }
    public boolean ppNeighborhoodGeneralStartingMapZoomToolTips() {
        return clickElement(PP_NEIGHBORHOOD_GENERAL_STARTING_MAP_ZOOM_TOOL_TIPS);
    }
    public boolean ppNeighborhoodGeneralSeoContentLayout() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GENERAL_SEO_CONTENT_LAYOUT);
    }
    public boolean ppNeighborhoodGeneralSeoContentLayoutToolTips() {
        return clickElement(PP_NEIGHBORHOOD_GENERAL_SEO_CONTENT_LAYOUT_TOOL_TIPS);
    }
    public boolean ppNeighborhoodGeneralSeoContentPosition() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GENERAL_SEO_CONTENT_POSITION);
    }
    public boolean ppNeighborhoodGeneralSeoContentPositionToolTips() {
        return clickElement(PP_NEIGHBORHOOD_GENERAL_SEO_CONTENT_POSITION_TOOL_TIPS);
    }
    public boolean ppNeighborhoodGeneralSortPlaceResultsBYDistanceFromProperty() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GENERAL_SORT_PLACE_RESULTS_BY_DISTANCE_FROM_PROPERTY);
    }
    public boolean ppNeighborhoodGeneralSortPlaceResultsBYDistanceFromPropertyToolTips() {
        return clickElement(PP_NEIGHBORHOOD_GENERAL_SORT_PLACE_RESULTS_BY_DISTANCE_FROM_PROPERTY_TOOL_TIPS);
    }
    public boolean ppNeighborhoodGeneralSkins() {
        return confirmElementIsVisible(PP_NEIGHBORHOOD_GENERAL_SKINS);
    }
    public boolean ppNeighborhoodGeneralSkinsToolTips() {
        return clickElement(PP_NEIGHBORHOOD_GENERAL_SKINS_TOOL_TIPS);
    }
}
