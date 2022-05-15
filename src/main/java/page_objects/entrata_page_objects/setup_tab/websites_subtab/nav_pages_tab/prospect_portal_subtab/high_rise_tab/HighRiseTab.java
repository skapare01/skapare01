package page_objects.entrata_page_objects.setup_tab.websites_subtab.nav_pages_tab.prospect_portal_subtab.high_rise_tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class HighRiseTab extends BasePage {
    public HighRiseTab(WebDriver driver) {
        super(driver);
    }

    private final By PP_HIGH_RISE_COLORS_HEADER = By.xpath("//h3[text()='Colors']");
    private final By PP_HIGH_RISE_COLORS_EDIT_BTN = By.id("high-rise-content-colors-button");
    private final By PP_HIGH_RISE_AVAILABLE_UNITS_COLOR = By.xpath("//*[text()='Available Units Color:']");
    private final By PP_HIGH_RISE_AVAILABLE_UNITS_COLOR_TOOL_TIPS = By.id("HIGH_RISE_VIEWER_AVAILABLE_UNITS_COLOR_WEBSITE_PREFERENCES_HELP");
    private final By PP_HIGH_RISE_FLOORS_UNITS_FILTER_COLOR = By.xpath("//*[text()='Floors/Units Filter Color:']");
    private final By PP_HIGH_RISE_FLOORS_UNITS_FILTER_COLOR_TOOL_TIPS = By.id("HIGH_RISE_VIEWER_FLOORS_OR_UNITS_FILTER_COLOR_WEBSITE_PREFERENCES_HELP");
    private final By PP_HIGH_RISE_FLOOR_UNIT_HOVER_COVER = By.xpath("//*[text()='Floor/Unit Hover Color:']");
    private final By PP_HIGH_RISE_FLOOR_UNIT_HOVER_COVER_TOOL_TIPS = By.id("HIGH_RISE_VIEWER_FLOOR_OR_UNIT_HOVER_COLOR_WEBSITE_PREFERENCES_HELP");
    private final By PP_HIGH_RISE_SELECTED_FLOOR_COLOR = By.xpath("//*[text()='Selected Floor Color:']");
    private final By PP_HIGH_RISE_SELECTED_FLOOR_COLOR_TOOL_TIPS = By.id("HIGH_RISE_VIEWER_SELECTED_FLOOR_COLOR_WEBSITE_PREFERENCES_HELP");
    private final By PP_HIGH_RISE_UNAVAILABLE_UNITS_COLOR = By.xpath("//*[text()='Unavailable Units Color:']");
    private final By PP_HIGH_RISE_UNAVAILABLE_UNITS_COLOR_TOOL_TIPS = By.id("HIGH_RISE_VIEWER_UNAVAILABLE_UNITS_COLOR_WEBSITE_PREFERENCES_HELP");

    public boolean ppHighRiseColorsHeader() {
        return confirmElementIsVisible(PP_HIGH_RISE_COLORS_HEADER);
    }
    public boolean ppHighRiseColorsEditBtn() {
        return confirmElementIsVisible(PP_HIGH_RISE_COLORS_EDIT_BTN);
    }
    public boolean ppHighRiseAvailableUnitsColor() {
        return confirmElementIsVisible(PP_HIGH_RISE_AVAILABLE_UNITS_COLOR);
    }
    public boolean ppHighRiseAvailableUnitsColorToolTips() {
        return clickElement(PP_HIGH_RISE_AVAILABLE_UNITS_COLOR_TOOL_TIPS);
    }
    public boolean ppHighRiseFloorsUnitsFilterColor() {
        return confirmElementIsVisible(PP_HIGH_RISE_FLOORS_UNITS_FILTER_COLOR);
    }
    public boolean ppHighRiseFloorsUnitsFilterColorToolTips() {
        return clickElement(PP_HIGH_RISE_FLOORS_UNITS_FILTER_COLOR_TOOL_TIPS);
    }
    public boolean ppHighRiseFloorUnitHoverColor() {
        return confirmElementIsVisible(PP_HIGH_RISE_FLOOR_UNIT_HOVER_COVER);
    }
    public boolean ppHighRiseFloorUnitHoverColorToolTips() {
        return clickElement(PP_HIGH_RISE_FLOOR_UNIT_HOVER_COVER_TOOL_TIPS);
    }
    public boolean ppHighRiseSelectedFloorColor() {
        return confirmElementIsVisible(PP_HIGH_RISE_SELECTED_FLOOR_COLOR);
    }
    public boolean ppHighRiseSelectedFloorColorToolTips() {
        return clickElement(PP_HIGH_RISE_SELECTED_FLOOR_COLOR_TOOL_TIPS);
    }
    public boolean ppHighRiseUnavailableUnitsColor() {
        return confirmElementIsVisible(PP_HIGH_RISE_UNAVAILABLE_UNITS_COLOR);
    }
    public boolean ppHighRiseUnavailableUnitsColorToolTips() {
        return clickElement(PP_HIGH_RISE_UNAVAILABLE_UNITS_COLOR_TOOL_TIPS);
    }
}
