package page_objects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import wait_times.WaitTimes;

import java.time.Duration;
import java.util.ArrayList;

public class BasePage {
    public WebDriver driver;
    public WaitTimes waitTimes = new WaitTimes();

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean confirmElementIsVisible(By locator) {
        try {
            new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean confirmElementIsVisible(By locator, Duration waitTime) {
        try {
            new WebDriverWait(driver, waitTime)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean clickElement(By locator) {
        try {
            WebElement elementToClick = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                    .until(ExpectedConditions.elementToBeClickable(locator));
            elementToClick.click();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean clickElement(By locator, Duration waitTime) {
        try {
            WebElement elementToClick = new WebDriverWait(driver, waitTime)
                    .until(ExpectedConditions.elementToBeClickable(locator));
            elementToClick.click();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean sendKeysToElement(By locator, String keys) {
        try {
            WebElement elementToReceiveKeys = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                    .until(ExpectedConditions.elementToBeClickable(locator));
            elementToReceiveKeys.sendKeys(keys);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean sendKeysToElement(By locator, String keys, Duration waitTime) {
        try {
            WebElement elementToReceiveKeys = new WebDriverWait(driver, waitTime)
                    .until(ExpectedConditions.elementToBeClickable(locator));
            elementToReceiveKeys.sendKeys(keys);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void waitForOverlay(By locator) {
        try {
            new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                    .until(ExpectedConditions.invisibilityOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No Overlay found.");
        }
    }

    public void waitForOverlay(By locator, Duration waitTime) {
        try {
            new WebDriverWait(driver, waitTime)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            new WebDriverWait(driver, waitTime)
                    .until(ExpectedConditions.invisibilityOfElementLocated(locator));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("No Overlay found.");
        }
    }

    public boolean moveToAnElementWithActions(By locator) {
        try {
            WebElement element = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            Actions a = new Actions(driver);
            a.moveToElement(element).perform();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean moveToAnElementWithActions(By locator, Duration waitTime) {
        try {
            WebElement element = new WebDriverWait(driver, waitTime)
                    .until(ExpectedConditions.elementToBeClickable(locator));
            Actions a = new Actions(driver);
            a.moveToElement(element).perform();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean selectElementByValue(By locator, String value) {
        try {
            WebElement element = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            Select select = new Select(element);
            select.selectByValue(value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean selectElementByValue(By locator, String value, Duration waitTime) {
        try {
            WebElement element = new WebDriverWait(driver, waitTime)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            Select select = new Select(element);
            select.selectByValue(value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean selectElementByIndex(By locator, int index) {
        try {
            WebElement element = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            Select select = new Select(element);
            select.selectByIndex(index);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean selectElementByIndex(By locator, int index, Duration waitTime) {
        try {
            WebElement element = new WebDriverWait(driver, waitTime)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            Select select = new Select(element);
            select.selectByIndex(index);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean selectElementByText(By locator, String text) {
        try {
            WebElement element = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            Select se = new Select(element);
            se.selectByVisibleText(text);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean selectElementByText(By locator, String text, Duration waitTime) {
        try {
            WebElement element = new WebDriverWait(driver, waitTime)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            Select se = new Select(element);
            se.selectByVisibleText(text);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean confirmElementIsInvisible(By locator) {
        try {
            new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                    .until(ExpectedConditions.invisibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean confirmElementIsInvisible(By locator, Duration waitTime) {
        try {
            new WebDriverWait(driver, waitTime)
                    .until(ExpectedConditions.invisibilityOfElementLocated(locator));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean confirmElementContainsText(By locator, String text) {

        try {
            new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            getElementText(locator).contains(text);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean confirmElementContainsText(By locator, String text, Duration waitTime) {

        try {
            new WebDriverWait(driver, waitTime)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            getElementText(locator).contains(text);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public String getElementText(By locator) {
        try {
            WebElement elementText = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            return elementText.getText();
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to get text from Element.";
        }
    }

    public String getElementText(By locator, Duration waitTime) {
        try {
            WebElement elementText = new WebDriverWait(driver, waitTime)
                    .until(ExpectedConditions.visibilityOfElementLocated(locator));
            return elementText.getText();
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to get text from Element.";
        }
    }

    public boolean elementClearTextField(By locator) {
        try {
            WebElement elementToClear = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT)
                    .until(ExpectedConditions.elementToBeClickable(locator));
            elementToClear.clear();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean elementClearTextField(By locator, Duration waitTime) {
        try {
            WebElement elementToClear = new WebDriverWait(driver, waitTime)
                    .until(ExpectedConditions.elementToBeClickable(locator));
            elementToClear.clear();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean pressEnter(By locator) {
        //Uses a locator to find an element and then presses enter as a send key.
        try {
            WebElement entryField = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT).until(ExpectedConditions.visibilityOfElementLocated(locator));
            entryField.sendKeys(Keys.ENTER);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean pressEnter(By locator, Duration waitTime) {
        //Uses a locator to find an element and then presses enter as a send key.
        try {
            WebElement entryField = new WebDriverWait(driver, waitTime).until(ExpectedConditions.visibilityOfElementLocated(locator));
            entryField.sendKeys(Keys.ENTER);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean doubleClickElement(By locator) {
        try {
            WebElement elementToDoubleClick = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT).until(ExpectedConditions.visibilityOfElementLocated(locator));
            Actions doubleClickLocator = new Actions(driver);
            doubleClickLocator.moveToElement(elementToDoubleClick).doubleClick().perform();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean doubleClickElement(By locator, Duration waitTime) {
        try {
            WebElement elementToDoubleClick = new WebDriverWait(driver, waitTime).until(ExpectedConditions.visibilityOfElementLocated(locator));
            Actions doubleClickLocator = new Actions(driver);
            doubleClickLocator.moveToElement(elementToDoubleClick).doubleClick().perform();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean switchToRecentlyOpenedTab() {
        try {
            System.out.println("Switching tabs! Currently on tab '" + driver.getTitle() + "', switching now!");
            ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(newTb.get(1));
            System.out.println("Switched to tab '" + driver.getTitle() + "'!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean closeSecondTabAndReturnToPrimaryTab() {
        try {
            System.out.println("Closing tab! Currently on tab '" + driver.getTitle() + "', closing now!");
            ArrayList<String> browserTabs = new ArrayList<String>(driver.getWindowHandles());
            driver.close();
            driver.switchTo().window(browserTabs.get(0));
            System.out.println("Switched to tab '" + driver.getTitle() + "'!");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean maximizeWindow() {
        try {
            driver.manage().window().maximize();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean pressDownArrow(By locator) {
        //Uses a locator to find an element and then presses down arrow as a send key.
        try {
            WebElement entryField = new WebDriverWait(driver, waitTimes.DEFAULT_WAIT).until(ExpectedConditions.visibilityOfElementLocated(locator));
            entryField.sendKeys(Keys.ARROW_DOWN);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean pressDownArrow(By locator, Duration waitTime) {
        //Uses a locator to find an element and then presses down arrow as a send key.
        try {
            WebElement entryField = new WebDriverWait(driver, waitTime).until(ExpectedConditions.visibilityOfElementLocated(locator));
            entryField.sendKeys(Keys.ARROW_DOWN);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean scrollDownToBottomOfPage() {

        try {
            ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean clickOkButtonOfAlertMessage() {

        try {
            driver.switchTo().alert().accept();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean confirmElementTextNoLongerMatches(By locator, String originalText) {
        try {
            new WebDriverWait(driver, waitTimes.DEFAULT_WAIT).until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, originalText)));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean openNewTabAndSwitchToThatTab(String url){
        try{
            ((JavascriptExecutor)driver).executeScript("window.open('about:blank','_blank');");
            ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(newTb.get(1));
            System.out.println("Switched to tab '" + driver.getTitle() + "'!");
            driver.navigate().to(url);
            return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }


}