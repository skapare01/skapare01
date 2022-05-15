package page_objects.entrata_page_objects.setup_tab.property_settings_subtab.communication_tab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import page_objects.BasePage;

public class PropertyQuickResponses extends BasePage {

    // Quick Responses Tab + Header Selectors
private final By QUICK_RESPONSES_TAB = By.id("property_communication_general_quick_responsesxxx");
private final By QUICK_RESPONSES_TAB_HEADER_TEXT = By.xpath("//h3[text()='Quick Responses']");
// Quick Responses Search Bar Selector

//Overlay Method

//Constructor//
    public PropertyQuickResponses(WebDriver driver) { super(driver); }

// Quick Responses Tab + Header Methods
public boolean clickQuickResponsesTab() {return clickElement(QUICK_RESPONSES_TAB);}
public boolean locateQuickResponsesTabHeader() {return clickElement(QUICK_RESPONSES_TAB_HEADER_TEXT);}

// Quick Responses Search Bar Methods

}

